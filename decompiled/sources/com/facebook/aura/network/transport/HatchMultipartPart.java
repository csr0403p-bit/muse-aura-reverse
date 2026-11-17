package com.facebook.aura.network.transport;

import X.AnonymousClass005;

/* loaded from: classes5.dex */
public final class HatchMultipartPart {
    public final byte[] bytes;
    public final String contentType;
    public final String filename;
    public final String name;

    public HatchMultipartPart(String str, String str2, String str3, byte[] bArr) {
        AnonymousClass005.A11(str, str3, bArr, 0);
        this.name = str;
        this.filename = str2;
        this.contentType = str3;
        this.bytes = bArr;
    }

    public final byte[] getBytes() {
        return this.bytes;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getName() {
        return this.name;
    }
}
