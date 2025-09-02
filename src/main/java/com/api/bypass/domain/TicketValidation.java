package com.api.bypass.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "ticket_validation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TicketValidation extends BaseEntity {
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private UUID id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TicketValidation that = (TicketValidation) o;
        return Objects.equals(id, that.id) && status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, status);
    }

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private TicketValidationStatusEnum status;

    @Column(name = "validation_method", nullable = false)
    @Enumerated(EnumType.STRING)
    private TicketValidationMethod validationMethod;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;
}
