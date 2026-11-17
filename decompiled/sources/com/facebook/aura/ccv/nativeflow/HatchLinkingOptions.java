package com.facebook.aura.ccv.nativeflow;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C3cI;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class HatchLinkingOptions extends C06G {
    public final List<HatchLinkableAccountType> accountTypes;
    public final String chargeAmount;
    public final String chargeCurrency;
    public final String displayAmount;
    public final String screenSubtitle;
    public final String screenTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public HatchLinkingOptions(List<? extends HatchLinkableAccountType> list, String str, String str2, String str3, String str4, String str5) {
        C7384Etj.A0Y(list, 0);
        this.accountTypes = list;
        this.screenTitle = str;
        this.screenSubtitle = str2;
        this.chargeAmount = str3;
        this.chargeCurrency = str4;
        this.displayAmount = str5;
    }

    public final HatchLinkingOptions copy(List<? extends HatchLinkableAccountType> list, String str, String str2, String str3, String str4, String str5) {
        C7384Etj.A0Y(list, 0);
        return new HatchLinkingOptions(list, str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchLinkingOptions) {
                HatchLinkingOptions hatchLinkingOptions = (HatchLinkingOptions) obj;
                if (!C7384Etj.areEqual(this.accountTypes, hatchLinkingOptions.accountTypes) || !C7384Etj.areEqual(this.screenTitle, hatchLinkingOptions.screenTitle) || !C7384Etj.areEqual(this.screenSubtitle, hatchLinkingOptions.screenSubtitle) || !C7384Etj.areEqual(this.chargeAmount, hatchLinkingOptions.chargeAmount) || !C7384Etj.areEqual(this.chargeCurrency, hatchLinkingOptions.chargeCurrency) || !C7384Etj.areEqual(this.displayAmount, hatchLinkingOptions.displayAmount)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchLinkingOptions copy$default(HatchLinkingOptions hatchLinkingOptions, List list, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hatchLinkingOptions.accountTypes;
        }
        if ((i & 2) != 0) {
            str = hatchLinkingOptions.screenTitle;
        }
        if ((i & 4) != 0) {
            str2 = hatchLinkingOptions.screenSubtitle;
        }
        if ((i & 8) != 0) {
            str3 = hatchLinkingOptions.chargeAmount;
        }
        if ((i & 16) != 0) {
            str4 = hatchLinkingOptions.chargeCurrency;
        }
        if ((i & 32) != 0) {
            str5 = hatchLinkingOptions.displayAmount;
        }
        return hatchLinkingOptions.copy(list, str, str2, str3, str4, str5);
    }

    public final List<HatchLinkableAccountType> component1() {
        return this.accountTypes;
    }

    public final String component2() {
        return this.screenTitle;
    }

    public final String component3() {
        return this.screenSubtitle;
    }

    public final String component4() {
        return this.chargeAmount;
    }

    public final String component5() {
        return this.chargeCurrency;
    }

    public final String component6() {
        return this.displayAmount;
    }

    public final List<HatchLinkableAccountType> getAccountTypes() {
        return this.accountTypes;
    }

    public final String getChargeAmount() {
        return this.chargeAmount;
    }

    public final String getChargeCurrency() {
        return this.chargeCurrency;
    }

    public final String getDisplayAmount() {
        return this.displayAmount;
    }

    public final String getScreenSubtitle() {
        return this.screenSubtitle;
    }

    public final String getScreenTitle() {
        return this.screenTitle;
    }

    public int hashCode() {
        return ((((((((AnonymousClass005.A0E(this.accountTypes) + AnonymousClass006.A0G(this.screenTitle)) * 31) + AnonymousClass006.A0G(this.screenSubtitle)) * 31) + AnonymousClass006.A0G(this.chargeAmount)) * 31) + AnonymousClass006.A0G(this.chargeCurrency)) * 31) + AnonymousClass005.A0H(this.displayAmount);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchLinkingOptions(List list, String str, String str2, String str3, String str4, String str5, int i, C06H c06h) {
        this(C3cI.A10(list, i), (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }

    public HatchLinkingOptions() {
        this(C0881AGi.A00, null, null, null, null, null);
    }
}
