package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmpleadoDao;
import com.example.demo.entity.Empleado;
import com.example.demo.service.EmpleadoService;
@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoDao empleadoDao;
	@Override
	public Empleado create(Empleado e) {
		// TODO Auto-generated method stub
		return empleadoDao.create(e);
	}

	@Override
	public Empleado update(Empleado e) {
		// TODO Auto-generated method stub
		return empleadoDao.update(e);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		empleadoDao.delete(id);
	}

	@Override
	public Empleado read(long id) {
		// TODO Auto-generated method stub
		return empleadoDao.read(id);
	}

	@Override
	public List<Empleado> readAll() {
		// TODO Auto-generated method stub
		return empleadoDao.readAll();
	}

}
