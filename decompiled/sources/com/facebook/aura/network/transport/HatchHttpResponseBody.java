package com.facebook.aura.network.transport;

import X.C06H;
import X.C7384Etj;
import com.facebook.aura.network.api.HttpResponseBytesKt;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class HatchHttpResponseBody implements Closeable {
    public final long sizeHint;
    public final InputStream stream;

    public HatchHttpResponseBody(InputStream inputStream, long j) {
        C7384Etj.A0Y(inputStream, 0);
        this.stream = inputStream;
        this.sizeHint = j;
    }

    public final InputStream byteStream() {
        return this.stream;
    }

    public final byte[] bytes() {
        return HttpResponseBytesKt.readBoundedBytes(this.stream, 50331648L, this.sizeHint);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final String string() throws IOException {
        InputStream inputStream = this.stream;
        try {
            String boundedString = HttpResponseBytesKt.readBoundedString(inputStream, 50331648L, this.sizeHint);
            if (inputStream != null) {
                inputStream.close();
            }
            return boundedString;
        } finally {
        }
    }

    public /* synthetic */ HatchHttpResponseBody(InputStream inputStream, long j, int i, C06H c06h) {
        this(inputStream, (i & 2) != 0 ? -1L : j);
    }
}
