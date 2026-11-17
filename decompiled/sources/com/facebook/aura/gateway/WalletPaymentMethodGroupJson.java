package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class WalletPaymentMethodGroupJson extends C06G {
    public static final int $stable = 8;
    public final String display_name;
    public final String payment_method;
    public final List<WalletPaymentOptionJson> payment_options;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, WalletPaymentMethodGroupJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<WalletPaymentMethodGroupJson> serializer() {
            return WalletPaymentMethodGroupJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public WalletPaymentMethodGroupJson(String str, String str2, List<WalletPaymentOptionJson> list) {
        C7384Etj.A0Y(list, 2);
        this.payment_method = str;
        this.display_name = str2;
        this.payment_options = list;
    }

    public final WalletPaymentMethodGroupJson copy(String str, String str2, List<WalletPaymentOptionJson> list) {
        C7384Etj.A0Y(list, 2);
        return new WalletPaymentMethodGroupJson(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WalletPaymentMethodGroupJson) {
                WalletPaymentMethodGroupJson walletPaymentMethodGroupJson = (WalletPaymentMethodGroupJson) obj;
                if (!C7384Etj.areEqual(this.payment_method, walletPaymentMethodGroupJson.payment_method) || !C7384Etj.areEqual(this.display_name, walletPaymentMethodGroupJson.display_name) || !C7384Etj.areEqual(this.payment_options, walletPaymentMethodGroupJson.payment_options)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletPaymentMethodGroupJson copy$default(WalletPaymentMethodGroupJson walletPaymentMethodGroupJson, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletPaymentMethodGroupJson.payment_method;
        }
        if ((i & 2) != 0) {
            str2 = walletPaymentMethodGroupJson.display_name;
        }
        if ((i & 4) != 0) {
            list = walletPaymentMethodGroupJson.payment_options;
        }
        return walletPaymentMethodGroupJson.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(WalletPaymentMethodGroupJson walletPaymentMethodGroupJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || walletPaymentMethodGroupJson.payment_method != null) {
            c9j5.AAP(walletPaymentMethodGroupJson.payment_method, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || walletPaymentMethodGroupJson.display_name != null) {
            c9j5.AAP(walletPaymentMethodGroupJson.display_name, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(walletPaymentMethodGroupJson.payment_options)) {
            c9j5.AAQ(walletPaymentMethodGroupJson.payment_options, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.payment_method;
    }

    public final String component2() {
        return this.display_name;
    }

    public final List<WalletPaymentOptionJson> component3() {
        return this.payment_options;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final String getPayment_method() {
        return this.payment_method;
    }

    public final List<WalletPaymentOptionJson> getPayment_options() {
        return this.payment_options;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.payment_options, ((AnonymousClass006.A0G(this.payment_method) * 31) + AnonymousClass005.A0H(this.display_name)) * 31);
    }

    public final List<WalletPaymentOption> toDomainOptions() {
        String strTrimToNonEmpty;
        String str = this.payment_method;
        if (str == null || (strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str)) == null) {
            return C0881AGi.A00;
        }
        List<WalletPaymentOptionJson> list = this.payment_options;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<WalletPaymentOptionJson> it = list.iterator();
        while (it.hasNext()) {
            WalletPaymentOption domainOrNull = it.next().toDomainOrNull(strTrimToNonEmpty, this.display_name);
            if (domainOrNull != null) {
                arrayListA0h.add(domainOrNull);
            }
        }
        return arrayListA0h;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WalletPaymentMethodGroupJson(int i, String str, String str2, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.payment_method = null;
        } else {
            this.payment_method = str;
        }
        if ((i & 2) == 0) {
            this.display_name = null;
        } else {
            this.display_name = str2;
        }
        if ((i & 4) == 0) {
            this.payment_options = C0881AGi.A00;
        } else {
            this.payment_options = list;
        }
    }

    public /* synthetic */ WalletPaymentMethodGroupJson(String str, String str2, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, C3cI.A12(list, i));
    }

    public WalletPaymentMethodGroupJson() {
        this(null, null, C0881AGi.A00);
    }
}
