package com.usernumber;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "navigationController")
public class NavigationController {
	public String moveToPage1(){
		return "page1";
	}
}
