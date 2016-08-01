package br.com.project.checkskills.repositories.autenticacao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.checkskills.entities.autenticacao.UsuarioEntity;


public interface IUsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

	
	public List<UsuarioEntity> findByEmail(String email);
	public UsuarioEntity findById(Long id);

}
