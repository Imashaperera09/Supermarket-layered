/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layered.dao;

import supermarket.layered.dao.custom.impl.CustomerDaoImpl;

/**
 *
 * @author USER
 */
public class DaoFactory {
     private static DaoFactory daoFactory;
    
    private DaoFactory(){
        
    }
    
    public static DaoFactory getInstance(){
        if(daoFactory == null){
            daoFactory = new DaoFactory();
        }
        
        return daoFactory;
    }
    
    public SuperDao getDao(DaoTypes type){
         return (SuperDao) (switch (type) {
             case CUSTOMER -> new CustomerDaoImpl();
             default -> null;
         });
    }
    
    public enum DaoTypes{
        CUSTOMER
    }
}

