package br.com.alura.novidadesjavarest.io;

import java.io.ObjectInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import br.com.alura.novidadesjavarest.modelo.Planeta;
import br.com.alura.novidadesjavarest.transformador.Transformador;

@Component
public class LeitorDeArquivo {

	@Autowired
	ResourceLoader rl;

	@Autowired
	Transformador transformador;

	public List<Planeta> lerArquivo() {
		ObjectInputStream ois = null;
		List<Planeta> planetas = null;
		try {
			ois = new ObjectInputStream(rl.getResource("classpath:planetas.bin").getInputStream());
			planetas = transformador.transformar(ois.readObject());
			ois.close();
		} catch (Exception e) {
			throw new RuntimeException("Não foi possível ler o arquivo", e);
		}
		return planetas;
	}
}
