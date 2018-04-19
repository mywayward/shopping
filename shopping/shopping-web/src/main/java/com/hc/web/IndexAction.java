package com.hc.web;

import com.hc.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class IndexAction extends ActionSupport implements ModelDriven<User> {
	
	private User user = new User();
	public User getModel() {
		return null;
	}
	
	
}
