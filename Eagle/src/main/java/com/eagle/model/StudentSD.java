package com.eagle.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="StudentSD")
public class StudentSD {

		@Id
		@Column
		private String studentId;
		@Column
		@JsonFormat(pattern="yyyy-MM-dd")
		private Date dateofjoining;
		@Column
		private String presentkyu;
		@Column
		private String presentbelt;
		@Column
		@JsonFormat(pattern="yyyy-MM-dd")
		private Date lastgradingdate;
		@Column
		@JsonFormat(pattern="yyyy-MM-dd")
		private Date nextgradingdate;
		@Column
		private String katas;
		@Column
		private String combinations;
		@Column
		private String sparingtechniques;
		@Column
		private String level;
		@Column
		private String kbi;
		@Column
		private String open;
		@Column
		@JsonFormat(pattern="yyyy-MM-dd")
		private Date feepaid;
		@Column
		private String pendingfee;
		
		
		
		
		public StudentSD() {
			
		}




		public StudentSD(String studentId, Date dateofjoining, String presentkyu, String presentbelt,
				Date lastgradingdate, Date nextgradingdate, String katas, String combinations, String sparingtechniques,
				String level, String kbi, String open, Date feepaid, String pendingfee) {
			
			this.studentId = studentId;
			this.dateofjoining = dateofjoining;
			this.presentkyu = presentkyu;
			this.presentbelt = presentbelt;
			this.lastgradingdate = lastgradingdate;
			this.nextgradingdate = nextgradingdate;
			this.katas = katas;
			this.combinations = combinations;
			this.sparingtechniques = sparingtechniques;
			this.level = level;
			this.kbi = kbi;
			this.open = open;
			this.feepaid = feepaid;
			this.pendingfee = pendingfee;
		}




		public String getStudentId() {
			return studentId;
		}




		public void setStudentId(String studentId) {
			this.studentId = studentId;
		}




		public Date getDateofjoining() {
			return dateofjoining;
		}




		public void setDateofjoining(Date dateofjoining) {
			this.dateofjoining = dateofjoining;
		}




		public String getPresentkyu() {
			return presentkyu;
		}




		public void setPresentkyu(String presentkyu) {
			this.presentkyu = presentkyu;
		}




		public String getPresentbelt() {
			return presentbelt;
		}




		public void setPresentbelt(String presentbelt) {
			this.presentbelt = presentbelt;
		}




		public Date getLastgradingdate() {
			return lastgradingdate;
		}




		public void setLastgradingdate(Date lastgradingdate) {
			this.lastgradingdate = lastgradingdate;
		}




		public Date getNextgradingdate() {
			return nextgradingdate;
		}




		public void setNextgradingdate(Date nextgradingdate) {
			this.nextgradingdate = nextgradingdate;
		}




		public String getKatas() {
			return katas;
		}




		public void setKatas(String katas) {
			this.katas = katas;
		}




		public String getCombinations() {
			return combinations;
		}




		public void setCombinations(String combinations) {
			this.combinations = combinations;
		}




		public String getSparingtechniques() {
			return sparingtechniques;
		}




		public void setSparingtechniques(String sparingtechniques) {
			this.sparingtechniques = sparingtechniques;
		}




		public String getLevel() {
			return level;
		}




		public void setLevel(String level) {
			this.level = level;
		}




		public String getKbi() {
			return kbi;
		}




		public void setKbi(String kbi) {
			this.kbi = kbi;
		}




		public String getOpen() {
			return open;
		}




		public void setOpen(String open) {
			this.open = open;
		}




		public Date getFeepaid() {
			return feepaid;
		}




		public void setFeepaid(Date feepaid) {
			this.feepaid = feepaid;
		}




		public String getPendingfee() {
			return pendingfee;
		}




		public void setPendingfee(String pendingfee) {
			this.pendingfee = pendingfee;
		}
		
		
}
