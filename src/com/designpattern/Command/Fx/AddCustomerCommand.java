package com.designpattern.Command.Fx;

import com.designpattern.Command.Fx.Fx.Command;

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
