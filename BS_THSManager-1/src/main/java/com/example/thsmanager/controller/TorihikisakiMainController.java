package com.example.thsmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.thsmanager.entity.TorihikisakiMain;
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
	
	@RequestMapping("/add/add")
	public String addAddTorihikisaki(TorihikisakiMain torihikisakiMain){
	    torihikisakiMainService.addTorihikisakiMain(torihikisakiMain);
	    return "redirect:/index";
	}

//	@RequestMapping("/add/add")
//	public String addAddTorihikisaki(TorihikisakiMain torihikisakiMain, Model model){
//	    model.addAttribute("toMain", torihikisakiMain);
//	    torihikisakiMainService.addTorihikisakiMain(torihikisakiMain);
//	    return "redirect:/index";
//	}
	
//    @PostMapping("/add/add")
//    public String handleFormSubmit(
//            @RequestParam("torihikiId") Integer torihikiId,
//            @RequestParam("torihikiNameAll") String torihikiNameAll,
//            @RequestParam("torihikiRyaku") String torihikiRyaku,
//            @RequestParam("yuubin") String yuubin,
//            @RequestParam("jyusyo1") String jyusyo1) {
//        
//        return "redirect:/index";
//    }
	
//	@RequestMapping("/add/add")
//	public String addAddTorihikisaki(@RequestBody()Integer ID,Model model) {
//		model.addAttribute("toMain",torihikisakiMainService.selectTorihikisakiMain(ID));
//		return "redirect:/index";
//	}
	
	
	@RequestMapping("upd")
	public String updateTorihikisakiMain(@RequestParam("torihikiId")Integer torihikiId,Model model) {
		model.addAttribute("toMain",torihikisakiMainService.selectTorihikisakiMain(torihikiId));
		return "upd";
	}
	
	@RequestMapping("del")
	public String delTorihikisakiMain(@RequestParam("torihikiId")Integer ID,Model model) {
		torihikisakiMainService.delTorihikisakiMain(ID);
		return "redirect:/index";
	}

}
