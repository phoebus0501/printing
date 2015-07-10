package com.phoebus.printing.web.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8080/test/sampleJsonControl.json
 * 
 * @author <a href="mailto:xingheng.yxc@taobao.com">xingheng.yxc</a>
 * @version 1.0
 * @since 2015年7月9日
 */
@RestController
@RequestMapping("/test")
public class SampleJsonControl {

	@RequestMapping(value = "/sampleJsonControl.json", method = { RequestMethod.GET }, produces = "application/json;charset=utf-8")
	public Object getJSON() {
		List<User1> tournamentList = new ArrayList<User1>();
		for (int i = 0; i < 10; i++) {
			tournamentList.add(new User1("firstname" + i, "lastName" + i));
		}
		return tournamentList;
	}

}

class User1 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8658671699296234669L;

	public User1() {

	}

	public User1(String firstName, String lastName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
