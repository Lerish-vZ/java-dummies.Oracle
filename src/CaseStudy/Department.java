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
    private String deptName;
    
    private Employee[] emps = new Employee[10];
    
    private int lastAddedEmployeeIndex = -1;
    
    public Department(String depName){
        this.deptName = depName;
    }
    
    public String getName() {
        return deptName;
    }

    public void setName(String depName) {
        this.deptName = depName;
    }
    
    public void addEmp(Employee anEmp){
        
        if(lastAddedEmployeeIndex < emps.length){
            lastAddedEmployeeIndex++; 
            emps[lastAddedEmployeeIndex] = anEmp;
        }
    }
    
    public Employee[] getEmployees(){
        Employee[] actualEmps = new Employee[lastAddedEmployeeIndex+1];
        
        for(int i = 0; i < actualEmps.length; i++){
            actualEmps[i] = emps[i];
        }
        return actualEmps;
    }
    
    public int getEmployeeCount(){
        return lastAddedEmployeeIndex+1;
    }
    
    public Employee getEmployeeByID(int empId){
        for (Employee emp: emps){
            
        }
    }
}
