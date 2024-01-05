package it.aips.aaBootJpaHibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.aips.aaBootJpaHibernate.model.Address;

@Repository
public interface IAddressRepository extends JpaRepository<Address, Integer> {

}
