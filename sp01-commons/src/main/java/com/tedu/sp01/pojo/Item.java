package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   //��������get setһ��ע�⣬���ɱ�Ҫ�Ĺ��췽��
@NoArgsConstructor   
@AllArgsConstructor
public class Item {
	private Integer id;
	private String name;
	private Integer number;
}