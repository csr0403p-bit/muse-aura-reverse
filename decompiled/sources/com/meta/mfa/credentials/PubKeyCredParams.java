package com.meta.mfa.credentials;

import X.C2hx;
import X.C7384Etj;
import X.C9gv;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PubKeyCredParams {
    public static final Companion Companion = new Companion();
    public final int alg;
    public final String type;

    public final class Companion {
        public final C9hr<PubKeyCredParams> serializer() {
            return C9gv.A00;
        }
    }

    public PubKeyCredParams(String str, int i) {
        C7384Etj.A0Y(str, 0);
        this.type = str;
        this.alg = i;
    }

    public static final /* synthetic */ void write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(PubKeyCredParams pubKeyCredParams, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(pubKeyCredParams.type, c9iZ, 0);
        c9j5.AAK(c9iZ, 1, pubKeyCredParams.alg);
    }

    public static /* synthetic */ void getAlg$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public final int getAlg() {
        return this.alg;
    }

    public final String getType() {
        return this.type;
    }

    public /* synthetic */ PubKeyCredParams(int i, String str, int i2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(C9gv.A01, i, 3);
            throw F60.createAndThrow();
        }
        this.type = str;
        this.alg = i2;
    }
}
