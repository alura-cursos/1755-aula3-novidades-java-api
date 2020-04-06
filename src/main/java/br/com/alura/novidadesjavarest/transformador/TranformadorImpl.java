package br.com.alura.novidadesjavarest.transformador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.alura.novidadesjavarest.modelo.Planeta;

@Component
public class TranformadorImpl implements Transformador {

	@Override
	public List<Planeta> transformar(Object object) {
		List<Planeta> list = new ArrayList<>();
		if (object instanceof ArrayList<?>) {
			List<?> obectList = (List<?>) object;
			for (Object a : obectList) {
				if(a instanceof Planeta) {
					list.add((Planeta) a);
				}
			}
		}
		return list;
	}
}
