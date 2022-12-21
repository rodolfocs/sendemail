package com.santosrodolfo.sendemail.models;

import com.santosrodolfo.sendemail.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name ="TB_EMAIL")
public class EmailModel implements Serializable {
    private static final long serialVersionUID = 6766871761415649136L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String Text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
}
