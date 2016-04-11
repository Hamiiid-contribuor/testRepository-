/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.BudgetEntiteAdministratifItem;
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
public class BudgetEntiteAdministratifItemFacade extends AbstractFacade<BudgetEntiteAdministratifItem> {

    @PersistenceContext(unitName = "budget_en_ligne_fstgPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BudgetEntiteAdministratifItemFacade() {
        super(BudgetEntiteAdministratifItem.class);
    }
    
    
    
    
//    public List<BudgetEntiteAdministratifItem> findByCriteres(EntiteAdministratif entiteAdministratif, String Valider, int annee) {
//
//        String requette = "SELECT bei FROM BudgetEntiteAdministratifItem bei WHERE 1=1 ";
//                
//                if(entiteAdministratif.getId() != null ){
//                    requette += " AND "
//                }
//
//    }

}
