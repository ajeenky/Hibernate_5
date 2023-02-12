package many.to.many.mapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Projects {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String module;
	@Column
	private String name;
	@ManyToMany (mappedBy = "pro")
	private List<Developers> dev = new ArrayList<Developers>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Developers> getDev() {
		return dev;
	}
	public void setDev(List<Developers> dev) {
		this.dev = dev;
	}
	@Override
	public String toString() {
		return "Projects [id=" + id + ", module=" + module + ", name=" + name + ", dev=" + dev + "]";
	}
	
}
