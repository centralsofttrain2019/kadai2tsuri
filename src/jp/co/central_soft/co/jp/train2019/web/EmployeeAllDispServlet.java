package jp.co.central_soft.co.jp.train2019.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.central_soft.co.jp.train2019.bean.EmployeeListAllDispBean;
import jp.co.central_soft.co.jp.train2019.service.EmployeeService;

/**
 * Servlet implementation class IndexStartServlet
 */
@WebServlet("/EmployeeAllDispServlet")
public class EmployeeAllDispServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeAllDispServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(
			HttpServletRequest request,
			HttpServletResponse response
			) 	throws ServletException, IOException
	{

		//サービスを取得
		EmployeeService service = new EmployeeService();
		EmployeeListAllDispBean bean = service.findAll( );


		//beanをリクエストにセット キー名は「bean」とする
		request.setAttribute("bean", bean);

		//JSPに遷移する
		RequestDispatcher disp = request.getRequestDispatcher("/employeeAllDisp.jsp");
		disp.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
