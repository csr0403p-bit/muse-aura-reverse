package com.meta.mfa.credentials;

import X.AnonymousClass003;
import X.C2hx;
import X.C9gl;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class RelyingParty {
    public static final Companion Companion = new Companion();
    public final String id;
    public final String name;

    public final class Companion {
        public final C9hr<RelyingParty> serializer() {
            return C9gl.A00;
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(RelyingParty relyingParty, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(relyingParty.id, c9iZ, 0);
        c9j5.AAV(relyingParty.name, c9iZ, 1);
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public RelyingParty(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.name = str2;
    }

    public /* synthetic */ RelyingParty(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(C9gl.A01, i, 3);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.name = str2;
    }
}
