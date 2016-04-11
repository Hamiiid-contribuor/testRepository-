/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.CompteItem;
import bean.EntiteAdministratif;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hamid
 */
@Stateless
public class CompteItemFacade extends AbstractFacade<CompteItem> {

    @PersistenceContext(unitName = "budget_en_ligne_fstgPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CompteItemFacade() {
        super(CompteItem.class);
    }

//    public List<CompteItem> findByCriteres(EntiteAdministratif entiteAdministratif, String Valider, int annee) {
//
//        String requette 
//
//    }

   

}
