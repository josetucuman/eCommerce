package com.gjrssoftware.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.OnDelete;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "tbl_detail_order")
public class DetalleOrden {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id_detail_order", updatable = false, nullable = false)
    @Size(max=32)
    private UUID id;
    private String nombre;
    private double cantidad;
    private double precio;
    private double total;
    @OneToOne
    private Orden orden;

    @OneToOne
    private Producto producto;
}
