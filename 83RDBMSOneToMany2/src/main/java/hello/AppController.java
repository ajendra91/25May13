package hello;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@Autowired
	public EmployeeDao employeeDao;
	
	@Autowired
	public DepartmentDao departmentDao;
	
	@PostConstruct
	public void add() {
		
		
		Employee emp1=new Employee("ajendra","25");
		Employee emp2=new Employee("manish","75");
		Employee emp3=new Employee("demo","66");
		Employee emp4=new Employee("raju","21");

		employeeDao.save(emp1);
		employeeDao.save(emp2);
		employeeDao.save(emp3);
		employeeDao.save(emp4);
		
		List<Employee> lst=new ArrayList<Employee>();
		lst.add(emp1);lst.add(emp2);lst.add(emp3);lst.add(emp4);
		
		Department dept =new Department(101,"java","4",lst);
		departmentDao.save(dept);

		
	}
	
	
}
