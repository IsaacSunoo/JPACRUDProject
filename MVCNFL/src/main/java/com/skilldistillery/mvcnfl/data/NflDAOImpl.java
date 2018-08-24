package com.skilldistillery.mvcnfl.data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Component
public class NflDAOImpl implements NflDAO{
	@PersistenceContext
	private EntityManager em;
	

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
