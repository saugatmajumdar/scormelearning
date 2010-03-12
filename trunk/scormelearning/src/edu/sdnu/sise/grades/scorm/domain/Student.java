package edu.sdnu.sise.grades.scorm.domain;

import java.sql.Date;
/**
 * 学生类,对应数据库中的student表
 * @author chenzmin
 *
 */
public class Student {	
	private Long id;
	private String name;
	/**
	 * 性别
	 */
	private String sexs;
	/**
	 * 籍贯
	 */
	private String nativePlace;
	private Date birth;

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
		return nativePlace;
	}

	public void setNapla(String napla) {
		this.nativePlace = napla;
	}

	public Date getBrith() {
		return birth;
	}

	public void setBrith(Date brith) {
		this.birth = brith;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birth == null) ? 0 : birth.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nativePlace == null) ? 0 : nativePlace.hashCode());
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
		if (birth == null) {
			if (other.birth != null)
				return false;
		} else if (!birth.equals(other.birth))
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
		if (nativePlace == null) {
			if (other.nativePlace != null)
				return false;
		} else if (!nativePlace.equals(other.nativePlace))
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
		return "Student [brith=" + birth + ", id=" + id + ", name=" + name
				+ ", napla=" + nativePlace + ", sexs=" + sexs + "]";
	}



}
