package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CheckoutLodgingFeeJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String amount;
    public final String collected;
    public final String currency;
    public final String label;

    public final class Companion {
        public final C9hr<CheckoutLodgingFeeJson> serializer() {
            return CheckoutLodgingFeeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CheckoutLodgingFeeJson checkoutLodgingFeeJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(checkoutLodgingFeeJson.label)) {
            c9j5.AAV(checkoutLodgingFeeJson.label, c9iZ, 0);
        }
        if (zAfR || !"".equals(checkoutLodgingFeeJson.amount)) {
            c9j5.AAV(checkoutLodgingFeeJson.amount, c9iZ, 1);
        }
        if (zAfR || checkoutLodgingFeeJson.currency != null) {
            c9j5.AAP(checkoutLodgingFeeJson.currency, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || checkoutLodgingFeeJson.collected != null) {
            c9j5.AAP(checkoutLodgingFeeJson.collected, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingFeeJson) {
                CheckoutLodgingFeeJson checkoutLodgingFeeJson = (CheckoutLodgingFeeJson) obj;
                if (!C7384Etj.areEqual(this.label, checkoutLodgingFeeJson.label) || !C7384Etj.areEqual(this.amount, checkoutLodgingFeeJson.amount) || !C7384Etj.areEqual(this.currency, checkoutLodgingFeeJson.currency) || !C7384Etj.areEqual(this.collected, checkoutLodgingFeeJson.collected)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutLodgingFeeJson copy$default(CheckoutLodgingFeeJson checkoutLodgingFeeJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutLodgingFeeJson.label;
        }
        if ((i & 2) != 0) {
            str2 = checkoutLodgingFeeJson.amount;
        }
        if ((i & 4) != 0) {
            str3 = checkoutLodgingFeeJson.currency;
        }
        if ((i & 8) != 0) {
            str4 = checkoutLodgingFeeJson.collected;
        }
        AnonymousClass003.A0u(str, str2);
        return new CheckoutLodgingFeeJson(str, str2, str3, str4);
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

    public final String component4() {
        return this.collected;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCollected() {
        return this.collected;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.amount, AnonymousClass001.A0G(this.label)) + AnonymousClass006.A0G(this.currency)) * 31) + AnonymousClass005.A0H(this.collected);
    }

    public final CheckoutLodgingFee toDomain() {
        String strTrimToNonEmpty;
        String strTrimToNonEmpty2 = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(this.label);
        if (strTrimToNonEmpty2 == null || (strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(this.amount)) == null) {
            return null;
        }
        String strA0Z = C3cI.A0Z(this.currency);
        String str = this.collected;
        return new CheckoutLodgingFee(strTrimToNonEmpty2, strTrimToNonEmpty, strA0Z, "at_property".equals(str != null ? AnonymousClass002.A0l(str) : null));
    }

    public CheckoutLodgingFeeJson(String str, String str2, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        this.label = str;
        this.amount = str2;
        this.currency = str3;
        this.collected = str4;
    }

    public final CheckoutLodgingFeeJson copy(String str, String str2, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        return new CheckoutLodgingFeeJson(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CheckoutLodgingFeeJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
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
        if ((i & 8) == 0) {
            this.collected = null;
        } else {
            this.collected = str4;
        }
    }

    public /* synthetic */ CheckoutLodgingFeeJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public CheckoutLodgingFeeJson() {
        this("", "", null, null);
    }
}
