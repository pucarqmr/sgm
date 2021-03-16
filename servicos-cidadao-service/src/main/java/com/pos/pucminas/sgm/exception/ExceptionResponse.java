package com.pos.pucminas.sgm.exception;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ExceptionResponse {

	private Integer status;
	private LocalDateTime time;
	private String title;
	private List<ExceptionField> fields;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<ExceptionField> getFields() {
		return fields;
	}

	public void setFields(List<ExceptionField> fields) {
		this.fields = fields;
	}

}
