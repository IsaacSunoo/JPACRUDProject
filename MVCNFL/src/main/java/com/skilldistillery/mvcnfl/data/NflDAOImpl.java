package com.skilldistillery.mvcnfl.data;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.skilldistillery.nfl.entities.NFL;

@Transactional
@Component
public class NflDAOImpl implements NflDAO{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public NFL show(int id) {
		return em.find(NFL.class, id);
	}
	
	@Override
	public List<NFL> index() {
		
		String qs = "SELECT n FROM NFL n";

		return em.createQuery(qs, NFL.class).getResultList();
	}

}


//@Transactional
//@Component
//public class FilmDAOImpl implements FilmDAO {
//	@PersistenceContext
//	private EntityManager em;
//		
//	@Override
//	public Film show(int id) {
//		return em.find(Film.class, id);
//	}
//	@Override
//	public List<Film> index() {
//		
//		String qs = "SELECT f FROM Film f";
//
//		return em.createQuery(qs, Film.class).getResultList();
