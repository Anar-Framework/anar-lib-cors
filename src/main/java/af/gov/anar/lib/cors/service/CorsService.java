package af.gov.anar.lib.cors.service;

import af.gov.anar.lib.cors.model.CorsEntity;

import java.util.List;

/**
 * Interface with function for read and write of CORS Config
 */
public interface CorsService {

    List<String> getAllowedOrigins();
    List<String> getAllowedMethods();
    List<String> getAllowedHeaders();
    List<CorsEntity> findAll();
    CorsEntity save (CorsEntity corsEntity);
    void delete(String id);
}
