package com.trading.app.exception;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import com.trading.app.domain.RestErrorInfo;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	protected final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ResourceNotFoundException.class)
    public
    @ResponseBody
    RestErrorInfo handleResourceNotFoundException(ResourceNotFoundException ex, WebRequest request, HttpServletResponse response) {
        log.info("ResourceNotFoundException handler:" + ex.getMessage());

        return new RestErrorInfo(ex, "Sorry I couldn't find it.");
    }
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(DataFormatException.class)
    public
    @ResponseBody
    RestErrorInfo handleDataStoreException(DataFormatException ex, WebRequest request, HttpServletResponse response) {
        log.info("Converting Data Store exception to RestResponse : " + ex.getMessage());

        return new RestErrorInfo(ex, "You messed up.");
    }
	
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	public
	@ResponseBody
	RestErrorInfo handleException(Exception ex, WebRequest request, HttpServletResponse response) {
        log.info("Converting Data Store exception to RestResponse : " + ex.getMessage());

        return new RestErrorInfo(ex, "Internal Server Error");
	}
	
	

}
