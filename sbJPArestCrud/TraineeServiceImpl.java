package com.rp.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rp.dao.Traineedao;
import com.rp.entity.Trainee;

@Service
@Transactional
public class TraineeServiceImpl  implements TraineeService{
	
	@Autowired
	Traineedao dao;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		
		return dao.save(trainee);
	}

	@Override
	public Trainee updateTrainee(Trainee Trainee) {
		
		return dao.save(Trainee);
	}

	@Override
	public void deleteTrainee(int trId) {
		
		 dao.deleteById(trId);
	}

	@Override
	public Optional<Trainee>  getTrainee(int trId) {

		return dao.findById(trId);
	}

	@Override
	public Iterable<Trainee> getAllTrainees() {
		
		return dao.findAll();
	}

}
