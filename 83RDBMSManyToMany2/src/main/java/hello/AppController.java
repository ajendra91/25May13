package hello;

import java.util.HashSet;
import java.util.Set;

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

		Department dept1 =new Department("java","14");
		Department dept2 =new Department("php","44");
		Department dept3 =new Department("dot","444");
		Department dept4 =new Department("c++","40");
		
		departmentDao.save(dept1);
		departmentDao.save(dept2);
		departmentDao.save(dept3);
		departmentDao.save(dept4);
		

		Set<Department> dset1 = new HashSet<Department>();
		dset1.add(dept1);dset1.add(dept2);dset1.add(dept3);dset1.add(dept4);
		
		Set<Department> dset2 = new HashSet<Department>();
		dset2.add(dept1);dset2.add(dept4);
		
		Employee emp1=new Employee(1,"ajendra","25",dset1);
		Employee emp2=new Employee(2,"manish","75",dset2);
		Employee emp3=new Employee(3,"demo","66",dset2);
		Employee emp4=new Employee(4,"raju","21",dset1);
		
		
		employeeDao.save(emp1);
		employeeDao.save(emp2);
		employeeDao.save(emp3);
		employeeDao.save(emp4);

	}
	
	
}
