package pe.edu.examen.unsch.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import pe.edu.examen.unsch.entities.Docente;
@Repository
public class DocenteDaoImpl implements IDocenteDao {

	@PersistenceContext
	private EntityManager em;
	@Transactional
	@Override
	public List<Docente> listarDocente() {
		
		return em.createQuery("from Semestre s join fetch s.docente c ").getResultList();
	}

}
