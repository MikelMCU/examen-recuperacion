package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "empleado")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "nombres", columnDefinition = "varchar(70)")
	private String nombre;
	@Column(name = "apellidos", columnDefinition = "varchar(70)")
	private String apellido;
	@Column(name = "correos", columnDefinition = "varchar(120)")
	private String correo;
	@Column(name = "telefonos", columnDefinition = "char(9)")
	private char telefono;

}
