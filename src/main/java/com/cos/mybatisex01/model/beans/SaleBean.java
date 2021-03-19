package com.cos.mybatisex01.model.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleBean {
	private int id; // sale
	private String username; // sale
	private String name; // product
	private String code; // product
}
