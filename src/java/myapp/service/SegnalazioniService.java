/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.service;

import java.util.List;

import myapp.model.Segnalazioni;
/**
 *
 * @author favaron
 */
public interface SegnalazioniService {
    Segnalazioni findById(int id);
    void saveSegnalazioni(Segnalazioni segnalazioni);
    void updateSegnalazioni(Segnalazioni segnalazioni);
    void deleteSegnalazioni(int id);
    List<Segnalazioni> findAllSegnalazioni();
}
