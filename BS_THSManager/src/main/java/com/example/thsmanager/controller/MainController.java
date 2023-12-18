package com.example.thsmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.thsmanager.service.MainService;

@Controller
public class MainController {

	@Autowired
	private MainService mainService;
	
	@RequestMapping("index")
	public String selectall(Model model) {
		model.addAttribute("toMainList", mainService.selectUsers());
		return "index";
	}
	
	@RequestMapping("add")
	public String insert() {
		return "add";
	}
	
	@RequestMapping("upd")
	public String updateByExample(@RequestParam("ID")Long id,Model model){
		model.addAttribute("toMain",mainService.selectUser(id));
		return "upd";
		}
	@RequestMapping("del")
	public String deleteByPrimaryKey(@RequestParam("ID")Long id,Model model) {
		mainService.deleteByPrimaryKey(id);
		return "redirect:/index";
	}
}
