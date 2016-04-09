package be.hogent.pocjavaapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import be.hogent.pocjavaapp.repository.GebruikerRepository;

@Controller
@RequestMapping(value = "/")
public class IndexController {
	
	@Autowired
	private GebruikerRepository gebruikerRepository;
	
	@RequestMapping(value = "", method=RequestMethod.GET)
	ModelAndView index() {
		return new ModelAndView("index","gebruikers",gebruikerRepository.findAll());
	}
}
