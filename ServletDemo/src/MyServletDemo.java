
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class to create Http Servlet
public class MyServletDemo extends HttpServlet {

   private String mymsg;

   public void init() throws ServletException {
      mymsg = "Hello World!";
   }

   public void doGet(HttpServletRequest request, 
      HttpServletResponse response)
      throws ServletException, IOException 
   {

      // Setting up the content type of webpage
      response.setContentType("text/html");

      // Writing message to the web page
      PrintWriter out = response.getWriter();
      String title = "Using GET Method to Read Form Data";
      String docType =
         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
      
      out.println(docType +
    	         "<html>\n" +
    	            "<head><title>" + title + "</title></head>\n" +
    	            "<body bgcolor = \"#f0f0f0\">\n" +
    	               "<h1 align = \"center\">" + title + "</h1>\n" +
    	               "<ul>\n" +
    	                  "  <li><b>Email</b>: "
    	                  + request.getParameter("uname") + "\n" +
    	                  "  <li><b>Password</b>: "
    	                  + request.getParameter("psw") + "\n" +
    	                  "	<li><b>Remember?</b>: "
    	                  + request.getParameter("remember") +
    	               "</ul>\n" +
    	            "</body>" +
    	         "</html>"
    	      );
      
   }
   public void doPost(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {

		      doGet(request, response);
		   }

   public void destroy() {
      /* leaving empty for now this can be
       * used when we want to do something at the end
       * of Servlet life cycle
       */
   }
}