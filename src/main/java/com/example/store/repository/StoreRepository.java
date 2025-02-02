package com.example.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.store.entity.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Integer> {

}
