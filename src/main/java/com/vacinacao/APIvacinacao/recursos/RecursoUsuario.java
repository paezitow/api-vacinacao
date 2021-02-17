package com.vacinacao.APIvacinacao.recursos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.vacinacao.APIvacinacao.modelos.Usuarios;
import com.vacinacao.APIvacinacao.repositorio.UsuarioRepo;

@RestController
@RequestMapping(value="/api")
@Api(value="API Vacinação")
@CrossOrigin(origins="*")
public class RecursoUsuario {
	
	@Autowired
	UsuarioRepo usuarioRepo;
	
	//@GetMapping("/usuarios")
	//@ApiOperation(value="Listagem de Usuários")
	//public List<Usuarios> listaUsuario(){
	//	return usuarioRepo.findAll();
	//}
	
	//@GetMapping("/usuario/{id}")
	//@ApiOperation(value="Cadastro do Usuários")
	//public Usuarios listausuarioNome(@PathVariable(value="id") int id){
		//return usuarioRepo.findById(id);
	//}
	//
	@PostMapping("/usuario")
	@ApiOperation(value="Salva Novo Usuário")
	public Usuarios insereUsuario(@RequestBody Usuarios usuario) {
		return usuarioRepo.save(usuario);
	}

}
