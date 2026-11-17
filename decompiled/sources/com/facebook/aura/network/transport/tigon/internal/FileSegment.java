package com.facebook.aura.network.transport.tigon.internal;

import X.AnonymousClass003;
import java.io.File;

/* loaded from: classes5.dex */
public final class FileSegment implements MultipartSegment {
    public final long capturedLength;
    public final File file;
    public final byte[] headerBytes;

    public final long getCapturedLength() {
        return this.capturedLength;
    }

    public final File getFile() {
        return this.file;
    }

    @Override // com.facebook.aura.network.transport.tigon.internal.MultipartSegment
    public byte[] getHeaderBytes() {
        return this.headerBytes;
    }

    public FileSegment(byte[] bArr, File file, long j) {
        AnonymousClass003.A0u(bArr, file);
        this.headerBytes = bArr;
        this.file = file;
        this.capturedLength = j;
    }
}
