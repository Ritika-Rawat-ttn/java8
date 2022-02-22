import java.util.ArrayList;

import java.util.stream.Collectors;


class Employee{
    String fullName;
    Long salary;
    String city;

    public Employee(String fullName, long salary, String city) {
        //super();
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }
    public Long getSalary(){
        return this.salary;
    }
    public String getFullName(){
        return this.fullName;
    }
    public String getCity(){
        return  this.city;
    }
}

public class q4b {
    public static <salary> void main(String[] args) {
        
        ArrayList<Employee> list=new ArrayList<Employee>();
        list.add(new Employee("Ritika Rawat Sleeps", 25000L, "kolkata"));
        list.add(new Employee("Ashish Singh OP", 5000L, "delhi"));
        list.add(new Employee("Ashish Devi kandari", 4000L, "delhi"));
        list.add(new Employee("swarnim whats up", 2000L, "delhi"));
        list.add(new Employee("Satish chandra srivastava", 45000L, "chennai"));
        System.out.println("Sorting..............");
        System.out.println((list.stream().distinct()
                        .filter(salary->salary.getSalary()<5000)
                .filter(city->city.getCity().equals("delhi"))
                .map (name->name.getFullName().split(" ")[0])
                .collect(Collectors.toList())));

       
    }        
    
}

