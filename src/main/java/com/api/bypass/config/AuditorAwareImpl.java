package com.api.bypass.config;

import io.micrometer.common.lang.NonNull;
import jakarta.annotation.Nonnull;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditorProvider")
public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    @NonNull
    public Optional<String> getCurrentAuditor() {
        var context = SecurityContextHolder.getContext();
        if (context == null || context.getAuthentication() == null || !context.getAuthentication().isAuthenticated()) {
            return Optional.of("system");
        }
        return Optional.ofNullable(context.getAuthentication().getName());
    }

}
