package com.jpa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.model.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {
List<EmployeeModel> findbyNom(String nom);
List<EmployeeModel> findbyRecrutement(String recrutement);
List<EmployeeModel> findbyDescriptionContaining(String description);
Optional<EmployeeModel> findByEmail(String email);

}
