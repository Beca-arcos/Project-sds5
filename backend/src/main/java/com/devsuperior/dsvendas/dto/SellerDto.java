package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SellerDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private long id;
	private String name;

	public SellerDto() {
	}

	public SellerDto(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public SellerDto(Seller entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
