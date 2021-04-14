package com.rodrigo.aulaparticular.domain;


import com.rodrigo.aulaparticular.api.object.ViaCepObject;
import lombok.*;



import javax.persistence.*;


@Data
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Table
@Entity
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String logradouro;
    private String cep;
    private String bairro;
    private String localidade;
    private String uf;
    private Integer numero;
    private String complemento;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    public Address() {
    }

    public Address(String logradouro, String cep, String bairro, String localidade, String uf, Integer numero, String complemento, String ibge, String gia, String ddd, String siafi) {
        this.logradouro = logradouro;
        this.cep = cep;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.numero = numero;
        this.complemento = complemento;
        this.ibge = ibge;
        this.gia = gia;
        this.ddd = ddd;
        this.siafi = siafi;
    }

    public Address(ViaCepObject viaCepObject) {
        this.logradouro = viaCepObject.getLogradouro();
        this.cep = viaCepObject.getCep();
        this.bairro = viaCepObject.getBairro();
        this.localidade = viaCepObject.getlocalidade();
        this.uf = viaCepObject.getUf();
        this.numero = viaCepObject.getnumero();
        this.complemento = viaCepObject.getcomplemento();
        this.ibge = viaCepObject.getIbge();
        this.gia = viaCepObject.getGia();
        this.ddd = viaCepObject.getDdd();
        this.siafi = viaCepObject.getSiafi();

    }

    public void UpdateComViaCepObject(ViaCepObject viaCepObject) {
        this.logradouro = viaCepObject.getLogradouro();
        this.cep = viaCepObject.getCep();
        this.bairro = viaCepObject.getBairro();
        this.localidade = viaCepObject.getlocalidade();
        this.uf = viaCepObject.getUf();
        this.numero = viaCepObject.getnumero();
        this.complemento = viaCepObject.getcomplemento();
        this.ibge = viaCepObject.getIbge();
        this.gia = viaCepObject.getGia();
        this.ddd = viaCepObject.getDdd();
        this.siafi = viaCepObject.getSiafi();

    }
}

