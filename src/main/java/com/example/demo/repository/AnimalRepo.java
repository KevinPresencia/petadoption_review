package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.AnimalModel;

import jakarta.transaction.Transactional;

public interface AnimalRepo extends JpaRepository<AnimalModel, Integer>{
	
	@Query(value="select * from pettable where id=:s or animalname=:sn",nativeQuery=true)
	public List<AnimalModel>getpetor(@Param("s")int id,@Param("sn") String animalname);
	
	@Query(value="select * from pettable where id=:i and name=:n",nativeQuery=true)
	public List<AnimalModel>getpetand(@Param("i")int id,@Param("n") String animalnamename);
	
	@Modifying 
	@Transactional
	@Query(value="delete from pettable where id=:s",nativeQuery=true)
	public int deletepetInfo(@Param("s") int id);
	
	@Modifying 
	@Transactional
	@Query(value="update pettable set animalname=:s where id=:sn",nativeQuery=true)
	public int updatepetInfo(@Param("s") String animalname,@Param("sn")int id);
}
