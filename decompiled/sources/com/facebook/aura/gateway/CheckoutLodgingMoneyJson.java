package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CheckoutLodgingMoneyJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String amount;
    public final String currency;

    public final class Companion {
        public final C9hr<CheckoutLodgingMoneyJson> serializer() {
            return CheckoutLodgingMoneyJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public CheckoutLodgingMoneyJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.amount = str;
        this.currency = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CheckoutLodgingMoneyJson checkoutLodgingMoneyJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(checkoutLodgingMoneyJson.amount)) {
            c9j5.AAV(checkoutLodgingMoneyJson.amount, c9iZ, 0);
        }
        if (zAfR || checkoutLodgingMoneyJson.currency != null) {
            c9j5.AAP(checkoutLodgingMoneyJson.currency, C07779iq.A01, c9iZ, 1);
        }
    }

    public final CheckoutLodgingMoneyJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new CheckoutLodgingMoneyJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingMoneyJson) {
                CheckoutLodgingMoneyJson checkoutLodgingMoneyJson = (CheckoutLodgingMoneyJson) obj;
                if (!C7384Etj.areEqual(this.amount, checkoutLodgingMoneyJson.amount) || !C7384Etj.areEqual(this.currency, checkoutLodgingMoneyJson.currency)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutLodgingMoneyJson copy$default(CheckoutLodgingMoneyJson checkoutLodgingMoneyJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutLodgingMoneyJson.amount;
        }
        if ((i & 2) != 0) {
            str2 = checkoutLodgingMoneyJson.currency;
        }
        C7384Etj.A0Y(str, 0);
        return new CheckoutLodgingMoneyJson(str, str2);
    }

    public final String component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.amount) + AnonymousClass006.A0G(this.currency);
    }

    public final CheckoutLodgingMoney toDomain() {
        String strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(this.amount);
        if (strTrimToNonEmpty == null) {
            return null;
        }
        String str = this.currency;
        return new CheckoutLodgingMoney(strTrimToNonEmpty, str != null ? HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str) : null);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CheckoutLodgingMoneyJson(int i, String str, String str2, C2hx c2hx) {
        this.amount = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.currency = null;
        } else {
            this.currency = str2;
        }
    }

    public /* synthetic */ CheckoutLodgingMoneyJson(String str, String str2, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), AnonymousClass006.A0s(i, str2));
    }

    public CheckoutLodgingMoneyJson() {
        this("", null);
    }
}
