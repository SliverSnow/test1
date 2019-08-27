package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	/**
	 * 通过订单id获取商品列表
	 * 一个订单当做包含的商品
	 * 淘宝历史订单
	 */
	List<Item> getItems(String orderId);
	
	void decreaseNumbers(List<Item> list);
	//decreaseNumbers减少商品库存，保存订单时操作  接受商品列表
}
//业务接口为了解耦合，可以是本地实现(单机单体服务)、远程调用实现dubbo（微服务）