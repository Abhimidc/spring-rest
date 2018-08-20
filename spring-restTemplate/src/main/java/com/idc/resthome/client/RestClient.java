package com.idc.resthome.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.idc.resthome.model.Accounth;

@Component
public class RestClient {
	@Autowired
	RestTemplate restTemplate;

	@SuppressWarnings("unchecked")
	public List<Accounth> findallacoount(String url) {
		return restTemplate.getForObject(url, List.class);

	}

	public String delete(String url) {
		restTemplate.delete(url);
		return "deleted";
	}

	public String save(String url, Accounth accounth) {
		restTemplate.postForLocation(url, accounth);
		return "save";
	}

	public Accounth update(String url) {

		return restTemplate.getForObject(url, Accounth.class);
	}

	public String update1(String url, Accounth account) {

		restTemplate.put(url, account);
		return "update";
	}

}
