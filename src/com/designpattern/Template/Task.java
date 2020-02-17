package com.designpattern.Template;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        this.auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
