package org.springframework.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.redisdemo.config.WebAppConfig;

public class AppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.register(WebAppConfig.class);
		Dynamic dynamic = servletContext.addServlet("appServlet", new DispatcherServlet(webApplicationContext));
		dynamic.setLoadOnStartup(1);
		dynamic.addMapping("/");
	}

}
