package com.demo.in;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {
	
	public static void main(String[] args) {
		
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String ep=encoder.encode("student");
		System.out.println(ep);
	}

}
