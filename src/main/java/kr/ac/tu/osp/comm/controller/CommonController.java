package kr.ac.tu.osp.comm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
	
	@GetMapping("/")
	public String index() {
		return "Open Source Program..";
	}
	
	@GetMapping("/osp")
	public String osp() {
		return "Git에서 수정..";
	}

}
