package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class WalletSetRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String approval_id;
    public final String payment_id;
    public final String payment_method;
    public final String payment_type;

    public final class Companion {
        public final C9hr<WalletSetRequestJson> serializer() {
            return WalletSetRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(WalletSetRequestJson walletSetRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(walletSetRequestJson.approval_id, c9iZ, 0);
        c9j5.AAV(walletSetRequestJson.payment_method, c9iZ, 1);
        c9j5.AAV(walletSetRequestJson.payment_type, c9iZ, 2);
        c9j5.AAV(walletSetRequestJson.payment_id, c9iZ, 3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WalletSetRequestJson) {
                WalletSetRequestJson walletSetRequestJson = (WalletSetRequestJson) obj;
                if (!C7384Etj.areEqual(this.approval_id, walletSetRequestJson.approval_id) || !C7384Etj.areEqual(this.payment_method, walletSetRequestJson.payment_method) || !C7384Etj.areEqual(this.payment_type, walletSetRequestJson.payment_type) || !C7384Etj.areEqual(this.payment_id, walletSetRequestJson.payment_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WalletSetRequestJson copy$default(WalletSetRequestJson walletSetRequestJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletSetRequestJson.approval_id;
        }
        if ((i & 2) != 0) {
            str2 = walletSetRequestJson.payment_method;
        }
        if ((i & 4) != 0) {
            str3 = walletSetRequestJson.payment_type;
        }
        if ((i & 8) != 0) {
            str4 = walletSetRequestJson.payment_id;
        }
        return walletSetRequestJson.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.approval_id;
    }

    public final String component2() {
        return this.payment_method;
    }

    public final String component3() {
        return this.payment_type;
    }

    public final String component4() {
        return this.payment_id;
    }

    public final String getApproval_id() {
        return this.approval_id;
    }

    public final String getPayment_id() {
        return this.payment_id;
    }

    public final String getPayment_method() {
        return this.payment_method;
    }

    public final String getPayment_type() {
        return this.payment_type;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.payment_id, AnonymousClass005.A0I(this.payment_type, AnonymousClass005.A0I(this.payment_method, AnonymousClass001.A0G(this.approval_id))));
    }

    public WalletSetRequestJson(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.approval_id = str;
        this.payment_method = str2;
        this.payment_type = str3;
        this.payment_id = str4;
    }

    public final WalletSetRequestJson copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new WalletSetRequestJson(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WalletSetRequestJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(WalletSetRequestJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.approval_id = str;
        this.payment_method = str2;
        this.payment_type = str3;
        this.payment_id = str4;
    }
}
