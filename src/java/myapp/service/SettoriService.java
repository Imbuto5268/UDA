/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp.service;

import java.util.List;
 
import myapp.model.Settori;
/**
 *
 * @author favaron
 */
public interface SettoriService {
    Settori findById(int id);
    void saveSettori(Settori settori);
    void updateSettori(Settori settori);
    void deleteSettori(int id);
    List<Settori> findAllSettori();
}
