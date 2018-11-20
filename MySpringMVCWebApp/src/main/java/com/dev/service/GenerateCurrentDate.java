package com.dev.service;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service("dateServie")
public class GenerateCurrentDate {
	public Date getDate() {
		return new Date();
	}
} 