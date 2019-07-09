package com.bw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.entity.Shop;
import com.bw.service.ShopService;

@Controller
public class ShopController {
	@Resource
	private ShopService service;
	
	@RequestMapping("list.do")
	public String list(ModelMap map){
		List<Shop> list = service.list();
		map.put("list", list);
		return "list";
		
	}
}
