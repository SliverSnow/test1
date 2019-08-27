package com.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	private String id;//订单id字符串类型 格式按照一串数字（时间用户+随机生成）
	private User user;//订单所属的用户
	private List<Item> items;//订单中包含的商品列表
}