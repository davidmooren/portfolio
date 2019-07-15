package com.websystique.springmvc.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "pizza")
public class Pizza {
	
	private String name;
	private String flavor;
	private List<String> toppings = new ArrayList<String>();
	
	public Pizza(){
		
	}
	
	public Pizza(String name){
		this.name = name;
		this.flavor = "A pecado";
		this.toppings.add("Extra queso");
		this.toppings.add("Bacon");
	}
	
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@XmlElement
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getFlavor() {
		return flavor;
	}

	public List<String> getToppings() {
		return toppings;
	}
	
	@XmlElement
	public void setToppings(List<String> toppings) {
		this.toppings = toppings;
	}
	
}
