package SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/bookTitle")
public class BookTitleController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		// create bookTitle object
		BookTitle thisTitle = new BookTitle();
		
		// add bookTitle object to the model
		theModel.addAttribute("bookTitle", thisTitle);
		
		return "titleForm";
	} // end showForm
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("title") BookTitle thisTitle) {
		
		// log the input data
		System.out.println("Book: " + thisTitle.getTitle() + " " + thisTitle.getIsbn() 
		+ " " + thisTitle.getAuthor() + " " + thisTitle.getEdition());
	
		return "titleConfirmation";

	} // end processForm
	

}
