package ch.etmles.payroll.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.Objects;

@Entity
public class Employee {

    private @Id
    @GeneratedValue Long id;
    private String name;
    private String role;
    //à changer en date...
    private String dateOfbirth ;


    public Employee(){}

    public Employee(String name, String role, String dateOfbirth){
        this.setName(name);
        this.setRole(role);
        this.setDateOfbirth(dateOfbirth);
    }

    public Long getID(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getRole(){
        return this.role;
    }

    public void setRole(String role){
        this.role = role;
    }

    //à changer en date...
    public String getDateOfbirth() {
        return dateOfbirth;
    }
    public void setDateOfbirth(String dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    // a adapter pour un format date
    public int geeeeeeeeeeeeeeeeeeeetAge(){
        return 17;
    }


    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(!(o instanceof Employee employee))
            return false;
        return Objects.equals(this.id, employee.id)
                && Objects.equals(this.name, employee.name)
                && Objects.equals(this.role, employee.role)
                && Objects.equals(this.dateOfbirth, employee.dateOfbirth);
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.id, this.name, this.role, this.dateOfbirth);
    }

    @Override
    public String toString(){
        return "Employee{" + "id=" + this.getID() + ", name='" + this.getName() + '\'' + ", role='" + this.getRole() + '\'' + ", date of birth='" + this.getDateOfbirth() + '\''+ '}';
    }
}
