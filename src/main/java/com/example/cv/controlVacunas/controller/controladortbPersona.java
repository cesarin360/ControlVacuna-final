package com.example.cv.controlVacunas.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.cv.controlVacunas.Model.tb_persona;
import com.example.cv.controlVacunas.interfacesServices.tbPersona;

@Controller
@RequestMapping
public class controladortbPersona {
	@Autowired
	private tbPersona c;

	@GetMapping("/dpersona/list")
	public String listar(Model model) {
		try {
			List<tb_persona> cl = c.listar();
			model.addAttribute("Tb_persona", cl);
			return "index3";
		} catch (Exception e) {
			return "error";
		}
	}

	@GetMapping("/tbpersona/agregar")
	public String agregar(Model model) {
		try {
			model.addAttribute("tb_persona", new tb_persona());
			return "form3";
		} catch (Exception e) {
			return "error";
		}
	}

	@PostMapping("/tbpersona/save")
	public String save(@Valid tb_persona cf, BindingResult result, Model model, RedirectAttributes redirectAttrs) {
		if (result.hasErrors()) {
			return "form3";
		}else {
		c.save(cf);
		redirectAttrs.addFlashAttribute("mensaje", "Se ha agregado correctamente.").addFlashAttribute("clase",
				"success");
		return "redirect:/tbpersona/agregar";
		}
	}

	@GetMapping("/tbpersona/editar/{cui}")
	public String editar(@PathVariable String cui, Model model) {
		try {
			Optional<tb_persona> cl = c.listarId(cui);
			model.addAttribute("tb_persona", cl);
			return "form3";
		} catch (Exception e) {
			return "error";
		}
	}

	@GetMapping("/tbpersona/delete/{cui}")
	public String delete(@PathVariable String cui) {
		try {
			c.delete(cui);
			return "redirect:/dpersona/list";
		} catch (Exception e) {
			return "error";
		}
	}
}
