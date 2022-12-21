package com.santosrodolfo.sendemail.repositories;

import com.santosrodolfo.sendemail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
}
