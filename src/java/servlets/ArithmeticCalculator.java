
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 794980
 */
public class ArithmeticCalculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
        .forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String inputFirst = request.getParameter("first_number");
        String inputSecond = request.getParameter("second_number");
        
        if(inputFirst.length() == 0 || inputSecond.length()== 0){
            request.setAttribute("result", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
            return;
        }
        boolean bothNumber = true;
        int firstNumber;
        int secondNumber;

        String plus = request.getParameter("+");
        String sub = request.getParameter("-");
        String mult = request.getParameter("*");
        String div = request.getParameter("%");
        int result;
        
        
	for(int i = 0; i < inputFirst.length(); i++) {
            if(!Character.isDigit(inputFirst.charAt(i))) {
		bothNumber = false;
		request.setAttribute("result", "invalid");
		getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
                return;
            }
        }
        for(int i = 0; i < inputSecond.length(); i++) {
            if(!Character.isDigit(inputSecond.charAt(i))) {
		bothNumber = false;
		request.setAttribute("result", "invalid");
		getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
                return;
            }
        }
        if(bothNumber) {
            firstNumber = Integer.parseInt(inputFirst);
            secondNumber = Integer.parseInt(inputSecond);
            if (!(plus == null || plus.equals("")) ) {
                result = firstNumber + secondNumber;
                request.setAttribute("result", result);
		getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
                return;
            }
            if (!(sub == null || sub.equals("")) ) {
                result = firstNumber - secondNumber;
                request.setAttribute("result", result);
		getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
                return;
            }
            if (!(mult == null || mult.equals("")) ) {
                result = firstNumber * secondNumber;
                request.setAttribute("result", result);
		getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
                return;
            }
            if (!(div == null || div.equals(""))) {
                result = firstNumber / secondNumber;
                request.setAttribute("result", result);
		getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
                return;
            }

        }
        
        
    }


}
