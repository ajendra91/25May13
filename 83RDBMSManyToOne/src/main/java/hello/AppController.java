package hello;

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
		
		Department dept =new Department("java","4");
		departmentDao.save(dept);
		
		Employee emp1=new Employee(1,"ajendra","25",dept);
		Employee emp2=new Employee(2,"manish","75",dept);
		Employee emp3=new Employee(3,"demo","66",dept);
		Employee emp4=new Employee(4,"raju","21",dept);

		employeeDao.save(emp1);
		employeeDao.save(emp2);
		employeeDao.save(emp3);
		employeeDao.save(emp4);
	}
	
	
}
