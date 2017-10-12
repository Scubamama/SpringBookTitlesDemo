package SpringMVC;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class LittleTitleController {

	// controller method to show initial screen
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorldForm";
	}
	
	// controller method to process the form
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}

	// controller method to read form data and
	// add data to the model
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// read the request parameter from the html form
//		String theName = request.getParameter("studentName");
		String theName = request.getParameter("bookTitle");
		
		// convert the data to all upper case
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Yo! " + theName;
		
		// add the message to the model
		model.addAttribute("message", result);
		
		return "helloWorld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("bookTitle") String title, Model model) {
//		@RequestParam("studentName") String title, Model model) {

		// eventually need isbn, author, and edition
		
		// don't need this code anymore with the @RequestParam
		// read the request parameter from the html form
//		String theName = request.getParameter("studentName");
		
		// convert the data to all upper case
		title = title.toUpperCase();
		
		// create the message
		String result = "Great Title! " + title;
		
		// add the message to the model
		model.addAttribute("message", result);
		
		return "helloWorld";
	}
	

	
	
} // end class
