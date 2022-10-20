package com.example.servicios;

import java.util.List;

import com.example.dto.EmpleadoDTO;

public interface ServicioEmpleado {


	List<EmpleadoDTO> getListadoEmpleadosDepartamento(Long departamentoId);

}
