package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.AnimalModel;
import com.example.demo.repository.AnimalRepo;

@Service

public class AnimalService {
	@Autowired
	AnimalRepo sr;
	public AnimalModel saveinfo(AnimalModel ss)
	{
		return sr.save(ss);
	}
	public List<AnimalModel>showinfo()
	{
		return sr.findAll();
	}
	public List<AnimalModel>savedetails(List<AnimalModel>ss)
	{
		return (List<AnimalModel>)sr.saveAll(ss);
	}
	public Optional<AnimalModel> gettinfo(int id)
	{
//		return sr.findById(id);
		sr.findById(id);
		if(sr.existsById(id))
		{
			return sr.findById(id);
		}
		else
		{
			return Optional.empty();
		}
	}
	public AnimalModel changeinfo(AnimalModel ss)
	{ 
		return sr.saveAndFlush(ss);
	}
	public void deleteinfo(AnimalModel ss)
	{
		sr.delete(ss);
	}
	public void deleteid(int id)
	{
		sr.deleteById(id);
	}
	public void deletepid(int id)
	{
		sr.deleteById(id);
	}
	public String updatebyid(int id,AnimalModel ss)
	{
		sr.saveAndFlush(ss);
		if(sr.existsById(id))
		{
			return "Updated";
		}
		else
		{
			return "Enter valid Id";
		}
	}
	public List<AnimalModel>sortinfo(String s)
	{
		return sr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}
	public List<AnimalModel>getbypage(int pgno,int pgsize,String s)
	{
		Page<AnimalModel>p=sr.findAll(PageRequest.of(pgno, pgsize,Sort.by(Sort.DEFAULT_DIRECTION,s )));
		return p.getContent();
	}
	public List<AnimalModel>getpet(int s,String b)
	{
		return sr.getpetor(s,b);
	}
	public List<AnimalModel>getpett(int i,String n)
	{
		return sr.getpetand(i,n);
	}
	public int delpet(int id)
	{
		return sr.deletepetInfo(id);
	}
	public int updatepet(String name,int i)
	{
		return sr.updatepetInfo(name,i);
	}
	public AnimalModel savepetinfo(AnimalModel ss)
	{
		return sr.save(ss);
	}
	public List<AnimalModel>showpetinfo()
	{
		return sr.findAll();
	}
}
