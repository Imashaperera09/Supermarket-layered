/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package supermarket.layered.service.custom;


import supermarket.layered.dto.CustomerDto;
import supermarket.layered.service.SuperService;

/**
 *
 * @author USER
 */
public interface CustomerService extends SuperService{

    public String addCustomer(CustomerDto customerDto);
    
}
