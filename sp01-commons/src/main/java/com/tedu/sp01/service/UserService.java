package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	User getUser(Integer id);//��ȡ�û�����  �ṩ�û����
	void addScore(Integer id, Integer score);//�����û�����
}
