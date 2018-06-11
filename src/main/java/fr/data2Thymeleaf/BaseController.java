package fr.data2Thymeleaf;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class BaseController {

	@Autowired
	protected SpringTemplateEngine templateEngine;

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	@RequestMapping("/ptp")
	public void ptp(HttpServletRequest request, HttpServletResponse response) {
		PageToProcess pageToProcess = new PageToProcess();
		ObjectMapper om = new ObjectMapper();
		try {
			pageToProcess = om.readValue(new File("src/main/resources/ptp.json"), PageToProcess.class);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(pageToProcess.toString());

		WebContext thymeleafContext = new WebContext(request, response, request.getServletContext(), Locale.FRANCE);

		thymeleafContext.setVariable("pageToProcess", pageToProcess);
		
		String htmlContent = templateEngine.process("ptp", thymeleafContext);
		
		try {
			Files.write(Paths.get("src/main/resources/result/test.html"), htmlContent.getBytes());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}