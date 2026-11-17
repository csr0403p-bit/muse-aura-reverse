package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class WalletCardInfoJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String brand;
    public final String network;

    public final class Companion {
        public final C9hr<WalletCardInfoJson> serializer() {
            return WalletCardInfoJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(WalletCardInfoJson walletCardInfoJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || walletCardInfoJson.brand != null) {
            c9j5.AAP(walletCardInfoJson.brand, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || walletCardInfoJson.network != null) {
            c9j5.AAP(walletCardInfoJson.network, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WalletCardInfoJson) {
                WalletCardInfoJson walletCardInfoJson = (WalletCardInfoJson) obj;
                if (!C7384Etj.areEqual(this.brand, walletCardInfoJson.brand) || !C7384Etj.areEqual(this.network, walletCardInfoJson.network)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WalletCardInfoJson copy$default(WalletCardInfoJson walletCardInfoJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletCardInfoJson.brand;
        }
        if ((i & 2) != 0) {
            str2 = walletCardInfoJson.network;
        }
        return new WalletCardInfoJson(str, str2);
    }

    public final String component1() {
        return this.brand;
    }

    public final String component2() {
        return this.network;
    }

    public final WalletCardInfoJson copy(String str, String str2) {
        return new WalletCardInfoJson(str, str2);
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getNetwork() {
        return this.network;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.brand) * 31) + AnonymousClass005.A0H(this.network);
    }

    public WalletCardInfoJson(String str, String str2) {
        this.brand = str;
        this.network = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WalletCardInfoJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.brand = null;
        } else {
            this.brand = str;
        }
        if ((i & 2) == 0) {
            this.network = null;
        } else {
            this.network = str2;
        }
    }

    public /* synthetic */ WalletCardInfoJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public WalletCardInfoJson() {
        this(null, null);
    }
}
