package ru.sout.pojo;

/**
 * Created by Анатолий on 04.06.2015.
 */

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "STRUCTURE_020_050")
public class Structure2050 {
    private BigDecimal idStructure;
    private BigDecimal totalWp;
    private BigDecimal womenWp;
    private BigDecimal prior18Wp;
    private BigDecimal disabledWp;
    private String mashineWp;
    private String materialWp;
    private String commWork;

    @Id
    @Column(name = "ID_STRUCTURE")
    public BigDecimal getIdStructure() {
        return idStructure;
    }
    public void setIdStructure(BigDecimal idStructure) {
        this.idStructure = idStructure;
    }

    @Basic
    @Column(name = "TOTAL_WP")
    public BigDecimal getTotalWp() {
        return totalWp;
    }
    public void setTotalWp(BigDecimal totalWp) {
        this.totalWp = totalWp;
    }

    @Basic
    @Column(name = "WOMEN_WP")
    public BigDecimal getWomenWp() {
        return womenWp;
    }
    public void setWomenWp(BigDecimal womenWp) {
        this.womenWp = womenWp;
    }

    @Basic
    @Column(name = "PRIOR18_WP")
    public BigDecimal getPrior18Wp() {
        return prior18Wp;
    }
    public void setPrior18Wp(BigDecimal prior18Wp) {
        this.prior18Wp = prior18Wp;
    }

    @Basic
    @Column(name = "DISABLED_WP")
    public BigDecimal getDisabledWp() {
        return disabledWp;
    }
    public void setDisabledWp(BigDecimal disabledWp) {
        this.disabledWp = disabledWp;
    }

    @Basic
    @Column(name = "MASHINE_WP")
    public String getMashineWp() {
        return mashineWp;
    }
    public void setMashineWp(String mashineWp) {
        this.mashineWp = mashineWp;
    }

    @Basic
    @Column(name = "MATERIAL_WP")
    public String getMaterialWp() {
        return materialWp;
    }
    public void setMaterialWp(String materialWp) {
        this.materialWp = materialWp;
    }

    @Basic
    @Column(name = "COMMWORK")
    public String getCommWork() {
        return commWork;
    }
    public void setCommWork(String commWork) {
        this.commWork = commWork;
    }
}
