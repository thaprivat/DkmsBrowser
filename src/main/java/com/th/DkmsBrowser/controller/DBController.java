package com.th.DkmsBrowser.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.th.DkmsBrowser.io.BruttoKey;
import com.th.DkmsBrowser.model.Db;
import com.th.DkmsBrowser.service.DbService;

@Controller
public class DBController {

	List<Db> dbs;

	ArrayList<Db> bruttoKeyList = BruttoKey.createBruttoKeyList();

	@Autowired
	DbService dbService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	@RequestMapping(value = "/list-dbs", method = RequestMethod.GET)
	public ModelAndView showDbs(ModelMap model, @RequestParam("label1") String label1,
			@RequestParam("label2") String label2, @RequestParam("label3") String label3,
			@RequestParam("label4") String label4, @RequestParam("label5") String label5,
			@RequestParam("kno") String kno, @RequestParam("kmgKeyStatus") String kmgKeyStatus) {
		dbs = dbService.retrievedb(label1, label2, label3, label4, label5, kno, kmgKeyStatus, bruttoKeyList);
		model.put("dbs", dbs);
		model.put("name", getLoggedInUserName(model));
		ModelAndView mav = new ModelAndView("list-dbs");
		return mav;
	}

	private String getLoggedInUserName(ModelMap model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}
		return principal.toString();
	}

	@RequestMapping(value = "/detail-db", method = RequestMethod.GET)
	public String showDetailDbPage(@RequestParam int id, ModelMap model) {
		Db db = dbService.retrievedb(id, bruttoKeyList);
		model.put("db", db);
		model.put("name", getLoggedInUserName(model));
		return "db";
	}

	@RequestMapping(value = "/diagram", method = RequestMethod.GET)
	public String showDiagram(@RequestParam int id, ModelMap model) {
		Db db = dbService.retrievedb(id, bruttoKeyList);
		model.put("name", getLoggedInUserName(model));
		model.put("db", db);
		model.put("draws", dbService.createTripleDes(db, bruttoKeyList));
		return "diagram";
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String showSearchPage(ModelMap model) {
		model.put("name", getLoggedInUserName(model));
		return "search";
	}
}