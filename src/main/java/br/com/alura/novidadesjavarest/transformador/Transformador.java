package br.com.alura.novidadesjavarest.transformador;
import java.util.List;

import br.com.alura.novidadesjavarest.modelo.Planeta;

public interface Transformador {

	List<Planeta> transformar(Object object);
}
