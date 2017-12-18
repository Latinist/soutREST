package ru.sout.pojo;

import javax.persistence.*;
//import org.hibernate.annotations.Entity
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Анатолий on 06.02.2015.
 */
//    import java.io.Serializable;
//    import java.math.BigDecimal;
//    import java.math.BigInteger;
//    import javax.persistence.Basic;
//    import javax.persistence.Column;
//    import javax.persistence.Entity;
//    import javax.persistence.Id;
//    import javax.persistence.NamedQueries;
//    import javax.persistence.NamedQuery;
//    import javax.persistence.Table;
//    import javax.validation.constraints.NotNull;
//    import javax.validation.constraints.Size;
//    import javax.xml.bind.annotation.XmlRootElement;


    /**
     *
     * @author Анатолий
     */
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "SprFactors.findAll", query = "SELECT s FROM SprFactors s"),
//    @NamedQuery(name = "SprFactors.findById", query = "SELECT s FROM SprFactors s WHERE s.id = :id"),
//    @NamedQuery(name = "SprFactors.findByIdprnt", query = "SELECT s FROM SprFactors s WHERE s.idprnt = :idprnt"),
//    @NamedQuery(name = "SprFactors.findByNameFactors", query = "SELECT s FROM SprFactors s WHERE s.nameFactors = :nameFactors"),
//    @NamedQuery(name = "SprFactors.findBySname", query = "SELECT s FROM SprFactors s WHERE s.sname = :sname"),
//    @NamedQuery(name = "SprFactors.findByNote", query = "SELECT s FROM SprFactors s WHERE s.note = :note")})

    @Entity
    @Table(name = "SPR_FACTORS")
    public class SprFactors implements Serializable {
        private static final long serialVersionUID = 1L;
        // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
        @Id
        @Basic(optional = false)
        @NotNull
        @Column(name = "ID")
        private BigDecimal id;
        @Column(name = "IDPRNT")
        private BigDecimal idprnt;
        @Size(max = 250)
        @Column(name = "NAME_FACTORS")
        private String nameFactors;
        @Size(max = 30)
        @Column(name = "SNAME")
        private String sname;
        @Size(max = 250)
        @Column(name = "NOTE")
        private String note;

        public SprFactors() {
        }

        public SprFactors(BigDecimal id) {
            this.id = id;
        }

        public SprFactors(BigDecimal id, BigDecimal idprnt, String nameFactors, String sname, String note) {
            this.id = id;
            this.idprnt = idprnt;
            this.nameFactors = nameFactors;
            this.sname = sname;
            this.note = note;
        }

        public BigDecimal getId() {
            return id;
        }

        public void setId(BigDecimal id) {
            this.id = id;
        }

        public BigDecimal getIdprnt() {
            return idprnt;
        }

        public void setIdprnt(BigDecimal idprnt) {
            this.idprnt = idprnt;
        }

        public String getNameFactors() {
            return nameFactors;
        }

        public void setNameFactors(String nameFactors) {
            this.nameFactors = nameFactors;
        }

        public String getSname() {
            return sname;
        }

        public void setSname(String sname) {
            this.sname = sname;
        }

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
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
            if (!(object instanceof SprFactors)) {
                return false;
            }
            SprFactors other = (SprFactors) object;
            if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
                return false;
            }
            return true;
        }

//        @Override
//        public String toString() {
//            return "artintech.domain.SprFactors[ id=" + id + " ]";
//        }

        @Override
        public String toString() {
            return "SprFactors{" +
                    "id=" + id +
                    ", idprnt='" + idprnt + '\'' +
                    ", nameFactors='" + nameFactors + '\'' +
                    ", sname='" + sname + '\'' +
                    ", note=" + note +
                    '}';
        }


    }

