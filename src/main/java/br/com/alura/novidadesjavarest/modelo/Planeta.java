package br.com.alura.novidadesjavarest.modelo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class Planeta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nome;
	private Integer rotacaoPorPeriodo;
	private Integer periodoOrbital;
	private Integer diametro;

	public Planeta() {
	}

	public Planeta(String nome, Integer rotacaoPorPeriodo, Integer periodoOrbital, Integer diametro) {
		this.nome = nome;
		this.rotacaoPorPeriodo = rotacaoPorPeriodo;
		this.periodoOrbital = periodoOrbital;
		this.diametro = diametro;
	}

	@JsonGetter("nome")
	public String getNome() {
		return nome;
	}

	@JsonGetter("rotacaoPorPeriodo")
	public Integer getRotacaoPorPeriodo() {
		return rotacaoPorPeriodo;
	}

	@JsonGetter("periodoOrbital")
	public Integer getPeriodoOrbital() {
		return periodoOrbital;
	}

	@JsonGetter("diametro")
	public Integer getDiametro() {
		return diametro;
	}
}
