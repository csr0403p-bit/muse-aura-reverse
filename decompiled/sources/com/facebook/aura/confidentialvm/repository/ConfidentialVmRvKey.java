package com.facebook.aura.confidentialvm.repository;

import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.G0U;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class ConfidentialVmRvKey implements AutoCloseable {
    public byte[] bytes;

    public ConfidentialVmRvKey(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        this.bytes = bArr;
        if (bArr.length != 32) {
            throw C60O.A0i("RV key must be 32 bytes");
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [byte[], java.lang.Object] */
    public final <T> T consume(G0U<? super byte[], ? extends T> g0u) {
        C7384Etj.A0Y(g0u, 0);
        ?? r3 = this.bytes;
        if (r3 == 0) {
            throw C3cG.A0Q("RV key has already been consumed");
        }
        try {
            return g0u.invoke(r3);
        } finally {
            Arrays.fill((byte[]) r3, 0, r3.length, (byte) 0);
            this.bytes = null;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        byte[] bArr = this.bytes;
        if (bArr != null) {
            Arrays.fill(bArr, 0, bArr.length, (byte) 0);
        }
        this.bytes = null;
    }
}
