package ru.sout.pojo;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Анатолий on 21.04.2015.
 */
@Entity
@Table(name = "V_TABLE_FACTORS")
public class VtableFactor {
    private BigDecimal id;
    private BigDecimal idWp;
    private BigDecimal idFactors;
    private String tabHtml;

    //----------------------------
    @Id
    @Column(name = "ID")
    public BigDecimal getId() {
        return id;
    }
    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ID_WP")
    public BigDecimal getIdWp() {
        return idWp;
    }
    public void setIdWp(BigDecimal idWp) {
        this.idWp = idWp;
    }

    @Basic
    @Column(name = "ID_FACTORS")
    public BigDecimal getIdFactors() {
        return idFactors;
    }

    public void setIdFactors(BigDecimal idFactors) {
        this.idFactors = idFactors;
    }

    @Basic
    @Column(name = "TABHTML")
    public String getTabHtml() {
        return tabHtml;
    }

    public void setTabHtml(String tabHtml) {
        this.tabHtml = tabHtml;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VtableFactor that = (VtableFactor) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (idWp != null ? !idWp.equals(that.idWp) : that.idWp != null) return false;
        if (idFactors != null ? !idFactors.equals(that.idFactors) : that.idFactors != null) return false;
        if (tabHtml != null ? !tabHtml.equals(that.tabHtml) : that.tabHtml != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (idWp != null ? idWp.hashCode() : 0);
        result = 31 * result + (idFactors != null ? idFactors.hashCode() : 0);
        result = 31 * result + (tabHtml != null ? tabHtml.hashCode() : 0);
        return result;
    }

}
