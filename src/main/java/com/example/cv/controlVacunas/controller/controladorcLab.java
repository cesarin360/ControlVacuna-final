package com.example.cv.controlVacunas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.cv.controlVacunas.interfacesServices.cLab;
import com.example.cv.controlVacunas.interfacesServices.cPais;
import com.example.cv.controlVacunas.Model.cat_laboratorios;
import com.example.cv.controlVacunas.Model.cat_pais;

import java.util.*;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping
public class controladorcLab {
	@Autowired
	private cLab c;
	@Autowired
	private cPais d;

	@GetMapping("/inicio")
	public String inicio() {
		return "inicio";
	}

	@GetMapping("/clab/list")
	public String listar(Model model) {
		try {
			List<cat_laboratorios> cl = c.listar();
			model.addAttribute("cat_Laboratorios", cl);
			return "index";
		} catch (Exception e) {
			return "error";
		}
	}

	@GetMapping("/clab/nuevo")
	public String agregar(Model model) {
		try {
			model.addAttribute("cat_laboratorios", new cat_laboratorios());
			List<cat_pais> listpais = d.listaPaises();
			model.addAttribute("paises", listpais);
			return "form";
		} catch (Exception e) {
			return "error";
		}
	}

	@PostMapping("/clab/save")
	public String save(@Valid cat_laboratorios cf, BindingResult result, Model model,
			RedirectAttributes redirectAttrs) {
		if (result.hasErrors()) {
			List<cat_pais> listpais = d.listaPaises();
			model.addAttribute("paises", listpais);
			return "form";
		} else {
			c.save(cf);
			redirectAttrs.addFlashAttribute("mensaje", "Se ha agregado correctamente.").addFlashAttribute("clase",
					"success");
			return "redirect:/clab/nuevo";
		}
	}

	@GetMapping("/clab/editar/{id_laboratorio}")
	public String editar(@PathVariable int id_laboratorio, Model model) {
		try {
			Optional<cat_laboratorios> cl = c.listarId(id_laboratorio);
			model.addAttribute("cat_laboratorios", cl);
			List<cat_pais> listpais = d.listaPaises();
			model.addAttribute("paises", listpais);
			return "form";
		} catch (Exception e) {
			return "error";
		}
	}

	@GetMapping("/clab/delete/{id_laboratorio}")
	public String delete(@PathVariable int id_laboratorio, Model model) {
		try {
			c.delete(id_laboratorio);
			return "redirect:/clab/list";
		} catch (Exception e) {
			return "error";
		}
	}

}
