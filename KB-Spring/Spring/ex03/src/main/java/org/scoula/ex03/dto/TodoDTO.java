package org.scoula.ex03.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class TodoDTO {
	private String title;

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date dueDate;
}
