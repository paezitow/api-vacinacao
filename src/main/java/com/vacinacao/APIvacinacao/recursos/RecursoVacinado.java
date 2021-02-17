package com.vacinacao.APIvacinacao.recursos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.vacinacao.APIvacinacao.modelos.Vacinados;
import com.vacinacao.APIvacinacao.repositorio.VacinadoRepo;

@RestController
@RequestMapping(value="/api")
@Api(value="API Vacinação")
@CrossOrigin(origins="*")
public class RecursoVacinado {
	
	@Autowired
	VacinadoRepo vacinadoRepo;
	
	//@GetMapping("/vacinados")
	//@ApiOperation(value="Listagem de Vacinados")
	//public List<Vacinados> listaVacinados(){
	//	return vacinaRepo.findAll();
	//}
	
	//@GetMapping("/vacinados/{id}")
	//@ApiOperation(value="Cadastro do Vacinado")
	//public Vacinados listaVacinadoNome(@PathVariable(value="id") int id){
	//	return vacinadoRepo.findById(id);
	//}
	
	@PostMapping("/vacinado")
	@ApiOperation(value="Salva Usuário Vacinado")
	public Vacinados insereVacinado(@RequestBody Vacinados vacinado) {
		return vacinadoRepo.save(vacinado);
	}

}
