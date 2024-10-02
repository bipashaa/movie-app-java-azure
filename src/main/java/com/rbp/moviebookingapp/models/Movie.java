package com.rbp.moviebookingapp.models;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value = "movie")
@Data
public class Movie {
	private ObjectId _id;
	private String movieName;
	private String theatreName;
	private Integer noOfTicketsAvailable;
	private String ticketStatus;
	 public Movie() {}

	public Movie(ObjectId _id, String movieName, String theatreName, Integer noOfTicketsAvailable,
			String ticketStatus) {
		super();
		this._id = _id;
		this.movieName = movieName;
		this.theatreName = theatreName;
		this.noOfTicketsAvailable = noOfTicketsAvailable;
		this.ticketStatus = ticketStatus;
	}

	public Movie(String movieName, String theatreName, Integer noOfTicketsAvailable, String ticketStatus) {
		this.movieName = movieName;
		this.theatreName = theatreName;
		this.noOfTicketsAvailable = noOfTicketsAvailable;
		this.ticketStatus = ticketStatus;
	}

	public Movie(String movieName, String theatreName, Integer noOfTicketsAvailable) {
		this.movieName = movieName;
		this.theatreName = theatreName;
		this.noOfTicketsAvailable = noOfTicketsAvailable;
	}

	public Movie(ObjectId _id, String movieName, String theatreName, Integer noOfTicketsAvailable) {

		this._id = _id;
		this.movieName = movieName;
		this.theatreName = theatreName;
		this.noOfTicketsAvailable = noOfTicketsAvailable;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public Integer getNoOfTicketsAvailable() {
		return noOfTicketsAvailable;
	}

	public void setNoOfTicketsAvailable(Integer noOfTicketsAvailable) {
		this.noOfTicketsAvailable = noOfTicketsAvailable;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

}
