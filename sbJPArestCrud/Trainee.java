package com.rp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sbjparesttraineeCrud")
public class Trainee {

	@Id
	@Column(name = "tid", length = 10)
	private int trId;
	@Column(name = "tname", length = 15)
	private String trName;
	@Column(name = "tsal", length = 10)
	private int trSal;
	@Column(name = "tadd", length = 15)
	private String trAdd;
	public int getTrId() {
		return trId;
	}
	public void setTrId(int trId) {
		this.trId = trId;
	}
	public String getTrName() {
		return trName;
	}
	public void setTrName(String trName) {
		this.trName = trName;
	}
	public int getTrSal() {
		return trSal;
	}
	public void setTrSal(int trSal) {
		this.trSal = trSal;
	}
	public String getTrAdd() {
		return trAdd;
	}
	public void setTrAdd(String trAdd) {
		this.trAdd = trAdd;
	}
	public Trainee(int trId, String trName, int trSal, String trAdd) {
		super();
		this.trId = trId;
		this.trName = trName;
		this.trSal = trSal;
		this.trAdd = trAdd;
	}
	@Override
	public String toString() {
		return "Trainee [trId=" + trId + ", trName=" + trName + ", trSal=" + trSal + ", trAdd=" + trAdd + "]";
	}
	public Trainee() {
		super();
	}

	
}