package ru.sout.pojo;

import java.math.BigDecimal;

/**
 * Created by Анатолий on 25.12.2015.
 */
public class Errors {
    private BigDecimal id_WP;
    private BigDecimal id_fac;
    private String mess;

    public BigDecimal getId_WP() {
        return id_WP;
    }

    public void setId_WP(BigDecimal id_WP) {
        this.id_WP = id_WP;
    }

    public BigDecimal getId_fac() {
        return id_fac;
    }

    public void setId_fac(BigDecimal id_fac) {
        this.id_fac = id_fac;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }
}
