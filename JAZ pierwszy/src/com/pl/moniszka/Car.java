package com.pl.moniszka;
 
public class Car {
public String marka;
public String nr;
public String miasto;
public Car(String marka, String nr, String miasto){
this.marka=marka;
this.nr=nr;
this.miasto=miasto;
}
public void printCar()
{
System.out.println("Marka: "+marka+"\t nr: "+nr+"\t Miasto:"+miasto );
}
 
}