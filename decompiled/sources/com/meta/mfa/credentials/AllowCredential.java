package com.meta.mfa.credentials;

import X.C2hx;
import X.C7384Etj;
import X.C8QW;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class AllowCredential {
    public static final Companion Companion = new Companion();
    public final byte[] id;

    public final class Companion {
        public final C9hr<AllowCredential> serializer() {
            return C8QW.A00;
        }
    }

    public /* synthetic */ AllowCredential(int i, byte[] bArr, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(C8QW.A01, i, 1);
            throw F60.createAndThrow();
        }
        this.id = bArr;
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public final byte[] getId() {
        return this.id;
    }

    public AllowCredential(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        this.id = bArr;
    }
}
