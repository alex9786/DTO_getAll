package com.example.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.store.dto.StoreDto;
import com.example.store.service.StoreService;

@RestController
@RequestMapping("/api")
public class StoreController {
	
	@Autowired
	StoreService storeService;
	
	@PostMapping("/post")
	public StoreDto postDto(@RequestBody StoreDto post) {
		return storeService.postDto(post);
	}
	
	@GetMapping("/get/{id}")
	public StoreDto getDto(@PathVariable ("id") int id) {
		return storeService.getDto(id);
	}
	
	@GetMapping("/getAll")
	public List<StoreDto> getAll(){
		return storeService.getAll();
	}
	
	
	
	
	
	
}
