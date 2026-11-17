package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class NativeLoginGoogleCredential extends C06G {
    public static final int $stable = 0;
    public final String email;
    public final String idToken;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeLoginGoogleCredential) {
                NativeLoginGoogleCredential nativeLoginGoogleCredential = (NativeLoginGoogleCredential) obj;
                if (!C7384Etj.areEqual(this.email, nativeLoginGoogleCredential.email) || !C7384Etj.areEqual(this.idToken, nativeLoginGoogleCredential.idToken)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NativeLoginGoogleCredential copy$default(NativeLoginGoogleCredential nativeLoginGoogleCredential, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeLoginGoogleCredential.email;
        }
        if ((i & 2) != 0) {
            str2 = nativeLoginGoogleCredential.idToken;
        }
        AnonymousClass003.A0u(str, str2);
        return new NativeLoginGoogleCredential(str, str2);
    }

    public final String component1() {
        return this.email;
    }

    public final String component2() {
        return this.idToken;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getIdToken() {
        return this.idToken;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.idToken, AnonymousClass001.A0G(this.email));
    }

    public NativeLoginGoogleCredential(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.email = str;
        this.idToken = str2;
    }

    public final NativeLoginGoogleCredential copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new NativeLoginGoogleCredential(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
