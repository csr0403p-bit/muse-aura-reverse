package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class NativePageCloseRequest {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public Budget budget;
    public PageAuthorityClaim claim;
    public OperationId operationId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativePageCloseRequest) {
                NativePageCloseRequest nativePageCloseRequest = (NativePageCloseRequest) obj;
                if (!C7384Etj.areEqual(this.operationId, nativePageCloseRequest.operationId) || !C7384Etj.areEqual(this.claim, nativePageCloseRequest.claim) || !C7384Etj.areEqual(this.budget, nativePageCloseRequest.budget)) {
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

    public final void setClaim(PageAuthorityClaim pageAuthorityClaim) {
        C7384Etj.A0Y(pageAuthorityClaim, 0);
        this.claim = pageAuthorityClaim;
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

    public static /* synthetic */ NativePageCloseRequest copy$default(NativePageCloseRequest nativePageCloseRequest, OperationId operationId, PageAuthorityClaim pageAuthorityClaim, Budget budget, int i, Object obj) {
        if ((i & 1) != 0) {
            operationId = nativePageCloseRequest.operationId;
        }
        if ((i & 2) != 0) {
            pageAuthorityClaim = nativePageCloseRequest.claim;
        }
        if ((i & 4) != 0) {
            budget = nativePageCloseRequest.budget;
        }
        return nativePageCloseRequest.copy(operationId, pageAuthorityClaim, budget);
    }

    public final OperationId component1() {
        return this.operationId;
    }

    public final PageAuthorityClaim component2() {
        return this.claim;
    }

    public final Budget component3() {
        return this.budget;
    }

    public final Budget getBudget() {
        return this.budget;
    }

    public final PageAuthorityClaim getClaim() {
        return this.claim;
    }

    public final OperationId getOperationId() {
        return this.operationId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.budget, AnonymousClass005.A0F(this.claim, AnonymousClass005.A0E(this.operationId)));
    }

    public String toString() {
        OperationId operationId = this.operationId;
        PageAuthorityClaim pageAuthorityClaim = this.claim;
        Budget budget = this.budget;
        StringBuilder sbA0f = C3cG.A0f(operationId, "NativePageCloseRequest(operationId=");
        sbA0f.append(", claim=");
        sbA0f.append(pageAuthorityClaim);
        return C3cJ.A0L(budget, ", budget=", sbA0f);
    }

    public NativePageCloseRequest(OperationId operationId, PageAuthorityClaim pageAuthorityClaim, Budget budget) {
        AnonymousClass005.A0x(operationId, pageAuthorityClaim, budget);
        this.operationId = operationId;
        this.claim = pageAuthorityClaim;
        this.budget = budget;
    }

    public final NativePageCloseRequest copy(OperationId operationId, PageAuthorityClaim pageAuthorityClaim, Budget budget) {
        AnonymousClass005.A0x(operationId, pageAuthorityClaim, budget);
        return new NativePageCloseRequest(operationId, pageAuthorityClaim, budget);
    }
}
