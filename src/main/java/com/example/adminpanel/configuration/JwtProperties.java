package com.example.adminpanel.configuration;

public class JwtProperties {

	// container for constants
	
	public static final String SECRET = "Project1789"; // for hashing token
	public static final int EXPIRATION_TIME = 864000000; // 10 days
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String HEADER_STRING = "Authorization";
	
}