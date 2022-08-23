package ej5poo.Entidad;

import java.util.Scanner;

public class CuentaBancaria {

    private Scanner leer = new Scanner(System.in);
    int numeroCuenta, SaldoActual;
    long DniDelCliente;
    double ingreso, ingresar;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, int SaldoActual, long DniDelCliente) {
        this.numeroCuenta = numeroCuenta;
        this.SaldoActual = SaldoActual;
        this.DniDelCliente = DniDelCliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getSaldoActual() {
        return SaldoActual;
    }

    public long getDniDelCliente() {
        return DniDelCliente;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldoActual(int SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    public void setDniDelCliente(long DniDelCliente) {
        this.DniDelCliente = DniDelCliente;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public void cuenta() {
        System.out.println("ingrese su numero de cuenta: ");
        int ncuenta = leer.nextInt();
        System.out.println("ingrese su numero de DNI:");
        long nDni = leer.nextLong();
        System.out.println("ingrese su numero de su saldo: ");
        int SaldoActual = leer.nextInt();
        System.out.println("indique el monto a ingresar en la cuenta: ");
        ingreso = leer.nextDouble();
        double total = ingreso + SaldoActual;
        System.out.println("el saldo total en la cuenta es de: " + total);
    }

}
