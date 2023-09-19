package com.myrdtest.springapi.models;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Builder
@Data
public class User {
	@Id
	@GeneratedValue
	private long userId;
	@Nonnull
	private String username;
	@Nonnull
	private LocalDate birthday;
	@Nonnull
	private String country;

	private String gender;

	private String phone;
}
