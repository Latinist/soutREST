package ru.sout.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Анатолий on 13.02.2015.
 */
@Entity
@Table(name = "V_SPR_SUBFACTORS_REST", schema = "SOUT69", catalog = "")
public class SprSubFactors implements Serializable {
    private int id;
    private int idFactors;
//    private String idtbl;
    private String nameSubfactors;
    private BigDecimal prt2;
    private BigDecimal prt3;
    private BigDecimal prt5;
    private String note;
//    private String idCat;
    private BigDecimal pdkMax;
    private BigDecimal pdkCc;
//    private String ps;
    private BigDecimal hc;
//    private String fa;
//    private BigDecimal iddoc;
//    private String dest;
//    private String note;
//    private BigDecimal orderSf;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ID_FACTORS")
    public int getIdFactors() {
        return idFactors;
    }

    public void setIdFactors(int idFactors) {
        this.idFactors = idFactors;
    }

//    @Basic
//    @Column(name = "IDTBL")
//    public String getIdtbl() {
//        return idtbl;
//    }
//
//    public void setIdtbl(String idtbl) {
//        this.idtbl = idtbl;
//    }

    @Basic
    @Column(name = "NAME_SUBFACTORS")
    public String getNameSubfactors() {
        return nameSubfactors;
    }
    public void setNameSubfactors(String nameSubfactors) {
        this.nameSubfactors = nameSubfactors;
    }

    @Basic
    @Column(name = "PRT2")
    public BigDecimal getPrt2() {
        return prt2;
    }
    public void setPrt2(BigDecimal prt2) {
        this.prt2 = prt2;
    }

    @Basic
    @Column(name = "PRT3")
    public BigDecimal getPrt3() {
        return prt3;
    }
    public void setPrt3(BigDecimal prt3) {
        this.prt3 = prt3;
    }

    @Basic
    @Column(name = "PRT5")
    public BigDecimal getPrt5() {
        return prt5;
    }
    public void setPrt5(BigDecimal prt5) {
        this.prt5 = prt5;
    }

    @Basic
    @Column(name = "NOTE")
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

//    @Basic
//    @Column(name = "ID_CAT")
//    public String getIdCat() {
//        return idCat;
//    }
//
//    public void setIdCat(String idCat) {
//        this.idCat = idCat;
//    }
//
    @Basic
    @Column(name = "PDK_MAX")
    public BigDecimal getPdkMax() {
        return pdkMax;
    }
    public void setPdkMax(BigDecimal pdkMax) {
        this.pdkMax = pdkMax;
    }

    @Basic
    @Column(name = "PDK_CC")
    public BigDecimal getPdkCc() {
        return pdkCc;
    }
    public void setPdkCc(BigDecimal pdkCc) {
        this.pdkCc = pdkCc;
    }
//
//    @Basic
//    @Column(name = "PS")
//    public String getPs() {
//        return ps;
//    }
//
//    public void setPs(String ps) {
//        this.ps = ps;
//    }

    @Basic
    @Column(name = "HC")
    public BigDecimal getHc() {
        return hc;
    }

    public void setHc(BigDecimal hc) {
        this.hc = hc;
    }

//    @Basic
//    @Column(name = "FA")
//    public String getFa() {
//        return fa;
//    }
//
//    public void setFa(String fa) {
//        this.fa = fa;
//    }
//
//    @Basic
//    @Column(name = "IDDOC")
//    public BigDecimal getIddoc() {
//        return iddoc;
//    }
//
//    public void setIddoc(BigDecimal iddoc) {
//        this.iddoc = iddoc;
//    }
//
//    @Basic
//    @Column(name = "DEST")
//    public String getDest() {
//        return dest;
//    }
//
//    public void setDest(String dest) {
//        this.dest = dest;
//    }
//
//    @Basic
//    @Column(name = "NOTE")
//    public String getNote() {
//        return note;
//    }
//
//    public void setNote(String note) {
//        this.note = note;
//    }
//
//    @Basic
//    @Column(name = "ORDER_SF")
//    public BigDecimal getOrderSf() {
//        return orderSf;
//    }
//
//    public void setOrderSf(BigDecimal orderSf) {
//        this.orderSf = orderSf;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SprSubFactors that = (SprSubFactors) o;

        if (id != that.id) return false;
        if (idFactors != that.idFactors) return false;
//        if (dest != null ? !dest.equals(that.dest) : that.dest != null) return false;
//        if (fa != null ? !fa.equals(that.fa) : that.fa != null) return false;
//        if (hc != null ? !hc.equals(that.hc) : that.hc != null) return false;
//        if (idCat != null ? !idCat.equals(that.idCat) : that.idCat != null) return false;
//        if (iddoc != null ? !iddoc.equals(that.iddoc) : that.iddoc != null) return false;
//        if (idtbl != null ? !idtbl.equals(that.idtbl) : that.idtbl != null) return false;
        if (nameSubfactors != null ? !nameSubfactors.equals(that.nameSubfactors) : that.nameSubfactors != null)
            return false;
//        if (note != null ? !note.equals(that.note) : that.note != null) return false;
//        if (orderSf != null ? !orderSf.equals(that.orderSf) : that.orderSf != null) return false;
//        if (pdkCc != null ? !pdkCc.equals(that.pdkCc) : that.pdkCc != null) return false;
//        if (pdkMax != null ? !pdkMax.equals(that.pdkMax) : that.pdkMax != null) return false;
//        if (ps != null ? !ps.equals(that.ps) : that.ps != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idFactors;
//        result = 31 * result + (idtbl != null ? idtbl.hashCode() : 0);
        result = 31 * result + (nameSubfactors != null ? nameSubfactors.hashCode() : 0);
//        result = 31 * result + (idCat != null ? idCat.hashCode() : 0);
//        result = 31 * result + (pdkMax != null ? pdkMax.hashCode() : 0);
//        result = 31 * result + (pdkCc != null ? pdkCc.hashCode() : 0);
//        result = 31 * result + (ps != null ? ps.hashCode() : 0);
//        result = 31 * result + (hc != null ? hc.hashCode() : 0);
//        result = 31 * result + (fa != null ? fa.hashCode() : 0);
//        result = 31 * result + (iddoc != null ? iddoc.hashCode() : 0);
//        result = 31 * result + (dest != null ? dest.hashCode() : 0);
//        result = 31 * result + (note != null ? note.hashCode() : 0);
//        result = 31 * result + (orderSf != null ? orderSf.hashCode() : 0);
        return result;
    }

}
