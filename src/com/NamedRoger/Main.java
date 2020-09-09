package com.NamedRoger;

public class Main {

    public static void main(String[] args) {
	    OperationMath op = new OperationMath(15,5);
        System.out.println("Suma: "+op.Suma());
        System.out.println("Resta: "+op.Resta());
        System.out.println("Multiplicación: " +op.Multiplicacion());
        System.out.println("División: "+op.Division());
        System.out.println("Módulo: "+op.Mod());

    }
}
