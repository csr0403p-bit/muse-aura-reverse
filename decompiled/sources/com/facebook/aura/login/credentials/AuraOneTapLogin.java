package com.facebook.aura.login.credentials;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class AuraOneTapLogin extends C06G {
    public final String nonce;
    public final String savedAccountId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraOneTapLogin) {
                AuraOneTapLogin auraOneTapLogin = (AuraOneTapLogin) obj;
                if (!C7384Etj.areEqual(this.savedAccountId, auraOneTapLogin.savedAccountId) || !C7384Etj.areEqual(this.nonce, auraOneTapLogin.nonce)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraOneTapLogin copy$default(AuraOneTapLogin auraOneTapLogin, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = auraOneTapLogin.savedAccountId;
        }
        if ((i & 2) != 0) {
            str2 = auraOneTapLogin.nonce;
        }
        AnonymousClass003.A0u(str, str2);
        return new AuraOneTapLogin(str, str2);
    }

    public final String component1() {
        return this.savedAccountId;
    }

    public final String component2() {
        return this.nonce;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getSavedAccountId() {
        return this.savedAccountId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.nonce, AnonymousClass001.A0G(this.savedAccountId));
    }

    public AuraOneTapLogin(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.savedAccountId = str;
        this.nonce = str2;
    }

    public final AuraOneTapLogin copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new AuraOneTapLogin(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
