package com.skilldistillery.mvcnfl.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String showPlayerById(Model model, Integer tid) {
		Roster nfl = dao.show(tid);
		model.addAttribute("team", nfl);
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
		mv.setViewName("player/show");
		return mv;
	}
	
	@RequestMapping(path="updatePlayer.do", method = RequestMethod.POST)
	public String updatePlayer(Model model, Roster rost) { 
		Roster updatedPlayer = dao.updatePlayer(rost);
		model.addAttribute("player", updatedPlayer);
		return "player/show";
	}
	
	@RequestMapping(path="deletePlayer.do", method = RequestMethod.POST)
	public String deletePlayer(Model model, int id) {
		if (dao.deletePlayer(id)) {
			return "player/show";
		}
		else {
			model.addAttribute("player", dao.show(id));
			return "player/show";
		}
	}

	
	
}
//if (filmId == 0) {
//	mv.setViewName("noUpdate");
//	return mv;
//} else {
//	Film film = dao.getFilmbyFilmId(filmId);
//	boolean updated = dao.updateFilm(film);
//	if (updated) {
//		redir.addFlashAttribute("film");
//		mv.setViewName("film");
//		return mv;
//	} else {
//		mv.setViewName("noUpdate");
//		return mv;
//	}