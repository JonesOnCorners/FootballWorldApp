package com.footballworld.footballapp;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.footballworld.entities.Managers;
import com.footballworld.service.ManagerService;

@RestController
@RequestMapping(value = "/managers")
public class ManagerController {

	private static Logger logger = LoggerFactory.getLogger(ManagerController.class);

	private ManagerService managerService;

	@Autowired(required = true)
	@Qualifier(value = "managerService")
	public void setPersonService(ManagerService ms) {
		this.managerService = ms;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void addManager(@RequestBody Managers m) {

		logger.info("Inside add manager call-->" + m.getManagerId());

		logger.info("Inside add manager method-->" + m);
		this.managerService.addManager(m);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/JSON")
	public Managers getManagerById(@PathVariable("id") int id) {

		Managers m = (Managers) this.managerService.getManagerById(id);
		return m;
		// return "redirect:/managers";
	}

	@RequestMapping(value = "/managerlist", method = RequestMethod.GET, produces = "application/JSON")
	public @ResponseBody List<Managers> getAllManagers() {
		logger.info("Retreived list-->");
		return this.managerService.getAllManagers();

	}

}
