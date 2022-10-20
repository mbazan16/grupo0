package com.example.servicios;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dto.EmpleadoDTO;
import com.example.entities.Departamento;
import com.example.entities.Empleado;
import com.example.entities.Puesto;
import com.example.repositories.EmpleadoRepository;

@SpringBootTest
class EmpleadoImplTest {
	@Mock
    EmpleadoRepository repositorio;
    
    @InjectMocks
    EmpleadoImpl servicio = new EmpleadoImpl();
    
	@Test
	void test() {
		List<Empleado> listaEmpleados = new ArrayList<Empleado>();
		listaEmpleados.add(generarEmpleado());
		listaEmpleados.add(generarEmpleado());
		listaEmpleados.add(generarEmpleado());
	
         // Arrange
        when(repositorio.findByDepartamento_Id(60l)).thenReturn(listaEmpleados);
        when(repositorio.findNombreCompletoById(2l)).thenReturn("jefe");
        when(repositorio.findNombreCompletoById(1l)).thenReturn("jefeDepartamento");
        
        List<EmpleadoDTO> empleados= servicio.getListadoEmpleadosDepartamento(60l);
        assertThat(empleados).isNotNull();
        assertThat(empleados).isNotEmpty();
        EmpleadoDTO empleadoDTO = empleados.get(0);
        assertEquals(empleadoDTO.getId(), 100l);
        assertEquals(empleadoDTO.getPuesto(), "Nnnn");
        assertEquals(empleadoDTO.getJefe(), "jefe");
        assertEquals(empleadoDTO.getJefeDepartamento(), "jefeDepartamento");
	}

	private Empleado generarEmpleado() {
		
		Empleado empleado= new Empleado();
		empleado.setId(100l);
		empleado.setNombre("Aaaa");
		empleado.setApellido("Bbbb");
		
		Departamento departamento= new Departamento();
		departamento.setId(60l);
		departamento.setNombre("Dddd");
		departamento.setJefeDepartamentoId(1l);
		
		empleado.setDepartamento(departamento);
		empleado.setJefeId(2l);
		
		Puesto puesto= new Puesto();
		puesto.setId("Pppp");
		puesto.setNombre("Nnnn");
		
		empleado.setPuesto(puesto);
		
		return empleado;
	}

}
