package com.example.store.dto;

import jakarta.persistence.Column;

public class StoreDto {
	
		private int id;
		
		private String product;
				
		private String quantity;
		
		private int price;


		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getProduct() {
			return product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public String getquantity() {
			return quantity;
		}

		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

	

}
