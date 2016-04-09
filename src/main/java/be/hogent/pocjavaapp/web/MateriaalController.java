package be.hogent.pocjavaapp.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import be.hogent.pocjavaapp.model.Materiaal;
import be.hogent.pocjavaapp.service.DoelgroepServiceImpl;
import be.hogent.pocjavaapp.service.LeergebiedServiceImpl;
import be.hogent.pocjavaapp.service.MateriaalService;
import be.hogent.pocjavaapp.valueobjects.SearchValue;

@Controller
@RequestMapping(value = "/materiaal")
public class MateriaalController {
	@Autowired
	private MateriaalService materiaalService;
	@Autowired
	private LeergebiedServiceImpl leergebiedService;
	@Autowired
	private DoelgroepServiceImpl doelgroepService;
	
	@RequestMapping(value = "")
	public ModelAndView index() {
		return new ModelAndView("materiaal/index","materialen", materiaalService.findAll())
				.addObject("searchValue",new SearchValue());
	}
	@RequestMapping(value = "", params = "query")
	public ModelAndView search(SearchValue value) {
		return new ModelAndView("materiaal/index","materialen", materiaalService.search(value.getQuery()))
				.addObject("searchValue",value);
	}	
	@RequestMapping(value = "", method= RequestMethod.POST)
	public ModelAndView create(Materiaal materiaal) {
		materiaalService.save(materiaal);
		return new ModelAndView("materiaal/detail","materiaal",materiaal);
	}
	@RequestMapping(value = "/{materiaal}")
	public ModelAndView read(@PathVariable Materiaal materiaal) {
		return new ModelAndView("materiaal/detail","materiaal",materiaal);
	}
	@RequestMapping(value = "/delete/{materiaal}", method = RequestMethod.POST)
	public ModelAndView delete(@PathVariable Materiaal materiaal) {
		materiaalService.delete(materiaal);
		return new ModelAndView("redirect:/materiaal");
	}
	@RequestMapping(value="/edit/{materiaal}")
	public ModelAndView edit(@PathVariable Materiaal materiaal) {
		return new ModelAndView("materiaal/create","materiaal",materiaal)
				.addObject("leergebieden",leergebiedService.findAll())
				.addObject("doelgroepen",doelgroepService.findAll())
				;
	}
	@RequestMapping(value="/create")
	public ModelAndView create() {
		return new ModelAndView("materiaal/create","materiaal",new Materiaal())
				.addObject("leergebieden",leergebiedService.findAll())
				.addObject("doelgroepen",doelgroepService.findAll())
				;
	}
}
