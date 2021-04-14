package com.rodrigo.aulaparticular.repository;

import com.rodrigo.aulaparticular.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

//       Optional<Usuario> findById(Long id);


}
