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
import com.example.thsmanager.service.TantouService;
import com.example.thsmanager.service.TorihikisakiMainService;

@Controller
public class TorihikisakiMainController {
	
	@Autowired
	private TorihikisakiMainService torihikisakiMainService;
	
	@Autowired
	private TantouService tantouService;
	
	@RequestMapping("/index")
	public String selectall(Model model) {
	    List<TorihikisakiMain> toMainList = torihikisakiMainService.selectTorihikisakiMains();
	    List<TorihikisakiTantou> toMainListt = tantouService.selectTorihikisakiTantous();
	    
	    // Debugging: print the contents of toMainList to console
	    toMainList.forEach(System.out::println);
	    toMainListt.forEach(System.out::println);
	    
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
	
	@RequestMapping("upd")
	public String updateTorihikisakiMain(@RequestParam("torihikiId")Integer torihikiId,Model model)
			/*@RequestParam("tantouId")Integer tantouId)*/ {
		model.addAttribute("toMain",torihikisakiMainService.selectTorihikisakiMain(torihikiId));
		/*model.addAttribute("toMainn",tantouService.selectTorihikisakiTantou(tantouId));*/
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


}
