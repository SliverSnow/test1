package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   //可以生成get set一堆注解，生成必要的构造方法
@NoArgsConstructor   
@AllArgsConstructor
public class Item {
	private Integer id;
	private String name;
	private Integer number;
}