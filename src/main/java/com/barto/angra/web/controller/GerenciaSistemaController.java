package com.barto.angra.web.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gerencia")
public class GerenciaSistemaController {
	
	@GetMapping("/exibir")
	public String exibir() {
		return "/gerencia/gerencia";
	}

}
