package com.task.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.task.demo.dao.RegisterRepo;
@Controller
public class RegiController {
	@Autowired
	RegisterRepo repo;

		@RequestMapping("Regi")
		
		public String Regi()
		{
			System.out.println("hi");
			return "Regi.jsp";
		
		
	}
		@RequestMapping("/addRegister")
		public String addRegister(Register register)
		{
			repo.save(register);
			return "Regi.jsp";
			
		}
		@RequestMapping("/Register")
		@ResponseBody
		public String getRegister()
		{
			return repo.findAll().toString();
		}

}
