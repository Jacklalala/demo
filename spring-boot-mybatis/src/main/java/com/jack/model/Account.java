package com.jack.model;

import java.io.Serializable;

import com.jack.enums.AccountRoleEnum;

public class Account implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String userName;
	private String passWord;
	private AccountRoleEnum role;
	private String avatar;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public AccountRoleEnum getRole() {
		return role;
	}

	public void setRole(AccountRoleEnum role) {
		this.role = role;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Account() {
		super();
	}

	public Account(String userName, String passWord, AccountRoleEnum role) {
		super();
		this.passWord = passWord;
		this.userName = userName;
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserEntity{" +
				"id=" + id +
				", userName='" + userName + '\'' +
				", passWord='" + passWord + '\'' +
				", role=" + role +
				", avatar='" + avatar + '\'' +
				'}';
	}
}