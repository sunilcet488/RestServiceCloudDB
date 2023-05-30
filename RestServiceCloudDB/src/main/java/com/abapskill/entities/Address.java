package com.abapskill.entities;

//import jakarta.persistence.*;
import javax.persistence.*;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false,name= "ID")
	private Long addressId;
	@Column(nullable = false,name= "TYPE")
	private String addressType;
	@Column(nullable = false,name= "STREET")
	private String street;
	@Column(nullable = false,name= "CITY")
	private String city;
	@Column(nullable = false,name= "REGION")
	private String region;
	@Column(nullable = false,name= "COUNTRY")
	private String country;
	
	public Address() {
		
	}
		
	public Address(Long addressId, String addressType, String street, String city, String region, String country) {
		super();
		this.addressId = addressId;
		this.addressType = addressType;
		this.street = street;
		this.city = city;
		this.region = region;
		this.country = country;
	}
	
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
