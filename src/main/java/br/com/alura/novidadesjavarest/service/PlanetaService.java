package br.com.alura.novidadesjavarest.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.novidadesjavarest.io.LeitorDeArquivo;
import br.com.alura.novidadesjavarest.modelo.Planeta;

@Service
public class PlanetaService {

	@Autowired
	private LeitorDeArquivo leitorArquivo; 

	public List<Planeta> listar() {
		return Collections.unmodifiableList(leitorArquivo.lerArquivo());
	}
}
