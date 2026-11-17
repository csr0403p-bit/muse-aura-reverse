package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
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
/* loaded from: classes.dex */
public final class WalletSetupOption extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String connectorId;
    public final String url;

    public final class Companion {
        public final C9hr<WalletSetupOption> serializer() {
            return WalletSetupOption$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(WalletSetupOption walletSetupOption, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(walletSetupOption.connectorId, c9iZ, 0);
        c9j5.AAV(walletSetupOption.url, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WalletSetupOption) {
                WalletSetupOption walletSetupOption = (WalletSetupOption) obj;
                if (!C7384Etj.areEqual(this.connectorId, walletSetupOption.connectorId) || !C7384Etj.areEqual(this.url, walletSetupOption.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WalletSetupOption copy$default(WalletSetupOption walletSetupOption, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletSetupOption.connectorId;
        }
        if ((i & 2) != 0) {
            str2 = walletSetupOption.url;
        }
        AnonymousClass003.A0u(str, str2);
        return new WalletSetupOption(str, str2);
    }

    public final String component1() {
        return this.connectorId;
    }

    public final String component2() {
        return this.url;
    }

    public final String getConnectorId() {
        return this.connectorId;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.url, AnonymousClass001.A0G(this.connectorId));
    }

    public WalletSetupOption(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.connectorId = str;
        this.url = str2;
    }

    public final WalletSetupOption copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new WalletSetupOption(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WalletSetupOption(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(WalletSetupOption$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.connectorId = str;
        this.url = str2;
    }
}
