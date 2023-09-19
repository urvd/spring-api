package com.myrdtest.springapi.utils;

public enum Gender {
	MAN("male"), WOMAN("feminine"), NOT_SPECIFIED("not specified");

	Gender(String type){
		this.type = type;
	}
	public String type;
}
