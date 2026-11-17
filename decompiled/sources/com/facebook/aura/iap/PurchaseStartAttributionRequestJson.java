package com.facebook.aura.iap;

import X.C06G;
import X.C7384Etj;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PurchaseStartAttributionRequestJson extends C06G {
    public final String entrypoint;

    public PurchaseStartAttributionRequestJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.entrypoint = str;
    }

    public final PurchaseStartAttributionRequestJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new PurchaseStartAttributionRequestJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PurchaseStartAttributionRequestJson) && C7384Etj.areEqual(this.entrypoint, ((PurchaseStartAttributionRequestJson) obj).entrypoint));
    }

    public static /* synthetic */ PurchaseStartAttributionRequestJson copy$default(PurchaseStartAttributionRequestJson purchaseStartAttributionRequestJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = purchaseStartAttributionRequestJson.entrypoint;
        }
        C7384Etj.A0Y(str, 0);
        return new PurchaseStartAttributionRequestJson(str);
    }

    public final String component1() {
        return this.entrypoint;
    }

    public final String getEntrypoint() {
        return this.entrypoint;
    }

    public int hashCode() {
        return this.entrypoint.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
