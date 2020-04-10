package myapp.model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matteofavaron
 */
@Entity
@Table(name="UTENTI")
public class Utenti implements Serializable{
    
    private static final long serialVersionUID= 1L;
    @Id
    @Column(name="Username")
    private String username;
    
    @Column(name="Nome")
    private String nome;
    
    @Column(name="Cognome")
    private String cognome;
    
    @Column(name="Pass")
    private String pass;
    
    @Enumerated(EnumType.STRING)
    @Column(name="Responsabile")
    private String responsabile;
    
    @OneToMany(cascade= CascadeType.ALL, mappedBy = "Utente")
    private Set<Settori> settoriCollection;
    
    @OneToMany(cascade= CascadeType.ALL, mappedBy= "Utente")
    private Set<Segnalazioni> segnalazioniCollection;
    
    @OneToMany(cascade= CascadeType.ALL, mappedBy= "Utente")
    private Set<VerificaAzioniCorrettive> verificaAzioniCorrettiveCollection;
    
    @ManyToMany(mappedBy="utenti")
    private Set<Team> team;
    
    
}
