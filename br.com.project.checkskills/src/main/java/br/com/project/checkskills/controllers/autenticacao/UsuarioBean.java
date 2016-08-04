package br.com.project.checkskills.controllers.autenticacao;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;

import br.com.project.checkskills.entities.autenticacao.UsuarioEntity;
import br.com.project.checkskills.repositories.autenticacao.IUsuarioRepository;
import br.com.project.checkskills.user.UserMB;

@ManagedBean(name="usuarioBean")
@SessionScoped
public class UsuarioBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOGGER = Logger.getLogger(UsuarioBean.class);

	@ManagedProperty(value="#{usuarioRepository}")
	private IUsuarioRepository usuarioRepository;
	
	private List<UsuarioEntity> usuarios;
	
	
	private UsuarioEntity usuarioEntity;
	
	private UsuarioEntity selectedUser;
	
	private Long id;
	
	
	//carregar lista
	public void onLoad(){
		this.usuarios = this.usuarioRepository.findAll();
	}

	//salvar ou atualizar
	public void salvarOuDeletar(){
		if(this.usuarioEntity != null){
			if(this.usuarioEntity.getId() == null)
			//add
			this.usuarioRepository.save(getUsuarioEntity());
		}else {
			//atualizar
			this.usuarioRepository.save(getUsuarioEntity());
		}
				
	}
	
	
	public void cancel() {
		this.unselectUser();
		
	}
	
	
	public void selectUser(SelectEvent evt) {
		try {
			if (evt.getObject() != null) {
				this.selectedUser = (UsuarioEntity) evt.getObject();
			} else {
				this.selectedUser = null;
			}
		} catch (Exception e) {
			this.selectedUser = null;

			LOGGER.error(e.getMessage(), e);
		}
	}

	public void unselectUser() {
		this.selectedUser = null;
		usuarioEntity = null;
	}
	
	
	//todos get e set
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


	public UsuarioEntity getUsuarioEntity() {
		if (usuarioEntity == null) 
			usuarioEntity = new UsuarioEntity();
		return usuarioEntity;
	}


	public void setUsuarioEntity(UsuarioEntity usuarioEntity) {
		this.usuarioEntity = usuarioEntity;
	}

	public UsuarioEntity getSelectedUser() {
		return selectedUser;
	}

	public void setSelectedUser(UsuarioEntity selectedUser) {
		this.selectedUser = selectedUser;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
