package vn.com.dinhkhoi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.com.dinhkhoi.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
