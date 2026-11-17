package com.facebook.aura.gateway;

import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class WalletCatalog extends C06G {
    public static final int $stable = 8;
    public final List<WalletPaymentOption> paymentOptions;

    public WalletCatalog(List<WalletPaymentOption> list) {
        C7384Etj.A0Y(list, 0);
        this.paymentOptions = list;
    }

    public final WalletCatalog copy(List<WalletPaymentOption> list) {
        C7384Etj.A0Y(list, 0);
        return new WalletCatalog(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof WalletCatalog) && C7384Etj.areEqual(this.paymentOptions, ((WalletCatalog) obj).paymentOptions));
    }

    public static /* synthetic */ WalletCatalog copy$default(WalletCatalog walletCatalog, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = walletCatalog.paymentOptions;
        }
        C7384Etj.A0Y(list, 0);
        return new WalletCatalog(list);
    }

    public final List<WalletPaymentOption> component1() {
        return this.paymentOptions;
    }

    public final List<WalletPaymentOption> getPaymentOptions() {
        return this.paymentOptions;
    }

    public int hashCode() {
        return this.paymentOptions.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
