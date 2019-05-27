package jp.co.central_soft.co.jp.train2019.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import jp.co.central_soft.co.jp.train2019.bean.EmployeeAllDispBean;
import jp.co.central_soft.co.jp.train2019.bean.EmployeeListAllDispBean;
import jp.co.central_soft.co.jp.train2019.dao.Dao;
import jp.co.central_soft.co.jp.train2019.dao.EmployeesDao;

public class EmployeeService
{

	public EmployeeListAllDispBean findAll()
	{
		EmployeeListAllDispBean bean = new EmployeeListAllDispBean();

		//オートクローズ
		try( Connection con= Dao.getConnection() )
		{
			EmployeesDao dao = new EmployeesDao(con);

			List<EmployeeAllDispBean> eList = dao.findAll();

			bean.setEmpList(eList);

		}
		catch( SQLException | ClassNotFoundException e )
		{
			e.printStackTrace();
			throw new RuntimeException( e );
		}

		return bean;
	}

	//--------------------------------------------
	public EmployeeAllDispBean findByKey(String strId)
	{

		EmployeeAllDispBean emp = null;
		try( Connection con = Dao.getConnection() )
		{

			int id= Integer.parseInt( strId );

			EmployeesDao dao = new EmployeesDao(con);

			emp =  dao.findByKey(id);


		}
		catch( SQLException | ClassNotFoundException e1 )
		{
			e1.printStackTrace();
			throw new RuntimeException( e1 );
		}

		return emp;
	}


}
