package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class WalletPaymentOption extends C06G {
    public static final int $stable = WalletBalance.$stable;
    public final WalletBalance balance;
    public final String cardBrand;
    public final String cardLast4;
    public final String displayName;
    public final boolean isEligible;
    public final String paymentId;
    public final String paymentMethod;
    public final String paymentMethodLabel;
    public final String paymentType;

    public static /* synthetic */ WalletPaymentOption copy$default(WalletPaymentOption walletPaymentOption, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, WalletBalance walletBalance, int i, Object obj) {
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        boolean z2 = z;
        WalletBalance walletBalance2 = walletBalance;
        if ((i & 1) != 0) {
            str8 = walletPaymentOption.paymentMethod;
        }
        if ((i & 2) != 0) {
            str9 = walletPaymentOption.paymentType;
        }
        if ((i & 4) != 0) {
            str10 = walletPaymentOption.paymentId;
        }
        if ((i & 8) != 0) {
            str11 = walletPaymentOption.paymentMethodLabel;
        }
        if ((i & 16) != 0) {
            str12 = walletPaymentOption.displayName;
        }
        if ((i & 32) != 0) {
            str13 = walletPaymentOption.cardBrand;
        }
        if ((i & 64) != 0) {
            str14 = walletPaymentOption.cardLast4;
        }
        if ((i & 128) != 0) {
            z2 = walletPaymentOption.isEligible;
        }
        if ((i & 256) != 0) {
            walletBalance2 = walletPaymentOption.balance;
        }
        AnonymousClass003.A0v(str8, str10);
        return new WalletPaymentOption(str8, str9, str10, str11, str12, str13, str14, z2, walletBalance2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WalletPaymentOption) {
                WalletPaymentOption walletPaymentOption = (WalletPaymentOption) obj;
                if (!C7384Etj.areEqual(this.paymentMethod, walletPaymentOption.paymentMethod) || !C7384Etj.areEqual(this.paymentType, walletPaymentOption.paymentType) || !C7384Etj.areEqual(this.paymentId, walletPaymentOption.paymentId) || !C7384Etj.areEqual(this.paymentMethodLabel, walletPaymentOption.paymentMethodLabel) || !C7384Etj.areEqual(this.displayName, walletPaymentOption.displayName) || !C7384Etj.areEqual(this.cardBrand, walletPaymentOption.cardBrand) || !C7384Etj.areEqual(this.cardLast4, walletPaymentOption.cardLast4) || this.isEligible != walletPaymentOption.isEligible || !C7384Etj.areEqual(this.balance, walletPaymentOption.balance)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ WalletPaymentOption(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, WalletBalance walletBalance, int i, C06H c06h) {
        this(str, str2, str3, str4, str5, str6, str7, (i & 128) != 0 ? true : z, (i & 256) != 0 ? null : walletBalance);
    }

    public final String component1() {
        return this.paymentMethod;
    }

    public final String component2() {
        return this.paymentType;
    }

    public final String component3() {
        return this.paymentId;
    }

    public final String component4() {
        return this.paymentMethodLabel;
    }

    public final String component5() {
        return this.displayName;
    }

    public final String component6() {
        return this.cardBrand;
    }

    public final String component7() {
        return this.cardLast4;
    }

    public final boolean component8() {
        return this.isEligible;
    }

    public final WalletBalance component9() {
        return this.balance;
    }

    public final WalletBalance getBalance() {
        return this.balance;
    }

    public final String getCardBrand() {
        return this.cardBrand;
    }

    public final String getCardLast4() {
        return this.cardLast4;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public final String getPaymentMethodLabel() {
        return this.paymentMethodLabel;
    }

    public final String getPaymentType() {
        return this.paymentType;
    }

    public int hashCode() {
        return C0KA.A01((((((((AnonymousClass005.A0I(this.paymentId, (AnonymousClass001.A0G(this.paymentMethod) + AnonymousClass006.A0G(this.paymentType)) * 31) + AnonymousClass006.A0G(this.paymentMethodLabel)) * 31) + AnonymousClass006.A0G(this.displayName)) * 31) + AnonymousClass006.A0G(this.cardBrand)) * 31) + AnonymousClass006.A0G(this.cardLast4)) * 31, this.isEligible) + C3cH.A02(this.balance);
    }

    public final boolean isEligible() {
        return this.isEligible;
    }

    public final WalletPaymentOption copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, WalletBalance walletBalance) {
        AnonymousClass003.A0v(str, str3);
        return new WalletPaymentOption(str, str2, str3, str4, str5, str6, str7, z, walletBalance);
    }

    public String toString() {
        return super.toString();
    }

    public WalletPaymentOption(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, WalletBalance walletBalance) {
        AnonymousClass003.A0v(str, str3);
        this.paymentMethod = str;
        this.paymentType = str2;
        this.paymentId = str3;
        this.paymentMethodLabel = str4;
        this.displayName = str5;
        this.cardBrand = str6;
        this.cardLast4 = str7;
        this.isEligible = z;
        this.balance = walletBalance;
    }
}
