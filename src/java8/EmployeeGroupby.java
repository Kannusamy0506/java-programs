package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeGroupby {

	public static void main (String args[]){
		
		List<Employee> employeeGroupbyList = new ArrayList<>();
		employeeGroupbyList.add(new Employee(101,"Kannusamy",1001,100000,"active"));
		employeeGroupbyList.add(new Employee(102,"Mani",1002,60000,"active"));
		employeeGroupbyList.add(new Employee(103,"Ramu",1001,90000,"inactive"));
		employeeGroupbyList.add(new Employee(104,"Kalai",1003,20000,"active"));
		employeeGroupbyList.add(new Employee(105,"Sumitha",1001,70000,"inactive"));
		
		// to group the employees based on deptID
	    Map<Integer, List<Employee>> finalMap = employeeGroupbyList.stream().collect(Collectors.groupingBy(Employee::getDeptid));
	    
	    finalMap.entrySet().forEach(System.out::println);
	    
	    Map<Integer, Long> empCount = employeeGroupbyList.stream().collect(Collectors.groupingBy(Employee::getDeptid,Collectors.counting()));
	    
	    empCount.entrySet().forEach(System.out::println);
	    
	    employeeGroupbyList.stream().filter(i-> i.getStatus().equals("active")).forEach(i->System.out.println("active count ====>"+i));
	    employeeGroupbyList.stream().filter(i-> i.getStatus().equals("inactive")).forEach(i->System.out.println("inactive count ====>"+i));
	    
	 
	    Optional<Employee>  empMax = employeeGroupbyList.stream().max(Comparator.comparing(Employee::getSalary));
	    Optional<Employee>  empMin = employeeGroupbyList.stream().min(Comparator.comparing(Employee::getSalary));
	    
	    System.out.println("max Employee details ====="+empMax);
	    System.out.println("min Employee details======"+empMin);
	    
	    
	    Map<Integer, Optional<Employee>> maxSalEmployee = employeeGroupbyList.stream().collect(Collectors.groupingBy(Employee::getDeptid,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
	    
	    maxSalEmployee.entrySet().forEach(System.out::println);
	}
}










class Employee{
	
	int id;
	String name;
	int deptid;
	int salary;
	String status;
	
	public Employee(int id, String name, int deptid, int salary,String status) {
		super();
		this.id = id;
		this.name = name;
		this.deptid = deptid;
		this.salary = salary;
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptid=" + deptid + ", salary=" + salary + ", status="
				+ status + "]";
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}