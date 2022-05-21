package com.portfolio.jca.entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class ExperienciaLaboral {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExpLab;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud deseada entre 1 y 50 caracteres")
    private String lugarExpLab;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud deseada entre 1 y 50 caracteres")
    private String actualoAnterioryTiempoExpLab;
    
    @NotNull
    @Size(min = 1, max = 300, message = "no cumple con la longitud deseada entre 1 y 300 caracteres")
    private String imagenExpLab;
    
    @NotNull
    @Size(min = 1, max = 3000, message = "no cumple con la longitud deseada entre 1 y 3000 caracteres")
    private String descripcionExpLab;
    
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idAcercaDe")
    private PersonaAcercaDe personaAcercaDe;
}