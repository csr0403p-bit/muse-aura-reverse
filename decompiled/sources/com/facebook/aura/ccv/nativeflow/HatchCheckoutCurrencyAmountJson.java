package com.facebook.aura.ccv.nativeflow;

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
/* loaded from: classes4.dex */
public final class HatchCheckoutCurrencyAmountJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String amount;
    public final String currency;

    public final class Companion {
        public final C9hr<HatchCheckoutCurrencyAmountJson> serializer() {
            return HatchCheckoutCurrencyAmountJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchCheckoutCurrencyAmountJson hatchCheckoutCurrencyAmountJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchCheckoutCurrencyAmountJson.amount != null) {
            c9j5.AAP(hatchCheckoutCurrencyAmountJson.amount, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || hatchCheckoutCurrencyAmountJson.currency != null) {
            c9j5.AAP(hatchCheckoutCurrencyAmountJson.currency, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCheckoutCurrencyAmountJson) {
                HatchCheckoutCurrencyAmountJson hatchCheckoutCurrencyAmountJson = (HatchCheckoutCurrencyAmountJson) obj;
                if (!C7384Etj.areEqual(this.amount, hatchCheckoutCurrencyAmountJson.amount) || !C7384Etj.areEqual(this.currency, hatchCheckoutCurrencyAmountJson.currency)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchCheckoutCurrencyAmountJson copy$default(HatchCheckoutCurrencyAmountJson hatchCheckoutCurrencyAmountJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCheckoutCurrencyAmountJson.amount;
        }
        if ((i & 2) != 0) {
            str2 = hatchCheckoutCurrencyAmountJson.currency;
        }
        return new HatchCheckoutCurrencyAmountJson(str, str2);
    }

    public final String component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final HatchCheckoutCurrencyAmountJson copy(String str, String str2) {
        return new HatchCheckoutCurrencyAmountJson(str, str2);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.amount) * 31) + AnonymousClass005.A0H(this.currency);
    }

    public HatchCheckoutCurrencyAmountJson(String str, String str2) {
        this.amount = str;
        this.currency = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchCheckoutCurrencyAmountJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.amount = null;
        } else {
            this.amount = str;
        }
        if ((i & 2) == 0) {
            this.currency = null;
        } else {
            this.currency = str2;
        }
    }

    public /* synthetic */ HatchCheckoutCurrencyAmountJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public HatchCheckoutCurrencyAmountJson() {
        this(null, null);
    }
}
