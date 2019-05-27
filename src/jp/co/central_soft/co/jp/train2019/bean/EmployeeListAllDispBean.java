package jp.co.central_soft.co.jp.train2019.bean;

import java.util.List;

public class EmployeeListAllDispBean
{
	private List<EmployeeAllDispBean> empList;
	private String message;

	public List<EmployeeAllDispBean> getEmpList() {
		return empList;
	}
	public void setEmpList(List<EmployeeAllDispBean> empList) {
		this.empList = empList;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "EmployeeListDispBean [empList=" + empList + ", message=" + message + "]";
	}



}
