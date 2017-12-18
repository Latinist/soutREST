package ru.sout.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;

/**
 * Created by Анатолий on 17.02.2015.
 */
@Entity
@Table(name = "V_STRUCTURE_MOBILE", schema = "SOUT69", catalog = "")
public class VStructureMobileEntity implements Serializable {
    private BigDecimal id;
    private BigDecimal idPar;
    private BigDecimal idContract;
    private String nameObject;
    private BigDecimal typerec;
    private BigDecimal idStatus;
    private BigDecimal classUt;
    private BigDecimal clasUtSiz;
    private BigDecimal outArea;
    private String note;
//    private BigDecimal flevel;
    private String jobsCode;
    private BigDecimal durProc;
    private BigDecimal typeWp;
    private BigDecimal catwp;
    private String     numNode;
    private BigDecimal timeday;
    private BigDecimal numSibling;
//    private BigDecimal idExpert;
//    private String fio;
//    private String pstr;

    //-----------------------------------------------------------------------------
//    @OneToMany
//    private StructureSubfactorsValueEntity workplace;
//    public List<StructureSubfactorsValueEntity>
//    @Transient

    //------------------------------------------------------------------------------------
    // для импортира содержимого вложенного списка
    //@OneToMany(fetch = FetchType.EAGER, mappedBy = "workplace", cascade = CascadeType.ALL)
    //------------------------------------------------------------------------------------
//    @OneToMany(mappedBy = "workplace")
////    @CollectionType(type = "StructureSubfactorsValueEntity")
//    private Collection<StructureFactors__> values;
//    public Collection<StructureSubfactorsValueEntity> getValues(){
//        return values;};
//    public void setValues(Collection<StructureSubfactorsValueEntity> values){
//        this.values = values;};
//-----------------------------------------------------------------------------

    //    @Basic
    @Id
    @Column(name = "ID")
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
    @Column(name = "CLASS_UT")
    public BigDecimal getClassUt() {
        return classUt;
    }

    @Basic
    @Column(name = "CLASS_UT_SIZ")
    public void setClassUt(BigDecimal classUt) {
        this.classUt = classUt;
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
//    @Column(name = "FLEVEL")
//    public BigDecimal getFlevel() {
//        return flevel;
//    }
//
//    public void setFlevel(BigDecimal flevel) {
//        this.flevel = flevel;
//    }

    @Basic
    @Column(name = "JOBS_CODE")
    public String getJobsCode(){return jobsCode;};
    public void setJobsCode(String jobsCode){this.jobsCode = jobsCode;};

    @Basic
    @Column(name = "OUTAREA")
    public BigDecimal getOutArea() {
        return outArea;
    }
    public void setOutArea(BigDecimal outArea) {
        this.outArea = outArea;
    }

    @Basic
    @Column(name = "CLASS_UT_SIZ")
    public BigDecimal getClasUtSiz() {
        return clasUtSiz;
    }
    public void setClasUtSiz(BigDecimal clasUtSiz) {
        this.clasUtSiz = clasUtSiz;
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
    @Column(name = "TYPEWP")
    public BigDecimal getTypeWp() {
        return typeWp;
    }
    public void setTypeWp(BigDecimal typeWp) {
        this.typeWp = typeWp;
    }


    @Basic
    @Column(name = "CATWP")
    public BigDecimal getCatwp() {
        return catwp;
    }

    @Basic
    @Column(name = "NUMNODE")
    public String getNumNode() {  return numNode; }
    public void setNumNode(String numNode) {  this.numNode = numNode;  }

    @Basic
    @Column(name = "TIMEDAY")
    public BigDecimal getTimeday() {
        return timeday;
    }
    public void setTimeday(BigDecimal timeday) {
        this.timeday = timeday;
    }

    @Basic
    @Column(name = "NUMSIBLING")
    public BigDecimal getNumSibling() {
        return numSibling;
    }
    public void setNumSibling(BigDecimal numSibling) {
        this.numSibling = numSibling;
    }

    public void setCatwp(BigDecimal catwp) {
        this.catwp = catwp;
    }



//    @Basic
//    @Column(name = "ID_EXPERT")
//    public BigDecimal getIdExpert() {
//        return idExpert;
//    }
//
//    public void setIdExpert(BigDecimal idExpert) {
//        this.idExpert = idExpert;
//    }
//
//    @Basic
//    @Column(name = "FIO")
//    public String getFio() {
//        return fio;
//    }
//
//    public void setFio(String fio) {
//        this.fio = fio;
//    }
//
//    @Basic
//    @Column(name = "PSTR")
//    public String getPstr() {
//        return pstr;
//    }
//
//    public void setPstr(String pstr) {
//        this.pstr = pstr;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VStructureMobileEntity that = (VStructureMobileEntity) o;

//        if (fio != null ? !fio.equals(that.fio) : that.fio != null) return false;
//        if (flevel != null ? !flevel.equals(that.flevel) : that.flevel != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (idContract != null ? !idContract.equals(that.idContract) : that.idContract != null) return false;
//        if (idExpert != null ? !idExpert.equals(that.idExpert) : that.idExpert != null) return false;
        if (idPar != null ? !idPar.equals(that.idPar) : that.idPar != null) return false;
        if (nameObject != null ? !nameObject.equals(that.nameObject) : that.nameObject != null) return false;
//        if (pstr != null ? !pstr.equals(that.pstr) : that.pstr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idPar != null ? idPar.hashCode() : 0);
        result = 31 * result + (idContract != null ? idContract.hashCode() : 0);
        result = 31 * result + (nameObject != null ? nameObject.hashCode() : 0);
//        result = 31 * result + (flevel != null ? flevel.hashCode() : 0);
//        result = 31 * result + (idExpert != null ? idExpert.hashCode() : 0);
//        result = 31 * result + (fio != null ? fio.hashCode() : 0);
//        result = 31 * result + (pstr != null ? pstr.hashCode() : 0);
        return result;
    }

}
