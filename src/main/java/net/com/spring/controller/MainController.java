/*
 * GumBox Inc
 * (c) 2022 GumBox Inc. Viet Nam
 *
 */
package net.com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author falcon
 */
@Controller
public class MainController {

	@GetMapping("/login")
	public String login() { return "login"; }
	// @GetMapping("/")
	// public String home() { return "index"; }
}
