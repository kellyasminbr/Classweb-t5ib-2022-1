package model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;



// @Data  permite jalar mas anotaciones pero agregar constuctores
@Data
@Entity
@Table(name="tb_productos")
 public class Producto {

     @Id
     @Column(name = "id_prod")
     private String codigo;

     @Column(name="des_prod")
     private String descripcion;

		
     @Column(name="stk_prod")
     private int stock;

     @Column(name="pre_prod")
     private double precio;

    @ManyToOne // la relacion de muchos a uno
    @JoinColumn(name = "idcategoria", insertable = false, updatable = false) // jala el name de llave foranea para que funcion el join
     private Categoria categoria; // para el listado join 
    
     private int idcategoria; // para grabar un nuevo producto

		
     @Column(name="est_prod")
     private int estado;

		
     @ManyToOne // la relacion de muchos a uno
     @JoinColumn(name = "idprovedor", insertable = false, updatable = false) // jala el name de llave foranea para que funcion el join
      private Proveedor proveedor; // para el listado join 
    
    
     private int idprovedor;



}
		