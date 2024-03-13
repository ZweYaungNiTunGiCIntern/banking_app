package com.zwesuu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zwesuu.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	
}
