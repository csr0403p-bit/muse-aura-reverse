package com.facebook.aura.network.transport.flipper;

import X.C7384Etj;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class CapturedBody {
    public final byte[] prefix;
    public final InputStream tail;

    public CapturedBody(byte[] bArr, InputStream inputStream) {
        C7384Etj.A0Y(bArr, 0);
        this.prefix = bArr;
        this.tail = inputStream;
    }

    public final byte[] getPrefix() {
        return this.prefix;
    }

    public final InputStream getTail() {
        return this.tail;
    }
}
