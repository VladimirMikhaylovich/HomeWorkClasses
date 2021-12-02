package com.company;

import sun.plugin2.applet.FXAppletSecurityManager;

import java.security.cert.CertificateNotYetValidException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Student studentOne = new Student(1,"Ivan", "Ivanovich", "Ivanov", "1990-01-01","Lenina" , 12345, "FAM", 1, "TM2");
        Student studentTwo  = new Student(2,"Petr","Petrovich","Petrov", "1987-02-02", "Zukova",12346, "IPTM",1, "TM");
        Student studentThree = new Student(3,"Vladimir","Mikhaylovich", "YAltsev", "1987-07-22", "Krasnozvezdnaya",12347, "FAM", 5, "TM");
        Student studentFour = new Student(4,"Valeriy", "Vladimirovich","Gluschenko", "1987-02-05","Belinka", 123458,"FAM",2,"TM");

        Student [] students ={studentOne,studentTwo,studentThree,studentFour};
        System.out.println("List of students:");

      for(Student s :students){
          System.out.println(s.getName()+" "+s.getFatherName()+" "+s.getLastName());
      }

      System.out.println("List of faculty:");

      for(Student s :students){
          if(s.getFaculty().equals("FAM")){
              System.out.println(s.getName()+" "+s.getFatherName()+" "+s.getLastName());
          }
      }

        System.out.println("List students are born in 1987:");
      for(Student s:students){
          if(yearOfBirth(s.birthday)==1987){
              System.out.println(s.getName()+" "+s.getFatherName()+" "+s.getLastName());
          }
      }
        System.out.println("TM group list:");

      for(Student s:students){
            if(s.getGroup().equals("TM")){
                System.out.println(s.getName()+" "+s.getFatherName()+" "+s.getLastName());
            }
        }

    }

    public static int yearOfBirth (String st) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date date=null;
        Calendar calendar = new GregorianCalendar();
        try {
            date = formatter.parse(st);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

}
