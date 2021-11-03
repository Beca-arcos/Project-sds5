package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDto {

	private String sellerName;
	private Long visited;
	private long deals;

	public SaleSuccessDto() {
	}

	public SaleSuccessDto(Seller seller, Long visited, long deals) {
		super();
		sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public long getDeals() {
		return deals;
	}

	public void setDeals(long deals) {
		this.deals = deals;
	}

}
