package com.cos.mybatisex01.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.cos.mybatisex01.model.Product;
import com.cos.mybatisex01.model.beans.SaleBean;

// interface는 메모리에 띄울수 없음. (@Mapper 어노테이션을 사용)
@Mapper //
public interface SaleRepository {
	public SaleBean findByIdAndJoin(int id);
}
