package org.example;
import javax.print.Doc;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Hello world!
 *
 */
public class App {
        public static void main(String[] args) {
                List<String> patients = new ArrayList<>(List.of("aaa","bbbb","ccccc","ddd"
                ////,"eee"
                ));
                List<Doctor> doctorsList = new ArrayList<>(List.of(
                        new Doctor("doctor1", 30, 1, patients,"spec1"),
                       /// new Doctor("doctor2", 30, 44, null,"spec2"),

                        new Doctor("doctor3", 30, 3, null,"spec3"),
                        new Doctor("doctor1", 30, 4, null,"spec4")
                ));
         Clinic clinic = new Clinic(doctorsList);
         try {
                 clinic.foundDoctor("doctor1").makeAppointment("patient");
                 clinic.foundDoctor("doctor1").updateRating(5);
         }
         catch (DoctorNotFoundException e){
            e.printStackTrace();

         }
         catch (AppointmentException e){
             e.printStackTrace();
         }
         for(Doctor doctor : clinic.doctors){
                 System.out.println(doctor);
         }















        }
}
