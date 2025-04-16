/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author PC
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        String str = "Four score and seven years ago";
        int first, last;
        first = str.indexOf('r');
        last = str.lastIndexOf('r');
    System.out.println("The letter r first appears at" + "position " +first);
    System.out.println("The letter r last appeas at" + "position " + last);
    
    String fullName = "Mamonne Brightness Motaung";
    String lastName = fullName.substring(19);
    System.out.println("The full name is " + fullName);
    System.out.println("The last name is " + lastName);
    }
}
