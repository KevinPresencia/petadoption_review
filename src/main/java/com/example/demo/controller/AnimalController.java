package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AnimalModel;
import com.example.demo.service.AnimalService;
@RestController

public class AnimalController {
	@Autowired
	AnimalService sser;
	
	@PostMapping("addpet")
	public AnimalModel add(@RequestBody AnimalModel ss) {
		return sser.saveinfo(ss);
	}
	@GetMapping("showpet")
	public List<AnimalModel>show()
	{
		return sser.showinfo();
	}
	@PostMapping("addnpet")
	public List<AnimalModel> addndetails(@RequestBody List<AnimalModel> ss) 
	{
		return sser.savedetails(ss);
	}
	@GetMapping("getpet/{id}")
	public Optional<AnimalModel>getinfo(@PathVariable int id)
	{
		return sser.gettinfo(id);
	}
	@PutMapping ("updatepet")
	public AnimalModel modify(@RequestBody AnimalModel ss)
	{
		return sser.changeinfo(ss);
	}
	@DeleteMapping ("deletepet")
	public String del(@RequestBody AnimalModel ss)
	{
		sser.deleteinfo(ss);
		return "Deleted successfully";
	}
	@DeleteMapping("delpetid/{id}")
	public void deletemyid(@PathVariable int id)
	{
		sser.deleteid(id);
	}
	@DeleteMapping("delpetparamid")
	public void deletemyparamid(@RequestParam int id)
	{
		sser.deletepid(id);
	}
	@PutMapping("updatepetid/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody AnimalModel ss)
	{
		return sser.updatebyid(id,ss);
	}
	@GetMapping("sorting/{animalname}")
	public List<AnimalModel>getsortinfo(@PathVariable String animalname)
	{
		return sser.sortinfo(animalname);
	}
	@GetMapping("paging/{pageno}/{pagesize}/{animalname}")
	public List<AnimalModel>showpageinfo(@PathVariable int pageno,@PathVariable int pagesize,@PathVariable String animalname)
	{
		return sser.getbypage(pageno,pagesize,animalname);
	}
	@GetMapping("getor/{s}/{b}")
	public List<AnimalModel>displayOr(@PathVariable int s,@PathVariable String b)
	{
		return sser.getpet(s,b);
	}
	@GetMapping("getand/{i}/{n}")
	public List<AnimalModel>displayAnd(@PathVariable int i,@PathVariable String n)
	{
		return sser.getpett(i,n);
	}
	@DeleteMapping("deletequery/{id}")
	public String delstudentdetails(@PathVariable int id)
	{
		return sser.delpet(id)+" deleted";
	}
	@PutMapping("updatequery/{name}/{id}")
	public String updatestudentdetails(@PathVariable String name,@PathVariable int id)
	{
		return sser.updatepet(name,id)+" updated";
	}
	@PostMapping("add")
	public AnimalModel addpet(@RequestBody AnimalModel ss) {
		return sser.savepetinfo(ss);
	}
	@GetMapping("show")
	public List<AnimalModel>showpet()
	{
		return sser.showpetinfo();
	}
	
}
