/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.service;

import java.util.List;

import myapp.model.AzioniCorrettive;
/**
 *
 * @author favaron
 */
public interface AzioniCorrettiveService {
    AzioniCorrettive findById(int id);
    void saveAzioniCorrettive(AzioniCorrettive azioniCorrettive);
    void updateAzioniCorrettive(AzioniCorrettive azioniCorrettive);
    void deleteAzioniCorrettive(int id);
    List<AzioniCorrettive> findAllAzioniCorrettive();
}
