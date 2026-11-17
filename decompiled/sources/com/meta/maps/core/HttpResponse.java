package com.meta.maps.core;

import X.AnonymousClass003;

/* loaded from: classes6.dex */
public final class HttpResponse {
    public final IOBuf body;
    public final int statusCode;
    public final String statusLine;

    public HttpResponse(int i, String str, IOBuf iOBuf) {
        AnonymousClass003.A0x(str, iOBuf);
        this.statusCode = i;
        this.statusLine = str;
        this.body = iOBuf;
    }
}
