package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
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
public final class CheckoutLodgingInstallmentJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String amount;
    public final String currency;
    public final String label;

    public final class Companion {
        public final C9hr<CheckoutLodgingInstallmentJson> serializer() {
            return CheckoutLodgingInstallmentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CheckoutLodgingInstallmentJson checkoutLodgingInstallmentJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(checkoutLodgingInstallmentJson.label)) {
            c9j5.AAV(checkoutLodgingInstallmentJson.label, c9iZ, 0);
        }
        if (zAfR || !"".equals(checkoutLodgingInstallmentJson.amount)) {
            c9j5.AAV(checkoutLodgingInstallmentJson.amount, c9iZ, 1);
        }
        if (zAfR || checkoutLodgingInstallmentJson.currency != null) {
            c9j5.AAP(checkoutLodgingInstallmentJson.currency, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingInstallmentJson) {
                CheckoutLodgingInstallmentJson checkoutLodgingInstallmentJson = (CheckoutLodgingInstallmentJson) obj;
                if (!C7384Etj.areEqual(this.label, checkoutLodgingInstallmentJson.label) || !C7384Etj.areEqual(this.amount, checkoutLodgingInstallmentJson.amount) || !C7384Etj.areEqual(this.currency, checkoutLodgingInstallmentJson.currency)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutLodgingInstallmentJson copy$default(CheckoutLodgingInstallmentJson checkoutLodgingInstallmentJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutLodgingInstallmentJson.label;
        }
        if ((i & 2) != 0) {
            str2 = checkoutLodgingInstallmentJson.amount;
        }
        if ((i & 4) != 0) {
            str3 = checkoutLodgingInstallmentJson.currency;
        }
        return checkoutLodgingInstallmentJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.amount;
    }

    public final String component3() {
        return this.currency;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.amount, AnonymousClass001.A0G(this.label)) + AnonymousClass006.A0G(this.currency);
    }

    public final CheckoutLodgingInstallment toDomain() {
        CheckoutLodgingMoney domain;
        String strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(this.label);
        if (strTrimToNonEmpty == null || (domain = new CheckoutLodgingMoneyJson(this.amount, this.currency).toDomain()) == null) {
            return null;
        }
        return new CheckoutLodgingInstallment(strTrimToNonEmpty, domain);
    }

    public CheckoutLodgingInstallmentJson(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.label = str;
        this.amount = str2;
        this.currency = str3;
    }

    public final CheckoutLodgingInstallmentJson copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new CheckoutLodgingInstallmentJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CheckoutLodgingInstallmentJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.label = "";
        } else {
            this.label = str;
        }
        if ((i & 2) == 0) {
            this.amount = "";
        } else {
            this.amount = str2;
        }
        if ((i & 4) == 0) {
            this.currency = null;
        } else {
            this.currency = str3;
        }
    }

    public /* synthetic */ CheckoutLodgingInstallmentJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, AnonymousClass006.A0t(i, str3));
    }

    public CheckoutLodgingInstallmentJson() {
        this("", "", null);
    }
}
