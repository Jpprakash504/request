package com.example.Gst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Gst.Entity.GstEntity;
import com.example.Gst.Services.GstService;


@RestController
public class GstController {
	@Autowired
	GstService gser;
	@PostMapping("/addGst")
	public String addGst(@RequestBody GstEntity g) {
		return gser.addGst(g);
	}
	@DeleteMapping("/delete/{a}")
	public String deletebyId(@PathVariable int a) {
		return gser.deletebyId(a);
	}
	@GetMapping("/getList")
	public List<GstEntity> getList() {
		return gser.getList();
}
	@GetMapping("/getph/{hn}")
	public int getByhsncode(@PathVariable int hn) {
		return gser.getByhsncode(hn);
}
}