package io.github.MichelMoraes;

import io.github.MichelMoraes.model.Cliente;
import io.github.MichelMoraes.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    /*@Autowired
    @Qualifier("applicationName")*/
    // usando o value , pegamos o valor que vem de APPLICATION.PROPERTIES
    @Value("${application.name}")
    private String applicationName;

    /* @GetMapping("/hello")
     public String helloWorld(){
         return applicationName;
     }*/

    @Bean
    public CommandLineRunner init (@Autowired ClientesRepository clientesRepository){
        return args -> {

            clientesRepository.save(new Cliente("outro cliente"));
            clientesRepository.save(new Cliente("MICHEL"));

           // List<Cliente> todosClientes = clientesRepository.findAll();
           // todosClientes.forEach(System.out::println);

            List<Cliente> result = clientesRepository.buscarPorNome("MICHEL");
            //System.out.println("EXISTE UM CLIENTE MICHEL? "  + (existe == true ? "Sim" : "Não" ));


            result.get(0).getNome();

            clientesRepository.findAll();


        };
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }


}