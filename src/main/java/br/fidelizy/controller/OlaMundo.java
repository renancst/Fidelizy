package br.fidelizy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaMundo {

	@RequestMapping("/olaMundo")
	public String execute() {
		System.out.println("Executando a l�gica com Spring MVC");
		return "ok";
	}
}
