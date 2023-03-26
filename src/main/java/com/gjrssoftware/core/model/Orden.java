package com.gjrssoftware.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name = "tbl_orders")
public class Orden {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id_order", updatable = false, nullable = false)
    @Size(max=32)

    private UUID id;

    private String numero;
    private LocalDate fechaCreacion;
    private LocalDate fechaRecibida;
    private double total;

    @ManyToOne
    private Usuario usuario;

    @OneToOne(mappedBy = "orden")
    private DetalleOrden detalle;
}
