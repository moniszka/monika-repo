package com.pl.moniszka;
 
import java.util.ArrayList;
import java.util.List;
 
public class Osoba {
public String imie;
public String nazwisko;
public String plec;
public Osoba(String imie, String nazwisko, String plec)
{
this.imie=imie;
this.nazwisko=nazwisko;
this.plec=plec;
}
public Osoba(String imie, String nazwisko, String plec, List<Car> cars)
{
this.imie=nazwisko;
this.nazwisko=nazwisko;
this.plec=plec;
this.cars=cars;
}
public List<Car> cars= new ArrayList<Car>();
public void printCars(){
for(Car c : this.cars)
{
c.printCar();
}
}
}