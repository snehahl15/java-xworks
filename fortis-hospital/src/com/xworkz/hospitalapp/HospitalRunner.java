package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.doctor.Doctor;
import com.xworkz.hospitalapp.hospital.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        String[]  anoopsSpecializations = {"Diabetology","Endocrinology ", "Endocrinology"};
        String[]  amitJavedSpecializations = {"General Surgery "," Bariatric Surgery "};
        String[]  manjinderSpecializations = {"Cardiac Sciences "," Interventional Cardiology"};
        String[] ajaySpecializations = {"Support Specialties","General Physician"};
        String[] koulsSpecializations = {"Cardiac Sciences ","Vascular Surgery "};


        Doctor doctor = new Doctor();
        doctor.setDoctorId(1);
        doctor.setDoctorName("Dr. Anoop Misra");
        doctor.setDesignation("Executive Chairman Fortis C Doc | Fortis C-Doc");
        doctor.setSpecializations(anoopsSpecializations);
        doctor.setExperience("40 Years");
        doctor.setFees(3000);

        Doctor doctor1 = new Doctor();
        doctor1.setDoctorId(2);
        doctor1.setDoctorName("Dr. (Prof.) Amit Javed");
        doctor1.setDesignation("Principal Director & HOD Lap GI, GI Onco, Bariatric & MIS Surgery | FMRI Gurgaon");
        doctor1.setSpecializations(amitJavedSpecializations);
        doctor1.setExperience("40 Years");
        doctor1.setFees(4000);


        Doctor doctor2 = new Doctor();
        doctor2.setDoctorId(3);
        doctor2.setDoctorName("Dr. (Col) Manjinder Sandhu");
        doctor2.setDesignation("Principal Director Cardiology | FMRI Gurgaon");
        doctor2.setSpecializations(manjinderSpecializations);
        doctor2.setExperience("35Years");
        doctor2.setFees(2000);

        Doctor doctor3= new Doctor();
        doctor3.setDoctorId(4);
        doctor3.setDoctorName("Dr. Ajay Agarwal");
        doctor3.setDesignation("Chairman - Internal Medicine | Fortis Noida");
        doctor3.setSpecializations(ajaySpecializations);
        doctor3.setExperience("25Years");
        doctor3.setFees(1400);


        Doctor doctor4= new Doctor();
        doctor4.setDoctorId(5);
        doctor4.setDoctorName("Dr. Ajay Kaul");
        doctor4.setDesignation("Chairman Cardiac Science | Fortis Noida");
        doctor4.setSpecializations(koulsSpecializations);
        doctor4.setExperience("38Years");
        doctor4.setFees(1600);




        hospital.addDoctor(doctor);
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addDoctor(doctor3);
        hospital.addDoctor(doctor4);



        hospital.getAllDoctors();

    }

}
