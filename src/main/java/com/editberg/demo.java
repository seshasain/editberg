package com.editberg;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class demo {
	public static void main(String[] args) {
		System.out.println(new BCryptPasswordEncoder().encode("1234"));
	}
}
