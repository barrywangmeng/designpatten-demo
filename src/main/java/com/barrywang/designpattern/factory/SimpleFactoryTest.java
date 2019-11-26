package com.barrywang.designpattern.factory;

/**
 * @description: 简单工厂测试类
 * @author: wangmeng
 * @blog: https://www.cnblogs.com/wang-meng/
 * @create: 2019-11-27 07:20
 **/
public class SimpleFactoryTest {

	public static void main(String[] args) {
		XiaoMing xiaoMing = new XiaoMing();
		// 小明骑摩托车去学校

		IVehicle motorcycle = GarageFactory.getVehicle("motorcycle");
		xiaoMing.goToSchool(motorcycle);
		// 小明开汽车去旅游
		IVehicle car = GarageFactory.getVehicle("car");
		xiaoMing.travel(car);
	}
}