package com.pjp2.week2.perCapitaIncome;

import java.util.HashMap;
import java.util.Map;

public class InputData implements Comparable {
	String country;
	String city;
	String gender;
	String currency;
	Double averageIncome;
	
	//map is used to convert between difference currency
	Map<String,Double> convert = new HashMap<String,Double>(){
		{
			put("SGP",1.5);
			put("HKD",8.0);
			put("INR",1.0);
			put("GBP",0.67);
			put("USD",66.0);
			
		}
	};
	public InputData(String city, String country, String gender, String currency, Double averageIncome) {
		super();
		if(country.equals("")) 
			this.country = city;
		else
			this.country = country;
		this.city = city;
		this.gender = gender;
		this.currency = currency;
		//System.out.println("city" + city +"country " + country +"gender " + gender +"curr "+currency +"income " +averageIncome);
		this.averageIncome = averageIncome/convert.get(currency);
	}
	public InputData(String country, String gender, Double averageIncome) {
		super();
		this.country = country;
		this.city = "";
		this.gender = gender;
		this.currency = "";
		this.averageIncome = averageIncome;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Double getAverageIncome() {
		return averageIncome;
	}
	public void setAverageIncome(Double averageIncome) {
		this.averageIncome = averageIncome;
	}
	@Override
	public String toString() {
		return country + "," + gender + "," + averageIncome + "\n";
	}
	@Override
	public int compareTo(Object obj) {
		InputData x = (InputData)obj;
		int genderCompare = this.getGender().compareTo(x.getGender());
		int incomeCompare = this.getAverageIncome().compareTo(x.getAverageIncome());
		int countryCompare = this.getCountry().compareTo(x.getCountry());
		if(countryCompare == 0) {
			if(genderCompare == 0) {
				return incomeCompare;
			}
			else {
				return genderCompare;
			}
		}
		else {
			return countryCompare;
		}
	}
}