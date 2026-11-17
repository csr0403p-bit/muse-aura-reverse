package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class PurchasePreapprovalTotal extends C06G {
    public static final int $stable = 0;
    public final String caption;
    public final String label;
    public final String value;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PurchasePreapprovalTotal) {
                PurchasePreapprovalTotal purchasePreapprovalTotal = (PurchasePreapprovalTotal) obj;
                if (!C7384Etj.areEqual(this.label, purchasePreapprovalTotal.label) || !C7384Etj.areEqual(this.caption, purchasePreapprovalTotal.caption) || !C7384Etj.areEqual(this.value, purchasePreapprovalTotal.value)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PurchasePreapprovalTotal copy$default(PurchasePreapprovalTotal purchasePreapprovalTotal, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = purchasePreapprovalTotal.label;
        }
        if ((i & 2) != 0) {
            str2 = purchasePreapprovalTotal.caption;
        }
        if ((i & 4) != 0) {
            str3 = purchasePreapprovalTotal.value;
        }
        return purchasePreapprovalTotal.copy(str, str2, str3);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.caption;
    }

    public final String component3() {
        return this.value;
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.value, AnonymousClass005.A0I(this.caption, AnonymousClass001.A0G(this.label)));
    }

    public PurchasePreapprovalTotal(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.label = str;
        this.caption = str2;
        this.value = str3;
    }

    public final PurchasePreapprovalTotal copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new PurchasePreapprovalTotal(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }
}
