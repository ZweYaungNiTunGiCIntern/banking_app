package com.zwesuu.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zwesuu.dto.AccountDto;
import com.zwesuu.service.AccountService;
@RestController
@RequestMapping("/api/accounts")
public class AccountController {
	
	private AccountService accountService;

	public AccountController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}
	@PostMapping("/api/accounts/pos")
	public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountdto){
		return new ResponseEntity<>(accountService.createAccount(accountdto),HttpStatus.CREATED);
	}

}
