package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C7384Etj;
import X.C8j5;

/* loaded from: classes6.dex */
public final class SettlementReceipt {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public OperationId operationId;
    public boolean settled;

    public SettlementReceipt(OperationId operationId, boolean z) {
        C7384Etj.A0Y(operationId, 0);
        this.operationId = operationId;
        this.settled = z;
    }

    public final SettlementReceipt copy(OperationId operationId, boolean z) {
        C7384Etj.A0Y(operationId, 0);
        return new SettlementReceipt(operationId, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SettlementReceipt) {
                SettlementReceipt settlementReceipt = (SettlementReceipt) obj;
                if (!C7384Etj.areEqual(this.operationId, settlementReceipt.operationId) || this.settled != settlementReceipt.settled) {
                }
            }
            return false;
        }
        return true;
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

    public static /* synthetic */ SettlementReceipt copy$default(SettlementReceipt settlementReceipt, OperationId operationId, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            operationId = settlementReceipt.operationId;
        }
        if ((i & 2) != 0) {
            z = settlementReceipt.settled;
        }
        C7384Etj.A0Y(operationId, 0);
        return new SettlementReceipt(operationId, z);
    }

    public final OperationId component1() {
        return this.operationId;
    }

    public final boolean component2() {
        return this.settled;
    }

    public final OperationId getOperationId() {
        return this.operationId;
    }

    public final boolean getSettled() {
        return this.settled;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0E(this.operationId), this.settled);
    }

    public final void setSettled(boolean z) {
        this.settled = z;
    }

    public String toString() {
        OperationId operationId = this.operationId;
        return C8j5.A0W(", settled=", C3cG.A0f(operationId, "SettlementReceipt(operationId="), this.settled);
    }
}
