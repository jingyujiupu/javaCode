package com.bjpowernode.oa.utils.web.action;

import com.bjpowernode.oa.utils.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeptDetailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String deptno=request.getParameter("fafkkj");
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            conn= DBUtil.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            String sql="select dname,loc from dept where deptno=?"
            try {
                ps=conn.prepareStatement(sql);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                ps.setString(1,deptno);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                rs=ps.executeQuery();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        } finally {
            try {
                DBUtil.close(conn,ps,rs);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
