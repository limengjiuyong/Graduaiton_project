package com.example.demo.enity;

public class student {
  
	private String name;
	private Integer xuehao;
	private String nianji;
	private String zhuanye;
	private String xueyuan;
	public student(String name, Integer xuehao, String nianji, String zhuanye, String xueyuan) {
		super();
		this.name = name;
		this.xuehao = xuehao;
		this.nianji = nianji;
		this.zhuanye = zhuanye;
		this.xueyuan = xueyuan;
	}
	
	@Override
	public String toString() {
		return "student [name=" + name + ", xuehao=" + xuehao + ", nianji=" + nianji + ", zhuanye=" + zhuanye
				+ ", xueyuan=" + xueyuan + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getXuehao() {
		return xuehao;
	}
	public void setXuehao(Integer xuehao) {
		this.xuehao = xuehao;
	}
	public String getNianji() {
		return nianji;
	}
	public void setNianji(String nianji) {
		this.nianji = nianji;
	}
	public String getZhuanye() {
		return zhuanye;
	}
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	public String getXueyuan() {
		return xueyuan;
	}
	public void setXueyuan(String xueyuan) {
		this.xueyuan = xueyuan;
	} 
}
