package br.com.project.checkskills.user;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.com.project.checkskills.entities.autenticacao.UsuarioEntity;
import br.com.project.checkskills.repositories.autenticacao.IUsuarioRepository;

@ManagedBean
@ViewScoped
public class UsuarioMB {

	@ManagedProperty(value="#{usuarioRepository}")
	private IUsuarioRepository usuarioRepository;
	
	
	public UsuarioEntity usuarioEntity(){
		return this.usuarioRepository.findOne(1L);
	}


	public IUsuarioRepository getUsuarioRepository() {
		return usuarioRepository;
	}


	public void setUsuarioRepository(IUsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	
	
}
