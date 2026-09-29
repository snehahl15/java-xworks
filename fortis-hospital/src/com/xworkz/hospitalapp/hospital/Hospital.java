package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.doctor.Doctor;

public class Hospital {
    private Doctor[] doctors = new Doctor[5];
    int index;

    public boolean addDoctor(Doctor doctor) {
        boolean isAdded = false;

        boolean isDoctorIdValid = false;
        boolean isDoctorNameValid = false;
        boolean isDoctorDesignationValid = false;
        boolean isDoctorSpecializationValid = false;
        boolean isDoctorExperienceValid = false;
        boolean isDoctorFeesValid = false;

        int doctorId = doctor.getDoctorId();
        if (doctorId > 0) {
            isDoctorIdValid = true;
        } else
            System.out.println("Doctor ID invalid");

        String doctorName = doctor.getDoctorName();
        if (doctorName != null && !doctorName.isEmpty()) {
            isDoctorNameValid = true;
        } else System.out.println("Doctor Name invalid");


        String doctorDesignation = doctor.getDesignation();
        if (doctorDesignation != null && !doctorDesignation.isEmpty()) {
            isDoctorDesignationValid = true;
        } else System.out.println("Doctor Designation invalid");

        String[] doctorSpecialization = doctor.getSpecializations();
        if (doctorSpecialization != null) {
            isDoctorSpecializationValid = true;
        } else System.out.println("Doctor Specialization invalid");

        String doctorExperience = doctor.getExperience();
        if (doctorExperience != null) {
            isDoctorExperienceValid = true;
        }
        int doctorFees = doctor.getFees();
        if (doctorFees > 0) {
            isDoctorFeesValid = true;

        }
        if(isDoctorIdValid &&  isDoctorDesignationValid && isDoctorFeesValid
                && isDoctorNameValid && isDoctorSpecializationValid&&isDoctorExperienceValid){
            doctors[index++] = doctor;
            isAdded = true;

        }


        return isAdded;


    }
    public void getAllDoctors(){

        for(Doctor doctor:doctors){
            System.out.println(doctor);}
    }

}
