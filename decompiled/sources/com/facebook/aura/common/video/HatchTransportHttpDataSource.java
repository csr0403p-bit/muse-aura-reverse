package com.facebook.aura.common.video;

import X.AGH;
import X.AbstractC3074BxD;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BV4;
import X.C1O;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C9tI;
import X.CX1;
import X.CX9;
import X.InterfaceC4891DDk;
import android.net.Uri;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import com.facebook.aura.network.transport.HatchHttpResponseStream;
import com.facebook.aura.network.transport.HatchRequestPurpose;
import com.facebook.aura.network.transport.cache.CachingHatchHttpClientKt;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class HatchTransportHttpDataSource extends CX9 implements InterfaceC4891DDk {
    public long bytesRemaining;
    public final CX1 defaultRequestProperties;
    public final Long idleTimeoutMs;
    public InputStream inputStream;
    public boolean opened;
    public C1O openedDataSpec;
    public final HatchRequestPurpose purpose;
    public final CX1 requestProperties;
    public int responseCode;
    public Map<String, ? extends List<String>> responseHeaders;
    public HatchHttpResponseStream responseStream;
    public final String userAgent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTransportHttpDataSource(String str, CX1 cx1, HatchRequestPurpose hatchRequestPurpose, Long l) {
        super(true);
        AnonymousClass002.A1A(cx1, 1, hatchRequestPurpose);
        this.userAgent = str;
        this.defaultRequestProperties = cx1;
        this.purpose = hatchRequestPurpose;
        this.idleTimeoutMs = l;
        this.requestProperties = new CX1();
        this.bytesRemaining = -1L;
        this.responseCode = -1;
        this.responseHeaders = AGH.A0E();
    }

    public void clearRequestProperty(String str) {
        C7384Etj.A0Y(str, 0);
        CX1 cx1 = this.requestProperties;
        synchronized (cx1) {
            cx1.A00 = null;
            cx1.A01.remove(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0129  */
    @Override // X.C1J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long open(X.C1O r17) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.common.video.HatchTransportHttpDataSource.open(X.C1O):long");
    }

    @Override // X.C1L
    public int read(byte[] bArr, int i, int i2) throws HttpDataSource$HttpDataSourceException {
        int i3;
        C7384Etj.A0Y(bArr, 0);
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j != 0) {
            if (j != -1) {
                i2 = BV4.A01(i2, j);
            }
            try {
                InputStream inputStream = this.inputStream;
                if (inputStream != null && (i3 = inputStream.read(bArr, i, i2)) != -1) {
                    long j2 = this.bytesRemaining;
                    if (j2 != -1) {
                        this.bytesRemaining = j2 - i3;
                    }
                    bytesTransferred(i3);
                    return i3;
                }
            } catch (IOException e) {
                C1O c1o = this.openedDataSpec;
                if (c1o == null) {
                    c1o = new C1O(Uri.EMPTY, null, 0L, -1L);
                }
                throw HttpDataSource$HttpDataSourceException.A00(c1o, e, 2);
            }
        }
        return -1;
    }

    private final long documentSize(HatchHttpResponseStream hatchHttpResponseStream) {
        Long lA0s;
        int i = this.responseCode;
        Map<String, String> map = hatchHttpResponseStream.headers;
        if (i == 206) {
            return AbstractC3074BxD.A00(C60O.A0p("Content-Range", map));
        }
        String strA0p = C60O.A0p("Content-Length", map);
        if (strA0p == null || (lA0s = C9tI.A0s(strA0p)) == null) {
            return -1L;
        }
        return lA0s.longValue();
    }

    private final void skipFully(InputStream inputStream, long j, C1O c1o) throws IOException {
        byte[] bArr = new byte[8192];
        while (j > 0) {
            try {
                int i = inputStream.read(bArr, 0, BV4.A01(j, 8192L));
                if (i == -1) {
                    throw new HttpDataSource$HttpDataSourceException(c1o);
                }
                j -= i;
                bytesTransferred(i);
            } catch (IOException e) {
                close();
                if (!(e instanceof HttpDataSource$HttpDataSourceException)) {
                    throw HttpDataSource$HttpDataSourceException.A00(c1o, e, 1);
                }
                throw e;
            }
        }
    }

    public void clearAllRequestProperties() {
        CX1 cx1 = this.requestProperties;
        synchronized (cx1) {
            cx1.A00 = null;
            cx1.A01.clear();
        }
    }

    @Override // X.C1J
    public void close() {
        boolean z = this.opened;
        this.opened = false;
        this.openedDataSpec = null;
        this.bytesRemaining = -1L;
        this.inputStream = null;
        this.responseCode = -1;
        this.responseHeaders = AGH.A0E();
        HatchHttpResponseStream hatchHttpResponseStream = this.responseStream;
        if (hatchHttpResponseStream != null) {
            hatchHttpResponseStream.close();
        }
        this.responseStream = null;
        if (z) {
            transferEnded();
        }
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    @Override // X.CX9, X.C1J
    public Map<String, List<String>> getResponseHeaders() {
        return this.responseHeaders;
    }

    @Override // X.C1J
    public Uri getUri() {
        C1O c1o = this.openedDataSpec;
        if (c1o != null) {
            return c1o.A06;
        }
        return null;
    }

    private final Map<String, String> buildRequestHeaders(C1O c1o) {
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        linkedHashMapA0j.putAll(this.defaultRequestProperties.A00());
        linkedHashMapA0j.putAll(this.requestProperties.A00());
        linkedHashMapA0j.putAll(c1o.A09);
        String str = this.userAgent;
        if (str != null && str.length() != 0) {
            linkedHashMapA0j.put("User-Agent", str);
        }
        linkedHashMapA0j.put("Accept-Encoding", (c1o.A00 & 1) == 1 ? "gzip" : "identity");
        String strA02 = AbstractC3074BxD.A02(c1o.A04, c1o.A03);
        if (strA02 != null) {
            linkedHashMapA0j.put(CachingHatchHttpClientKt.RANGE_HEADER, strA02);
        }
        return linkedHashMapA0j;
    }

    public void setRequestProperty(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        CX1 cx1 = this.requestProperties;
        synchronized (cx1) {
            cx1.A00 = null;
            cx1.A01.put(str, str2);
        }
    }
}
