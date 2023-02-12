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
public class Developers {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String Designation;
	@ManyToMany
	private List<Projects> pro = new ArrayList<Projects>();
	
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
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public List<Projects> getPro() {
		return pro;
	}
	public void setPro(List<Projects> pro) {
		this.pro = pro;
	}
	@Override
	public String toString() {
		return "Developers [id=" + id + ", name=" + name + ", Designation=" + Designation + ", pro=" + pro + "]";
	}
}
