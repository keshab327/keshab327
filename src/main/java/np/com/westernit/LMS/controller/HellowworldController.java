package np.com.westernit.LMS.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HellowworldController {

	@GetMapping("/greeting")
	public String greeting(Model model) {
		model.addAttribute("name", " world");
		return "keshab";
	}

}