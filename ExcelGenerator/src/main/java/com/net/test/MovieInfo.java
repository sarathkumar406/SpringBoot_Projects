package com.net.test;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name ="movie_info")
@Data
public class MovieInfo {
	
	@jakarta.persistence.Id
	private int Id;
	private String name;
	private String description;
	private String path;

}
