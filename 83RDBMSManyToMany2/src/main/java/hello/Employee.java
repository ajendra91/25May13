package hello;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
public class Employee {
	
	@Id
	@GeneratedValue
	public int id;
	public String name;
	public String age;
	@ManyToMany(cascade= {CascadeType.PERSIST,CascadeType.MERGE},
			fetch=FetchType.EAGER)
	@JoinTable(name="ajendradata",
	joinColumns= {@JoinColumn(name="eid")},
	inverseJoinColumns= {@JoinColumn(name="did")})
	public Set<Department> dset;

}
