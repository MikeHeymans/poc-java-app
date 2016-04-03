package be.hogent.pocjavaapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import be.hogent.pocjavaapp.service.MateriaalService;

@Controller
@RequestMapping(value = "/materiaal")
public class MateriaalController {
	@Autowired
	private MateriaalService materiaalService;
	
	@RequestMapping(value = "")
	public ModelAndView index() {
		return new ModelAndView("materiaal/index","materialen", materiaalService.findAll());
	}
}