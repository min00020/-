package co.yedam.user.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.common.Command;

public class LogoutControl implements Command {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		req.getSession().invalidate();
		try {
			resp.sendRedirect("main.do");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
