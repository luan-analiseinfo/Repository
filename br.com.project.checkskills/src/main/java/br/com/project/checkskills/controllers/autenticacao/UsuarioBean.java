package br.com.project.checkskills.controllers.autenticacao;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import br.com.project.checkskills.entities.autenticacao.UsuarioEntity;
import br.com.project.checkskills.repositories.autenticacao.IUsuarioRepository;

@ManagedBean(name="usuarioBean")
@SessionScoped
public class UsuarioBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManagedProperty(value="#{usuarioRepository}")
	private IUsuarioRepository usuarioRepository;
	
	private List<UsuarioEntity> usuarios;
	
	
	public void onLoad(){
		this.usuarios = this.usuarioRepository.findAll();
	}


	public IUsuarioRepository getUsuarioRepository() {
		return usuarioRepository;
	}


	public void setUsuarioRepository(IUsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}


	public List<UsuarioEntity> getUsuarios() {
		return usuarios;
	}


	public void setUsuarios(List<UsuarioEntity> usuarios) {
		this.usuarios = usuarios;
	}
	
	
	
}
