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
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CheckoutTotalJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String amount;
    public final String currency;
    public final String display_text;
    public final String type;

    public final class Companion {
        public final C9hr<CheckoutTotalJson> serializer() {
            return CheckoutTotalJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CheckoutTotalJson checkoutTotalJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || checkoutTotalJson.type != null) {
            c9j5.AAP(checkoutTotalJson.type, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || checkoutTotalJson.display_text != null) {
            c9j5.AAP(checkoutTotalJson.display_text, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || checkoutTotalJson.amount != null) {
            c9j5.AAP(checkoutTotalJson.amount, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || checkoutTotalJson.currency != null) {
            c9j5.AAP(checkoutTotalJson.currency, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutTotalJson) {
                CheckoutTotalJson checkoutTotalJson = (CheckoutTotalJson) obj;
                if (!C7384Etj.areEqual(this.type, checkoutTotalJson.type) || !C7384Etj.areEqual(this.display_text, checkoutTotalJson.display_text) || !C7384Etj.areEqual(this.amount, checkoutTotalJson.amount) || !C7384Etj.areEqual(this.currency, checkoutTotalJson.currency)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutTotalJson copy$default(CheckoutTotalJson checkoutTotalJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutTotalJson.type;
        }
        if ((i & 2) != 0) {
            str2 = checkoutTotalJson.display_text;
        }
        if ((i & 4) != 0) {
            str3 = checkoutTotalJson.amount;
        }
        if ((i & 8) != 0) {
            str4 = checkoutTotalJson.currency;
        }
        return new CheckoutTotalJson(str, str2, str3, str4);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.display_text;
    }

    public final String component3() {
        return this.amount;
    }

    public final String component4() {
        return this.currency;
    }

    public final CheckoutTotalJson copy(String str, String str2, String str3, String str4) {
        return new CheckoutTotalJson(str, str2, str3, str4);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDisplay_text() {
        return this.display_text;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0G(this.type) * 31) + AnonymousClass006.A0G(this.display_text)) * 31) + AnonymousClass006.A0G(this.amount)) * 31) + AnonymousClass005.A0H(this.currency);
    }

    public final HatchAgentPermissionsRepository.CheckoutTotal toDomain() {
        return new HatchAgentPermissionsRepository.CheckoutTotal(this.type, this.display_text, this.amount, this.currency);
    }

    public CheckoutTotalJson(String str, String str2, String str3, String str4) {
        this.type = str;
        this.display_text = str2;
        this.amount = str3;
        this.currency = str4;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CheckoutTotalJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.display_text = null;
        } else {
            this.display_text = str2;
        }
        if ((i & 4) == 0) {
            this.amount = null;
        } else {
            this.amount = str3;
        }
        if ((i & 8) == 0) {
            this.currency = null;
        } else {
            this.currency = str4;
        }
    }

    public /* synthetic */ CheckoutTotalJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public CheckoutTotalJson() {
        this(null, null, null, null);
    }
}
