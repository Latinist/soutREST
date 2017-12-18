package ru.sout.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Анатолий on 23.03.2015.
 */
@Entity
@Table(name = "JOBS", schema = "SOUT69", catalog = "")
public class Jobs implements Serializable {
    private BigDecimal id;
    private BigDecimal idStatus;
    private String jobsCode;

    @Id
    @Column(name = "ID")
    public BigDecimal getId() {
        return id;
    }
    public void setId(BigDecimal id) {
        this.id = id;
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
    @Column(name = "JOBS_CODE")
    public String getJobsCode() {
        return jobsCode;
    }
    public void setJobsCode(String jobsCode) {
        this.jobsCode = jobsCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jobs that = (Jobs) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (idStatus != null ? !idStatus.equals(that.idStatus) : that.idStatus != null) return false;
        if (jobsCode != null ? !jobsCode.equals(that.jobsCode) : that.jobsCode != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idStatus != null ? idStatus.hashCode() : 0);
        result = 31 * result + (jobsCode != null ? jobsCode.hashCode() : 0);
        return result;
    }

}
