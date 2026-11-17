package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class NativeControlRequest {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public Budget budget;
    public PageAuthorityClaim claim;
    public NativeControlKind kind;
    public OperationId operationId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeControlRequest) {
                NativeControlRequest nativeControlRequest = (NativeControlRequest) obj;
                if (!C7384Etj.areEqual(this.operationId, nativeControlRequest.operationId) || !C7384Etj.areEqual(this.claim, nativeControlRequest.claim) || this.kind != nativeControlRequest.kind || !C7384Etj.areEqual(this.budget, nativeControlRequest.budget)) {
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

    public final void setKind(NativeControlKind nativeControlKind) {
        C7384Etj.A0Y(nativeControlKind, 0);
        this.kind = nativeControlKind;
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

    public static /* synthetic */ NativeControlRequest copy$default(NativeControlRequest nativeControlRequest, OperationId operationId, PageAuthorityClaim pageAuthorityClaim, NativeControlKind nativeControlKind, Budget budget, int i, Object obj) {
        if ((i & 1) != 0) {
            operationId = nativeControlRequest.operationId;
        }
        if ((i & 2) != 0) {
            pageAuthorityClaim = nativeControlRequest.claim;
        }
        if ((i & 4) != 0) {
            nativeControlKind = nativeControlRequest.kind;
        }
        if ((i & 8) != 0) {
            budget = nativeControlRequest.budget;
        }
        return nativeControlRequest.copy(operationId, pageAuthorityClaim, nativeControlKind, budget);
    }

    public final OperationId component1() {
        return this.operationId;
    }

    public final PageAuthorityClaim component2() {
        return this.claim;
    }

    public final NativeControlKind component3() {
        return this.kind;
    }

    public final Budget component4() {
        return this.budget;
    }

    public final Budget getBudget() {
        return this.budget;
    }

    public final PageAuthorityClaim getClaim() {
        return this.claim;
    }

    public final NativeControlKind getKind() {
        return this.kind;
    }

    public final OperationId getOperationId() {
        return this.operationId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.budget, AnonymousClass005.A0F(this.kind, AnonymousClass005.A0F(this.claim, AnonymousClass005.A0E(this.operationId))));
    }

    public String toString() {
        OperationId operationId = this.operationId;
        PageAuthorityClaim pageAuthorityClaim = this.claim;
        NativeControlKind nativeControlKind = this.kind;
        Budget budget = this.budget;
        StringBuilder sbA0f = C3cG.A0f(operationId, "NativeControlRequest(operationId=");
        sbA0f.append(", claim=");
        sbA0f.append(pageAuthorityClaim);
        sbA0f.append(", kind=");
        sbA0f.append(nativeControlKind);
        return C3cJ.A0L(budget, ", budget=", sbA0f);
    }

    public NativeControlRequest(OperationId operationId, PageAuthorityClaim pageAuthorityClaim, NativeControlKind nativeControlKind, Budget budget) {
        AnonymousClass005.A14(operationId, pageAuthorityClaim, nativeControlKind, budget);
        this.operationId = operationId;
        this.claim = pageAuthorityClaim;
        this.kind = nativeControlKind;
        this.budget = budget;
    }

    public final NativeControlRequest copy(OperationId operationId, PageAuthorityClaim pageAuthorityClaim, NativeControlKind nativeControlKind, Budget budget) {
        AnonymousClass005.A14(operationId, pageAuthorityClaim, nativeControlKind, budget);
        return new NativeControlRequest(operationId, pageAuthorityClaim, nativeControlKind, budget);
    }
}
