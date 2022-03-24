package com.rp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rp.entity.Trainee;
import com.rp.entity.Trainee;
import com.rp.entity.Trainee;
import com.rp.entity.Trainee;

@Repository
public class TraineedaoImpl implements Traineedao {

	@PersistenceContext
	EntityManager entity;

	@Override
	public Trainee addTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		entity.persist(trainee);
		return entity.find(Trainee.class, trainee.getTrId());
		
	}

	@Override
	public Trainee updateTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return entity.merge(trainee);
	}

	@Override
	public String deleteTrainee(int trId) {
		// TODO Auto-generated method stub
		Trainee tr = entity.find(Trainee.class, trId);

		if (tr != null) {
			entity.remove(tr);
			return "Trainee deleted";
		} else {
			return "no Trainee found";
		}
	}

	@Override
	public Trainee getTrainee(int trId) {
		// TODO Auto-generated method stub
		return entity.find(Trainee.class, trId);
	}

	@Override
	public List<Trainee> getAllTrainees() {
		// TODO Auto-generated method stub
		TypedQuery<Trainee> result = entity.createQuery("select t from Trainee t", Trainee.class);
		return result.getResultList();
	}

	

}
