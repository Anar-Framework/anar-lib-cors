package af.gov.anar.lib.cors.service;

import af.gov.anar.lib.cors.data.repository.CorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CorsServiceImpl implements CorsService {

    @Autowired
    private CorsRepository corsRepository;


    @Override
    public List<String> getAllowedOrigins() {
        corsRepository.findAll().stream().collect(Collectors.toList());
        return null;
    }

    @Override
    public List<String> getAllowedMethods() {
        return null;
    }

    @Override
    public List<String> getAllowedHeaders() {
        return null;
    }
}
