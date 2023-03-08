package com.exercice;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ControleAgeExercice {
    public static void main(String[] args) throws Exception {
        verificationAge(LocalDate.of(2000, Month.FEBRUARY, 05));
        verificationAge(LocalDate.of(2009, Month.OCTOBER, 10));
    }

    public static void verificationAge(LocalDate dateNaissance) throws Exception {
        LocalDate dateJour = LocalDate.now();
        long age = dateNaissance.until(dateJour,ChronoUnit.YEARS);
        if(age < 16){
            throw new Exception("cette personne n’a pas l’âge légale pour travailler");
        } else {
            System.out.println("Vous avez l'âge de travailler");
        }
    }
}
