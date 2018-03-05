package com.fullstacker.course;

import com.fullstacker.course.entity.UserEntity;
import com.fullstacker.course.enums.UserSexEnum;
import com.fullstacker.course.mapper.one.UserOneMapper;
import com.fullstacker.course.mapper.two.UserTwoMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DruidStudyApplicationTests {

	@Autowired
	private UserOneMapper userOneMapper;
	@Autowired
	private UserTwoMapper userTwoMapper;


	@Test
	public void testInsert() throws Exception {
		userOneMapper.insert(new UserEntity("aa12a", "a21432256", UserSexEnum.MAN));
		userOneMapper.insert(new UserEntity("bbdfb", "b22333456", UserSexEnum.WOMAN));
		userTwoMapper.insert(new UserEntity("ccadfc", "b12333456", UserSexEnum.WOMAN));

		Assert.assertEquals(2, userOneMapper.getAll().size());
		Assert.assertEquals(2, userOneMapper.getAll().size());
	}

	@Test
	public void contextLoads() {
	}

}
