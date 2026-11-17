package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.C06G;
import X.C3cI;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class WalletBalance extends C06G {
    public static final int $stable = 0;
    public final long amount;
    public final String currency;

    public WalletBalance(long j, String str) {
        C7384Etj.A0Y(str, 1);
        this.amount = j;
        this.currency = str;
    }

    public final WalletBalance copy(long j, String str) {
        C7384Etj.A0Y(str, 1);
        return new WalletBalance(j, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WalletBalance) {
                WalletBalance walletBalance = (WalletBalance) obj;
                if (this.amount != walletBalance.amount || !C7384Etj.areEqual(this.currency, walletBalance.currency)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WalletBalance copy$default(WalletBalance walletBalance, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = walletBalance.amount;
        }
        if ((i & 2) != 0) {
            str = walletBalance.currency;
        }
        C7384Etj.A0Y(str, 1);
        return new WalletBalance(j, str);
    }

    public final long component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.currency, C3cI.A01(this.amount));
    }

    public String toString() {
        return super.toString();
    }
}
