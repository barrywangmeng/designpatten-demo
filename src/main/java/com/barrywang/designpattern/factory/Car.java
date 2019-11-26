package com.barrywang.designpattern.factory;

/**
 * 汽车
 */
public class Car implements IVehicle {

  @Override
  public void run() {
	System.out.println("开汽车去。。。");
  }
}
