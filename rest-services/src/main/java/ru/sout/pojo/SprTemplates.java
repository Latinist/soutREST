package ru.sout.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Анатолий on 02.04.2015.
 */

@Entity
@Table(name = "SPR_TEMPLATES")
public class SprTemplates implements Serializable{
    private static final long serialVersionUID = 1L;

    private BigDecimal id;
    private BigDecimal idFactors;
    private String name;
    private String body;
    private BigDecimal dflt;
    private String sname;

    @Id
    @Column(name = "ID")
    public BigDecimal getId() {
        return id;
    }
    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ID_FACTOR")
    public BigDecimal getIdFactors() {
        return idFactors;
    }
    public void setIdFactors(BigDecimal idFactors) {
        this.idFactors = idFactors;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "BODY")
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    @Basic
    @Column(name = "DFLT")
    public BigDecimal getDflt() {
        return dflt;
    }
    public void setDflt(BigDecimal dflt) {
        this.dflt = dflt;
    }

    @Basic
    @Column(name = "SNAME")
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
}


