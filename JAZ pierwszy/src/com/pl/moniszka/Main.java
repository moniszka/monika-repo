package com.pl.moniszka;
 
import java.util.ArrayList;
import java.util.List;
 
public class Main {
 
public static void main(String[] args){
List<Car> cars= new ArrayList<Car>();
cars.add(new Car("Peugeot","GD 17324", "Sopot"));
cars.add(new Car("Renault","GD 29975","Gdañsk"));
cars.add(new Car("Fiat","GDA 45667","Pruszcz Gdañski"));
cars.add(new Car("Audi","GSP 7324", "Sopot"));
cars.add(new Car("Ford","GKS 3333", "Koœcierzyna"));
cars.add(new Car("Renault","GD 29975","Gdañsk"));
Osoba o= new Osoba("Monika","Uszyñska","kobieta",cars);
o.printCars();
}
}
