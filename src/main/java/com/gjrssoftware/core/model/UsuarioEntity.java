package com.gjrssoftware.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@Entity
@Table(name = "tbl_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UsuarioEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id_user", updatable = false, nullable = false)
    @Size(max=32)
    private UUID id;

    @Column(name = "user_name")
    @NotNull
    @Size(max = 50)
    private String nombre;

    @Column(name = "user_lastname")
    @NotNull
    @Size(max = 50)
    private String apellido;
    @Email
    @Column(name = "user_email")
    @Size(max = 50)
    private String email;

    @Column(name = "user_address")
    private String direccion;

    @Column(name = "user_cellphone")
    private String celular;

    @Column(name = "user_pwd")
    private String password;

}
