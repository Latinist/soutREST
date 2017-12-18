package ru.sout.pojo;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Анатолий on 22.10.2015.
 */
@Entity
@Table(name = "WP_SOURCE_FACTOR")
public class WpSourceFactor {
        private BigDecimal idWp;
        private String sf1;
        private String sf3;
        private String sf4;
        private String sf5;
        private String sf6;
        private String sf7;
        private String sf8;
        private String sf13;
        private String sf14;
        private String sf15;

        @Id
        @Column(name = "ID_WP")
        public BigDecimal getIdWp() {
            return idWp;
        }
        public void setIdWp(BigDecimal idWp) {
            this.idWp = idWp;
        }

        @Basic
        @Column(name = "SF1")
        public String getSf1() {
            return sf1;
        }
        public void setSf1(String sf1) {
            this.sf1 = sf1;
        }

        @Basic
        @Column(name = "SF3")
        public String getSf3() {
            return sf3;
        }
        public void setSf3(String sf3) {
            this.sf3 = sf3;
        }

        @Basic
        @Column(name = "SF4")
        public String getSf4() {
            return sf4;
        }
        public void setSf4(String sf4) {
            this.sf4 = sf4;
        }

        @Basic
        @Column(name = "SF5")
        public String getSf5() {
            return sf5;
        }
        public void setSf5(String sf5) {
            this.sf5 = sf5;
        }

        @Basic
        @Column(name = "SF6")
        public String getSf6() {
            return sf6;
        }
        public void setSf6(String sf6) {
            this.sf6 = sf6;
        }

        @Basic
        @Column(name = "SF7")
        public String getSf7() {
            return sf7;
        }
        public void setSf7(String sf7) {
            this.sf7 = sf7;
        }

        @Basic
        @Column(name = "SF8")
        public String getSf8() {
            return sf8;
        }
        public void setSf8(String sf8) {
            this.sf8 = sf8;
        }

        @Basic
        @Column(name = "SF13")
        public String getSf13() {
            return sf13;
        }
        public void setSf13(String sf13) {
            this.sf13 = sf13;
        }

        @Basic
        @Column(name = "SF14")
        public String getSf14() { return sf14; }
        public void setSf14(String sf14) { this.sf14 = sf14; }

        @Basic
        @Column(name = "SF15")
        public String getSf15() {
            return sf15;
        }
        public void setSf15(String sf15) {
            this.sf15 = sf15;
        }

    }
