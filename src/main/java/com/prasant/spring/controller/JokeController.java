package com.prasant.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prasant.spring.services.JokesService;

@Controller
public class JokeController {
	
	private JokesService jokesService;
	
	public JokeController(JokesService jokesService) {
		this.jokesService = jokesService;
	}

	@RequestMapping({"/", ""})
	public String showJoke(Model model) {
		model.addAttribute("joke", jokesService.getJoke());
		return "chucknorris";
	}

}
