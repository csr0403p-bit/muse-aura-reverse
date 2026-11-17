package com.facebook.aura.model;

import X.AnonymousClass002;
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
/* loaded from: classes3.dex */
public final class WalletSetupOptionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String connector_id;
    public final String url;

    public final class Companion {
        public final C9hr<WalletSetupOptionJson> serializer() {
            return WalletSetupOptionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(WalletSetupOptionJson walletSetupOptionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || walletSetupOptionJson.connector_id != null) {
            c9j5.AAP(walletSetupOptionJson.connector_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || walletSetupOptionJson.url != null) {
            c9j5.AAP(walletSetupOptionJson.url, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WalletSetupOptionJson) {
                WalletSetupOptionJson walletSetupOptionJson = (WalletSetupOptionJson) obj;
                if (!C7384Etj.areEqual(this.connector_id, walletSetupOptionJson.connector_id) || !C7384Etj.areEqual(this.url, walletSetupOptionJson.url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WalletSetupOptionJson copy$default(WalletSetupOptionJson walletSetupOptionJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletSetupOptionJson.connector_id;
        }
        if ((i & 2) != 0) {
            str2 = walletSetupOptionJson.url;
        }
        return new WalletSetupOptionJson(str, str2);
    }

    public final String component1() {
        return this.connector_id;
    }

    public final String component2() {
        return this.url;
    }

    public final WalletSetupOptionJson copy(String str, String str2) {
        return new WalletSetupOptionJson(str, str2);
    }

    public final String getConnector_id() {
        return this.connector_id;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.connector_id) * 31) + AnonymousClass005.A0H(this.url);
    }

    public final WalletSetupOption toDomain() {
        String strA0l;
        String str;
        String strA0l2;
        String str2 = this.connector_id;
        if (str2 == null || (strA0l = AnonymousClass002.A0l(str2)) == null || strA0l.length() <= 0 || (str = this.url) == null || (strA0l2 = AnonymousClass002.A0l(str)) == null || strA0l2.length() <= 0) {
            return null;
        }
        return new WalletSetupOption(strA0l, strA0l2);
    }

    public WalletSetupOptionJson(String str, String str2) {
        this.connector_id = str;
        this.url = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WalletSetupOptionJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.connector_id = null;
        } else {
            this.connector_id = str;
        }
        if ((i & 2) == 0) {
            this.url = null;
        } else {
            this.url = str2;
        }
    }

    public /* synthetic */ WalletSetupOptionJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public WalletSetupOptionJson() {
        this(null, null);
    }
}
