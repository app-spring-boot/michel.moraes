package io.github.MichelMoraes;


import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration

// usa as informações do app properties - TIPO DE USO
@Profile("production")
public class MinhaConfiguration {


    @Bean
    public CommandLineRunner executar() {
        return  args ->
                System.out.println("RODANDO EM PRODUCAO");
    }

    @Bean(name = "applicationName")

    public String applicationName() {
        return "Sistemas de Vendas " ;
    }

    /*posso criar varios, porem como nome diferente*/
  /*  @Bean(name = "teste")
    public String teste() {
        return "Sistemas de Vendas";
    }
*/



}
