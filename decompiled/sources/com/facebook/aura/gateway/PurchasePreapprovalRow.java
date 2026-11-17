package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class PurchasePreapprovalRow extends C06G {
    public static final int $stable = 0;
    public final PurchasePreapprovalRowKind kind;
    public final String text;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PurchasePreapprovalRow) {
                PurchasePreapprovalRow purchasePreapprovalRow = (PurchasePreapprovalRow) obj;
                if (this.kind != purchasePreapprovalRow.kind || !C7384Etj.areEqual(this.text, purchasePreapprovalRow.text)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PurchasePreapprovalRow copy$default(PurchasePreapprovalRow purchasePreapprovalRow, PurchasePreapprovalRowKind purchasePreapprovalRowKind, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            purchasePreapprovalRowKind = purchasePreapprovalRow.kind;
        }
        if ((i & 2) != 0) {
            str = purchasePreapprovalRow.text;
        }
        AnonymousClass003.A0u(purchasePreapprovalRowKind, str);
        return new PurchasePreapprovalRow(purchasePreapprovalRowKind, str);
    }

    public final PurchasePreapprovalRowKind component1() {
        return this.kind;
    }

    public final String component2() {
        return this.text;
    }

    public final PurchasePreapprovalRowKind getKind() {
        return this.kind;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.text, AnonymousClass005.A0E(this.kind));
    }

    public PurchasePreapprovalRow(PurchasePreapprovalRowKind purchasePreapprovalRowKind, String str) {
        AnonymousClass003.A0u(purchasePreapprovalRowKind, str);
        this.kind = purchasePreapprovalRowKind;
        this.text = str;
    }

    public final PurchasePreapprovalRow copy(PurchasePreapprovalRowKind purchasePreapprovalRowKind, String str) {
        AnonymousClass003.A0u(purchasePreapprovalRowKind, str);
        return new PurchasePreapprovalRow(purchasePreapprovalRowKind, str);
    }

    public String toString() {
        return super.toString();
    }
}
