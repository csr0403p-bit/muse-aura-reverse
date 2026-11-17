package com.facebook.aura.network.transport.tigon.internal;

import X.AnonymousClass003;

/* loaded from: classes5.dex */
public final class ByteSegment implements MultipartSegment {
    public final byte[] body;
    public final byte[] headerBytes;

    public final byte[] getBody() {
        return this.body;
    }

    @Override // com.facebook.aura.network.transport.tigon.internal.MultipartSegment
    public byte[] getHeaderBytes() {
        return this.headerBytes;
    }

    public ByteSegment(byte[] bArr, byte[] bArr2) {
        AnonymousClass003.A0u(bArr, bArr2);
        this.headerBytes = bArr;
        this.body = bArr2;
    }
}
