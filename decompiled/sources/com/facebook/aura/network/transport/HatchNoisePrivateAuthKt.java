package com.facebook.aura.network.transport;

import X.C7384Etj;
import X.C9zv;
import java.security.MessageDigest;

/* loaded from: classes5.dex */
public abstract class HatchNoisePrivateAuthKt {
    public static final int RV_KEY_SIZE_BYTES = 32;

    public static final boolean isCvmHostDataFor(byte[] bArr, byte[] bArr2) {
        C7384Etj.A0Y(bArr, 0);
        return bArr2 != null && bArr.length == 32 && MessageDigest.isEqual(bArr2, C9zv.A00(bArr));
    }
}
