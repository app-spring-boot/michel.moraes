package io.github.MichelMoraes.repository;


import io.github.MichelMoraes.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


/*Anotacao que diz que esta classe acessa a base de dados*/
@Repository
public class ClientesRepository {

    private static String INSERT = " insert into Cliente " +
            " (nome)  values (?)  ";

    // jbdc template nativo do SPRING
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Cliente salvar(Cliente cliente) {
        // acessa a base de dados para persistir um cliente

        jdbcTemplate.update(INSERT, new Object[]{cliente.getNome()} );
        return cliente;


    }
}
