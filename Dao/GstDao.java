package com.example.Gst.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Gst.Entity.GstEntity;
import com.example.Gst.Repository.GstRepository;

@Repository
public class GstDao {
@Autowired
GstRepository grep;
public String addGst(@RequestBody GstEntity g) {
	grep.save(g);
	return "Saved Gst";
}
public String deletebyId(@PathVariable int a) {
	grep.deleteById(a);
	return "Deleted";
}
public List<GstEntity> getList() {
	return grep.findAll();
}
public int getByhsncode(@Param("hc1")int hc1) {
	return grep.getByhsncode(hc1);
}
}
