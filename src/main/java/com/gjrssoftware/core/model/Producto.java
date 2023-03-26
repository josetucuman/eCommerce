package com.gjrssoftware.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@Entity
@Table(name = "tbl_product")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Producto {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id_product", updatable = false, nullable = false)
    @Size(max=32)
    private UUID id;
    @NotNull
    @Column(name = "product_name")
    @Size(max = 40)
    @NotNull
    private String nombre;
    @Column(name = "product_description")
    @Size(max = 120)
    @NotNull
    private String descripcion;
    @Size(max = 30)
    @Column(name = "product_image")
    private String imagen;
    @NotNull
    @Column(name = "product_price")
    private double precio;
    @NotNull
    @Column(name = "product_quantity")
    private int cantidad;

}
