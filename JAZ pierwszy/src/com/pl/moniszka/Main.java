package com.pl.moniszka;
 
import java.util.ArrayList;
import java.util.List;
 
public class Main {
 
public static void main(String[] args){
List<Car> cars= new ArrayList<Car>();
cars.add(new Car("Peugeot","GD 17324", "Sopot"));
cars.add(new Car("Renault","GD 29975","Gda�sk"));
cars.add(new Car("Fiat","GDA 45667","Pruszcz Gda�ski"));
cars.add(new Car("Audi","GSP 7324", "Sopot"));
cars.add(new Car("Ford","GKS 3333", "Ko�cierzyna"));
cars.add(new Car("Renault","GD 29975","Gda�sk"));
Osoba o= new Osoba("Monika","Uszy�ska","kobieta",cars);
o.printCars();
}
}
