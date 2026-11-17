package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class PageCommandInvocation {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public Budget budget;
    public Command command;
    public ObserveOptions observeAfter;
    public OperationId operationId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageCommandInvocation) {
                PageCommandInvocation pageCommandInvocation = (PageCommandInvocation) obj;
                if (!C7384Etj.areEqual(this.operationId, pageCommandInvocation.operationId) || !C7384Etj.areEqual(this.budget, pageCommandInvocation.budget) || !C7384Etj.areEqual(this.command, pageCommandInvocation.command) || !C7384Etj.areEqual(this.observeAfter, pageCommandInvocation.observeAfter)) {
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

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ PageCommandInvocation copy$default(PageCommandInvocation pageCommandInvocation, OperationId operationId, Budget budget, Command command, ObserveOptions observeOptions, int i, Object obj) {
        if ((i & 1) != 0) {
            operationId = pageCommandInvocation.operationId;
        }
        if ((i & 2) != 0) {
            budget = pageCommandInvocation.budget;
        }
        if ((i & 4) != 0) {
            command = pageCommandInvocation.command;
        }
        if ((i & 8) != 0) {
            observeOptions = pageCommandInvocation.observeAfter;
        }
        AnonymousClass005.A0x(operationId, budget, command);
        return new PageCommandInvocation(operationId, budget, command, observeOptions);
    }

    public final OperationId component1() {
        return this.operationId;
    }

    public final Budget component2() {
        return this.budget;
    }

    public final Command component3() {
        return this.command;
    }

    public final ObserveOptions component4() {
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

    public int hashCode() {
        return AnonymousClass005.A0F(this.command, AnonymousClass005.A0F(this.budget, AnonymousClass005.A0E(this.operationId))) + AnonymousClass006.A0D(this.observeAfter);
    }

    public final void setObserveAfter(ObserveOptions observeOptions) {
        this.observeAfter = observeOptions;
    }

    public String toString() {
        OperationId operationId = this.operationId;
        Budget budget = this.budget;
        Command command = this.command;
        ObserveOptions observeOptions = this.observeAfter;
        StringBuilder sbA0f = C3cG.A0f(operationId, "PageCommandInvocation(operationId=");
        sbA0f.append(", budget=");
        sbA0f.append(budget);
        sbA0f.append(", command=");
        sbA0f.append(command);
        return C3cJ.A0L(observeOptions, ", observeAfter=", sbA0f);
    }

    public PageCommandInvocation(OperationId operationId, Budget budget, Command command, ObserveOptions observeOptions) {
        AnonymousClass005.A0x(operationId, budget, command);
        this.operationId = operationId;
        this.budget = budget;
        this.command = command;
        this.observeAfter = observeOptions;
    }

    public final PageCommandInvocation copy(OperationId operationId, Budget budget, Command command, ObserveOptions observeOptions) {
        AnonymousClass005.A0x(operationId, budget, command);
        return new PageCommandInvocation(operationId, budget, command, observeOptions);
    }
}
