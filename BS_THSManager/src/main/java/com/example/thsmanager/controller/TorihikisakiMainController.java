package com.example.thsmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.thsmanager.service.TorihikisakiMainService;

@Controller
public class TorihikisakiMainController {
	
	@Autowired
	private TorihikisakiMainService torihikisakiMainService;
	
	@RequestMapping("/index")
	public String selectall(Model model) {
		model.addAttribute("toMainList",torihikisakiMainService.selectTorihikisakiMains());
		return "index";
	}
	
	@RequestMapping("/add")
	public String addTorihikisaki() {
		return "add";
	}
	
	@RequestMapping("upd")
	public String updTorihikisakiMain(@RequestParam("torihikiID")Integer id,Model model) {
		model.addAttribute("tomain",torihikisakiMainService.selectTorihikisakiMain(id));
		return "upd";
	}
	
	@RequestMapping("del")
	public String delTorihikisakiMain(@RequestParam("torihikiId")Integer id,Model model) {
		torihikisakiMainService.delTorihikisakiMain(id);
		return "redirect:/index";
	}

}
