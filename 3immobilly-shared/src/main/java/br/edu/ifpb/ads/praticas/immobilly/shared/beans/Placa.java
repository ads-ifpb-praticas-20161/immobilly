//
// This file was generated by the JPA Modeler
//
package br.edu.ifpb.ads.praticas.immobilly.shared.beans;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class Placa implements Serializable {

    @Id
<<<<<<< HEAD
    @GeneratedValue
<<<<<<< HEAD:immobilly-shared/src/main/java/br/edu/ifpb/ads/praticas/immobilly/shared/beans/Placa.java
    private Integer id;
=======
    private long id;
>>>>>>> 2c656730bda02354cadbe88943cd49745dfda4aa:3immobilly-shared/src/main/java/br/edu/ifpb/ads/praticas/immobilly/shared/beans/Placa.java
    @Column(name = "numeracao", nullable = false, unique = true, length = 8)
=======
    @Column(unique = false, updatable = true, insertable = true, nullable = true, length = 255, scale = 0, precision = 0)
    @Basic
    private long id;
    @Column(name = "numeracao", unique = true, updatable = true, insertable = true, nullable = false, length = 8, scale = 0, precision = 0)
    @Basic
>>>>>>> bWeb
    private String numeracao;
    @Column(name = "cidade", unique = false, updatable = true, insertable = true, nullable = false, length = 50, scale = 0, precision = 0)
    @Basic
    private String cidade;

    @Column(name = "uf", unique = false, updatable = true, insertable = true, nullable = false, length = 2, scale = 0, precision = 0)
    @Basic
    private String uf;

    public Placa() {

    }

    public Placa(String numeracao, String cidade, String uf) {
        this.numeracao = numeracao;
        this.cidade = cidade;
        this.uf = uf;

    }

    public Placa(long id, String numeracao, String cidade, String uf) {
        this.id = id;
        this.numeracao = numeracao;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getUf() {
        return this.uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumeracao() {
        return this.numeracao;
    }

    public void setNumeracao(String numeracao) {
        this.numeracao = numeracao;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
