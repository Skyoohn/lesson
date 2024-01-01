/*package com.example.thsmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.thsmanager.entity.TorihikisakiMain;
import com.example.thsmanager.service.TorihikisakiMainService;

@Controller
public class TorihikisakiTantouController {
	
	@Autowired
	private TorihikisakiMainService torihikisakiMainService;
	
	@RequestMapping("/index")
	public String selectall(Model model) {
	    List<TorihikisakiMain> toMainList = torihikisakiMainService.selectTorihikisakiMains();
	    
	    toMainList.forEach(System.out::println);
	    
	    model.addAttribute("toMainList", toMainList);
	    return "index";
	}

	
	@RequestMapping("/add")
	public String addTorihikisaki() {
		return "add";
	}
	
	@RequestMapping("/add/add")
	public String addAddTorihikisaki(TorihikisakiMain torihikisakiMain){
	    torihikisakiMainService.addTorihikisakiMain(torihikisakiMain);
	    return "redirect:/index";
	}
	
	@RequestMapping("del")
	public String delTorihikisakiMain(@RequestParam("torihikiId")Integer torihikiId,Model model) {
		torihikisakiMainService.delTorihikisakiMain(torihikiId);
		return "redirect:/index";
	}


}
*/