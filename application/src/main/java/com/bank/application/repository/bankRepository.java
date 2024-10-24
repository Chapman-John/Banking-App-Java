package com.bank.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.application.model.Account;

@Repository
public interface bankRepository extends JpaRepository<Account, Long> {

}
