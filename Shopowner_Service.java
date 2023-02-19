package com.tns.Shopownerservice;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class Shopowner_Service 
{
	@Autowired
	private Shopowner_Service_Repository repo;
	
	public List<Shopowner> listAll()
	{
		return repo.findAll();
	}
	
	public void save(Shopowner shop)
	{
		repo.save(shop);
	}
	
	public Shopowner get(String s_name)
	{
		return repo.findById(s_name).get();
	}
	public void delete(String s_name)
	{
		repo.deleteById(s_name);
	}
	
}


