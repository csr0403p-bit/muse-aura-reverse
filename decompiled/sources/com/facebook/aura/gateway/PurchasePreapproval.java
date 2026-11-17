package com.facebook.aura.gateway;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.List;

/* loaded from: classes2.dex */
public final class PurchasePreapproval extends C06G implements HatchAgentPermissionsRepository.AgentPermissionRichPayload {
    public static final int $stable = 8;
    public final PurchasePreapprovalTotal maxTotal;
    public final List<PurchasePreapprovalRow> rows;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PurchasePreapproval) {
                PurchasePreapproval purchasePreapproval = (PurchasePreapproval) obj;
                if (!C7384Etj.areEqual(this.rows, purchasePreapproval.rows) || !C7384Etj.areEqual(this.maxTotal, purchasePreapproval.maxTotal)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PurchasePreapproval copy$default(PurchasePreapproval purchasePreapproval, List list, PurchasePreapprovalTotal purchasePreapprovalTotal, int i, Object obj) {
        if ((i & 1) != 0) {
            list = purchasePreapproval.rows;
        }
        if ((i & 2) != 0) {
            purchasePreapprovalTotal = purchasePreapproval.maxTotal;
        }
        AnonymousClass003.A0u(list, purchasePreapprovalTotal);
        return new PurchasePreapproval(list, purchasePreapprovalTotal);
    }

    public final List<PurchasePreapprovalRow> component1() {
        return this.rows;
    }

    public final PurchasePreapprovalTotal component2() {
        return this.maxTotal;
    }

    public final PurchasePreapprovalTotal getMaxTotal() {
        return this.maxTotal;
    }

    public final List<PurchasePreapprovalRow> getRows() {
        return this.rows;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.maxTotal, AnonymousClass005.A0E(this.rows));
    }

    public PurchasePreapproval(List<PurchasePreapprovalRow> list, PurchasePreapprovalTotal purchasePreapprovalTotal) {
        AnonymousClass003.A0u(list, purchasePreapprovalTotal);
        this.rows = list;
        this.maxTotal = purchasePreapprovalTotal;
    }

    public final PurchasePreapproval copy(List<PurchasePreapprovalRow> list, PurchasePreapprovalTotal purchasePreapprovalTotal) {
        AnonymousClass003.A0u(list, purchasePreapprovalTotal);
        return new PurchasePreapproval(list, purchasePreapprovalTotal);
    }

    public String toString() {
        return super.toString();
    }
}
