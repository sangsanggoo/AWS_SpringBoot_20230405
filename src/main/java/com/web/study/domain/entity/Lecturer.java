package com.web.study.domain.entity;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Setter;
@Setter
@Builder
public class Lecturer {
	private int id;
	private String name;
	private LocalDate birth_date;
}
