package com.skilldistillery.mvcnfl.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.mvcnfl.data.NflDAO;
import com.skilldistillery.nfl.entities.NFL;

@Controller
public class NFLController {
	
	@Autowired
	private NflDAO dao;
	
	@RequestMapping (path="index.do", method = RequestMethod.GET)
	public String index (Model model) {
		return "index";
	}
	
	@RequestMapping(path="getPlayer.do", method = RequestMethod.GET)
	public String showFilmById(Model model, Integer fid) {
		NFL nfl = dao.show(fid);
		model.addAttribute("team", nfl);
		return "film/show";
	}
	
	@RequestMapping(path="teams.do", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		List<NFL> teams =dao.index();
		
		mv.addObject("teams", teams);
		
		mv.setViewName("index");
		
		return mv;
	}

	
	
}
