package com.example.dockercompose.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
		
		@Id
		private Integer sid;
		private String sname;
		private Integer age;
		public Integer getSid() {
			return sid;
		}
		public void setSid(Integer sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		
}
