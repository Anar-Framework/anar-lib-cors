package af.gov.anar.lib.cors.init;

import af.gov.anar.lib.cors.service.CorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CorsInitializer {

    @Value("${anar.cors.allowed-origin}: *")
    private String allowedOrigin;

    @Value("${anar.cors.allowed-method}: *")
    private String allowedMethod;


    @Value("${anar.cors.allowed-header}: *")
    private String allowedHeader;

    @Autowired
    private CorsService corsService;


    public void init()
    {

    }


}
