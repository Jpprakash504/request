package com.example.Gst.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Gst.Dao.GstDao;
import com.example.Gst.Entity.GstEntity;
@Service
public class GstService {
	@Autowired
	GstDao gdao;
	
	public String addGst(@RequestBody GstEntity g) {
		return gdao.addGst(g);
	}
	public String deletebyId(@PathVariable int a) {
		return gdao.deletebyId(a);
}
	public List<GstEntity> getList() {
		return gdao.getList();
}
	public int getByhsncode(@PathVariable int hn) {
		return gdao.getByhsncode(hn);
}
}