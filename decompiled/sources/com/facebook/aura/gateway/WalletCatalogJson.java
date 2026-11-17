package com.facebook.aura.gateway;

import X.AbstractC0882AGj;
import X.C06G;
import X.C06H;
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
public final class WalletCatalogJson extends C06G {
    public static final int $stable = 8;
    public final List<WalletPaymentMethodGroupJson> payment_methods;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, WalletCatalogJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<WalletCatalogJson> serializer() {
            return WalletCatalogJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final WalletCatalogJson copy(List<WalletPaymentMethodGroupJson> list) {
        C7384Etj.A0Y(list, 0);
        return new WalletCatalogJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof WalletCatalogJson) && C7384Etj.areEqual(this.payment_methods, ((WalletCatalogJson) obj).payment_methods));
    }

    public static /* synthetic */ WalletCatalogJson copy$default(WalletCatalogJson walletCatalogJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = walletCatalogJson.payment_methods;
        }
        C7384Etj.A0Y(list, 0);
        return new WalletCatalogJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(WalletCatalogJson walletCatalogJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C3cG.A1L(walletCatalogJson.payment_methods)) {
            c9j5.AAQ(walletCatalogJson.payment_methods, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<WalletPaymentMethodGroupJson> component1() {
        return this.payment_methods;
    }

    public final List<WalletPaymentMethodGroupJson> getPayment_methods() {
        return this.payment_methods;
    }

    public int hashCode() {
        return this.payment_methods.hashCode();
    }

    public final WalletCatalog toDomain() {
        List<WalletPaymentMethodGroupJson> list = this.payment_methods;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<WalletPaymentMethodGroupJson> it = list.iterator();
        while (it.hasNext()) {
            AbstractC0882AGj.A0r(it.next().toDomainOptions(), arrayListA0h);
        }
        return new WalletCatalog(arrayListA0h);
    }

    public /* synthetic */ WalletCatalogJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.payment_methods = C0881AGi.A00;
        } else {
            this.payment_methods = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public WalletCatalogJson(List<WalletPaymentMethodGroupJson> list) {
        C7384Etj.A0Y(list, 0);
        this.payment_methods = list;
    }

    public /* synthetic */ WalletCatalogJson(List list, int i, C06H c06h) {
        this(C3cI.A10(list, i));
    }

    public WalletCatalogJson() {
        this(C0881AGi.A00);
    }
}
