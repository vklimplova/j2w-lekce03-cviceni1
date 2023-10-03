package cz.czechitas.java2webapps.lekce3.entity;

import java.time.LocalDate;
import java.time.Period;

/* Entita obsahující osobní údaje. */

public class Person {
    private String givenName;
    private String surname;
    private LocalDate birthDate;
    private String photoURL;

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photosURL) {
        this.photoURL = photosURL;
    }

    public int getAge() {
        Period period = birthDate.until(LocalDate.now());
        return period.getYears();
    }
}
