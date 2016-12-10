package util;

import javax.ws.rs.QueryParam;

import modelo.Usuario;


public class Validacao {

	public boolean verificarEmail(Usuario usuario){
		return ListaUsuario.usuarios.stream().anyMatch(user -> user.getEmail().equals(usuario.getEmail()));
	}
	
	public boolean verificarCPF(Usuario usuario){
		return ListaUsuario.usuarios.stream().anyMatch(user -> user.getCpf().equals(usuario.getCpf()));
	}
	
	public boolean verificarCPFValido(Usuario usuario){
		return usuario.getCpf().matches("(^[0-9]{3}.?[0-9]{3}.?[0-9]{3}-?[0-9]{2})");
	}
	

	public boolean validarLogin(Usuario usuario){
		if(ListaUsuario.usuarios.stream().anyMatch(user -> user.getEmail().equals(usuario.getEmail()))
				&& ListaUsuario.usuarios.stream().anyMatch(user -> user.getSenha().equals(usuario.getSenha())))
				
		return true;
	 return false;
	}

}
