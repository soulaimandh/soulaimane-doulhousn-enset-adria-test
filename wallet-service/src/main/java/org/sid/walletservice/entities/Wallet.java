package org.sid.walletservice.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Wallet {
    @Id
    private UUID id;

    private BigDecimal balance;
    private LocalDateTime creationDate;
    private String currency;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
