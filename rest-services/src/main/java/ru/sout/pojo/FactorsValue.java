package ru.sout.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Анатолий on 16.03.2015.
 */

@Entity
@Table(name = "STRUCTURE_FACTORS", schema = "SOUT69", catalog = "")
public class FactorsValue implements Serializable {
    private BigDecimal id;
    private BigDecimal idStructure;
    private BigDecimal idFactors;
    private String value2;
    private String sname;
    private BigDecimal idStatus;
//    private BigDecimal idSubfactor;
//    private BigDecimal valueMax;
//    private BigDecimal valueAvg;
    private BigDecimal durProc;
    private BigDecimal classUt;
    private BigDecimal classUtSiz;
    private String note;
    private String job;
    private Date dtInsert;

    public FactorsValue(){};

//    @JoinColumn(name = "ID_STRUCTURE", referencedColumnName = "ID", insertable = false, updatable = false)
//    @ManyToOne
//    private VStructureMobileEntity workplace;
//
//    public VStructureMobileEntity getWorkplace() {
//        return workplace;
//    } ;
//
//    public void setWorkplace(VStructureMobileEntity workplace) {
//        this.workplace = workplace;
//    };


    //@Basic
    @Id
    @Column(name = "ID")
//    //@GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="my_Factors_seq_gen")
//    @SequenceGenerator(name = "my_Factors_seq_gen", sequenceName = "STRUCTURE_FACTORS_SEQ")

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ID_STRUCTURE")
    public BigDecimal getIdStructure() {
        return idStructure;
    }

    public void setIdStructure(BigDecimal idStructure) {
        this.idStructure = idStructure;
    }

    @Basic
    @Column(name = "ID_FACTORS")
    public BigDecimal getIdFactors() {
        return idFactors;
    }

    public void setIdFactors(BigDecimal idFactors) {
        this.idFactors = idFactors;
    }

//    @Basic
//    @Column(name = "ID_SUBFACTOR")
//    public BigDecimal getIdSubfactor() {
//        return idSubfactor;
//    }
//
//    public void setIdSubfactor(BigDecimal idSubfactor) {
//        this.idSubfactor = idSubfactor;
//    }
//
//    @Basic
//    @Column(name = "VALUE_MAX")
//    public BigDecimal getValueMax() {
//        return valueMax;
//    }
//
//    public void setValueMax(BigDecimal valueMax) {
//        this.valueMax = valueMax;
//    }
//
//    @Basic
//    @Column(name = "VALUE_AVG")
//    public BigDecimal getValueAvg() {
//        return valueAvg;
//    }
//
//    public void setValueAvg(BigDecimal valueAvg) {
//        this.valueAvg = valueAvg;
//    }

    @Basic
    @Column(name = "DUR_PROC")
    public BigDecimal getDurProc() {
        return durProc;
    }

    public void setDurProc(BigDecimal durProc) {
        this.durProc = durProc;
    }

    @Basic
    @Column(name = "ID_STATUS")
    public BigDecimal getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(BigDecimal idStatus) {
        this.idStatus = idStatus;
    }

    @Basic
    @Column(name = "VALUE2")
    public String getValue2(){ return this.value2; }
    public void setValue2(String value2) {
        this.value2 = value2;
    }

    @Basic
    @Column(name = "SNAME")
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }

    @Basic
    @Column(name = "CLASS_UT")
    public BigDecimal getClassUt() {
        return classUt;
    }
    public void setClassUt(BigDecimal classUt) {
        this.classUt = classUt;
    }

    @Basic
    @Column(name = "CLASS_UT_SIZ")
    public BigDecimal getClassUtSiz() {
        return classUtSiz;
    }
    public void setClassUtSiz(BigDecimal clasUtSiz) {
        this.classUtSiz = clasUtSiz;
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
    @Column(name = "JOB")
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "DT_INSERT")
    public Date getDtInsert() {return dtInsert;}
    public void setDtInsert(Date dtInsert) {this.dtInsert = dtInsert;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FactorsValue that = (FactorsValue) o;

//        if (durProc != null ? !durProc.equals(that.durProc) : that.durProc != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
//        if (idExpert != null ? !idExpert.equals(that.idExpert) : that.idExpert != null) return false;
        if (idFactors != null ? !idFactors.equals(that.idFactors) : that.idFactors != null) return false;
        if (idStructure != null ? !idStructure.equals(that.idStructure) : that.idStructure != null) return false;
//        if (idSubfactor != null ? !idSubfactor.equals(that.idSubfactor) : that.idSubfactor != null) return false;
//        if (idclass != null ? !idclass.equals(that.idclass) : that.idclass != null) return false;
//        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (value2 != null ? !value2.equals(that.value2) : that.value2 != null) return false;
//        if (valueAvg != null ? !valueAvg.equals(that.valueAvg) : that.valueAvg != null) return false;
//        if (valueMax != null ? !valueMax.equals(that.valueMax) : that.valueMax != null) return false;
        if (sname != null ? !sname.equals(that.sname) : that.sname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idStructure != null ? idStructure.hashCode() : 0);
        result = 31 * result + (idFactors != null ? idFactors.hashCode() : 0);
//        result = 31 * result + (idSubfactor != null ? idSubfactor.hashCode() : 0);
//        result = 31 * result + (valueMax != null ? valueMax.hashCode() : 0);
//        result = 31 * result + (valueAvg != null ? valueAvg.hashCode() : 0);
        result = 31 * result + (durProc != null ? durProc.hashCode() : 0);
        result = 31 * result + (value2 != null ? value2.hashCode() : 0);
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        return result;

    }

}