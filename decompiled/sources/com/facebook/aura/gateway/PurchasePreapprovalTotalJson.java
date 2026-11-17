package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class PurchasePreapprovalTotalJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String caption;
    public final String label;
    public final String value;

    public final class Companion {
        public final C9hr<PurchasePreapprovalTotalJson> serializer() {
            return PurchasePreapprovalTotalJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(PurchasePreapprovalTotalJson purchasePreapprovalTotalJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || purchasePreapprovalTotalJson.label != null) {
            c9j5.AAP(purchasePreapprovalTotalJson.label, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || purchasePreapprovalTotalJson.caption != null) {
            c9j5.AAP(purchasePreapprovalTotalJson.caption, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || purchasePreapprovalTotalJson.value != null) {
            c9j5.AAP(purchasePreapprovalTotalJson.value, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PurchasePreapprovalTotalJson) {
                PurchasePreapprovalTotalJson purchasePreapprovalTotalJson = (PurchasePreapprovalTotalJson) obj;
                if (!C7384Etj.areEqual(this.label, purchasePreapprovalTotalJson.label) || !C7384Etj.areEqual(this.caption, purchasePreapprovalTotalJson.caption) || !C7384Etj.areEqual(this.value, purchasePreapprovalTotalJson.value)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PurchasePreapprovalTotalJson copy$default(PurchasePreapprovalTotalJson purchasePreapprovalTotalJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = purchasePreapprovalTotalJson.label;
        }
        if ((i & 2) != 0) {
            str2 = purchasePreapprovalTotalJson.caption;
        }
        if ((i & 4) != 0) {
            str3 = purchasePreapprovalTotalJson.value;
        }
        return new PurchasePreapprovalTotalJson(str, str2, str3);
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

    public final PurchasePreapprovalTotalJson copy(String str, String str2, String str3) {
        return new PurchasePreapprovalTotalJson(str, str2, str3);
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
        return (((AnonymousClass006.A0G(this.label) * 31) + AnonymousClass006.A0G(this.caption)) * 31) + AnonymousClass005.A0H(this.value);
    }

    public PurchasePreapprovalTotalJson(String str, String str2, String str3) {
        this.label = str;
        this.caption = str2;
        this.value = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PurchasePreapprovalTotalJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.label = null;
        } else {
            this.label = str;
        }
        if ((i & 2) == 0) {
            this.caption = null;
        } else {
            this.caption = str2;
        }
        if ((i & 4) == 0) {
            this.value = null;
        } else {
            this.value = str3;
        }
    }

    public /* synthetic */ PurchasePreapprovalTotalJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public PurchasePreapprovalTotalJson() {
        this(null, null, null);
    }
}
