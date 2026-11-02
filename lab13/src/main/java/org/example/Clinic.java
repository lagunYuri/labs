package org.example;
import javax.print.Doc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Clinic {
    public List<Doctor> doctors;
    Clinic() {
        this.doctors = new ArrayList<Doctor>();
    }
    Clinic(List<Doctor> doctors) {
        this.doctors = doctors;
    }
    public Doctor foundDoctor(String name) throws DoctorNotFoundException {
        for (Doctor doctor : doctors) {
            if (doctor.name.equalsIgnoreCase(name)) {

                return doctor;
            }
        }
        throw new DoctorNotFoundException("Доктора с таким именем нет в списке");
    }
    public void addDoctor(Doctor doctor){
        for(Doctor doctor1 : doctors){
            if(doctor1.name.equalsIgnoreCase(doctor.name)){
                System.out.println("Доктор с таким именем уже есть");
                return;
            }
        }
        this.doctors.add(doctor);
    }
}

