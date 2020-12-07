package io.github.MichelMoraes.service;

import io.github.MichelMoraes.model.Cliente;
import io.github.MichelMoraes.repository.ClientesRepository;
import org.springframework.stereotype.Service;


/*Classe de servicos*/
@Service
public class ClientesService {

    // Autowired faz a instancia da CLASSE repository para service
   // @Autowired
    private ClientesRepository repository;

    // ou fazemos com @Autowired ou fazemos via construtor, abaixo
    public ClientesService (ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);

        repository.save(cliente);
    }

    public void validarCliente(Cliente cliente) {


    }


}
