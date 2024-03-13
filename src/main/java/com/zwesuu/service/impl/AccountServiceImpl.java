package com.zwesuu.service.impl;

import com.zwesuu.dto.AccountDto;
import com.zwesuu.entity.Account;
import com.zwesuu.mapper.AccountMapper;
import com.zwesuu.repository.AccountRepository;
import com.zwesuu.service.AccountService;

public class AccountServiceImpl implements AccountService{
	
	private AccountRepository accountRepository;
	

	public AccountServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}


	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		Account account= AccountMapper.mapToAccount(accountDto);
		Account savedAccount=accountRepository.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}

}
