package af.gov.anar.lib.cors.data.repository;

import af.gov.anar.lib.cors.data.model.CorsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorsRepository extends JpaRepository<CorsEntity, String> {
}
