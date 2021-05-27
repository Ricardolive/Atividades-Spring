package br.com.generation.blogPessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.generation.blogPessoal.repository.PostagemRepository;
import br.com.generation.blogPessoal.model.Postagem;

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class PostagemController {
	
	@Autowired
	private PostagemRepository repository;
	
	
	@GetMapping
	public ResponseEntity<List<Postagem>> findAllPostagem(){
		
		return ResponseEntity.ok(repository.findAll());	
	}
	
	@GetMapping("/{id}") 
	public ResponseEntity<Postagem> findByIDPostagem(@PathVariable long id){
	      return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Postagem>> getByTitulo(@PathVariable String titulo ){
	        return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	 
	}
	
	
	@PostMapping
	public ResponseEntity<Postagem> postPostagem(@RequestBody Postagem postagem){
	        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	}
	
	@PutMapping
	public ResponseEntity<Postagem> putPostagem(@RequestBody Postagem postagem){
	        return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	}
 

	@DeleteMapping("/{id}")
	public void deletePostagem(@PathVariable long id){
	       repository.deleteById(id);

	}
	
 
	

}
