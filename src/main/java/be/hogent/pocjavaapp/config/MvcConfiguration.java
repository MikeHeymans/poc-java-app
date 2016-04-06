package be.hogent.pocjavaapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfiguration extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry reg) {

		reg.addViewController("/").setViewName("index");
		reg.addViewController("/login").setViewName("login");
		reg.addViewController("/denied").setViewName("denied");
	}
}
