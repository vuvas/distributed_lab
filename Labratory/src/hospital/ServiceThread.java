/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class ServiceThread implements Runnable{

    String name = "servicethread";
    Thread t;
    public ServiceThread()
    {
        t = new Thread(this,name);
        t.start();
    }
    @Override
    public void run() {
        try {
            System.out.println("Constructing server implementations...");
            PatientDAO patient = new PatientDAOImp();
            System.out.println("Binding remote object implementations to registry...");
            LocateRegistry.createRegistry(1098);
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind("LabratoryService", patient);
            System.out.println("LabratoryService Waiting for invocations from clients...");
        } catch (Exception e) {// you could also catch remote exeptions
            System.out.println("Error: " + e);
        }
    }
    
}
