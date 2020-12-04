package io.github.MichelMoraes;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfiguration {

    @Bean(name = "applicationName")

    public String applicationName() {
        return "Sistemas de Vendas  " +
                "   .   ____          _            __ _ _\n" +
                " /\\\\ / ___'_ __ _ _(_)_ __  __ _ \\ \\ \\ \\\n" +
                "( ( )\\___ | '_ | '_| | '_ \\/ _` | \\ \\ \\ \\\n" +
                " \\\\/  ___)| |_)| | | | | || (_| |  ) ) ) )\n" +
                "  '  |____| .__|_| |_|_| |_\\__, | / / / /\n" +
                " =========|_|==============|___/=/_/_/_/ " ;
    }

    /*posso criar varios, porem como nome diferente*/
  /*  @Bean(name = "teste")
    public String teste() {
        return "Sistemas de Vendas";
    }
*/



}
