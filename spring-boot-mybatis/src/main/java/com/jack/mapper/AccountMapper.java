package com.jack.mapper;

import java.util.List;

import com.jack.model.Account;
import com.jack.dto.AccountDto;

public interface AccountMapper {

	List<Account> getAll();

	List<Account> getList(AccountDto accountDto);

	int getCount(AccountDto accountDto);

	Account getOne(Long id);

	void insert(Account user);

	int update(Account user);

	int delete(Long id);

}