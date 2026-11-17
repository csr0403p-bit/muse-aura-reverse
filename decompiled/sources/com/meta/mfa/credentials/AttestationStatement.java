package com.meta.mfa.credentials;

import X.AnonymousClass003;
import X.BUV;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9tf;
import X.C9uU;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class AttestationStatement {
    public final int alg;
    public final byte[] sig;
    public final List<byte[]> x5c;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, new BUV(13));

    public final class Companion {
        public final C9hr<AttestationStatement> serializer() {
            return C9uU.A00;
        }
    }

    public static /* synthetic */ void getAlg$annotations() {
    }

    public static /* synthetic */ void getSig$annotations() {
    }

    public static /* synthetic */ void getX5c$annotations() {
    }

    public static final /* synthetic */ void write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(AttestationStatement attestationStatement, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAK(c9iZ, 0, attestationStatement.alg);
        c9j5.AAQ(attestationStatement.sig, C9tf.A00, c9iZ, 1);
        c9j5.AAQ(attestationStatement.x5c, C3cH.A15(f0cArr, 2), c9iZ, 2);
    }

    public final int getAlg() {
        return this.alg;
    }

    public final byte[] getSig() {
        return this.sig;
    }

    public final List<byte[]> getX5c() {
        return this.x5c;
    }

    public AttestationStatement(int i, byte[] bArr, List<byte[]> list) {
        AnonymousClass003.A0x(bArr, list);
        this.alg = i;
        this.sig = bArr;
        this.x5c = list;
    }

    public /* synthetic */ AttestationStatement(int i, int i2, byte[] bArr, List list, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(C9uU.A01, i, 7);
            throw F60.createAndThrow();
        }
        this.alg = i2;
        this.sig = bArr;
        this.x5c = list;
    }
}
