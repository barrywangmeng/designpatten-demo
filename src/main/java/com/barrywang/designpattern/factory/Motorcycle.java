package com.barrywang.designpattern.factory;

/**
 * 摩托车
 */
public class Motorcycle implements IVehicle {
  @Override
  public void run() {
	System.out.println("骑摩托车去。。。");
  }
}
