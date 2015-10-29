package com.demo.Demo1.services;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.Demo1.model.Status;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class BaseServices {

	@Autowired
	private ServletContext context;
	private static final Logger log = Logger.getLogger(BaseServices.class);

	@PostConstruct
	public void init() {
		log.info("init Demo Controller");
	}

	@RequestMapping(value="/hello", method=RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public Status hello(HttpServletRequest req, HttpServletResponse res)
	{
	  Status status = new Status();
		status.setStatus(Status.STATUS_OK);
		status.setMsg("hello");
		return status;
	}
}
