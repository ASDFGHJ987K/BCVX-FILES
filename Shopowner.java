package com.tns.Shopownerservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shopowner
{
	private String S_name;
	private Integer S_age;
	
	
	public Shopowner() 
	{
		super();
	}
	
	public Shopowner(String s_name, Integer s_age)
	{
		super();
		S_name = s_name;
		S_age = s_age;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public String getS_name() {
		return S_name;
	}
	public void setS_name(String s_name) {
		S_name = s_name;
	}
	public Integer getS_age() {
		return S_age;
	}
	public void setS_age(Integer s_age)
	{
		S_age = s_age;
	}
	@Override
	public String toString()
	{
		return "Shopowner[Shopowner name:"+S_name+" Shoowner age"+S_age+"]";
	}
}

