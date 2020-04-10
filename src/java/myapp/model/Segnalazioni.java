package myapp.model;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Set;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

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
@Table(name="SEGNALAZIONI")
public class Segnalazioni implements Serializable{
    
    private static final long serialVersionUID= 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="IdSegnalazione")
    private int idSegnalazione;
    
    @Column(name="Data")
    private Date data;
       
    @Column(name="Tipo")
    private String tipo;
    
    @Column(name="Descrizione")
    private String descrizione;
    
    @JoinColumn(name="Utente",referencedColumnName="Username")
    @ManyToOne
    private Utenti utente;
    
    @JoinColumn(name="Settore",referencedColumnName="IdSettore")
    @ManyToOne
    private Settori settore;
    
    @OneToMany(cascade= CascadeType.ALL, mappedBy= "Segnalazione")
    private Set<AzioniCorrettive> azioniCorrettiveCollection;
}