package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entities.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

	Empleado findByNombreAndApellido(@Param("nombre")String name,@Param("apellido") String surname);
	
	@Query("SELECT e FROM Empleado e WHERE e.nombre=:nombre and e.apellido=:apellido")
	Empleado xx(@Param("nombre")String name,@Param("apellido") String surname);
	
	@Query(value="SELECT e.* FROM EMPLOYEES e WHERE e.FIRST_NAME=:nombre and e.LAST_NAME=:apellido",nativeQuery=true)
	Empleado xx2(@Param("nombre")String name,@Param("apellido") String surname);
	
	//
	Empleado findByDatos_Email(@Param("email")String email);
	
	@Query("SELECT e FROM Empleado e WHERE e.datos.email=:email")
	Empleado findByDatos_Email2(@Param("email")String email);
	
	@Query(value="SELECT e.* FROM EMPLOYEES e WHERE e.EMAIL=:email",nativeQuery=true)
	Empleado findByDatos_Email3(@Param("email")String email);
	
	//
	List<Empleado> findByDepartamento_Id(@Param("id")Long id);

	@Query("SELECT e FROM Empleado e WHERE e.departamento.id=:id")
	List<Empleado> findByDepartamento_Id2(@Param("id")Long id);
	
	@Query(value="SELECT e.* FROM EMPLOYEES e WHERE e.DEPARTMENT_ID=:id",nativeQuery=true)
	List<Empleado> findByDepartamento_Id3(@Param("id")Long id);
	//
	@Query("SELECT e.nombre ||' '|| e.apellido FROM Empleado e WHERE e.id =:id")
	String findNombreCompletoById(@Param("id")Long id);
	
}
