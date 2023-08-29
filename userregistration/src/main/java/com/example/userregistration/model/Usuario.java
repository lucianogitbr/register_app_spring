package com.example.userregistration.model;

import lombok.*;


import java.util.List;
import jakarta.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Ocorrencia> ocorrencias;
}
