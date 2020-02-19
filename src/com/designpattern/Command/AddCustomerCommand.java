package com.designpattern.Command;

import com.designpattern.Command.Fx.Command;

public class AddCustomerCommand implements Command {
    private CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {
        this.customerService.addCustomer();
    }
}
