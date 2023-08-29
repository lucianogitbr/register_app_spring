package com.example.userregistration.dto;

import com.example.userregistration.model.Ocorrencia;
import lombok.*;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private List<Ocorrencia> ocorrencias;

    public void setOcorrencias(List<Ocorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    public List<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }
}