package com.barrywang.designpattern.factory;

public class XiaoMing {

  public void goToSchool(IVehicle vechicle) {
	  System.out.println("小明去学校");
	  vechicle.run();
  }

  public void travel(IVehicle vehicle) {
	  System.out.println("小明去旅游");
	  vehicle.run();
  }
}
