package com.sid.msbanque.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double solde;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Enumerated(EnumType.STRING)
    //Au niveau de bd les valeurs du type doit etre stockés en type string (0,1) (.ORDINAL : en type numérique)
    private TypeCompte type;
    @ManyToOne
    private Client client;

}
