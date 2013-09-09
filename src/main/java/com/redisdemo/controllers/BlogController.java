package com.redisdemo.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.redisdemo.domain.Blog;

@Controller
@RequestMapping("blogs")
public class BlogController {

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createNewBlog(@RequestBody Blog blog) {
		
		return null;
	}

}
