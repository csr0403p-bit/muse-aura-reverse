package com.facebook.aura.network.transport;

import X.AnonymousClass002;
import X.C60O;
import X.C7384Etj;
import X.C9tI;
import com.facebook.aura.network.api.HttpResponseBytesKt;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes3.dex */
public abstract class HatchHttpClientKt {
    public static final long identityContentLength(HatchHttpResponseStream hatchHttpResponseStream) {
        String strA0p;
        Long lA0s;
        C7384Etj.A0Y(hatchHttpResponseStream, 0);
        String strA0p2 = C60O.A0p("Content-Encoding", hatchHttpResponseStream.headers);
        String strA0l = strA0p2 != null ? AnonymousClass002.A0l(strA0p2) : null;
        if ((strA0l != null && strA0l.length() != 0 && !strA0l.equalsIgnoreCase("identity")) || (strA0p = C60O.A0p("Content-Length", hatchHttpResponseStream.headers)) == null || (lA0s = C9tI.A0s(strA0p)) == null) {
            return -1L;
        }
        return lA0s.longValue();
    }

    public static final byte[] readBodyBytes(HatchHttpResponseStream hatchHttpResponseStream, long j) {
        byte[] boundedBytes;
        C7384Etj.A0Y(hatchHttpResponseStream, 0);
        InputStream inputStream = hatchHttpResponseStream.body;
        return (inputStream == null || (boundedBytes = HttpResponseBytesKt.readBoundedBytes(inputStream, j, identityContentLength(hatchHttpResponseStream))) == null) ? new byte[0] : boundedBytes;
    }

    public static final InputStream selfClosingBody(final HatchHttpResponseStream hatchHttpResponseStream) {
        C7384Etj.A0Y(hatchHttpResponseStream, 0);
        InputStream byteArrayInputStream = hatchHttpResponseStream.body;
        if (byteArrayInputStream == null) {
            byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
        }
        return new FilterInputStream(byteArrayInputStream) { // from class: com.facebook.aura.network.transport.HatchHttpClientKt.selfClosingBody.1
            @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    super.close();
                } finally {
                    hatchHttpResponseStream.close();
                }
            }
        };
    }

    public static /* synthetic */ byte[] readBodyBytes$default(HatchHttpResponseStream hatchHttpResponseStream, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 50331648;
        }
        return readBodyBytes(hatchHttpResponseStream, j);
    }
}
