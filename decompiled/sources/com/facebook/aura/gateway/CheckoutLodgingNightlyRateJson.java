package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C10571Hud;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import java.time.LocalDate;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CheckoutLodgingNightlyRateJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String amount;
    public final String currency;
    public final String stay_date;

    public final class Companion {
        public final C9hr<CheckoutLodgingNightlyRateJson> serializer() {
            return CheckoutLodgingNightlyRateJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CheckoutLodgingNightlyRateJson checkoutLodgingNightlyRateJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(checkoutLodgingNightlyRateJson.stay_date)) {
            c9j5.AAV(checkoutLodgingNightlyRateJson.stay_date, c9iZ, 0);
        }
        if (zAfR || !"".equals(checkoutLodgingNightlyRateJson.amount)) {
            c9j5.AAV(checkoutLodgingNightlyRateJson.amount, c9iZ, 1);
        }
        if (zAfR || checkoutLodgingNightlyRateJson.currency != null) {
            c9j5.AAP(checkoutLodgingNightlyRateJson.currency, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingNightlyRateJson) {
                CheckoutLodgingNightlyRateJson checkoutLodgingNightlyRateJson = (CheckoutLodgingNightlyRateJson) obj;
                if (!C7384Etj.areEqual(this.stay_date, checkoutLodgingNightlyRateJson.stay_date) || !C7384Etj.areEqual(this.amount, checkoutLodgingNightlyRateJson.amount) || !C7384Etj.areEqual(this.currency, checkoutLodgingNightlyRateJson.currency)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutLodgingNightlyRateJson copy$default(CheckoutLodgingNightlyRateJson checkoutLodgingNightlyRateJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutLodgingNightlyRateJson.stay_date;
        }
        if ((i & 2) != 0) {
            str2 = checkoutLodgingNightlyRateJson.amount;
        }
        if ((i & 4) != 0) {
            str3 = checkoutLodgingNightlyRateJson.currency;
        }
        return checkoutLodgingNightlyRateJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.stay_date;
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

    public final String getStay_date() {
        return this.stay_date;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.amount, AnonymousClass001.A0G(this.stay_date)) + AnonymousClass006.A0G(this.currency);
    }

    public final CheckoutLodgingNightlyRate toDomain() {
        Object objA0s;
        String strTrimToNonEmpty;
        try {
            objA0s = LocalDate.parse(this.stay_date);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        LocalDate localDate = (LocalDate) objA0s;
        if (localDate == null || (strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(this.amount)) == null) {
            return null;
        }
        String str = this.currency;
        return new CheckoutLodgingNightlyRate(localDate, strTrimToNonEmpty, str != null ? HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str) : null);
    }

    public CheckoutLodgingNightlyRateJson(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.stay_date = str;
        this.amount = str2;
        this.currency = str3;
    }

    public final CheckoutLodgingNightlyRateJson copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new CheckoutLodgingNightlyRateJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CheckoutLodgingNightlyRateJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.stay_date = "";
        } else {
            this.stay_date = str;
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

    public /* synthetic */ CheckoutLodgingNightlyRateJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, AnonymousClass006.A0t(i, str3));
    }

    public CheckoutLodgingNightlyRateJson() {
        this("", "", null);
    }
}
