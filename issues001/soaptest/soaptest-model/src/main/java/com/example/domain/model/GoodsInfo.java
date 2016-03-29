package com.example.domain.model;

import java.io.Serializable;

public class GoodsInfo implements Serializable {

	/**
	 * シリアルID
	 */
	private static final long serialVersionUID = 9179858826330661694L;

	/**
	 * 商品名
	 */
	private String name;
	
	/**
	 * 価格
	 */
	private Integer price;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public Integer getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
}
