package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class PageCloseReceipt {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public OperationId operationId;
    public PageCloseOutcome outcome;
    public SettlementState settlement;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageCloseReceipt) {
                PageCloseReceipt pageCloseReceipt = (PageCloseReceipt) obj;
                if (!C7384Etj.areEqual(this.operationId, pageCloseReceipt.operationId) || !C7384Etj.areEqual(this.outcome, pageCloseReceipt.outcome) || this.settlement != pageCloseReceipt.settlement) {
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

    public final void setOutcome(PageCloseOutcome pageCloseOutcome) {
        C7384Etj.A0Y(pageCloseOutcome, 0);
        this.outcome = pageCloseOutcome;
    }

    public final void setSettlement(SettlementState settlementState) {
        C7384Etj.A0Y(settlementState, 0);
        this.settlement = settlementState;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ PageCloseReceipt copy$default(PageCloseReceipt pageCloseReceipt, OperationId operationId, PageCloseOutcome pageCloseOutcome, SettlementState settlementState, int i, Object obj) {
        if ((i & 1) != 0) {
            operationId = pageCloseReceipt.operationId;
        }
        if ((i & 2) != 0) {
            pageCloseOutcome = pageCloseReceipt.outcome;
        }
        if ((i & 4) != 0) {
            settlementState = pageCloseReceipt.settlement;
        }
        return pageCloseReceipt.copy(operationId, pageCloseOutcome, settlementState);
    }

    public final OperationId component1() {
        return this.operationId;
    }

    public final PageCloseOutcome component2() {
        return this.outcome;
    }

    public final SettlementState component3() {
        return this.settlement;
    }

    public final OperationId getOperationId() {
        return this.operationId;
    }

    public final PageCloseOutcome getOutcome() {
        return this.outcome;
    }

    public final SettlementState getSettlement() {
        return this.settlement;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.settlement, AnonymousClass005.A0F(this.outcome, AnonymousClass005.A0E(this.operationId)));
    }

    public String toString() {
        OperationId operationId = this.operationId;
        PageCloseOutcome pageCloseOutcome = this.outcome;
        SettlementState settlementState = this.settlement;
        StringBuilder sbA0f = C3cG.A0f(operationId, "PageCloseReceipt(operationId=");
        sbA0f.append(", outcome=");
        sbA0f.append(pageCloseOutcome);
        return C3cJ.A0L(settlementState, ", settlement=", sbA0f);
    }

    public PageCloseReceipt(OperationId operationId, PageCloseOutcome pageCloseOutcome, SettlementState settlementState) {
        AnonymousClass005.A0x(operationId, pageCloseOutcome, settlementState);
        this.operationId = operationId;
        this.outcome = pageCloseOutcome;
        this.settlement = settlementState;
    }

    public final PageCloseReceipt copy(OperationId operationId, PageCloseOutcome pageCloseOutcome, SettlementState settlementState) {
        AnonymousClass005.A0x(operationId, pageCloseOutcome, settlementState);
        return new PageCloseReceipt(operationId, pageCloseOutcome, settlementState);
    }
}
