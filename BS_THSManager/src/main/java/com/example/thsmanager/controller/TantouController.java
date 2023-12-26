package com.example.thsmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.thsmanager.entity.TorihikisakiTantou;
import com.example.thsmanager.service.TantouService;

@Controller
public class TantouController {
	
	@Autowired
	private TantouService tantouService;
	
	@RequestMapping("/indexx")
	public String selectalll(Model model) {
	    List<TorihikisakiTantou> toMainListt = tantouService.selectTorihikisakiTantous();
	    
	    // Debugging: print the contents of toMainList to console
	    toMainListt.forEach(System.out::println);
	    
	    model.addAttribute("toMainListt", toMainListt);
	    return "indexx";
	}

	
	@RequestMapping("/upd/add")
	public String addTorihikisakiTantou() {
		return "add";
	}
	
	@RequestMapping("upd/add/add")
	public String addAddTorihikisakiTantou(TorihikisakiTantou torihikisakiTantou){
		tantouService.addTorihikisakiTantou(torihikisakiTantou);
	    return "redirect:/index";
	}
	
	@RequestMapping("updd")
	public String updateTorihikisakiTantou(@RequestParam("tantouId")Integer tantouId,Model model) {
		model.addAttribute("toMainn",tantouService.selectTorihikisakiTantou(tantouId));
		return "upd";
	}
	
    @PostMapping("/upd/updd")
    public String updateTorihikisakiTantou(@ModelAttribute("toMainn") TorihikisakiTantou toMainn) {
    	tantouService.updateTorihikisakiTantou(toMainn);
        return "redirect:/index";
    }
	
	@RequestMapping("/upd/del")
	public String delTorihikisakiTantou(@RequestParam("tantouId")Integer tantouId,Model model) {
		tantouService.delTorihikisakiTantou(tantouId);
		return "redirect:/upd";
	}


}
