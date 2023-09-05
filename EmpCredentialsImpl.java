package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmpCredentialsImpl implements EmpCredentials {

	@Override
	public String generateEmailId(String fname, String lname, String dept) {
		return fname+lname+"@"+dept+".gl.com";
	}

	@Override
	public String generatePassword() {
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String nums="1234567890";
		String splchars="!@#$%^&*()";
		
		String combined=caps+lower+nums+splchars;  //72 chars
		String pass="";
		Random random=new Random();
		for(int k=0;k<8;k++)
		{
		pass=pass+String.valueOf(combined.charAt(random.nextInt(combined.length()))); 
		}
		return pass;
	}

	@Override
	public void showDetails(Employee e) {
		System.out.println("Employee's  Firstname is "+e.getFname());
		System.out.println("Employee's  Lastname is "+e.getLname());
		System.out.println("Employee's  Email is "+e.getEmailid());
		System.out.println("Employee's  Password is "+e.getPassword());
		
	}
}