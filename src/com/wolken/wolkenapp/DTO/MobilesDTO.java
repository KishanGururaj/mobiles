package com.wolken.wolkenapp.DTO;

public class MobilesDTO {
	private int mobileId;
	private String modelName;
	private int price;
	private String brandName;

	public MobilesDTO() {
		System.out.println("object is created");
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getMobileId() {
		return mobileId;
	}

	public String getModelName() {
		return modelName;
	}

	public int getPrice() {
		return price;
	}

	public String getBrandName() {
		return brandName;
	}

	@Override
	public String toString() {
		return "MobileDTO: mobileId" + this.mobileId + " ModelName: " + this.modelName + " Price: " + this.price
				+ " brandName" + this.brandName;

	}

}
