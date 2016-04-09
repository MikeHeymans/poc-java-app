package be.hogent.pocjavaapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import be.hogent.pocjavaapp.model.Reservatie;
import be.hogent.pocjavaapp.service.ReservatieService;

@Controller
@RequestMapping(value = "/reservatie")
public class ReservatieController {
	
	@Autowired
	private ReservatieService reservatieService;
	
	@RequestMapping(value = "",method=RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("reservaties/index","reservaties",reservatieService.findAll());
	}
	@RequestMapping(value = "/{id}")
	public ModelAndView findOne(@PathVariable("id") Reservatie reservatie) {
		return new ModelAndView("reservaties/detail", "reservatie",reservatie);
	}
}
