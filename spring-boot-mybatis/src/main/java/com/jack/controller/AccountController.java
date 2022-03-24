package com.jack.web;

import java.util.List;

import com.jack.model.Account;
import com.jack.dto.AccountDto;
import org.springframework.web.bind.annotation.*;


import com.jack.mapper.AccountMapper;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/v1/test")
public class AccountController {
	
	@Resource
	private AccountMapper accountMapper;
	
	@GetMapping("/getAccounts")
	public List<Account> getAccounts() {
		List<Account> accounts=accountMapper.getAll();
		return accounts;
	}
	
    @GetMapping("/get")
    public Account getAccounts(@RequestParam(name = "id", required = true) Long id) {
        Account account=accountMapper.getOne(id);
        return account;
    }
    
    @PostMapping("/add")
    public void save(@RequestBody Account account) {
        accountMapper.insert(account);
    }
    
    @PostMapping(value="update")
    public void update(@RequestBody Account account) {
        accountMapper.update(account);
    }
    
    @PostMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        accountMapper.delete(id);
    }
    
    
}