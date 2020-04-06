package br.com.alura.novidadesjavarest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.novidadesjavarest.modelo.Planeta;
import br.com.alura.novidadesjavarest.service.PlanetaService;

@RestController
@RequestMapping("/planetas")
public class PlanetaController {

	@Autowired
	private PlanetaService planetaService;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Planeta> listar() {
		return planetaService.listar();
	}
}
