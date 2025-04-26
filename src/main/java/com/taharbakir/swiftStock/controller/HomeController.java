package com.taharbakir.swiftStock.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index(Model model) {	
		model.addAttribute("cunt","Swift-Stock");
		return "index.html"; 
	}
	
	@GetMapping("/getListes")	
	public String getListes(Model model) {	
		return "listes.html";
	}
	
	@GetMapping("/getDetailUneListe")	
	public String getDetailUneListe(@RequestParam(value = "listeId", defaultValue = "") String listeId, Model model) {	
		model.addAttribute("listeId", listeId);
		return "detailUneListe.html";
	}
	
	@GetMapping("/getAjouterProduitDansListe")	
	public String getAjouterProduitDansListe(@RequestParam(value = "listeId", defaultValue = "") String listeId, Model model) {	
		model.addAttribute("listeId", listeId);
		return "formulaireProduit.html";
	}
	
	

	@GetMapping("/submitNouveauProduit")	
	public String submitNouveauProduit(@RequestParam(value = "listeId", defaultValue = "") String listeId, Model model) {	
		model.addAttribute("listeId", listeId);
		return "detailUneListe.html";
	}
}