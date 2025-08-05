package com.excelr.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Headphones {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@JsonProperty("pid")
	private int pid;
	
	@JsonProperty("pname")
	private String pname;
	
	@JsonProperty("pcost")
	private double pcost;
	
	@JsonProperty("pqty")
	private int pqty;
	
	@JsonProperty("pimage")
	private String pimage;
}
