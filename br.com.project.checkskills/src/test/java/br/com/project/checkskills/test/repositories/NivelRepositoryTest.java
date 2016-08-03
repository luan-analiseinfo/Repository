package br.com.project.checkskills.test.repositories;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.project.checkskills.entities.autenticacao.UsuarioEntity;
import br.com.project.checkskills.entities.dadosbasicos.NivelEntity;
import br.com.project.checkskills.repositories.dadosbasicos.INivelRepository;
import br.com.project.checkskills.test.utils.AbstractDatabaseTest;

public class NivelRepositoryTest extends AbstractDatabaseTest {

	private static final Logger LOGGER = Logger.getLogger(NivelRepositoryTest.class);
	
	@Inject
	private INivelRepository nivelRepository;
	
	@Test
	public void findAllTest(){
		   List<NivelEntity> nivelEntities = this.nivelRepository.findAll();
		
		LOGGER.info(nivelEntities);
	}
	
}
