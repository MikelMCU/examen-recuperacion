package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Empleado;

public interface EmpleadoService {
	Empleado create (Empleado e);
	Empleado update (Empleado e);
	void delete(long id);
	Empleado read (long id);
	List<Empleado>readAll();
}
