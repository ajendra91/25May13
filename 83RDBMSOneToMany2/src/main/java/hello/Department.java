package hello;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Department {
	
	@Id
	@GeneratedValue
	public int did;
	public String dname;
	public String length;
	
	//@OneToMany(cascade={CascadeType.ALL},fetch=FetchType.EAGER)
	//@JoinColumn(name="courseId")
	@OneToMany
	public List<Employee> elst;
	
	public Department(String dname, String length) {
		super();
		this.dname = dname;
		this.length = length;
	}
	

	
	
}
