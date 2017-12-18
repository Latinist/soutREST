package ru.sout.pojo;

/**
 * Created by Анатолий on 22.04.2015.
 */

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "V_GET_WPDATA")
public class KartWorkplace {
    private BigDecimal id;
    private String kartHtml;
    private Integer fact1;
    private Integer fact2;
    private Integer fact3;
    private Integer fact4;
    private Integer fact5;
    private Integer fact6;
    private Integer fact7;
    private Integer need1;
    private Integer need2;
    private Integer need3;
    private Integer need4;
    private Integer need5;
    private Integer need6;
    private Integer need7;
    private String base1;
    private String base2;
    private String base3;
    private String base4;
    private String base5;
    private String base6;
    private String base7;
    private String recommend;
    //-------------------------------
    @Id
    @Column(name = "ID")
    public BigDecimal getId() {
        return id;
    }
    public void setId(BigDecimal id) {
        this.id = id;
    }

    @Basic
    @Column(name = "KARTHTML")
    public String getKartHtml() {
        return kartHtml;
    }
    public void setKartHtml(String kartHtml) {
        this.kartHtml = kartHtml;
    }

    @Basic
    @Column(name = "FACT1")
    public Integer getFact1() {return fact1;}
    public void setFact1(Integer fact1) {this.fact1 = fact1;}
    @Basic
    @Column(name = "FACT2")
    public Integer getFact2() { return fact2;}
    public void setFact2(Integer fact2) {this.fact2 = fact2;}
    @Basic
    @Column(name = "FACT3")
    public Integer getFact3() { return fact3;}
    public void setFact3(Integer fact3) {this.fact3 = fact3;}
    @Basic
    @Column(name = "FACT4")
    public Integer getFact4() { return fact4;}
    public void setFact4(Integer fact4) {this.fact4 = fact2;}
    @Basic
    @Column(name = "FACT5")
    public Integer getFact5() { return fact5;}
    public void setFact5(Integer fact5) {this.fact5 = fact5;}
    @Basic
    @Column(name = "FACT6")
    public Integer getFact6() { return fact1;}
    public void setFact6(Integer fact6) {this.fact6 = fact6;}
    @Basic
    @Column(name = "FACT7")
    public Integer getFact7() { return fact1;}
    public void setFact7(Integer fact7) {this.fact7 = fact7;}

    @Basic
    @Column(name = "NEED1")
    public Integer getNeed1() {
        return need1;
    }
    public void setNeed1(Integer need1) {
        this.need1 = need1;
    }

    @Basic
    @Column(name = "NEED2")
    public Integer getNeed2() {
        return need2;
    }
    public void setNeed2(Integer need2) {
        this.need2 = need2;
    }

    @Basic
    @Column(name = "NEED3")
    public Integer getNeed3() {
        return need3;
    }
    public void setNeed3(Integer need3) {
        this.need3 = need3;
    }

    @Basic
    @Column(name = "NEED4")
    public Integer getNeed4() {
        return need4;
    }
    public void setNeed4(Integer need4) {
        this.need4 = need4;
    }

    @Basic
    @Column(name = "NEED5")
    public Integer getNeed5() {
        return need5;
    }
    public void setNeed5(Integer need5) {
        this.need5 = need5;
    }

    @Basic
    @Column(name = "NEED6")
    public Integer getNeed6() {
        return need6;
    }
    public void setNeed6(Integer need6) {
        this.need6 = need6;
    }

    @Basic
    @Column(name = "NEED7")
    public Integer getNeed7() {
        return need7;
    }
    public void setNeed7(Integer need7) {
        this.need7 = need7;
    }

    @Basic
    @Column(name = "BASE1")
    public String getBase1() {
        return base1;
    }
    public void setBase1(String base1) {
        this.base1 = base1;
    }

    @Basic
    @Column(name = "BASE2")
    public String getBase2() {
        return base2;
    }
    public void setBase2(String base2) {
        this.base2 = base2;
    }

    @Basic
    @Column(name = "BASE3")
    public String getBase3() {
        return base3;
    }
    public void setBase3(String base3) {
        this.base3 = base3;
    }

    @Basic
    @Column(name = "BASE4")
    public String getBase4() {
        return base4;
    }
    public void setBase4(String base4) {
        this.base4 = base4;
    }

    @Basic
    @Column(name = "BASE5")
    public String getBase5() {
        return base5;
    }
    public void setBase5(String base5) {
        this.base5 = base5;
    }

    @Basic
    @Column(name = "BASE6")
    public String getBase6() {
        return base6;
    }
    public void setBase6(String base6) {
        this.base6 = base6;
    }

    @Basic
    @Column(name = "BASE7")
    public String getBase7() {
        return base7;
    }
    public void setBase7(String base7) {
        this.base7 = base7;
    }

    @Basic
    @Column(name = "RECOMMEND")
    public String getRecommend() {
        return recommend;
    }
    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }
}
