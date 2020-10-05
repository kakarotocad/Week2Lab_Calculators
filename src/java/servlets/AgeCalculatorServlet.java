package servlets;

import java.io.IOException;
import static java.lang.Integer.parseInt;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgeCalculatorServlet extends HttpServlet {

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String u_age = request.getParameter("age"); 
        int num_age;
        
           
        request.setAttribute("age", u_age);
        
        
        if (u_age == null || u_age.equals("") || !u_age.matches("[0-9]+")){
            request.setAttribute("age", "");
            request.setAttribute("message", "You must give your current age");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
        
        num_age = Integer.parseInt(u_age);
        num_age +=1;
        
        if(num_age>=0){
        request.setAttribute("age", ("Your Age next Birthday will be: "+num_age));
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
    }

  

}
