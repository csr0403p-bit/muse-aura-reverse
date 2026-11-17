package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HatchCcvAmountJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String currency;
    public final String display_amount;
    public final int minor_value;

    public final class Companion {
        public final C9hr<HatchCcvAmountJson> serializer() {
            return HatchCcvAmountJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ccv_nativeflow_nativeflow(HatchCcvAmountJson hatchCcvAmountJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchCcvAmountJson.currency != null) {
            c9j5.AAP(hatchCcvAmountJson.currency, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || hatchCcvAmountJson.minor_value != 0) {
            c9j5.AAK(c9iZ, 1, hatchCcvAmountJson.minor_value);
        }
        if (zAfR || hatchCcvAmountJson.display_amount != null) {
            c9j5.AAP(hatchCcvAmountJson.display_amount, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCcvAmountJson) {
                HatchCcvAmountJson hatchCcvAmountJson = (HatchCcvAmountJson) obj;
                if (!C7384Etj.areEqual(this.currency, hatchCcvAmountJson.currency) || this.minor_value != hatchCcvAmountJson.minor_value || !C7384Etj.areEqual(this.display_amount, hatchCcvAmountJson.display_amount)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchCcvAmountJson copy$default(HatchCcvAmountJson hatchCcvAmountJson, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = hatchCcvAmountJson.currency;
        }
        if ((i2 & 2) != 0) {
            i = hatchCcvAmountJson.minor_value;
        }
        if ((i2 & 4) != 0) {
            str2 = hatchCcvAmountJson.display_amount;
        }
        return new HatchCcvAmountJson(str, i, str2);
    }

    public final String component1() {
        return this.currency;
    }

    public final int component2() {
        return this.minor_value;
    }

    public final String component3() {
        return this.display_amount;
    }

    public final HatchCcvAmountJson copy(String str, int i, String str2) {
        return new HatchCcvAmountJson(str, i, str2);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDisplay_amount() {
        return this.display_amount;
    }

    public final int getMinor_value() {
        return this.minor_value;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.currency) * 31) + this.minor_value) * 31) + AnonymousClass005.A0H(this.display_amount);
    }

    public HatchCcvAmountJson(String str, int i, String str2) {
        this.currency = str;
        this.minor_value = i;
        this.display_amount = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchCcvAmountJson(int i, String str, int i2, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.currency = null;
        } else {
            this.currency = str;
        }
        if ((i & 2) == 0) {
            this.minor_value = 0;
        } else {
            this.minor_value = i2;
        }
        if ((i & 4) == 0) {
            this.display_amount = null;
        } else {
            this.display_amount = str2;
        }
    }

    public /* synthetic */ HatchCcvAmountJson(String str, int i, String str2, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? null : str, C3cG.A01(i2, i), (i2 & 4) != 0 ? null : str2);
    }

    public HatchCcvAmountJson() {
        this(null, 0, null);
    }
}
