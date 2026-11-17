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
public final class WalletPaymentDetailsJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String card_brand;
    public final String card_last4;
    public final String payment_method_label;

    public final class Companion {
        public final C9hr<WalletPaymentDetailsJson> serializer() {
            return WalletPaymentDetailsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(WalletPaymentDetailsJson walletPaymentDetailsJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || walletPaymentDetailsJson.payment_method_label != null) {
            c9j5.AAP(walletPaymentDetailsJson.payment_method_label, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || walletPaymentDetailsJson.card_brand != null) {
            c9j5.AAP(walletPaymentDetailsJson.card_brand, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || walletPaymentDetailsJson.card_last4 != null) {
            c9j5.AAP(walletPaymentDetailsJson.card_last4, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WalletPaymentDetailsJson) {
                WalletPaymentDetailsJson walletPaymentDetailsJson = (WalletPaymentDetailsJson) obj;
                if (!C7384Etj.areEqual(this.payment_method_label, walletPaymentDetailsJson.payment_method_label) || !C7384Etj.areEqual(this.card_brand, walletPaymentDetailsJson.card_brand) || !C7384Etj.areEqual(this.card_last4, walletPaymentDetailsJson.card_last4)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WalletPaymentDetailsJson copy$default(WalletPaymentDetailsJson walletPaymentDetailsJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletPaymentDetailsJson.payment_method_label;
        }
        if ((i & 2) != 0) {
            str2 = walletPaymentDetailsJson.card_brand;
        }
        if ((i & 4) != 0) {
            str3 = walletPaymentDetailsJson.card_last4;
        }
        return new WalletPaymentDetailsJson(str, str2, str3);
    }

    public final String component1() {
        return this.payment_method_label;
    }

    public final String component2() {
        return this.card_brand;
    }

    public final String component3() {
        return this.card_last4;
    }

    public final WalletPaymentDetailsJson copy(String str, String str2, String str3) {
        return new WalletPaymentDetailsJson(str, str2, str3);
    }

    public final String getCard_brand() {
        return this.card_brand;
    }

    public final String getCard_last4() {
        return this.card_last4;
    }

    public final String getPayment_method_label() {
        return this.payment_method_label;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.payment_method_label) * 31) + AnonymousClass006.A0G(this.card_brand)) * 31) + AnonymousClass005.A0H(this.card_last4);
    }

    public WalletPaymentDetailsJson(String str, String str2, String str3) {
        this.payment_method_label = str;
        this.card_brand = str2;
        this.card_last4 = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WalletPaymentDetailsJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.payment_method_label = null;
        } else {
            this.payment_method_label = str;
        }
        if ((i & 2) == 0) {
            this.card_brand = null;
        } else {
            this.card_brand = str2;
        }
        if ((i & 4) == 0) {
            this.card_last4 = null;
        } else {
            this.card_last4 = str3;
        }
    }

    public /* synthetic */ WalletPaymentDetailsJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public WalletPaymentDetailsJson() {
        this(null, null, null);
    }
}
