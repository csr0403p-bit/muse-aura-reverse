package com.facebook.aura.gateway;

import X.AbstractC0878AGe;
import X.AnonymousClass006;
import X.BFI;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.CFK;
import X.FGI;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class WalletPaymentOptionJson extends C06G {
    public final WalletBalanceJson balance;
    public final String brand;
    public final String card_brand;
    public final WalletCardInfoJson card_info;
    public final String card_last4;
    public final String display_name;
    public final Boolean is_eligible;
    public final String network;
    public final String payment_id;
    public final String payment_method;
    public final String payment_method_label;
    public final String payment_type;
    public static final Companion Companion = new Companion();
    public static final int $stable = WalletBalanceJson.$stable;

    public final class Companion {
        public final C9hr<WalletPaymentOptionJson> serializer() {
            return WalletPaymentOptionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ WalletPaymentOptionJson copy$default(WalletPaymentOptionJson walletPaymentOptionJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, WalletCardInfoJson walletCardInfoJson, String str9, Boolean bool, WalletBalanceJson walletBalanceJson, int i, Object obj) {
        String str10 = str;
        String str11 = str2;
        String str12 = str3;
        String str13 = str4;
        String str14 = str5;
        String str15 = str6;
        String str16 = str7;
        String str17 = str8;
        WalletCardInfoJson walletCardInfoJson2 = walletCardInfoJson;
        String str18 = str9;
        Boolean bool2 = bool;
        WalletBalanceJson walletBalanceJson2 = walletBalanceJson;
        if ((i & 1) != 0) {
            str10 = walletPaymentOptionJson.payment_method;
        }
        if ((i & 2) != 0) {
            str11 = walletPaymentOptionJson.payment_type;
        }
        if ((i & 4) != 0) {
            str12 = walletPaymentOptionJson.payment_id;
        }
        if ((i & 8) != 0) {
            str13 = walletPaymentOptionJson.payment_method_label;
        }
        if ((i & 16) != 0) {
            str14 = walletPaymentOptionJson.display_name;
        }
        if ((i & 32) != 0) {
            str15 = walletPaymentOptionJson.card_brand;
        }
        if ((i & 64) != 0) {
            str16 = walletPaymentOptionJson.brand;
        }
        if ((i & 128) != 0) {
            str17 = walletPaymentOptionJson.network;
        }
        if ((i & 256) != 0) {
            walletCardInfoJson2 = walletPaymentOptionJson.card_info;
        }
        if ((i & 512) != 0) {
            str18 = walletPaymentOptionJson.card_last4;
        }
        if ((i & 1024) != 0) {
            bool2 = walletPaymentOptionJson.is_eligible;
        }
        if ((i & 2048) != 0) {
            walletBalanceJson2 = walletPaymentOptionJson.balance;
        }
        return new WalletPaymentOptionJson(str10, str11, str12, str13, str14, str15, str16, str17, walletCardInfoJson2, str18, bool2, walletBalanceJson2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(WalletPaymentOptionJson walletPaymentOptionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || walletPaymentOptionJson.payment_method != null) {
            c9j5.AAP(walletPaymentOptionJson.payment_method, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || walletPaymentOptionJson.payment_type != null) {
            c9j5.AAP(walletPaymentOptionJson.payment_type, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || walletPaymentOptionJson.payment_id != null) {
            c9j5.AAP(walletPaymentOptionJson.payment_id, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || walletPaymentOptionJson.payment_method_label != null) {
            c9j5.AAP(walletPaymentOptionJson.payment_method_label, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || walletPaymentOptionJson.display_name != null) {
            c9j5.AAP(walletPaymentOptionJson.display_name, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || walletPaymentOptionJson.card_brand != null) {
            c9j5.AAP(walletPaymentOptionJson.card_brand, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || walletPaymentOptionJson.brand != null) {
            c9j5.AAP(walletPaymentOptionJson.brand, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || walletPaymentOptionJson.network != null) {
            c9j5.AAP(walletPaymentOptionJson.network, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || walletPaymentOptionJson.card_info != null) {
            c9j5.AAP(walletPaymentOptionJson.card_info, WalletCardInfoJson$$serializer.INSTANCE, c9iZ, 8);
        }
        if (zAfR || walletPaymentOptionJson.card_last4 != null) {
            c9j5.AAP(walletPaymentOptionJson.card_last4, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || walletPaymentOptionJson.is_eligible != null) {
            c9j5.AAP(walletPaymentOptionJson.is_eligible, C07839ix.A00, c9iZ, 10);
        }
        if (zAfR || walletPaymentOptionJson.balance != null) {
            c9j5.AAP(walletPaymentOptionJson.balance, WalletBalanceJson$$serializer.INSTANCE, c9iZ, 11);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WalletPaymentOptionJson) {
                WalletPaymentOptionJson walletPaymentOptionJson = (WalletPaymentOptionJson) obj;
                if (!C7384Etj.areEqual(this.payment_method, walletPaymentOptionJson.payment_method) || !C7384Etj.areEqual(this.payment_type, walletPaymentOptionJson.payment_type) || !C7384Etj.areEqual(this.payment_id, walletPaymentOptionJson.payment_id) || !C7384Etj.areEqual(this.payment_method_label, walletPaymentOptionJson.payment_method_label) || !C7384Etj.areEqual(this.display_name, walletPaymentOptionJson.display_name) || !C7384Etj.areEqual(this.card_brand, walletPaymentOptionJson.card_brand) || !C7384Etj.areEqual(this.brand, walletPaymentOptionJson.brand) || !C7384Etj.areEqual(this.network, walletPaymentOptionJson.network) || !C7384Etj.areEqual(this.card_info, walletPaymentOptionJson.card_info) || !C7384Etj.areEqual(this.card_last4, walletPaymentOptionJson.card_last4) || !C7384Etj.areEqual(this.is_eligible, walletPaymentOptionJson.is_eligible) || !C7384Etj.areEqual(this.balance, walletPaymentOptionJson.balance)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WalletPaymentOption toDomainOrNull$default(WalletPaymentOptionJson walletPaymentOptionJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return walletPaymentOptionJson.toDomainOrNull(str, str2);
    }

    public final String component1() {
        return this.payment_method;
    }

    public final String component10() {
        return this.card_last4;
    }

    public final Boolean component11() {
        return this.is_eligible;
    }

    public final WalletBalanceJson component12() {
        return this.balance;
    }

    public final String component2() {
        return this.payment_type;
    }

    public final String component3() {
        return this.payment_id;
    }

    public final String component4() {
        return this.payment_method_label;
    }

    public final String component5() {
        return this.display_name;
    }

    public final String component6() {
        return this.card_brand;
    }

    public final String component7() {
        return this.brand;
    }

    public final String component8() {
        return this.network;
    }

    public final WalletCardInfoJson component9() {
        return this.card_info;
    }

    public final WalletPaymentOptionJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, WalletCardInfoJson walletCardInfoJson, String str9, Boolean bool, WalletBalanceJson walletBalanceJson) {
        return new WalletPaymentOptionJson(str, str2, str3, str4, str5, str6, str7, str8, walletCardInfoJson, str9, bool, walletBalanceJson);
    }

    public final WalletBalanceJson getBalance() {
        return this.balance;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getCard_brand() {
        return this.card_brand;
    }

    public final WalletCardInfoJson getCard_info() {
        return this.card_info;
    }

    public final String getCard_last4() {
        return this.card_last4;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getNetwork() {
        return this.network;
    }

    public final String getPayment_id() {
        return this.payment_id;
    }

    public final String getPayment_method() {
        return this.payment_method;
    }

    public final String getPayment_method_label() {
        return this.payment_method_label;
    }

    public final String getPayment_type() {
        return this.payment_type;
    }

    public int hashCode() {
        return (((((((((((((((((((((AnonymousClass006.A0G(this.payment_method) * 31) + AnonymousClass006.A0G(this.payment_type)) * 31) + AnonymousClass006.A0G(this.payment_id)) * 31) + AnonymousClass006.A0G(this.payment_method_label)) * 31) + AnonymousClass006.A0G(this.display_name)) * 31) + AnonymousClass006.A0G(this.card_brand)) * 31) + AnonymousClass006.A0G(this.brand)) * 31) + AnonymousClass006.A0G(this.network)) * 31) + AnonymousClass006.A0D(this.card_info)) * 31) + AnonymousClass006.A0G(this.card_last4)) * 31) + AnonymousClass006.A0D(this.is_eligible)) * 31) + C3cH.A02(this.balance);
    }

    public final Boolean is_eligible() {
        return this.is_eligible;
    }

    public final WalletPaymentOption toDomainOrNull(String str, String str2) {
        String strTrimToNonEmpty;
        String strTrimToNonEmpty2;
        String str3;
        String str4;
        String strA0Z = C3cI.A0Z(this.payment_id);
        String str5 = this.payment_method;
        if (str5 == null || (strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str5)) == null) {
            strTrimToNonEmpty = str != null ? HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str) : null;
        }
        if (strA0Z == null || strTrimToNonEmpty == null) {
            CFK.A04(HatchAgentPermissionsRepositoryJsonKt.TAG, FGI.A0d("Dropping payment option with missing payment_id or payment_method: id=", strA0Z, " method=", strTrimToNonEmpty));
            return null;
        }
        String str6 = this.payment_type;
        String strTrimToNonEmpty3 = str6 != null ? HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str6) : null;
        String str7 = this.payment_method_label;
        String strTrimToNonEmpty4 = str7 != null ? HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str7) : null;
        String str8 = this.display_name;
        if (str8 == null || (strTrimToNonEmpty2 = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str8)) == null) {
            strTrimToNonEmpty2 = str2 != null ? HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str2) : null;
        }
        String strA0Z2 = C3cI.A0Z(this.card_brand);
        String strA0Z3 = C3cI.A0Z(this.brand);
        String strA0Z4 = C3cI.A0Z(this.network);
        WalletCardInfoJson walletCardInfoJson = this.card_info;
        String strTrimToNonEmpty5 = (walletCardInfoJson == null || (str4 = walletCardInfoJson.brand) == null) ? null : HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str4);
        WalletCardInfoJson walletCardInfoJson2 = this.card_info;
        String str9 = (String) AbstractC0878AGe.A0G(BFI.A0F(new String[]{strA0Z2, strA0Z3, strA0Z4, strTrimToNonEmpty5, (walletCardInfoJson2 == null || (str3 = walletCardInfoJson2.network) == null) ? null : HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str3)}));
        String str10 = this.card_last4;
        String strTrimToNonEmpty6 = str10 != null ? HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str10) : null;
        Boolean bool = this.is_eligible;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        WalletBalanceJson walletBalanceJson = this.balance;
        return new WalletPaymentOption(strTrimToNonEmpty, strTrimToNonEmpty3, strA0Z, strTrimToNonEmpty4, strTrimToNonEmpty2, str9, strTrimToNonEmpty6, zBooleanValue, walletBalanceJson != null ? walletBalanceJson.toDomainOrNull() : null);
    }

    public WalletPaymentOptionJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, WalletCardInfoJson walletCardInfoJson, String str9, Boolean bool, WalletBalanceJson walletBalanceJson) {
        this.payment_method = str;
        this.payment_type = str2;
        this.payment_id = str3;
        this.payment_method_label = str4;
        this.display_name = str5;
        this.card_brand = str6;
        this.brand = str7;
        this.network = str8;
        this.card_info = walletCardInfoJson;
        this.card_last4 = str9;
        this.is_eligible = bool;
        this.balance = walletBalanceJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WalletPaymentOptionJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, WalletCardInfoJson walletCardInfoJson, String str9, Boolean bool, WalletBalanceJson walletBalanceJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : walletCardInfoJson, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : bool, (i & 2048) != 0 ? null : walletBalanceJson);
    }

    public /* synthetic */ WalletPaymentOptionJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, WalletCardInfoJson walletCardInfoJson, String str9, Boolean bool, WalletBalanceJson walletBalanceJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.payment_method = null;
        } else {
            this.payment_method = str;
        }
        if ((i & 2) == 0) {
            this.payment_type = null;
        } else {
            this.payment_type = str2;
        }
        if ((i & 4) == 0) {
            this.payment_id = null;
        } else {
            this.payment_id = str3;
        }
        if ((i & 8) == 0) {
            this.payment_method_label = null;
        } else {
            this.payment_method_label = str4;
        }
        if ((i & 16) == 0) {
            this.display_name = null;
        } else {
            this.display_name = str5;
        }
        if ((i & 32) == 0) {
            this.card_brand = null;
        } else {
            this.card_brand = str6;
        }
        if ((i & 64) == 0) {
            this.brand = null;
        } else {
            this.brand = str7;
        }
        if ((i & 128) == 0) {
            this.network = null;
        } else {
            this.network = str8;
        }
        if ((i & 256) == 0) {
            this.card_info = null;
        } else {
            this.card_info = walletCardInfoJson;
        }
        if ((i & 512) == 0) {
            this.card_last4 = null;
        } else {
            this.card_last4 = str9;
        }
        if ((i & 1024) == 0) {
            this.is_eligible = null;
        } else {
            this.is_eligible = bool;
        }
        if ((i & 2048) == 0) {
            this.balance = null;
        } else {
            this.balance = walletBalanceJson;
        }
    }

    public WalletPaymentOptionJson() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
