package com.rbp.moviebookingapp.payload.response;

import lombok.Data;

@Data
public class MessageResponse {
	public MessageResponse(String message) {
		super();
		Message = message;
	}

	private String Message;

}
