package edu.sdnu.sise.grades.scorm.domain;

import java.sql.Date;

public class Student {	
	private Long id;
	private String name;
	private String sexs;
	private String napla;
	private Date brith;

	public Student() {

	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSexs() {
		return sexs;
	}

	public void setSexs(String sexs) {
		this.sexs = sexs;
	}

	public String getNapla() {
		return napla;
	}

	public void setNapla(String napla) {
		this.napla = napla;
	}

	public Date getBrith() {
		return brith;
	}

	public void setBrith(Date brith) {
		this.brith = brith;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brith == null) ? 0 : brith.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((napla == null) ? 0 : napla.hashCode());
		result = prime * result + ((sexs == null) ? 0 : sexs.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (brith == null) {
			if (other.brith != null)
				return false;
		} else if (!brith.equals(other.brith))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (napla == null) {
			if (other.napla != null)
				return false;
		} else if (!napla.equals(other.napla))
			return false;
		if (sexs == null) {
			if (other.sexs != null)
				return false;
		} else if (!sexs.equals(other.sexs))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [brith=" + brith + ", id=" + id + ", name=" + name
				+ ", napla=" + napla + ", sexs=" + sexs + "]";
	}



}
