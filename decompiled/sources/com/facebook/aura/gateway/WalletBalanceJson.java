package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class WalletBalanceJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final long amount;
    public final String currency;

    public final class Companion {
        public final C9hr<WalletBalanceJson> serializer() {
            return WalletBalanceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public WalletBalanceJson(long j, String str) {
        C7384Etj.A0Y(str, 1);
        this.amount = j;
        this.currency = str;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(WalletBalanceJson walletBalanceJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAN(c9iZ, 0, walletBalanceJson.amount);
        c9j5.AAV(walletBalanceJson.currency, c9iZ, 1);
    }

    public final WalletBalanceJson copy(long j, String str) {
        C7384Etj.A0Y(str, 1);
        return new WalletBalanceJson(j, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WalletBalanceJson) {
                WalletBalanceJson walletBalanceJson = (WalletBalanceJson) obj;
                if (this.amount != walletBalanceJson.amount || !C7384Etj.areEqual(this.currency, walletBalanceJson.currency)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WalletBalanceJson copy$default(WalletBalanceJson walletBalanceJson, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = walletBalanceJson.amount;
        }
        if ((i & 2) != 0) {
            str = walletBalanceJson.currency;
        }
        C7384Etj.A0Y(str, 1);
        return new WalletBalanceJson(j, str);
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

    public final WalletBalance toDomainOrNull() {
        if (this.amount < 0) {
            return null;
        }
        String str = this.currency;
        if (str.length() != 3) {
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ('A' > cCharAt) {
                return null;
            }
            if (cCharAt >= '[' && ('a' > cCharAt || cCharAt >= '{')) {
                return null;
            }
        }
        return new WalletBalance(this.amount, this.currency);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WalletBalanceJson(int i, long j, String str, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(WalletBalanceJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.amount = j;
        this.currency = str;
    }
}
