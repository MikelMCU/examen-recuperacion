package com.example.demo.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.EmpleadoDao;
import com.example.demo.entity.Empleado;
import com.example.demo.repository.EmpleadoRepository;
@Component
public class EmpleadoDaoImpl implements EmpleadoDao {

	@Autowired
	private EmpleadoRepository empleadoRepository;
	@Override
	public Empleado create(Empleado e) {
		// TODO Auto-generated method stub
		return empleadoRepository.save(e);
	}

	@Override
	public Empleado update(Empleado e) {
		// TODO Auto-generated method stub
		return empleadoRepository.save(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		empleadoRepository.deleteById(id);

	}

	@Override
	public Empleado read(Long id) {
		// TODO Auto-generated method stub
		return empleadoRepository.findById(id).get();
	}

	@Override
	public List<Empleado> readAll() {
		// TODO Auto-generated method stub
		return empleadoRepository.findAll();
	}

}
