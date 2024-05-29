package com.example.store.service;



import java.util.List;

import com.example.store.dto.StoreDto;


public interface StoreService {

	StoreDto postDto(StoreDto post);

	StoreDto getDto(int id);

	List<StoreDto> getAll();

}
