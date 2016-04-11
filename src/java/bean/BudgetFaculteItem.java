/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author HawkEye
 */
@Entity
public class BudgetFaculteItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private CompteItem compteItem;
    @ManyToOne
    private BudgetFaculte budgetFaculte;
    @ManyToOne
    private EntiteAdministratif entiteAdministratif; // zid had les attributs li b9aw l ta7t f bean BudgetFaculteItem
    private Double montantAffecte; // hiya l flouss li t affectat f t=0
    private Double montantEngage;
    private Double montantPaye;
    private int montant;

    
    

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
    
    

    public Double getMontantAffecte() {
        return montantAffecte;
    }

    public void setMontantAffecte(Double montantAffecte) {
        this.montantAffecte = montantAffecte;
    }

    public Double getMontantEngage() {
        return montantEngage;
    }

    public void setMontantEngage(Double montantEngage) {
        this.montantEngage = montantEngage;
    }

    public Double getMontantPaye() {
        return montantPaye;
    }

    public void setMontantPaye(Double montantPaye) {
        this.montantPaye = montantPaye;
    }
    
    

    public EntiteAdministratif getEntiteAdministratif() {
        if(entiteAdministratif == null){
            entiteAdministratif = new EntiteAdministratif();
        }
        return entiteAdministratif;
    }

    public void setEntiteAdministratif(EntiteAdministratif entiteAdministratif) {
        this.entiteAdministratif = entiteAdministratif;
    }
    
    
            

    public CompteItem getCompteItem() {
        return compteItem;
    }

    public void setCompteItem(CompteItem compteItem) {
        this.compteItem = compteItem;
    }

    public BudgetFaculte getBudgetFaculte() {
        return budgetFaculte;
    }

    public void setBudgetFaculte(BudgetFaculte budgetFaculte) {
        this.budgetFaculte = budgetFaculte;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudgetFaculteItem)) {
            return false;
        }
        BudgetFaculteItem other = (BudgetFaculteItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.BudgetFaculteItem[ id=" + id + " ]";
    }

}
