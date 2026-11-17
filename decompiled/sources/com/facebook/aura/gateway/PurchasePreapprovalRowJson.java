package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class PurchasePreapprovalRowJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String kind;
    public final String text;

    public final class Companion {
        public final C9hr<PurchasePreapprovalRowJson> serializer() {
            return PurchasePreapprovalRowJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PurchasePreapprovalRowJson(String str, String str2) {
        C7384Etj.A0Y(str2, 1);
        this.kind = str;
        this.text = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(PurchasePreapprovalRowJson purchasePreapprovalRowJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || purchasePreapprovalRowJson.kind != null) {
            c9j5.AAP(purchasePreapprovalRowJson.kind, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || !C3cH.A1Q(purchasePreapprovalRowJson.text)) {
            c9j5.AAV(purchasePreapprovalRowJson.text, c9iZ, 1);
        }
    }

    public final PurchasePreapprovalRowJson copy(String str, String str2) {
        C7384Etj.A0Y(str2, 1);
        return new PurchasePreapprovalRowJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PurchasePreapprovalRowJson) {
                PurchasePreapprovalRowJson purchasePreapprovalRowJson = (PurchasePreapprovalRowJson) obj;
                if (!C7384Etj.areEqual(this.kind, purchasePreapprovalRowJson.kind) || !C7384Etj.areEqual(this.text, purchasePreapprovalRowJson.text)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PurchasePreapprovalRowJson copy$default(PurchasePreapprovalRowJson purchasePreapprovalRowJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = purchasePreapprovalRowJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = purchasePreapprovalRowJson.text;
        }
        C7384Etj.A0Y(str2, 1);
        return new PurchasePreapprovalRowJson(str, str2);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.text;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.text, AnonymousClass006.A0G(this.kind) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PurchasePreapprovalRowJson(int i, String str, String str2, C2hx c2hx) {
        this.kind = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.text = "";
        } else {
            this.text = str2;
        }
    }

    public /* synthetic */ PurchasePreapprovalRowJson(String str, String str2, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str), (i & 2) != 0 ? "" : str2);
    }

    public PurchasePreapprovalRowJson() {
        this(null, "");
    }
}
