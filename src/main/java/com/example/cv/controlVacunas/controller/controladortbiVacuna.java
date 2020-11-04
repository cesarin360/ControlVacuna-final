package com.example.cv.controlVacunas.controller;

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

import java.util.*;

import com.example.cv.controlVacunas.Model.cat_laboratorios;
import com.example.cv.controlVacunas.Model.cat_pais;
import com.example.cv.controlVacunas.Model.cat_tipo_vacuna;
import com.example.cv.controlVacunas.Model.tb_inventario_vacunas;
import com.example.cv.controlVacunas.interfacesServices.cLab;
import com.example.cv.controlVacunas.interfacesServices.cPais;
import com.example.cv.controlVacunas.interfacesServices.ctVacuna;
import com.example.cv.controlVacunas.interfacesServices.tbiVacuna;

@Controller
@RequestMapping
public class controladortbiVacuna {

	@Autowired
	private tbiVacuna c;

	@Autowired
	private cPais d;

	@Autowired
	private ctVacuna s;

	@Autowired
	private cLab z;

	@GetMapping("/list/inventario")
	public String listar(Model model) {
		try {
			List<tb_inventario_vacunas> cl = c.listar();
			model.addAttribute("Tb_inventario_vacunas", cl);
			return "index1";
		} catch (Exception e) {
			return "error";
		}
	}

	@GetMapping("/tbivacuna/inventario")
	public String agregar(Model model) {
		try {

			model.addAttribute("tb_inventario_vacunas", new tb_inventario_vacunas());
			List<cat_pais> listpais = d.listaPaises();
			model.addAttribute("paises", listpais);
			List<cat_tipo_vacuna> cls = s.listars();
			model.addAttribute("Cat_tipo_vacuna", cls);
			List<cat_laboratorios> cl = z.listar();
			model.addAttribute("cat_Laboratorios", cl);
			return "form2";
		} catch (Exception e) {
			return "error";
		}
	}

	@PostMapping("/tbivacuna/save")
	public String save(@Valid tb_inventario_vacunas cf, BindingResult result, RedirectAttributes redirectAttrs,
			Model model) {
		if (result.hasErrors()) {
			List<cat_pais> listpais = d.listaPaises();
			model.addAttribute("paises", listpais);
			List<cat_tipo_vacuna> cls = s.listars();
			model.addAttribute("Cat_tipo_vacuna", cls);
			List<cat_laboratorios> cl = z.listar();
			model.addAttribute("cat_Laboratorios", cl);
			return "form2";
		} else {
			c.save(cf);
			redirectAttrs.addFlashAttribute("mensaje", "Se ha agregado correctamente.").addFlashAttribute("clase",
					"success");
			return "redirect:/tbivacuna/inventario";
		}

	}

	@GetMapping("/tbivacuna/editar/{id_inventario_vacuna}")
	public String editar(@PathVariable int id_inventario_vacuna, Model model) {
		try {
			List<cat_pais> listpais = d.listaPaises();
			model.addAttribute("paises", listpais);
			List<cat_tipo_vacuna> cls = s.listars();
			model.addAttribute("Cat_tipo_vacuna", cls);
			List<cat_laboratorios> cl = z.listar();
			model.addAttribute("cat_Laboratorios", cl);
			Optional<tb_inventario_vacunas> v = c.listarId(id_inventario_vacuna);
			model.addAttribute("tb_inventario_vacunas", v);
			return "form2";
		} catch (Exception e) {
			return "error";
		}
	}

	@GetMapping("/tbivacuna/delete/{id_inventario_vacuna}")
	public String delete(@PathVariable int id_inventario_vacuna, Model model) {
		try {
			c.delete(id_inventario_vacuna);
			return "redirect:/list/inventario";
		} catch (Exception e) {
			return "error";
		}
	}

}
