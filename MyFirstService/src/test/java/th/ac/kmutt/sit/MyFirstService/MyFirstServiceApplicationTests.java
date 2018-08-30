package th.ac.kmutt.sit.MyFirstService;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import th.ac.kmutt.sit.MyFirstService.controller.UserController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyFirstServiceApplicationTests {
	@Autowired
	private UserController uc;

@Test
public void CheckUserControllerGetUserAll() {
		//Check method getUserAll result is not null
		assertEquals(uc.getUserAll(),uc.arrayUser);
	}
	@Test
	public void CheckUserControllerGetUserIndex() {
		assertEquals(uc.getUserIndex(3),uc.arrayUser.get(2));
	}

}
