package com.rp.dao;

import java.util.List;

import com.rp.entity.Trainee;

public interface Traineedao {

	Trainee addTrainee(Trainee trainee);

	Trainee updateTrainee(Trainee trainee);

	String deleteTrainee(int trId);

	Trainee getTrainee(int trId);

	List<Trainee> getAllTrainees();
}
