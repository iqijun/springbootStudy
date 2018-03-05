package com.fullstacker.course.mapper.one;

import com.fullstacker.course.entity.UserEntity;
import com.fullstacker.course.enums.UserSexEnum;
import com.fullstacker.course.param.UserParam;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserOneMapper {
	
	@Select("SELECT * FROM users")
	@Results({
		@Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
		@Result(property = "nickName", column = "nick_name")
	})
	List<UserEntity> getAll();

	@SelectProvider(type = com.fullstacker.course.mapper.UserSql.class, method = "getList")
	List<UserEntity> getList(UserParam userParam);

	@SelectProvider(type = com.fullstacker.course.mapper.UserSql.class, method = "getCount")
	int getCount(UserParam userParam);
	
	@Select("SELECT * FROM users WHERE id = #{id}")
	@Results({
		@Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
		@Result(property = "nickName", column = "nick_name")
	})
	UserEntity getOne(Long id);

	@Insert("INSERT INTO users(userName,passWord,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
	void insert(UserEntity user);

	@Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
	void update(UserEntity user);

	@Delete("DELETE FROM users WHERE id =#{id}")
	void delete(Long id);

}