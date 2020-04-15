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
		if (object instanceof ArrayList<?> listOfObject) {
			List<?> obectList = listOfObject;
			for (Object a : obectList) {
				if (a instanceof Planeta planeta) {
					list.add(planeta);
				}
			}
		}
		return list;
	}
}
