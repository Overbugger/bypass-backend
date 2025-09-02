package com.api.bypass.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "ticket_types")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TicketType extends BaseEntity {

    @Id
    @Column(name = "id", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private Double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TicketType that = (TicketType) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(price, that.price) && Objects.equals(totalAvailable, that.totalAvailable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, name, price, totalAvailable);
    }

    @Column(name = "totalAvailable")
    private Integer totalAvailable;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "events_id")
    private Event event;

    @OneToMany(mappedBy = "ticketType", cascade = CascadeType.ALL)
    private List<Ticket> tickets = new ArrayList<>();
}
