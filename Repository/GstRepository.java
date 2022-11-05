package com.example.Gst.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Gst.Entity.GstEntity;


public interface GstRepository extends JpaRepository <GstEntity,Integer>{
	@Query(value="select pecentage from gst where hsncode=:hc1",nativeQuery = true)
	public int getByhsncode(@Param("hc1")int hc1);

}
