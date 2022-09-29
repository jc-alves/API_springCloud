package com.dev.hrworker.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.hrworker.entities.Worker;
import com.dev.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResources {
	
	@Autowired
	private WorkerRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		
		List<Worker> lista = repository.findAll();
		return ResponseEntity.ok(lista);
				
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> buscaId(@PathVariable Long id) {		
		Worker jobId = repository.findById(id).get();
		return ResponseEntity.ok(jobId);
				
	}
}
