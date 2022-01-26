package com.userdb.model;

import java.io.Serializable;

public class UserPasswordReset implements Serializable{

	
	private static final long serialVersionUID = 8025910191330639714L;
	
	private String oldPassword;
	private String newPassword;
	
	
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
	

}
