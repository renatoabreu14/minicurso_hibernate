package models;
// Generated 24/06/2019 20:38:05 by Hibernate Tools 4.3.1



/**
 * Produto generated by hbm2java
 */
public class Produto  implements java.io.Serializable {


     private Integer id;
     private Categoria categoria;
     private Marca marca;
     private String descricao;
     private Double vlrunit;
     private Integer estoque;

    public Produto() {
    }

    public Produto(Categoria categoria, Marca marca, String descricao, Double vlrunit, Integer estoque) {
       this.categoria = categoria;
       this.marca = marca;
       this.descricao = descricao;
       this.vlrunit = vlrunit;
       this.estoque = estoque;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Categoria getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Marca getMarca() {
        return this.marca;
    }
    
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getVlrunit() {
        return this.vlrunit;
    }
    
    public void setVlrunit(Double vlrunit) {
        this.vlrunit = vlrunit;
    }
    public Integer getEstoque() {
        return this.estoque;
    }
    
    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }




}

