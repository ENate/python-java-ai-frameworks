package com.minejava.tutorials.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainClassImpl {
    public static void main(String[] args) throws Exception {
        Vehicle myVehicle = new Vehicle("LIDA", 231, "Toyota");
        // Get names of methods
        Method[] methods = myVehicle.getClass().getMethods();
        Field[] fields = myVehicle.getClass().getFields();

        for (Field field : fields) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set("name", "Derterter");
            }
        }

        for (Method method : methods) {
            if (method.getName().equals("privateVehileMethod")) {
                //method.invoke(myVehicle, "Sierra");
                // Also, direct calls are permitted
                //myVehicle.oundCarNoise("Hilux");
                // Access private method from class
                method.setAccessible(true);
                // for static methods
                //method.setAccessible(null);
                method.invoke(myVehicle);
            }
        }
    }
}
