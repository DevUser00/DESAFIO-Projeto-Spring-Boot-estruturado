package com.helio.io.dscommerce.dto;

import java.time.Instant;

public class CustomError {

	private Instant timestamp;
	private Integer status;
	private String error;
	private String trace;
	
	public CustomError(Instant timestamp, Integer status, String error, String trace) {
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.trace = trace;
	}

	public Instant getTimestamp() {
		return timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public String getError() {
		return error;
	}

	public String getTrace() {
		return trace;
	}
	
}
