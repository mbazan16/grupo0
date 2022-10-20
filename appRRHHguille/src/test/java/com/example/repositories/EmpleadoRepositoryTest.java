package com.example.repositories;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.entities.Empleado;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)

class EmpleadoRepositoryTest {

	@Autowired
	EmpleadoRepository repository;

	@Test
	void testFindByNombreAndApellido() {

		Empleado empleado = repository.findByNombreAndApellido("Steven", "King");
		assertEquals(empleado.getId(), 100l);
	}

	@Test
	void xx() {

		Empleado empleado = repository.xx("Steven", "King");
		assertEquals(empleado.getId(), 100l);
	}

	@Test
	void xx2() {

		Empleado empleado = repository.xx2("Steven", "King");
		assertEquals(empleado.getId(), 100l);
	}

	@Test
	void findByDatos_Email() {

		Empleado empleado = repository.findByDatos_Email("SKING");
		assertEquals(empleado.getId(), 100l);
	}

	@Test
	void findByDatos_Email2() {

		Empleado empleado = repository.findByDatos_Email2("SKING");
		assertEquals(empleado.getId(), 100l);
	}

	@Test
	void findByDatos_Email3() {

		Empleado empleado = repository.findByDatos_Email3("SKING");
		assertEquals(empleado.getId(), 100l);
	}


	@Test
	void findByDepartamento_Id() {
		
		List<Empleado> empleados = repository.findByDepartamento_Id(60l);
		assertThat(empleados).isNotNull();
		assertThat(empleados).isNotEmpty();
		assertEquals(empleados.get(0).getDepartamento().getId(), 60l);
	}
	
	@Test
	void findByDepartamento_Id2() {
		
		List<Empleado> empleados = repository.findByDepartamento_Id2(60l);
		assertThat(empleados).isNotNull();
		assertThat(empleados).isNotEmpty();
		assertEquals(empleados.get(0).getDepartamento().getId(), 60l);
	}
	
	@Test
	void findByDepartamento_Id3() {
		
		List<Empleado> empleados = repository.findByDepartamento_Id3(60l);
		assertThat(empleados).isNotNull();
		assertThat(empleados).isNotEmpty();
		assertEquals(empleados.get(0).getDepartamento().getId(), 60l);
	}
	
	@Test
	void findNombreCompletoById() {

		String nombreCompleto = repository.findNombreCompletoById(100l);
		assertEquals(nombreCompleto, "Steven King");
	}
}
