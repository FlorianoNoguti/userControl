package util;

import javax.ws.rs.QueryParam;

import modelo.Usuario;


public class Validacao {

	public boolean verificarEmail(Usuario usuario){
		return ListaUsuario.usuarios.stream().anyMatch(u -> u.getEmail().equals(usuario.getEmail()));
	}
	
	public boolean verificarCPF(Usuario usuario){
		return ListaUsuario.usuarios.stream().anyMatch(u -> u.getCpf().equals(usuario.getCpf()));
	}
	
	public boolean verificarCPFValido(Usuario usuario){
		return usuario.getCpf().matches("(^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$)");
	}
	
	

	public boolean validarLogin(Usuario usuario){
		if(ListaUsuario.usuarios.stream().anyMatch(u -> u.getEmail().equals(usuario.getEmail()))
				&& ListaUsuario.usuarios.stream().anyMatch(u -> u.getSenha().equals(usuario.getSenha())))
				
		return true;
	 return false;
	}

}
