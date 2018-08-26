package com.skilldistillery.mvcnfl.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.mvcnfl.data.NflDAO;
import com.skilldistillery.nfl.entities.Roster;

@Controller
public class NFLController {
	
	@Autowired
	private NflDAO dao;
	
	@RequestMapping (path="index.do", method = RequestMethod.GET)
	public String index (Model model) {
		return "index";
	}
	
	@RequestMapping(path="getPlayer.do", method = RequestMethod.GET)
	public String showPlayerById(Model model, Integer id) {
		Roster player = dao.show(id);
		model.addAttribute("team", player);
		return "player/show";
	}
	
	@RequestMapping(path="teams.do", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		List<Roster> teams =dao.index();
		
		mv.addObject("teams", teams);
		
		mv.setViewName("index");
		
		return mv;
	}
	
	@RequestMapping(path = "newPlayer.do", method = RequestMethod.POST)
	public ModelAndView addNewPlayer(Roster rost) {
		ModelAndView mv = new ModelAndView();
		Roster newPlayer = dao.addNewPlayer(rost);
		mv.addObject("player", newPlayer);
		mv.setViewName("player/newPlayer");
		return mv;
	}
	
	
//	@RequestMapping(path = "updatePlayer.do", method = RequestMethod.GET)
//	public ModelAndView updatePlayerRedirect(Integer id) {
//		ModelAndView mv = new ModelAndView();
//		Roster player = dao.show(id);
//		mv.addObject("player", player);
//		mv.setViewName("player/updatePlayer");
//		return mv;
//	}
	
	  
//	@RequestMapping(path="updatePlayer.do", method = RequestMethod.POST)
//	public ModelAndView updatePlayer(Roster rost, Integer id) {
//		ModelAndView mv = new ModelAndView();
//		dao.updatePlayer(id, rost);
//		mv.setViewName("player/show");
//		return mv;
//	}
	
	@RequestMapping(path="updatePlayer.do", method = RequestMethod.POST)
	public String updatePlayer(Model model, Integer id, Roster player) { 
		Roster updatedPlayer = dao.updatePlayer(id, player);
		model.addAttribute("player", updatedPlayer);
		return "player/updatePlayer";
	}
	
	@RequestMapping(path="deletePlayer.do", method = RequestMethod.POST)
	public String deletePlayer(Model model, Integer id) {
		if (dao.deletePlayer(id)) {
			return "player/deletePlayer";
		}
		else {
			model.addAttribute("player", dao.show(id));
			return "player/deletePlayer";
		}
	}

	
	
}
