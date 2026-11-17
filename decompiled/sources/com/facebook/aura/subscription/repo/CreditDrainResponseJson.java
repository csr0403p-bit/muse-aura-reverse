package com.facebook.aura.subscription.repo;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cI;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CreditDrainResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final int wallets_drained;

    public final class Companion {
        public final C9hr<CreditDrainResponseJson> serializer() {
            return CreditDrainResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_subscription_repo_repo(CreditDrainResponseJson creditDrainResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || creditDrainResponseJson.wallets_drained != 0) {
            c9j5.AAK(c9iZ, 0, creditDrainResponseJson.wallets_drained);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CreditDrainResponseJson) && this.wallets_drained == ((CreditDrainResponseJson) obj).wallets_drained);
    }

    public static /* synthetic */ CreditDrainResponseJson copy$default(CreditDrainResponseJson creditDrainResponseJson, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = creditDrainResponseJson.wallets_drained;
        }
        return new CreditDrainResponseJson(i);
    }

    public final int component1() {
        return this.wallets_drained;
    }

    public final CreditDrainResponseJson copy(int i) {
        return new CreditDrainResponseJson(i);
    }

    public final int getWallets_drained() {
        return this.wallets_drained;
    }

    public int hashCode() {
        return this.wallets_drained;
    }

    public /* synthetic */ CreditDrainResponseJson(int i, int i2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.wallets_drained = 0;
        } else {
            this.wallets_drained = i2;
        }
    }

    public String toString() {
        return super.toString();
    }

    public CreditDrainResponseJson(int i) {
        this.wallets_drained = i;
    }

    public /* synthetic */ CreditDrainResponseJson(int i, int i2, C06H c06h) {
        this(C3cI.A00(i2, i));
    }

    public CreditDrainResponseJson() {
        this(0);
    }
}
