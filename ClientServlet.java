package Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.ClientBean;

/**
 * Servlet implementation class ClientServlet
 */
@WebServlet("ClientServlet")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String nom = request.getParameter("name");
		 String prenom = request.getParameter("surname");
		 String adresse = request.getParameter("adressliv");
		 String telephon = request.getParameter("numtel");
		 String email = request.getParameter("email");
			ClientBean client =new ClientBean();
			client.setNom(nom);
			client.setPrenom(prenom);
			client.setAdresse(adresse);
			client.setTelephon(telephon);
			client.setEmail(email);
			HttpSession session = request.getSession();
			session.setAttribute("client", client);
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}