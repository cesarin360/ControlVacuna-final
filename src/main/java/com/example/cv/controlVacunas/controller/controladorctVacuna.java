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

import com.example.cv.controlVacunas.Model.cat_laboratorios;
import com.example.cv.controlVacunas.Model.cat_pais;
import com.example.cv.controlVacunas.Model.cat_tipo_vacuna;
import com.example.cv.controlVacunas.interfacesServices.cLab;
import com.example.cv.controlVacunas.interfacesServices.cPais;
import com.example.cv.controlVacunas.interfacesServices.ctVacuna;

@Controller
@RequestMapping
public class controladorctVacuna {

	@Autowired
	private ctVacuna c;
	@Autowired
	private cLab z;
	@Autowired
	private cPais d;

	@GetMapping("/list/tipovacuna")
	public String listar(Model model) {
		try {
			List<cat_tipo_vacuna> cls = c.listars();
			model.addAttribute("Cat_tipo_vacuna", cls);
			return "index4";
		} catch (Exception e) {
			return "error";
		}
	}

	@GetMapping("/ctvacuna/nuevo")
	public String agregar(Model model) {
		try {
			model.addAttribute("cat_tipo_vacuna", new cat_tipo_vacuna());
			List<cat_pais> listpais = d.listaPaises();
			model.addAttribute("paises", listpais);
			List<cat_laboratorios> cl = z.listar();
			model.addAttribute("cat_Laboratorios", cl);
			return "form1";
		} catch (Exception e) {
			return "error";
		}
	}

	@PostMapping("/ctvacuna/save")
	public String save(@Valid cat_tipo_vacuna cf, BindingResult result, Model model, RedirectAttributes redirectAttrs) {
		if (result.hasErrors()) {
			List<cat_pais> listpais = d.listaPaises();
			model.addAttribute("paises", listpais);
			List<cat_laboratorios> cl = z.listar();
			model.addAttribute("cat_Laboratorios", cl);
			return "form1";
		} else {
			c.save(cf);
			redirectAttrs.addFlashAttribute("mensaje", "Se ha agregado correctamente.").addFlashAttribute("clase",
					"success");
			return "redirect:/ctvacuna/nuevo";
		}
	}

	@GetMapping("ctvacuna/editar/{idcat_tipo_vacuna}")
	public String editar(@PathVariable int idcat_tipo_vacuna, Model model) {
		try {
			Optional<cat_tipo_vacuna> cl = c.listarId(idcat_tipo_vacuna);
			model.addAttribute("cat_tipo_vacuna", cl);
			List<cat_pais> listpais = d.listaPaises();
			model.addAttribute("paises", listpais);
			List<cat_laboratorios> n = z.listar();
			model.addAttribute("cat_Laboratorios", n);
			return "form1";
		} catch (Exception e) {
			return "error";
		}
	}

	@GetMapping("/ctvacuna/delete/{idcat_tipo_vacuna}")
	public String delete(@PathVariable int idcat_tipo_vacuna, Model model) {
		try {
			c.delete(idcat_tipo_vacuna);
			return "redirect:/list/tipovacuna";
		} catch (Exception e) {
			return "error";
		}
	}
}
