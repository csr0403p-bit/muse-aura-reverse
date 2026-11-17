package com.facebook.aura.agentpermission;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class WalletOptionKey extends C06G {
    public static final int $stable = 0;
    public final String paymentId;
    public final String paymentMethod;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WalletOptionKey) {
                WalletOptionKey walletOptionKey = (WalletOptionKey) obj;
                if (!C7384Etj.areEqual(this.paymentMethod, walletOptionKey.paymentMethod) || !C7384Etj.areEqual(this.paymentId, walletOptionKey.paymentId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WalletOptionKey copy$default(WalletOptionKey walletOptionKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletOptionKey.paymentMethod;
        }
        if ((i & 2) != 0) {
            str2 = walletOptionKey.paymentId;
        }
        AnonymousClass003.A0u(str, str2);
        return new WalletOptionKey(str, str2);
    }

    public final String component1() {
        return this.paymentMethod;
    }

    public final String component2() {
        return this.paymentId;
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.paymentId, AnonymousClass001.A0G(this.paymentMethod));
    }

    public WalletOptionKey(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.paymentMethod = str;
        this.paymentId = str2;
    }

    public final WalletOptionKey copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new WalletOptionKey(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
