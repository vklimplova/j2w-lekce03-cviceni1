package cz.czechitas.java2webapps.lekce3;

import java.time.LocalDate;
import java.time.Period;

public class Person {
  private String givenName;
  private String lastName;
  private LocalDate birthDate;

  public Person(String givenName, String lastName, LocalDate birthDate) {
    this.givenName = givenName;
    this.lastName = lastName;
    this.birthDate = birthDate;
  }

  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public int getAge() {
    Period period = birthDate.until(LocalDate.now());
    return period.getYears();
  }

}
