package com.tns.Shopownerservice;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Shopowner_service_Controller
{
	@Autowired(required=true)
	private Shopowner_Service service;
	
	@GetMapping("/shopownerservice")
	public java.util.List<Shopowner> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/shopownerservice/{s_name}")
	public ResponseEntity<Shopowner> get(@PathVariable String S_name)
	{
		try
		{
			Shopowner shop=service.get(S_name);
			return new ResponseEntity<Shopowner>(shop,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<Shopowner>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/shopownerservice")
	public void add(@RequestBody Shopowner shop)
	{
		service.save(shop);
	}
	
	@PutMapping("/shopownerservice/{s_id}")
	public ResponseEntity<?> update(@RequestBody Shopowner shop, @PathVariable String S_name)
	{
		Shopowner existshop=service.get(S_name);
		service.save(existshop);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/shopownerservice/{s_name}")
	public void delete(@PathVariable String s_name)
	{
		service.delete(s_name);
	}
}

