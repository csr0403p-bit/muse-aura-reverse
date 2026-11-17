package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class HatchCheckoutSession extends C06G {
    public final String amount;
    public final HatchCcvCountryOptions countryOptions;
    public final String currency;
    public final String orderId;
    public final String otcSessionId;
    public final String screenSubtitle;
    public final String screenTitle;
    public final List<String> supportedCardTypes;
    public final String uplSessionId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCheckoutSession) {
                HatchCheckoutSession hatchCheckoutSession = (HatchCheckoutSession) obj;
                if (!C7384Etj.areEqual(this.orderId, hatchCheckoutSession.orderId) || !C7384Etj.areEqual(this.uplSessionId, hatchCheckoutSession.uplSessionId) || !C7384Etj.areEqual(this.otcSessionId, hatchCheckoutSession.otcSessionId) || !C7384Etj.areEqual(this.supportedCardTypes, hatchCheckoutSession.supportedCardTypes) || !C7384Etj.areEqual(this.countryOptions, hatchCheckoutSession.countryOptions) || !C7384Etj.areEqual(this.amount, hatchCheckoutSession.amount) || !C7384Etj.areEqual(this.currency, hatchCheckoutSession.currency) || !C7384Etj.areEqual(this.screenTitle, hatchCheckoutSession.screenTitle) || !C7384Etj.areEqual(this.screenSubtitle, hatchCheckoutSession.screenSubtitle)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchCheckoutSession copy$default(HatchCheckoutSession hatchCheckoutSession, String str, String str2, String str3, List list, HatchCcvCountryOptions hatchCcvCountryOptions, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCheckoutSession.orderId;
        }
        if ((i & 2) != 0) {
            str2 = hatchCheckoutSession.uplSessionId;
        }
        if ((i & 4) != 0) {
            str3 = hatchCheckoutSession.otcSessionId;
        }
        if ((i & 8) != 0) {
            list = hatchCheckoutSession.supportedCardTypes;
        }
        if ((i & 16) != 0) {
            hatchCcvCountryOptions = hatchCheckoutSession.countryOptions;
        }
        if ((i & 32) != 0) {
            str4 = hatchCheckoutSession.amount;
        }
        if ((i & 64) != 0) {
            str5 = hatchCheckoutSession.currency;
        }
        if ((i & 128) != 0) {
            str6 = hatchCheckoutSession.screenTitle;
        }
        if ((i & 256) != 0) {
            str7 = hatchCheckoutSession.screenSubtitle;
        }
        return hatchCheckoutSession.copy(str, str2, str3, list, hatchCcvCountryOptions, str4, str5, str6, str7);
    }

    public final String component1() {
        return this.orderId;
    }

    public final String component2() {
        return this.uplSessionId;
    }

    public final String component3() {
        return this.otcSessionId;
    }

    public final List<String> component4() {
        return this.supportedCardTypes;
    }

    public final HatchCcvCountryOptions component5() {
        return this.countryOptions;
    }

    public final String component6() {
        return this.amount;
    }

    public final String component7() {
        return this.currency;
    }

    public final String component8() {
        return this.screenTitle;
    }

    public final String component9() {
        return this.screenSubtitle;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final HatchCcvCountryOptions getCountryOptions() {
        return this.countryOptions;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getOtcSessionId() {
        return this.otcSessionId;
    }

    public final String getScreenSubtitle() {
        return this.screenSubtitle;
    }

    public final String getScreenTitle() {
        return this.screenTitle;
    }

    public final List<String> getSupportedCardTypes() {
        return this.supportedCardTypes;
    }

    public final String getUplSessionId() {
        return this.uplSessionId;
    }

    public int hashCode() {
        return ((((((((AnonymousClass005.A0F(this.supportedCardTypes, AnonymousClass005.A0I(this.otcSessionId, AnonymousClass005.A0I(this.uplSessionId, AnonymousClass001.A0G(this.orderId)))) + AnonymousClass006.A0D(this.countryOptions)) * 31) + AnonymousClass006.A0G(this.amount)) * 31) + AnonymousClass006.A0G(this.currency)) * 31) + AnonymousClass006.A0G(this.screenTitle)) * 31) + AnonymousClass005.A0H(this.screenSubtitle);
    }

    public HatchCheckoutSession(String str, String str2, String str3, List<String> list, HatchCcvCountryOptions hatchCcvCountryOptions, String str4, String str5, String str6, String str7) {
        AnonymousClass005.A14(str, str2, str3, list);
        this.orderId = str;
        this.uplSessionId = str2;
        this.otcSessionId = str3;
        this.supportedCardTypes = list;
        this.countryOptions = hatchCcvCountryOptions;
        this.amount = str4;
        this.currency = str5;
        this.screenTitle = str6;
        this.screenSubtitle = str7;
    }

    public final HatchCheckoutSession copy(String str, String str2, String str3, List<String> list, HatchCcvCountryOptions hatchCcvCountryOptions, String str4, String str5, String str6, String str7) {
        AnonymousClass005.A14(str, str2, str3, list);
        return new HatchCheckoutSession(str, str2, str3, list, hatchCcvCountryOptions, str4, str5, str6, str7);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchCheckoutSession(String str, String str2, String str3, List list, HatchCcvCountryOptions hatchCcvCountryOptions, String str4, String str5, String str6, String str7, int i, C06H c06h) {
        this(str, str2, str3, (i & 8) != 0 ? C0881AGi.A00 : list, (i & 16) != 0 ? null : hatchCcvCountryOptions, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7);
    }
}
