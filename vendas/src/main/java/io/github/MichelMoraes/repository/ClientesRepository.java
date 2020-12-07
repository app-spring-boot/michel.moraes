package io.github.MichelMoraes.repository;

import io.github.MichelMoraes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;



/*Anotacao que diz que esta classe acessa a base de dados*/
/*@Repository
public class ClientesRepository {*/

// Implementação do Spring Data JPA
// herda vários métodos automaticamente
public interface ClientesRepository extends JpaRepository<Cliente, Integer> {

    // esta consulta é similar a : "select c from cliente c
    // where c.nome like :nome "
    // declarar parametros na mesma ordem
    List<Cliente> findByNomeLike(String nome);

    List<Cliente> findByNomeOrIdOrderById(String nome, Integer id);

    // retornar unico result
    Cliente findOneByNome(String nome);

    // ex booleano
    boolean existsByNome(String nome);


    // query hql
    @Query(value = " select c from Cliente c where c.nome like :nome "  )
    List<Cliente> buscarPorNome(@Param("nome") String nome );


    // caso tenha necessidade de query nativa
    // not o *, os % e o NATIVE QUERY
    @Query(value = " select * from Cliente c where c.nome like '%:nome%' ", nativeQuery = true  )

    // SString utilizads no padrão JDBC - não recomendado
    /*private static String INSERT = " insert into Cliente (nome)  values (?)  ";
    private static String SELECT_ALL = "select * from cliente ";
    private static String UPDATE = " update cliente set nome = ? where id= ? ";
    private static String DELETE = " delete from cliente where id =?" ;*/

    // jbdc template nativo do SPRING - Não recomendado, mistura de códigos
    // @Autowired
    //private JdbcTemplate jdbcTemplate;

    // o entity manager faz todas operações com o banco
    // eliminado após implemntar o DATA JPA INTERFACES
   /* @Autowired
    private EntityManager entityManager;*/

    // ESta anotação diz que o método faz uma transação no BD
    // @Transactional
    /*public Cliente salvar(Cliente cliente) {
        // acessa a base de dados para persistir um cliente
       //  jdbcTemplate.update(INSERT, new Object[]{cliente.getNome()} );

      // entityManager.persist(cliente);
      // return cliente;

    }
*/
    // @Transactional
    // public Cliente atualizar(Cliente cliente) {
    // acessa a base de dados para atualizar um cliente
    //  jdbcTemplate.update(UPDATE, new Object[]{cliente.getNome(),//cliente.getId() } );

    // entityManager.merge(cliente);
    //  return cliente;


    // @Transactional(readOnly = true)
    /*public List<Cliente> buscarPorNome(String nome) {

        String jpql = " select c from Cliente c where c.nome like :nome ";

        TypedQuery<Cliente> query =entityManager.createQuery(jpql, Cliente.class);
        query.setParameter("nome", "%" + nome + "%");

        return query.getResultList();

    }*/

   /* @Transactional
    public void deletar(Cliente cliente) {
      // deletar(cliente.getId());

        if( ! entityManager.contains(cliente) ){
            cliente = entityManager.merge(cliente);
        }


       entityManager.remove(cliente);
    }*/

   /* @Transactional
    public void deletar(Integer id) {
        // acessa a base de dados para deletar um cliente
       // jdbcTemplate.update(DELETE, new Object[]{id} );
       Cliente cliente = entityManager.find(Cliente.class, id);
       entityManager.remove(cliente);


    }
*/


    // @Transactional
    /*public List<Cliente> obterTodos() {
        // JDBC
        *//*return jdbcTemplate.query(SELECT_ALL, new RowMapper<Cliente>()  {
            @Override
            public Cliente mapRow(ResultSet resultset, int i) throws SQLException {

                Integer id = resultset.getInt("id");
                String nome = resultset.getString("nome");

               return new Cliente(id, nome);

            }
        });*//*

        // ENTITY MANAGER

      return entityManager
              .createQuery("from Cliente", Cliente.class)
              .getResultList();

    }*/


}


