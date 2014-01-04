package sk.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sk.model.User;
import sk.service.UserService;

@Controller
@RequestMapping("/userController")
public class UserController {
	private UserService userService;
	
	
	public UserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	@RequestMapping("/{id}/showUser")
	public String showUser(@PathVariable int id,HttpServletRequest request){
		User u = (User)userService.getUserById(id);
		request.setAttribute("user", u);
		return "showUser";
	}
}
