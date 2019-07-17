package br.com.alura.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao);
	
//	@Query("SELECT t FROM Topico t where t.curso.nome = :nomeCurso")
//	List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);

}
