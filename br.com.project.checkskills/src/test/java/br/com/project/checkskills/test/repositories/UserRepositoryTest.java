package br.com.project.checkskills.test.repositories;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;

import br.com.project.checkskills.entities.autenticacao.UsuarioEntity;
import br.com.project.checkskills.entities.autenticacao.UsuarioPermissaoEntity;
import br.com.project.checkskills.entities.dadosbasicos.FuncionarioEntity;
import br.com.project.checkskills.repositories.autenticacao.IUsuarioRepository;
import br.com.project.checkskills.test.utils.AbstractDatabaseTest;

public class UserRepositoryTest extends AbstractDatabaseTest {

	private static final Logger LOGGER = Logger.getLogger(UserRepositoryTest.class);

	@Inject
	public IUsuarioRepository userRepository;

	@Ignore
	@Test
	public void tesFindAll() {
		
		List<UsuarioEntity> users = this.userRepository.findAll();

		LOGGER.info(users);
	}

	@Ignore
	@Test
	public void user() {
		
		UsuarioEntity usuarioEntity = this.userRepository.findById(1L);
		 LOGGER.info(usuarioEntity);
	}
	
	@Test
	public void saveUser(){
		
		UsuarioEntity usuarioEntity = new UsuarioEntity();
		
		usuarioEntity.setNome("luan");
		usuarioEntity.setPassword("1312313");
		usuarioEntity.setEmail("adfadafad222");
		
		FuncionarioEntity funcionarioEntity = new FuncionarioEntity();
		funcionarioEntity.setNome("luan lucas");
		
		usuarioEntity.setFuncionarioEntity(funcionarioEntity);
		
		try {
			this.userRepository.save(usuarioEntity);
		} catch (Exception e) {
				e.printStackTrace();
		}
		
		
		
		LOGGER.info(usuarioEntity);
		LOGGER.info(funcionarioEntity);
	}
}
