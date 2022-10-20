package com.example.repositories;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.entities.Region;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
class RegionRepositoryTest {
	
	static Logger log = LoggerFactory.getLogger(RegionRepositoryTest.class);
	
	@Autowired
	RegionRepository repository;
	Region region;
	
	@BeforeAll
	public static void beforeAllTests() {
		log.debug("SE VAN A EJECUTAR LOS TESTS");
	}

	@BeforeEach
	public void beforetest() {
		region = new Region();
		region.setId(53);
		region.setNombre("alguna");
		repository.save(region);
	}

	@Test
	@DisplayName("FindAll")
	void test() {
		List<Region> regiones = repository.findAll();
		assertThat(regiones).isNotEmpty();
	}
	
	
	@Test
	@DisplayName("FindById")
	void testt() {
		Region region2 = repository.findById(region.getId()).get();
		assertThat(region2).isNotNull();
		assertEquals(region.getId(), region2.getId());
	}

	@Test
	@DisplayName("Save")
	void test2() {
		Region region2 = repository.save(region);
		assertEquals(region.getId(), region2.getId());
	}

	@Test
	@DisplayName("Delete")
	void test3() {
		repository.deleteById(region.getId());
		Optional<Region> region2 = repository.findById(region.getId());
		assertEquals(region2.isPresent(), false);
	}
}
