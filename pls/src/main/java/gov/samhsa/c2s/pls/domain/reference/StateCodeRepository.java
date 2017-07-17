package gov.samhsa.c2s.pls.domain.reference;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StateCodeRepository extends JpaRepository<StateCode, Long> {

    List<StateCode> findAll();
}
