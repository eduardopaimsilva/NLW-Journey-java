package br.com.rocketseat.planner.participant;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParticipantRepositry extends JpaRepository<Participant, UUID> {
}
