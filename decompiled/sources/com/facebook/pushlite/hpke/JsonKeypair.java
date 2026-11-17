package com.facebook.pushlite.hpke;

import X.A5G;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class JsonKeypair extends C06G {
    public static final Companion Companion = new Companion();
    public final String A00;
    public final String A01;
    public final String A02;

    public final class Companion {
        public final C9hr<JsonKeypair> serializer() {
            return A5G.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JsonKeypair) {
                JsonKeypair jsonKeypair = (JsonKeypair) obj;
                if (!C7384Etj.areEqual(this.A00, jsonKeypair.A00) || !C7384Etj.areEqual(this.A02, jsonKeypair.A02) || !C7384Etj.areEqual(this.A01, jsonKeypair.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ JsonKeypair(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            C9iI.A00(A5G.A01, i, 7);
            throw F60.createAndThrow();
        }
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A01, AnonymousClass005.A0I(this.A02, AnonymousClass001.A0G(this.A00)));
    }
}
