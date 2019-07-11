package pe.edu.examen.unsch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.examen.unsch.service.IDocenteService;

@RequestMapping("/docente")
@Controller
public class DocenteController {
	
	@Autowired
	private IDocenteService docenteService;
	
	@GetMapping("/listar")
	public String listarDocente(Model model) {
		model.addAttribute("titulo", "Docentes");
		model.addAttribute("docentes", docenteService.listarDocente());
		return "listar";
		
	}

}
