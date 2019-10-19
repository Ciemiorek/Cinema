package com.example.demoApp.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.StringJoiner;

@Entity
public class Ticket {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;
    private String seat;
    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name = "session_id")
    private Session session;

    public Ticket() { }

    public Ticket(Long id, String seat, BigDecimal price) {
        this.id = id;
        this.seat = seat;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket)) return false;
        Ticket ticket = (Ticket) o;
        return id != null & id.equals(ticket.getId());
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Ticket.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("seat='" + seat + "'")
                .add("price=" + price)
                .toString();
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Session getSession() {
        return session;
    }
}
