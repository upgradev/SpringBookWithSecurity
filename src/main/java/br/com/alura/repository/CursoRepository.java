package br.com.alura.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nomeCurso);

}
