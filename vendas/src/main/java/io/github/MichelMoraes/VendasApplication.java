package io.github.MichelMoraes;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

/*Esta anotations faz o escanemanto das configuracoes, tem uma finalidade mais apropriada quando
 se tem maisd e um PACOTE .com, pois se tem somente um por default já há o escanemanto  */
/*@ComponentScan(
        basePackages = {
                "io.github.MichelMoraes.repository",
                "io.github.MichelMoraes.service" }
        )*/

@RestController
public class VendasApplication {

    @Autowired
    @Qualifier("applicationName")
    private String applicationName;

    @GetMapping("/hello")
    public String helloWorld(){
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }




}
