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
		Department dept1 =new Department("java","4");
		Department dept2 =new Department("php","4");
		Department dept3 =new Department("dot","4");
		Department dept4 =new Department("c++","4");
		
		departmentDao.save(dept1);
		departmentDao.save(dept2);
		departmentDao.save(dept3);
		departmentDao.save(dept4);

		List<Department> lst=new ArrayList<Department>();
		lst.add(dept1);lst.add(dept2);lst.add(dept3);lst.add(dept4);


		List<Department> lst2=new ArrayList<Department>();
		lst.add(dept3);lst.add(dept4);


		Employee emp1=new Employee(1,"ajendra","25",lst);

		employeeDao.save(emp1);


		Employee emp2=new Employee(1,"ajendra","25",lst2);

		employeeDao.save(emp2);
	}
	
	
}
