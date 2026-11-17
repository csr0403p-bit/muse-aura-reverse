package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class PagePrepareRequest {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public Budget budget;
    public OperationId operationId;
    public PageOwnerScope scope;
    public String selfFqdn;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PagePrepareRequest) {
                PagePrepareRequest pagePrepareRequest = (PagePrepareRequest) obj;
                if (!C7384Etj.areEqual(this.operationId, pagePrepareRequest.operationId) || !C7384Etj.areEqual(this.scope, pagePrepareRequest.scope) || !C7384Etj.areEqual(this.budget, pagePrepareRequest.budget) || !C7384Etj.areEqual(this.selfFqdn, pagePrepareRequest.selfFqdn)) {
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

    public final void setScope(PageOwnerScope pageOwnerScope) {
        C7384Etj.A0Y(pageOwnerScope, 0);
        this.scope = pageOwnerScope;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ PagePrepareRequest copy$default(PagePrepareRequest pagePrepareRequest, OperationId operationId, PageOwnerScope pageOwnerScope, Budget budget, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            operationId = pagePrepareRequest.operationId;
        }
        if ((i & 2) != 0) {
            pageOwnerScope = pagePrepareRequest.scope;
        }
        if ((i & 4) != 0) {
            budget = pagePrepareRequest.budget;
        }
        if ((i & 8) != 0) {
            str = pagePrepareRequest.selfFqdn;
        }
        AnonymousClass005.A0x(operationId, pageOwnerScope, budget);
        return new PagePrepareRequest(operationId, pageOwnerScope, budget, str);
    }

    public final OperationId component1() {
        return this.operationId;
    }

    public final PageOwnerScope component2() {
        return this.scope;
    }

    public final Budget component3() {
        return this.budget;
    }

    public final String component4() {
        return this.selfFqdn;
    }

    public final Budget getBudget() {
        return this.budget;
    }

    public final OperationId getOperationId() {
        return this.operationId;
    }

    public final PageOwnerScope getScope() {
        return this.scope;
    }

    public final String getSelfFqdn() {
        return this.selfFqdn;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.budget, AnonymousClass005.A0F(this.scope, AnonymousClass005.A0E(this.operationId))) + AnonymousClass006.A0G(this.selfFqdn);
    }

    public final void setSelfFqdn(String str) {
        this.selfFqdn = str;
    }

    public String toString() {
        OperationId operationId = this.operationId;
        PageOwnerScope pageOwnerScope = this.scope;
        Budget budget = this.budget;
        String str = this.selfFqdn;
        StringBuilder sbA0f = C3cG.A0f(operationId, "PagePrepareRequest(operationId=");
        AbstractC7609F5w.A1M(sbA0f, pageOwnerScope);
        sbA0f.append(", budget=");
        sbA0f.append(budget);
        return C3cJ.A0N(", selfFqdn=", str, sbA0f);
    }

    public PagePrepareRequest(OperationId operationId, PageOwnerScope pageOwnerScope, Budget budget, String str) {
        AnonymousClass005.A0x(operationId, pageOwnerScope, budget);
        this.operationId = operationId;
        this.scope = pageOwnerScope;
        this.budget = budget;
        this.selfFqdn = str;
    }

    public final PagePrepareRequest copy(OperationId operationId, PageOwnerScope pageOwnerScope, Budget budget, String str) {
        AnonymousClass005.A0x(operationId, pageOwnerScope, budget);
        return new PagePrepareRequest(operationId, pageOwnerScope, budget, str);
    }
}
