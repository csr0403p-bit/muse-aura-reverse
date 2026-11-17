package com.facebook.aura.network.api;

import X.C7384Etj;
import java.io.ByteArrayOutputStream;

/* loaded from: classes5.dex */
public final class UncopiedByteArrayOutputStream extends ByteArrayOutputStream {
    public final byte[] takeByteArray() {
        int i = ((ByteArrayOutputStream) this).count;
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        return i != bArr.length ? C7384Etj.A0d(this) : bArr;
    }

    public UncopiedByteArrayOutputStream(int i) {
        super(i);
    }
}
