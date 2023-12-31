/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layered.service;

import supermarket.layered.service.custom.impl.CustomerServiceImpl;

/**
 *
 * @author USER
 */
public class ServiceFactory {
    
    private static ServiceFactory serviceFactory;
    
    private ServiceFactory(){}
    
    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
           serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }
   public SuperService getService(ServiceType type){
        switch (type) {
            case CUSTOMER:
                return (SuperService) new CustomerServiceImpl();
            default:
                return null;
        }
    }
    
    public enum ServiceType{
        CUSTOMER
    }
}

