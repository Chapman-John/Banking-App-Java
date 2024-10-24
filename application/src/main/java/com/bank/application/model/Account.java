package com.bank.application.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
public class Account {

    @Id
    private Long id;
    private Long accountNumber;
    private String accountHolderName;
    private Double accountBalance;

}
