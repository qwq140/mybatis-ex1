package com.cos.mybatisex01.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.mybatisex01.model.Product;
import com.cos.mybatisex01.model.beans.SaleBean;
import com.cos.mybatisex01.repository.ProductRepository;
import com.cos.mybatisex01.repository.SaleRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class SaleController {
	private final SaleRepository saleRepository;

	@GetMapping("/sale/{id}")
	public SaleBean findById(@PathVariable int id) {
		return saleRepository.findByIdAndJoin(id);
	}
}
