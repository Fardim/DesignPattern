package com.designpattern.Template;

public class TransferMoneyTask extends Task {

    public TransferMoneyTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @java.lang.Override
    protected void doExecute() {
        System.out.println("Trasfer money executed");
    }
}
