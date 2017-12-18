package ru.sout.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Анатолий on 15.04.2015.
 */
@Entity
@Table(name = "STRUCTURE_WORKPLACE", schema = "SOUT69", catalog = "")
public class WorkPlace implements Serializable {
    private BigDecimal id;
    private BigDecimal idPar;
    private BigDecimal idContract;
    private String nameObject;
    private BigDecimal typerec;
    private BigDecimal idStatus;
    private BigDecimal durProc;
    private BigDecimal delrec;
    private BigDecimal outArea;
    private String note;
    private BigDecimal typeWp;
    private BigDecimal catwp;
    private String ExtCode;
    private BigDecimal numSibling;
    //-----------------------------------------------------------------------------
    @Id
    @Column(name = "ID")
////    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="my_Workplace_seq_gen")
//    @SequenceGenerator(name = "my_Workplace_seq_gen", sequenceName = "STRUCTURE_WORKPLACE_SEQ")
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ID_PAR")
    public BigDecimal getIdPar() {
        return idPar;
    }

    public void setIdPar(BigDecimal idPar) {
        this.idPar = idPar;
    }

    @Basic
    @Column(name = "ID_CONTRACT")
    public BigDecimal getIdContract() {
        return idContract;
    }

    public void setIdContract(BigDecimal idContract) {
        this.idContract = idContract;
    }

    @Basic
    @Column(name = "NAME_OBJECT")
    public String getNameObject() {
        return nameObject;
    }

    public void setNameObject(String nameObject) {
        this.nameObject = nameObject;
    }

    @Basic
    @Column(name = "TYPEREC")
    public  BigDecimal getTyperec(){return  typerec;}
    public void setTyperec(BigDecimal typerec){this.typerec = typerec;}

    @Basic
    @Column(name = "ID_STATUS")
    public BigDecimal getIdStatus() {
        return idStatus;
    }
    public void setIdStatus(BigDecimal idStatus) {
        this.idStatus = idStatus;
    }


    @Basic
    @Column(name = "DUR_PROC")
    public BigDecimal getDurProc() {
        return durProc;
    }
    public void setDurProc(BigDecimal durProc) {
        this.durProc = durProc;
    }

    @Basic
    @Column(name = "DELREC")
    public BigDecimal getDelrec() {
        return delrec;
    }
    public void setDelrec(BigDecimal delrec) {
        this.delrec = delrec;
    }

    @Basic
    @Column(name = "OUTAREA")
    public BigDecimal getOutArea() {
        return outArea;
    }
    public void setOutArea(BigDecimal outArea) {
        this.outArea = outArea;
    }

    @Basic
    @Column(name = "NOTE")
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "TYPEWP")
    public BigDecimal getTypeWp() {   return typeWp;  }
    public void setTypeWp(BigDecimal typeWp) { this.typeWp = typeWp; }

    @Basic
    @Column (name = "CATWP")
    public BigDecimal getCatwp() {
        return catwp;
    }
    public void setCatwp(BigDecimal catwp) {
        this.catwp = catwp;
    }

    @Basic
    @Column (name = "EXTCODE")
    public String getExtCode() { return ExtCode;  }
    public void setExtCode(String extCode) { ExtCode = extCode; }

    @Basic
    @Column(name = "NUMSIBLING")
    public BigDecimal getNumSibling() {
        return numSibling;
    }
    public void setNumSibling(BigDecimal numSibling) {
        this.numSibling = numSibling;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkPlace that = (WorkPlace) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (idContract != null ? !idContract.equals(that.idContract) : that.idContract != null) return false;
        if (idPar != null ? !idPar.equals(that.idPar) : that.idPar != null) return false;
        if (nameObject != null ? !nameObject.equals(that.nameObject) : that.nameObject != null) return false;

        if (typerec != null ? !typerec.equals(that.typerec) : that.typerec != null) return false;
        if (idStatus != null ? !idStatus.equals(that.idStatus) : that.idStatus != null) return false;
        if (durProc != null ? !durProc.equals(that.durProc) : that.durProc != null) return false;
        if (delrec != null ? !delrec.equals(that.delrec) : that.delrec != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idPar != null ? idPar.hashCode() : 0);
        result = 31 * result + (idContract != null ? idContract.hashCode() : 0);
        result = 31 * result + (nameObject != null ? nameObject.hashCode() : 0);
        result = 31 * result + (typerec != null ? typerec.hashCode() : 0);
        result = 31 * result + (nameObject != null ? nameObject.hashCode() : 0);
        result = 31 * result + (idStatus != null ? idStatus.hashCode() : 0);
        result = 31 * result + (durProc != null ? durProc.hashCode() : 0);
        result = 31 * result + (delrec != null ? delrec.hashCode() : 0);
        return result;
    }

}
