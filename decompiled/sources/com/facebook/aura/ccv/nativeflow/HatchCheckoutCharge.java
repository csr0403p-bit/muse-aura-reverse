package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass005;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchCheckoutCharge {
    public final String amount;
    public final String billingCountry;
    public final String credentialId;
    public final String currency;
    public final String platformTrustToken;
    public final HatchCheckoutSession session;

    public final String getAmount$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow() {
        return this.amount;
    }

    public final String getBillingCountry$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow() {
        return this.billingCountry;
    }

    public final String getCredentialId$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow() {
        return this.credentialId;
    }

    public final String getCurrency$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow() {
        return this.currency;
    }

    public final String getPlatformTrustToken$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow() {
        return this.platformTrustToken;
    }

    public final HatchCheckoutSession getSession$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow() {
        return this.session;
    }

    public HatchCheckoutCharge(HatchCheckoutSession hatchCheckoutSession, String str, String str2, String str3, String str4, String str5) {
        AnonymousClass005.A17(hatchCheckoutSession, str, str2, str3, str4);
        C7384Etj.A0Y(str5, 5);
        this.session = hatchCheckoutSession;
        this.credentialId = str;
        this.platformTrustToken = str2;
        this.amount = str3;
        this.currency = str4;
        this.billingCountry = str5;
    }
}
