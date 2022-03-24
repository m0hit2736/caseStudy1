package com.rp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rp.entity.Trainee;
import com.rp.service.TraineeService;

@RestController
@RequestMapping("/Trainee")// http://localhost:8625/Trainee
public class TraineeController {
	@Autowired
	TraineeService service;

	@PostMapping("/addTrainee") // http://localhost:8625/Trainee/addTrainee
	public Trainee addTrainee(@RequestBody Trainee tr)
	{
		
		return service.addTrainee(tr);
		
	}
	
	@PutMapping("/updateTrainee") // http://localhost:8625/Trainee/updateTrainee
	public Trainee updateTrainee(@RequestBody Trainee tr)
	{
		
		return service.updateTrainee(tr);
		
	}
	
	@GetMapping("/getTrainee/{tid}") // http://localhost:8625/Trainee/getTrainee/tid
	public Optional<Trainee> getTrainee(@PathVariable("tid") int trId)
	{
		
		return service.getTrainee(trId);
		
	}
	
	@GetMapping("/getAllTrainee") // http://localhost:8625/Trainee/getAllTrainee
	public Iterable<Trainee> getAllTrainees()
	{
		
		return service.getAllTrainees();
		
	}
	
	@DeleteMapping("/deleteTrainee/{tid}") // http://localhost:8625/Trainee/deleteTrainee/eid
	public void deleteTrainee(@PathVariable("tid") int trId)
	{
		
		 service.deleteTrainee(trId);
		
	}
	
	
}
