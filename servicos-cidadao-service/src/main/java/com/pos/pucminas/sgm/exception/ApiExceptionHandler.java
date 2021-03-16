package com.pos.pucminas.sgm.exception;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler{
	
	@Autowired
	private MessageSource messageSource;
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		ArrayList<ExceptionField> fields = new ArrayList<>();
		
		for (ObjectError error : ex.getBindingResult().getAllErrors()) {
			String nome = ((FieldError) error).getField();
			String mensagem = messageSource.getMessage(error, LocaleContextHolder.getLocale());
			
			fields.add(new ExceptionField(nome, mensagem));
		}
		
		ExceptionResponse response = new ExceptionResponse();
		response.setStatus(status.value());
		response.setTime(LocalDateTime.now());
		response.setTitle("Campos inválidos, verifique as validações abaixo e tente novamente.");
		response.setFields(fields);
		
		return super.handleExceptionInternal(ex, response, headers, status, request);
	}
	
	@ExceptionHandler(CustomException.class)
	public ResponseEntity<Object> handleCustomException(CustomException ex, WebRequest request) {
		var status = HttpStatus.BAD_REQUEST;
		
		ExceptionResponse response = new ExceptionResponse();
		response.setStatus(status.value());
		response.setTime(LocalDateTime.now());
		response.setTitle(ex.getMessage());
		
		return handleExceptionInternal(ex, response, new HttpHeaders(), status, request);
	}

}
