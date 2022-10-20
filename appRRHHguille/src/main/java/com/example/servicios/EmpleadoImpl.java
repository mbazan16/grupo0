package com.example.servicios;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.EmpleadoDTO;
import com.example.entities.Empleado;
import com.example.repositories.EmpleadoRepository;

@Service
public class EmpleadoImpl implements ServicioEmpleado {

	private static Logger log = LoggerFactory.getLogger(EmpleadoImpl.class);

	@Autowired
	EmpleadoRepository repository;

	@Override
	public List<EmpleadoDTO> getListadoEmpleadosDepartamento(Long departamentoId) {
		log.info("[getListadoEmpleadosDepartamento]");
		log.debug("[departamentoId:" + departamentoId + "]");

		try {

			List<Empleado> empleados = repository.findByDepartamento_Id(departamentoId);
			List<EmpleadoDTO> empleadosDTO = empleados.stream()
													  .map(s->convertirAEmpleadoDTO(s))
													  .collect(Collectors.toList());
			
			empleadosDTO.forEach(s->s.setJefe(repository.findNombreCompletoById(s.getIdJefe())));
			empleadosDTO.forEach(s->s.setJefeDepartamento(repository.findNombreCompletoById(s.getIdJefeDepartamento())));

			return empleadosDTO;
			
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return null;
	}
	
	private EmpleadoDTO convertirAEmpleadoDTO(Empleado empleado) {
		log.info("[private map]");
		log.debug("[empleado:" + empleado + "]");

		EmpleadoDTO empleadoDTO = new EmpleadoDTO();
		empleadoDTO.setId(empleado.getId());

		String nombreCompleto = empleado.getNombre() + " " + empleado.getApellido();
		empleadoDTO.setNombre(nombreCompleto);

		empleadoDTO.setIdPuesto(empleado.getPuesto().getId());
		empleadoDTO.setPuesto(empleado.getPuesto().getNombre());

		empleadoDTO.setIdJefe(empleado.getJefeId());

		empleadoDTO.setIdDepartamento(empleado.getDepartamento().getId());
		empleadoDTO.setDepartamento(empleado.getDepartamento().getNombre());

		empleadoDTO.setIdJefeDepartamento(empleado.getDepartamento().getJefeDepartamentoId());

		log.debug("[empleadoDTO:" + empleadoDTO + "]");

		return empleadoDTO;
	}

}
