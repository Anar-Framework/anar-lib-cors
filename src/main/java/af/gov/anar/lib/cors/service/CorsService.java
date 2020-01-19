package af.gov.anar.lib.cors.service;

import java.util.List;

/**
 * Interface with function for read and write of CORS Config
 */
public interface CorsService {

    List<String> getAllowedOrigins();
    List<String> getAllowedMethods();
    List<String> getAllowedHeaders();
}
