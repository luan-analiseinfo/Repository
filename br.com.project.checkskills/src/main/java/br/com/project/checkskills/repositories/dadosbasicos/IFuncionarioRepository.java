package br.com.project.checkskills.repositories.dadosbasicos;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.project.checkskills.entities.dadosbasicos.FuncionarioEntity;

public interface IFuncionarioRepository extends JpaRepository<FuncionarioEntity, Long>{

}
