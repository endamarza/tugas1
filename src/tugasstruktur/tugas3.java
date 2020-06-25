/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasstruktur;

import java.util.*;


public class tugas3 {
    
public static void main(String[] args) {
    

Stack<String> STACK = new Stack<String>();
STACK.push("Minggu");
STACK.push("Senin");
STACK.push("Selasa");
STACK.push("Rabu");
STACK.push("Kamis");

System.out.println("Stack Awal: " + STACK);

System.out.println("Pop Element: " +
STACK.pop());
System.out.println("Pop Element: " +
STACK.pop());

System.out.println("Update Stack "
+ STACK);
}
}
