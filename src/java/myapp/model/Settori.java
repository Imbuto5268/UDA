package myapp.model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
@Table(name="SETTORI")
public class Settori implements Serializable{
    
    private static final long serialVersionUID= 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="IdSettore")
    private int idSettore;
    
    @Column(name="Nome")
    private String nome;
       
    @JoinColumn(name="Utente",referencedColumnName="Username")
    @ManyToOne
    private Utenti utente;
    
    @OneToMany(cascade= CascadeType.ALL, mappedBy= "Settore")
    private Set<Segnalazioni> segnalazioniCollection;
    
    
}