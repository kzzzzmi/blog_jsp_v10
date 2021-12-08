package com.cos.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿이란 Dynamic Web Page를 만들 때 사용되는 자바 기반의 웹 애플리케이션
// 자바 기반 기술이기에 코드가 조금만 수정되도 계속 컴파일 해야함
// Client에서 request하면 서버가 response한다
// request, response할 때 GET/POST 방식이 있음
@WebServlet("/test")
public class ApiTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.service(req, resp);
	}

	@Override
	public void destroy() {
		super.destroy();
	}

	// 보통 사용자가 DB에 들어가 검색할 때 사용
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String mime = request.getContentType();
		System.out.println(mime);

		String food = request.getParameter("food");
		System.out.println(food);

		// DB에 접속해서 결과를 찾아서 return
		// 객체로 만들고
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>" + food + "</h1>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
	}

	// insert할 때 주로 사용
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String food = request.getParameter("food");
		String recipe = request.getParameter("recipe");
		
		System.out.println(food);
		System.out.println(recipe);
		
		// DB에 인설트하고 끝
		int result = 1; // -1
		if(result == 1) {
			//성공 응답
		} else {
			// 실패 응답
		}
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>포스트 방식입니다.</h1>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
	}

}
