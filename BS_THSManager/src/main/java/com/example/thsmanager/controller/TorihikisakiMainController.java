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
	
//	@RequestMapping("/add")
//	public String addTorihikisaki() {
//		return "add";
//	}
	
	@RequestMapping("/add")
	public String addTorihikisaki(@RequestParam("torihikiId") Long torihikiId, Model model) {
	    // 여기서 필요한 로직 수행
	    model.addAttribute("tomain", torihikisakiMainService.selectTorihikisakiMain(torihikiId));
	    return "add";
	}

	
	@RequestMapping("upd")
	public String updateTorihikisakiMain(@RequestParam("torihikiId")Long ID,Model model) {
		model.addAttribute("tomain",torihikisakiMainService.selectTorihikisakiMain(ID));
		return "upd";
	}
	
	@RequestMapping("del")
	public String delTorihikisakiMain(@RequestParam("torihikiId")Long ID,Model model) {
		torihikisakiMainService.delTorihikisakiMain(ID);
		return "redirect:/index";
	}

}
