/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_8_area_triangulo;

import java.util.Scanner;

/**
 *
 * @author Gabael
 */
public class EVA1_8_AREA_TRIANGULO {

    public static void main(String[] args) {
        double area;
        double base;
        double altura;
        Scanner captura = new Scanner (System.in);
        System.out.println("Ingrese la medida de la base");
        base = captura.nextDouble();
        System.out.println("Ingrese la medida de la altura");
        altura = captura.nextDouble();
        area = (base*altura)/2;
        System.out.println("El area del triangulo es:");
        System.out.println(area);
        
    }
}
