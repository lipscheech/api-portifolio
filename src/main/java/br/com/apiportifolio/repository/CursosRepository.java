package br.com.apiportifolio.repository;

import br.com.apiportifolio.model.Cursos;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CursosRepository extends MongoRepository<Cursos, String>{


}
