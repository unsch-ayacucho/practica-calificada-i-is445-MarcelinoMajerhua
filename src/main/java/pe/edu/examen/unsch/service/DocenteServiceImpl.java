package pe.edu.examen.unsch.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.examen.unsch.dao.IDocenteDao;
import pe.edu.examen.unsch.entities.Docente;
@Service
public class DocenteServiceImpl implements IDocenteService {
	@Autowired
	private IDocenteDao docenteDao;

	@Override
	@Transactional
	public List<Docente> listarDocente() {
		
		return docenteDao.listarDocente();
	}

}
