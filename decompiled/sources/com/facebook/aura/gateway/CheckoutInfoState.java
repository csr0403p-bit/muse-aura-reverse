package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class CheckoutInfoState extends C06G {
    public static final int $stable = 8;
    public final boolean failed;
    public final CheckoutInfo info;
    public final boolean isRefreshing;
    public final String locale;

    public CheckoutInfoState(String str, CheckoutInfo checkoutInfo, boolean z, boolean z2) {
        C7384Etj.A0Y(str, 0);
        this.locale = str;
        this.info = checkoutInfo;
        this.failed = z;
        this.isRefreshing = z2;
    }

    public final CheckoutInfoState copy(String str, CheckoutInfo checkoutInfo, boolean z, boolean z2) {
        C7384Etj.A0Y(str, 0);
        return new CheckoutInfoState(str, checkoutInfo, z, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutInfoState) {
                CheckoutInfoState checkoutInfoState = (CheckoutInfoState) obj;
                if (!C7384Etj.areEqual(this.locale, checkoutInfoState.locale) || !C7384Etj.areEqual(this.info, checkoutInfoState.info) || this.failed != checkoutInfoState.failed || this.isRefreshing != checkoutInfoState.isRefreshing) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutInfoState copy$default(CheckoutInfoState checkoutInfoState, String str, CheckoutInfo checkoutInfo, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutInfoState.locale;
        }
        if ((i & 2) != 0) {
            checkoutInfo = checkoutInfoState.info;
        }
        if ((i & 4) != 0) {
            z = checkoutInfoState.failed;
        }
        if ((i & 8) != 0) {
            z2 = checkoutInfoState.isRefreshing;
        }
        C7384Etj.A0Y(str, 0);
        return new CheckoutInfoState(str, checkoutInfo, z, z2);
    }

    public final String component1() {
        return this.locale;
    }

    public final CheckoutInfo component2() {
        return this.info;
    }

    public final boolean component3() {
        return this.failed;
    }

    public final boolean component4() {
        return this.isRefreshing;
    }

    public final boolean getFailed() {
        return this.failed;
    }

    public final CheckoutInfo getInfo() {
        return this.info;
    }

    public final String getLocale() {
        return this.locale;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01((AnonymousClass001.A0G(this.locale) + AnonymousClass006.A0D(this.info)) * 31, this.failed), this.isRefreshing);
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CheckoutInfoState(String str, CheckoutInfo checkoutInfo, boolean z, boolean z2, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : checkoutInfo, AnonymousClass005.A1O(i, z), AnonymousClass005.A1P(i, z2));
    }
}
