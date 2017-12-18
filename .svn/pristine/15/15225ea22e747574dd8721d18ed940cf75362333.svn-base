package ru.sout.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Анатолий on 10.06.2015.
 */
@Entity
@Table(name = "V_ION")
public class Ion  implements Serializable {
    private BigDecimal id;
    private String nm1;
    private String nm2;
    private String soed;

    @Id
    @Column (name = "ID")
    public BigDecimal getId() {
        return id;
    }
    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Basic
    @Column (name = "NM_")
    public String getNm1() {
        return nm1;
    }
    public void setNm1(String nm1) {
        this.nm1 = nm1;
    }

    @Basic
    @Column (name = "NM")
    public String getNm2() {
        return nm2;
    }
    public void setNm2(String nm2) {
        this.nm2 = nm2;
    }

    @Basic
    @Column (name = "SOED")
    public String getSoed() {
        return soed;
    }
    public void setSoed(String soed) {
        this.soed = soed;
    }

}
