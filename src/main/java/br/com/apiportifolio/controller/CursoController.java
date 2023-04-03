package br.com.apiportifolio.controller;

import br.com.apiportifolio.model.Cursos;
import br.com.apiportifolio.repository.CursosRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CursoController {

	@Autowired
	private CursosRepository repository;

	@GetMapping("/cursos")
	public List<Cursos> getCursos(){
		return repository.findAll();
	}

	@GetMapping("/cursos/{id}")
	public Optional<Cursos> getCursos(@PathVariable String id) {
		return repository.findById(id);
	}

	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/cursos")
	public Cursos postCursos(@RequestBody String jsonParameter) {

		Cursos curso = new Gson().fromJson(jsonParameter, Cursos.class);
		if(ObjectUtils.isEmpty(curso)) {
			throw new IllegalArgumentException("curso is null or empty");
		}

		return repository.save(curso);
	}

	@DeleteMapping("/cursos/{id}")
	public void DeleteCursos(@PathVariable String id) {
		repository.deleteById(id);
	}


}
