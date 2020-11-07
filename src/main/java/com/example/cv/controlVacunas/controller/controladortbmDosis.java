package com.example.cv.controlVacunas.controller;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.example.cv.controlVacunas.Model.cat_laboratorios;
import com.example.cv.controlVacunas.Model.cat_pais;
import com.example.cv.controlVacunas.Model.cat_tipo_vacuna;
import com.example.cv.controlVacunas.Model.tb_movimiento_dosis;
import com.example.cv.controlVacunas.Model.tb_persona;
import com.example.cv.controlVacunas.interfacesServices.cLab;
import com.example.cv.controlVacunas.interfacesServices.cPais;
import com.example.cv.controlVacunas.interfacesServices.ctVacuna;
import com.example.cv.controlVacunas.interfacesServices.tbPersona;
import com.example.cv.controlVacunas.interfacesServices.tbmDosis;

@Controller
@RequestMapping
public class controladortbmDosis {
	@Autowired
	private tbmDosis c;
	@Autowired
	private cPais d;

	@Autowired
	private ctVacuna s;

	@Autowired
	private cLab z;
	@Autowired
	private tbPersona x;

	@GetMapping("/edit")
	public String edit(Model model) {
		List<tb_persona> cl = x.listar();
		model.addAttribute("Tb_persona", cl);
		return "index5";
	}
	@GetMapping("/mdosis/list")
	public String listar(Model model) {
		try {
			List<tb_movimiento_dosis> cl = c.listar();
			model.addAttribute("Tb_movimiento_dosis", cl);
			return "index2";
		}catch(Exception e) {
			return "error";
		}
		
	}
	@GetMapping("/mdosis/agregar/{tb_persona_CUI}")
	public String agregar(@PathVariable String tb_persona_CUI, ModelMap Map, Model model) {
		try {
			
			Map.addAttribute("tb_movimiento_dosis", new tb_movimiento_dosis());
			model.addAttribute("tb_movimiento_dosis", new tb_movimiento_dosis());
			List<cat_pais> listpais = d.listaPaises();
			model.addAttribute("paises", listpais);
			List<cat_tipo_vacuna> cls = s.listars();
			model.addAttribute("Cat_tipo_vacuna", cls);
			List<cat_laboratorios> cl = z.listar();
			model.addAttribute("cat_Laboratorios", cl);
			return "form4";
		} catch (Exception e) {
			return "error";
		}
	}

	@PostMapping("/mdosis/save")
	public String save(@Valid tb_movimiento_dosis cf, BindingResult result, RedirectAttributes redirectAttrs, Model model) {
		if (result.hasErrors()) {
			List<cat_pais> listpais = d.listaPaises();
			model.addAttribute("paises", listpais);
			List<cat_tipo_vacuna> cls = s.listars();
			model.addAttribute("Cat_tipo_vacuna", cls);
			List<cat_laboratorios> cl = z.listar();
			model.addAttribute("cat_Laboratorios", cl);
			return "form4";
		} else {
			c.save(cf);
			redirectAttrs.addFlashAttribute("mensaje", "Se ha agregado correctamente.").addFlashAttribute("clase",
					"success");
			return "redirect:/edit";
		}
	}

	@GetMapping("/editar/mdosis/{idtb_movimiento_dosis}")
	public String editar(@PathVariable long idtb_movimiento_dosis, Model model) {
		try {
			List<cat_pais> listpais = d.listaPaises();
			model.addAttribute("paises", listpais);
			List<cat_tipo_vacuna> cls = s.listars();
			model.addAttribute("Cat_tipo_vacuna", cls);
			List<cat_laboratorios> cl = z.listar();
			model.addAttribute("cat_Laboratorios", cl);
			Optional<tb_movimiento_dosis> v = c.listarId(idtb_movimiento_dosis);
			model.addAttribute("tb_movimiento_dosis", v);
			return "form4";
		} catch (Exception e) {
			return "error";
		}
	}

	@GetMapping("/delete/mdosis/{idtb_movimiento_dosis}")
	public String delete(@PathVariable long idtb_movimiento_dosis) {
		try {
			c.delete(idtb_movimiento_dosis);
			return "redirect:/mdosis/list";
		} catch (Exception e) {
			return "error";
		}
	}

}
