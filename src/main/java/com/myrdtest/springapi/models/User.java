package com.myrdtest.springapi.models;



import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

//@Entity
//@Table(name = "user")
@Builder
@Data
public class User {
	//@Id
	//@GeneratedValue(strategy= GenerationType.IDENTITY)
	//@Column(name = "user_id")
	private Integer userId;

	//@Column(name = "username", unique=true, nullable=false)
	private String username;

	//@Column(name = "birthday", nullable=false)
	private LocalDate birthday;

	//@Column(name = "country", nullable=false)
	private String country;

	//@Column(name = "gender")
	private String gender;

	//@Column(name = "phone")
	private String phone;
}
