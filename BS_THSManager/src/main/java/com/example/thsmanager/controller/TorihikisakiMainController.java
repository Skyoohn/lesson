package com.example.thsmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.thsmanager.entity.TorihikisakiMain;
import com.example.thsmanager.entity.TorihikisakiTantou;
import com.example.thsmanager.service.TorihikisakiMainService;
import com.example.thsmanager.service.TorihikisakiTantouService;

@Controller
public class TorihikisakiMainController {
	
	@Autowired
	private TorihikisakiMainService torihikisakiMainService;
	
	@Autowired
	private TorihikisakiTantouService torihikisakiTantouService;
	
	@RequestMapping("/index")
	public String selectall(Model model) {
	    List<TorihikisakiMain> toMainList = torihikisakiMainService.selectTorihikisakiMains();
	    List<TorihikisakiTantou> toMainListt = torihikisakiTantouService.selectTorihikisakiTantous();
	    
	    toMainList.forEach(System.out::println);
	    toMainListt.forEach(System.out::println);
	    
	    model.addAttribute("toMainList", toMainList);
	    model.addAttribute("toMainListt", toMainListt);
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
	
	/*	@RequestMapping("/upd/add")
		public String addTorihikisakiT(TorihikisakiTantou torihikisakiTantou){
			torihikisakiTantouService.addTorihikisakiTantou(torihikisakiTantou);
		    return "redirect:/upd";
		}*/
	
	@RequestMapping("/upd/add")
    public String addTorihikisakiT(@ModelAttribute("toMainn") TorihikisakiTantou toMainn) {
		torihikisakiTantouService.addTorihikisakiTantou(toMainn);
        return "redirect:/index";
	}
	
	@RequestMapping("upd")
	public String updateTorihikisakiMain(@RequestParam("torihikiId")Integer torihikiId,Model model)
			/*@RequestParam("tantouId")Integer tantouId)*/ {
		model.addAttribute("toMain",torihikisakiMainService.selectTorihikisakiMain(torihikiId));
		/*		model.addAttribute("toMainn",torihikisakiTantouService.selectTorihikisakiTantou(tantouId));*/
		return "upd";
	}
	
    @PostMapping("/upd/upd")
    public String updateTorihikisakiMains(@ModelAttribute("toMain") TorihikisakiMain toMain) {
        torihikisakiMainService.updateTorihikisakiMain(toMain);
        return "redirect:/index";
    }
	
	@RequestMapping("del")
	public String delTorihikisakiMain(@RequestParam("torihikiId")Integer torihikiId,Model model) {
		torihikisakiMainService.delTorihikisakiMain(torihikiId);
		return "redirect:/index";
	}
	
	@RequestMapping("/upd/del")
	public String delTorihikisakiTantou(@RequestParam("tantouId")Integer tantouId,Model model) {
		torihikisakiTantouService.delTorihikisakiTantou(tantouId);
		return "redirect:/index";
	}


}
