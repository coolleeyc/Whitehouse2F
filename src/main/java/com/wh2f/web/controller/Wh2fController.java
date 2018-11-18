package com.wh2f.web.controller;

import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wh2f.web.dto.ItemInfoDTO;
import com.wh2f.web.service.Wh2fService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class Wh2fController {
	
	private static final Logger logger = LoggerFactory.getLogger(Wh2fController.class);
	
	@Resource(name="com.wh2f.web.service.Wh2fServiceImpl")
	private Wh2fService wh2fServiceImpl;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome Whitehouse2F! The client locale is {}.", locale);
		
		
		try {
			ItemInfoDTO product = wh2fServiceImpl.selectProductService(1001);
			
			model.addAttribute("productName", product.getItem_name());
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		return "home";
	}
	
}
