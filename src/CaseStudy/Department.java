/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CaseStudy;

/**
 *
 * @author lerishav
 */
public class Department {
    private String name;
    
    private Employee[] emps = new Employee[10];
    
    private int lastAddedEmployeeIndex = -1;
    
    public Department(String name){
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
   
}
