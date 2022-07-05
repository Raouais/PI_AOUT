package be.hers.info.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import be.hers.info.business.Calculator;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		int gauche = Integer.parseInt(request.getParameter("gauche"));
		int droite = Integer.parseInt(request.getParameter("droit"));
		
		Calculator calculator = new Calculator();
		int res = calculator.add(gauche, droite);
		
		ModelAndView modelView = new ModelAndView();
		modelView.addObject("result", res);
		modelView.setViewName("addResult");
		return modelView;
	}
}
