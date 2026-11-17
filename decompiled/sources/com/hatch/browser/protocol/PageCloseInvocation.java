package com.hatch.browser.protocol;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class PageCloseInvocation {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public Budget budget;
    public OperationId operationId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageCloseInvocation) {
                PageCloseInvocation pageCloseInvocation = (PageCloseInvocation) obj;
                if (!C7384Etj.areEqual(this.operationId, pageCloseInvocation.operationId) || !C7384Etj.areEqual(this.budget, pageCloseInvocation.budget)) {
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

    public static /* synthetic */ PageCloseInvocation copy$default(PageCloseInvocation pageCloseInvocation, OperationId operationId, Budget budget, int i, Object obj) {
        if ((i & 1) != 0) {
            operationId = pageCloseInvocation.operationId;
        }
        if ((i & 2) != 0) {
            budget = pageCloseInvocation.budget;
        }
        AnonymousClass003.A0u(operationId, budget);
        return new PageCloseInvocation(operationId, budget);
    }

    public final OperationId component1() {
        return this.operationId;
    }

    public final Budget component2() {
        return this.budget;
    }

    public final Budget getBudget() {
        return this.budget;
    }

    public final OperationId getOperationId() {
        return this.operationId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.budget, AnonymousClass005.A0E(this.operationId));
    }

    public String toString() {
        return C3cJ.A0L(this.budget, ", budget=", C3cG.A0f(this.operationId, "PageCloseInvocation(operationId="));
    }

    public PageCloseInvocation(OperationId operationId, Budget budget) {
        AnonymousClass003.A0u(operationId, budget);
        this.operationId = operationId;
        this.budget = budget;
    }

    public final PageCloseInvocation copy(OperationId operationId, Budget budget) {
        AnonymousClass003.A0u(operationId, budget);
        return new PageCloseInvocation(operationId, budget);
    }
}
