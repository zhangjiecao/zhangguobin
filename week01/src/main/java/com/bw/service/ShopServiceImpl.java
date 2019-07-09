package com.bw.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.entity.Shop;
import com.bw.mapper.ShopDao;
@Service
public class ShopServiceImpl implements ShopService {
	@Resource
	private ShopDao dao;
	@Override
	public List<Shop> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}

}
