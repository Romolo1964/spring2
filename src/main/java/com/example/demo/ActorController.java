package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ActorController {

	@Autowired
	ActorService as;

	@RequestMapping ("/")

	public String index () {

		return "index";
	}

	@RequestMapping ("/pippo")

public ModelAndView pippo () {

			List <Actor>ls=as.findAll();
			System.out.println(ls);
			ModelAndView modelAndView = new ModelAndView("pippo.jsp");
	        modelAndView.addObject("message",ls);
		return modelAndView;
	}

	@RequestMapping("lista")
	public List<Actor> findall() {
		List<Actor> ls=as.findAll();
		System.out.println(ls);
		return ls;
	}


	    @RequestMapping("/lista2")
	    public ModelAndView example() {
	    	List<Actor> ls=as.findAll();
	        ModelAndView modelAndView = new ModelAndView("lista2.jsp");
	        modelAndView.addObject("message",ls);
	        System.out.println(modelAndView);
	        System.out.println(ls);
	        return modelAndView;
	    }
	}


