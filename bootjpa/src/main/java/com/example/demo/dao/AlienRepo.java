package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Alien;

import java.util.List;


//primary key type integer
// jpa does all operations for us
//public interface AlienRepo extends CrudRepository<Alien,Integer>{
//	
//	// automatically takes custom function on the basis of dao class parameters
//	List<Alien> findByAname(String aname);
//	
//	List<Alien> findByAidGreaterThan(int aid);
//	
//	@Query("from Alien where aname=?1 order by aid desc")
//	List<Alien> findByNameSorted(String name);
//}

public interface AlienRepo extends JpaRepository<Alien,Integer>{
	
}
