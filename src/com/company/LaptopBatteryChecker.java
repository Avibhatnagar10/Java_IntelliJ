package com.company;
import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;
public class LaptopBatteryChecker {
    public static void main(String[] args) {
        OperatingSystemMXBean osBean = (com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();

        double Batterer = osBean.getSystemLoadAverage();
        System.out.println("laptop Battery level:"+ Batterer + "%");
    }

}
