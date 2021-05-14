package com.example.restaurantpro.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "producto_id")
    private Long id;

    @Column(name = "bebidas")
    private String bebidas;

    @Column(name = "comidas")
    private String comidas;

    @Column(name = "costo_bebidas")
    private String costoBebidas;

    @Column(name = "costo_comida")
    private String costoComida;

    @Column(name = "ofertaBebida")
    private String ofertaBebida;

    @Column(name = "ofertaComida")
    private String ofertaComida;


    @ManyToOne
    @JoinColumn(name="operador_id")
    private Operadores operadorId;


    @Column(name="fecha_creado", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", nullable = false, updatable=false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date fechaCreado;

    @Column(name="fecha_modificado", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date fechaModificado;
}
