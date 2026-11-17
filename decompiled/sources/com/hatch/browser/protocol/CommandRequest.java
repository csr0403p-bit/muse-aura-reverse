package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class CommandRequest {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public Budget budget;
    public Command command;
    public ObserveOptions observeAfter;
    public OperationId operationId;
    public PageReference page;
    public BrowserTaskBinding task;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommandRequest) {
                CommandRequest commandRequest = (CommandRequest) obj;
                if (!C7384Etj.areEqual(this.operationId, commandRequest.operationId) || !C7384Etj.areEqual(this.page, commandRequest.page) || !C7384Etj.areEqual(this.task, commandRequest.task) || !C7384Etj.areEqual(this.budget, commandRequest.budget) || !C7384Etj.areEqual(this.command, commandRequest.command) || !C7384Etj.areEqual(this.observeAfter, commandRequest.observeAfter)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setBudget(Budget budget) {
        C7384Etj.A0Y(budget, 0);
        this.budget = budget;
    }

    public final void setCommand(Command command) {
        C7384Etj.A0Y(command, 0);
        this.command = command;
    }

    public final void setOperationId(OperationId operationId) {
        C7384Etj.A0Y(operationId, 0);
        this.operationId = operationId;
    }

    public final void setPage(PageReference pageReference) {
        C7384Etj.A0Y(pageReference, 0);
        this.page = pageReference;
    }

    public final void setTask(BrowserTaskBinding browserTaskBinding) {
        C7384Etj.A0Y(browserTaskBinding, 0);
        this.task = browserTaskBinding;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ CommandRequest copy$default(CommandRequest commandRequest, OperationId operationId, PageReference pageReference, BrowserTaskBinding browserTaskBinding, Budget budget, Command command, ObserveOptions observeOptions, int i, Object obj) {
        if ((i & 1) != 0) {
            operationId = commandRequest.operationId;
        }
        if ((i & 2) != 0) {
            pageReference = commandRequest.page;
        }
        if ((i & 4) != 0) {
            browserTaskBinding = commandRequest.task;
        }
        if ((i & 8) != 0) {
            budget = commandRequest.budget;
        }
        if ((i & 16) != 0) {
            command = commandRequest.command;
        }
        if ((i & 32) != 0) {
            observeOptions = commandRequest.observeAfter;
        }
        return commandRequest.copy(operationId, pageReference, browserTaskBinding, budget, command, observeOptions);
    }

    public final OperationId component1() {
        return this.operationId;
    }

    public final PageReference component2() {
        return this.page;
    }

    public final BrowserTaskBinding component3() {
        return this.task;
    }

    public final Budget component4() {
        return this.budget;
    }

    public final Command component5() {
        return this.command;
    }

    public final ObserveOptions component6() {
        return this.observeAfter;
    }

    public final Budget getBudget() {
        return this.budget;
    }

    public final Command getCommand() {
        return this.command;
    }

    public final ObserveOptions getObserveAfter() {
        return this.observeAfter;
    }

    public final OperationId getOperationId() {
        return this.operationId;
    }

    public final PageReference getPage() {
        return this.page;
    }

    public final BrowserTaskBinding getTask() {
        return this.task;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.command, AnonymousClass005.A0F(this.budget, AnonymousClass005.A0F(this.task, AnonymousClass005.A0F(this.page, AnonymousClass005.A0E(this.operationId))))) + AnonymousClass006.A0D(this.observeAfter);
    }

    public final void setObserveAfter(ObserveOptions observeOptions) {
        this.observeAfter = observeOptions;
    }

    public String toString() {
        OperationId operationId = this.operationId;
        PageReference pageReference = this.page;
        BrowserTaskBinding browserTaskBinding = this.task;
        Budget budget = this.budget;
        Command command = this.command;
        ObserveOptions observeOptions = this.observeAfter;
        StringBuilder sbA0f = C3cG.A0f(operationId, "CommandRequest(operationId=");
        sbA0f.append(", page=");
        sbA0f.append(pageReference);
        sbA0f.append(", task=");
        sbA0f.append(browserTaskBinding);
        sbA0f.append(", budget=");
        sbA0f.append(budget);
        sbA0f.append(", command=");
        sbA0f.append(command);
        return C3cJ.A0L(observeOptions, ", observeAfter=", sbA0f);
    }

    public CommandRequest(OperationId operationId, PageReference pageReference, BrowserTaskBinding browserTaskBinding, Budget budget, Command command, ObserveOptions observeOptions) {
        AnonymousClass005.A17(operationId, pageReference, browserTaskBinding, budget, command);
        this.operationId = operationId;
        this.page = pageReference;
        this.task = browserTaskBinding;
        this.budget = budget;
        this.command = command;
        this.observeAfter = observeOptions;
    }

    public final CommandRequest copy(OperationId operationId, PageReference pageReference, BrowserTaskBinding browserTaskBinding, Budget budget, Command command, ObserveOptions observeOptions) {
        AnonymousClass005.A17(operationId, pageReference, browserTaskBinding, budget, command);
        return new CommandRequest(operationId, pageReference, browserTaskBinding, budget, command, observeOptions);
    }
}
