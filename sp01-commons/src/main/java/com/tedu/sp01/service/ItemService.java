package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	/**
	 * ͨ������id��ȡ��Ʒ�б�
	 * һ������������������Ʒ
	 * �Ա���ʷ����
	 */
	List<Item> getItems(String orderId);
	
	void decreaseNumbers(List<Item> list);
	//decreaseNumbers������Ʒ��棬���涩��ʱ����  ������Ʒ�б�
}
//ҵ��ӿ�Ϊ�˽���ϣ������Ǳ���ʵ��(�����������)��Զ�̵���ʵ��dubbo��΢����