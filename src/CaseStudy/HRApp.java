/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CaseStudy;

/**
 *
 * @author lerishav
 */
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HRApp Starts");
        
        
        Employee emp1 = new Employee(887, "Susan", 15000.00);
        System.out.println(emp1.toString());
        
        Employee emp2 = new Employee(23, "John", 17000.00);
        System.out.println(emp2.toString());
    }
    
}
