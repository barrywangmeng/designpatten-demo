package com.barrywang.designpattern.factory;

/**
 * @description: 车库
 * @author: wangmeng
 * @blog: https://www.cnblogs.com/wang-meng/
 * @create: 2019-11-27 07:25
 **/
public class GarageFactory {
	public static IVehicle getVehicle(String type) {
		if ("car".equals(type)) {
			return new Car();
		} else if ("motorcycle".equals(type)) {
			return new Motorcycle();
		}
		throw new IllegalArgumentException("请输入车类型");
	}
}