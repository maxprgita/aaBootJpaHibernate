package it.aips.aaBootJpaHibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.aips.aaBootJpaHibernate.model.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
