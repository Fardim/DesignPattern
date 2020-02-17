package com.designpattern.Template;

public class GenerateReport extends Task {

    public GenerateReport(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Generating report");
    }
}
