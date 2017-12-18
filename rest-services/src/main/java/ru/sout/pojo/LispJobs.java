package ru.sout.pojo;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Анатолий on 11.12.2015.
 */
@Entity
@Table(name = "V_GET_LISP_JOBS_ON_EXPERT", schema = "SOUT69", catalog = "")
public class LispJobs implements Serializable{
    private String jobs_Code;
    private String shortName;
    private String lstr;
    private String pstr;

    @Id
    @Column(name = "JOBS_CODE")
    public String getJobs_Code() {
        return jobs_Code;
    }
    public void setJobs_Code(String jobs_Code) {
        this.jobs_Code = jobs_Code;
    }

    @Basic
    @Column(name = "SHORTNAME")
    public String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Basic
    @Column(name = "LSTR")
    public String getLstr() {
        return lstr;
    }
    public void setLstr(String lstr) {
        this.lstr = lstr;
    }

    @Basic
    @Column(name = "PSTR")
    public String getPstr() {
        return pstr;
    }
    public void setPstr(String pstr) {
        this.pstr = pstr;
    }
}
