package com.br.zup.dojo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.zup.dojo.models.NoticiasModel;
import com.br.zup.dojo.services.NoticiaService;

@Controller
public class NoticiaController {

	@Autowired
	private NoticiaService noticiaService;
	
	@GetMapping
	public ModelAndView mostrarPublicacao() {
		ModelAndView model = new ModelAndView("home.html");
		model.addObject("publicacao", noticiaService.mostrarPublicacao());
		
		return model;
	}
	
	@GetMapping("/adicionar")
	public ModelAndView realizarComentario() {
		ModelAndView model = new ModelAndView("comentar.html");
		return model;
	}
	
	@PostMapping("/adicionar")
	public String adicionarComentario(NoticiasModel noticiasModel) {
		noticiaService.adicionarPublicacao(noticiasModel);
		return "redirect:/";
	}
	
	
	@GetMapping("/{nome}")
	public ModelAndView buscarUsuario(@PathVariable String nome) {
		ModelAndView model = new ModelAndView("perfil.html");
		model.addObject("publicacao", noticiaService.buscarUsuario(nome));
		return model;
	}
	
}
