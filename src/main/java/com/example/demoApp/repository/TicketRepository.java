package com.example.demoApp.repository;

import com.example.demoApp.domain.Session;
import com.example.demoApp.domain.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {

    Iterable<Ticket> findAllBySession(Session session);

    Long countBySession (Session session);
}
