package com.jack.mapper;

import java.util.List;

import com.jack.model.Account;
import com.jack.dto.AccountDto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jack.enums.AccountRoleEnum;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountMapperTest {

	@Resource
	private AccountMapper accountMapper;


	@Test
	public void testAccount()  {
		//增加
		accountMapper.insert(new Account("haha", "a123456", AccountRoleEnum.ADMIN));
		//删除
		int count=accountMapper.delete(2l);
		Account account = accountMapper.getOne(1l);
		account.setAvatar("luck");
		//修改
		accountMapper.update(account);
		//查询
		List<Account> accounts = accountMapper.getAll();
	}

	@Test
	public void testInsert()  {
		accountMapper.insert(new Account("aa", "a123456", AccountRoleEnum.ADMIN));
		accountMapper.insert(new Account("bb", "b123456", AccountRoleEnum.ADMIN));
		accountMapper.insert(new Account("cc", "c123456", AccountRoleEnum.DEVELOPER));

		Assert.assertEquals(3, accountMapper.getAll().size());
	}

	@Test
	public void testQuery() {
		List<Account> accounts = accountMapper.getAll();
		if(accounts==null || accounts.size()==0){
			System.out.println("is null");
		}else{
			System.out.println("accounts list is :"+accounts.toString());
		}
	}
	
	
	@Test
	public void testUpdate() {
		long id=1l;
		Account account = accountMapper.getOne(id);
		if(account!=null){
			System.out.println(account.toString());
			account.setAvatar("jack");
			accountMapper.update(account);
			Assert.assertTrue(("jack".equals(accountMapper.getOne(id).getAvatar())));
		}else {
			System.out.println("not find Account id="+id);
		}
	}


	@Test
	public void testDelete() {
		int count=accountMapper.delete(29l);
		if(count>0){
			System.out.println("delete is sucess");
		}else {
			System.out.println("delete if failed");
		}
	}

}