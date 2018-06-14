package fr.data2Thymeleaf;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class BaseController {

	@Autowired
	protected SpringTemplateEngine templateEngine;

	@RequestMapping("/ptp")
	public void pageToProcess(HttpServletRequest request, HttpServletResponse response) {
		PageToProcess pageToProcess = new PageToProcess();
		ObjectMapper om = new ObjectMapper();
		try {
			pageToProcess = om.readValue(new File("src/main/resources/ptp.json"), PageToProcess.class);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream("test.txt"), "utf-8"))){
		    
		    writer.write(pageToProcess.toString());
		} catch (IOException ex) {
		    ex.printStackTrace();
		}
		
		System.out.println(pageToProcess.toString());

		WebContext thymeleafContext = new WebContext(request, response, request.getServletContext(), Locale.FRANCE);

		thymeleafContext.setVariable("pageToProcess", pageToProcess);
		
		String htmlContent = templateEngine.process("ptp", thymeleafContext);
		

		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream("test.html"), "utf-8"))){
		    
		    writer.write(htmlContent);
		} catch (IOException ex) {
		    ex.printStackTrace();
		}
		
	}

}