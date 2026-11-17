package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class PageCloseRequest {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public Budget budget;
    public OperationId operationId;
    public PageReference page;
    public BrowserTaskBinding task;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageCloseRequest) {
                PageCloseRequest pageCloseRequest = (PageCloseRequest) obj;
                if (!C7384Etj.areEqual(this.operationId, pageCloseRequest.operationId) || !C7384Etj.areEqual(this.page, pageCloseRequest.page) || !C7384Etj.areEqual(this.task, pageCloseRequest.task) || !C7384Etj.areEqual(this.budget, pageCloseRequest.budget)) {
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

    public static /* synthetic */ PageCloseRequest copy$default(PageCloseRequest pageCloseRequest, OperationId operationId, PageReference pageReference, BrowserTaskBinding browserTaskBinding, Budget budget, int i, Object obj) {
        if ((i & 1) != 0) {
            operationId = pageCloseRequest.operationId;
        }
        if ((i & 2) != 0) {
            pageReference = pageCloseRequest.page;
        }
        if ((i & 4) != 0) {
            browserTaskBinding = pageCloseRequest.task;
        }
        if ((i & 8) != 0) {
            budget = pageCloseRequest.budget;
        }
        return pageCloseRequest.copy(operationId, pageReference, browserTaskBinding, budget);
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

    public final Budget getBudget() {
        return this.budget;
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
        return AnonymousClass005.A0G(this.budget, AnonymousClass005.A0F(this.task, AnonymousClass005.A0F(this.page, AnonymousClass005.A0E(this.operationId))));
    }

    public String toString() {
        OperationId operationId = this.operationId;
        PageReference pageReference = this.page;
        BrowserTaskBinding browserTaskBinding = this.task;
        Budget budget = this.budget;
        StringBuilder sbA0f = C3cG.A0f(operationId, "PageCloseRequest(operationId=");
        sbA0f.append(", page=");
        sbA0f.append(pageReference);
        sbA0f.append(", task=");
        sbA0f.append(browserTaskBinding);
        return C3cJ.A0L(budget, ", budget=", sbA0f);
    }

    public PageCloseRequest(OperationId operationId, PageReference pageReference, BrowserTaskBinding browserTaskBinding, Budget budget) {
        AnonymousClass005.A14(operationId, pageReference, browserTaskBinding, budget);
        this.operationId = operationId;
        this.page = pageReference;
        this.task = browserTaskBinding;
        this.budget = budget;
    }

    public final PageCloseRequest copy(OperationId operationId, PageReference pageReference, BrowserTaskBinding browserTaskBinding, Budget budget) {
        AnonymousClass005.A14(operationId, pageReference, browserTaskBinding, budget);
        return new PageCloseRequest(operationId, pageReference, browserTaskBinding, budget);
    }
}
