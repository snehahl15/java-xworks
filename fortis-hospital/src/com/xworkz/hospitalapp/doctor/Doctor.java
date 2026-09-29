package com.xworkz.hospitalapp.doctor;

import java.util.Arrays;

public class Doctor {
   private  int doctorId;
   private  String doctorName;
   private  String designation;
   private String[] specializations;
   private String Experience;
   private int fees;

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setSpecializations(String[] specializations) {
        this.specializations = specializations;
    }

    public String[] getSpecializations() {
        return specializations;
    }

    public void setExperience(String experience) {
        Experience = experience;
    }

    public String getExperience() {
        return Experience;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }


    public int getFees() {
        return fees;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                ", designation='" + designation + '\'' +
                ", specializations=" + Arrays.toString(specializations) +
                ", Experience='" + Experience + '\'' +
                ", fees=" + fees +
                '}';
    }
}
