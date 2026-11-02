package org.example;
import javax.print.Doc;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Doctor {
    String name;
    int experience;
    double rating;
    String specizlization;
    List<String> patients;
    Doctor() {
        this.patients = new ArrayList<String>();

    }
    Doctor(String name, int experience, double rating, List<String> patients, String specizlization) {
        this.name = name;
        this.experience = experience;
        this.rating = rating;
        this.patients = patients;
        this.specizlization = specizlization;



        if (patients == null) {
            this.patients = new ArrayList<String>();
        }

    }

    public void setExperience(int experience)  throws  DoctorNotFoundException{
        if (experience <= 0){
            throw new InvalidDoctorDataException("Неверный опыт");
        }
        this.experience = experience;
    }

    public void makeAppointment(String patient) throws AppointmentException {
        if (patients.contains(patient))
            throw new AppointmentException("Ошибка записи. Пациент уже есть в списке");
        if (patients.size() > 4)
            throw new AppointmentException("Очередь переполнена");
        patients.add(patient);
    }


    public void updateRating(double rating) {
        if (rating > 5 || rating < 0) {
            throw new InvalidDoctorDataException("Рейтинг от 1 до 5");
        }
        this.rating = rating;
    }
    public String getPatients() {


        StringBuilder sb = new StringBuilder();

        for (String patient : patients) {

          sb.append("\n").append(patient);
        }
       return  sb.toString();
    }

        @Override
        public String toString () {

            return ("Имя: " + this.name + "\nСпециализация" + this.specizlization + "\nexp:" + this.experience + "\nrating" + this.rating + getPatients());

        }


}



