package com.example.store.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.store.dto.StoreDto;
import com.example.store.entity.Store;
import com.example.store.repository.StoreRepository;

@Service
public class StoreServiceImp implements StoreService{
	
	@Autowired
	StoreRepository storeRepo;
	
	@Override
	public StoreDto postDto(StoreDto post) {
		Store store = new Store();
		store.setId(post.getId());
		store.setProduct(post.getProduct());
		store.setQuantity(post.getquantity());
		store.setPrice(post.getPrice());
		storeRepo.save(store) ;
		 return post;
		  
	}

	@Override
	public StoreDto getDto(int id) {
		Optional<Store> store = storeRepo.findById(id);
		Store entity = store.get();
		StoreDto dto = new StoreDto();
		dto.setId(entity.getId());
		dto.setProduct(entity.getProduct());
		dto.setQuantity(entity.getQuantity());
		dto.setPrice(entity.getPrice());
		return dto;
	}

	@Override
	public List<StoreDto>  getAll() {
		List<Store> store = storeRepo.findAll();
		List<StoreDto> dto = new ArrayList<>();
		for(Store s: store) {
			StoreDto stDto = new StoreDto();
			stDto.setId(s.getId());
			stDto.setProduct(s.getProduct());
			stDto.setQuantity(s.getQuantity());
			stDto.setPrice(s.getPrice());
			dto.add(stDto);
		}
		return dto;
	}

	
	
	
	
	
	
	
}
