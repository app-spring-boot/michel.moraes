package io.github.MichelMoraes.model;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;


@Entity
@Table( name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome", length = 100)
    private String nome;



    public Cliente() {

    }

    public Cliente(String nome){
        this.nome = nome;
    }

    public Cliente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
