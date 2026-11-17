package X;

import android.net.Uri;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import com.facebook.aura.network.transport.cache.CachingHatchHttpClientKt;
import com.facebook.tigon.iface.TigonRequest;
import com.google.common.collect.RegularImmutableMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* loaded from: classes5.dex */
public final class CWy extends CX9 implements InterfaceC4891DDk {
    public long A00;
    public long A01;
    public InputStream A02;
    public int A03;
    public C1O A04;
    public HttpURLConnection A05;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final CX1 A09;
    public final CX1 A0A;
    public final String A0B;

    public CWy(CX1 cx1, String str, int i, int i2) {
        super(true);
        this.A0B = str;
        this.A07 = i;
        this.A08 = i2;
        this.A09 = cx1;
        this.A0A = new CX1();
    }

    private HttpURLConnection A00(URL url, Map map, byte[] bArr, int i, long j, long j2, boolean z) throws IOException {
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.A07);
        httpURLConnection.setReadTimeout(this.A08);
        HashMap mapA0u = BV4.A0u();
        mapA0u.putAll(this.A09.A00());
        mapA0u.putAll(this.A0A.A00());
        mapA0u.putAll(map);
        Iterator itA0i = C3cG.A0i(mapA0u);
        while (itA0i.hasNext()) {
            BV8.A1S(httpURLConnection, itA0i);
        }
        String strA02 = AbstractC3074BxD.A02(j, j2);
        if (strA02 != null) {
            httpURLConnection.setRequestProperty(CachingHatchHttpClientKt.RANGE_HEADER, strA02);
        }
        String str2 = this.A0B;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setDoOutput(AnonymousClass002.A1X(bArr));
        C1O c1o = C1O.$redex_init_class;
        if (i == 1) {
            str = TigonRequest.GET;
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                throw BV4.A0T();
            }
            str = TigonRequest.HEAD;
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1J
    public final void close() {
        try {
            InputStream inputStream = this.A02;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new HttpDataSource$HttpDataSourceException(this.A04, e, 2000, 3);
                }
            }
        } finally {
            this.A02 = null;
            A01();
            if (this.A06) {
                this.A06 = false;
                transferEnded();
            }
            this.A05 = null;
            this.A04 = null;
        }
    }

    private void A01() {
        HttpURLConnection httpURLConnection = this.A05;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                CNC.A05("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // X.CX9, X.C1J
    public final Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.A05;
        return httpURLConnection == null ? RegularImmutableMap.A03 : new DND(httpURLConnection.getHeaderFields());
    }

    @Override // X.C1J
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.A05;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        C1O c1o = this.A04;
        if (c1o != null) {
            return c1o.A06;
        }
        return null;
    }

    @Override // X.C1J
    public final long open(C1O c1o) throws IOException, NumberFormatException {
        byte[] bArrA00;
        this.A04 = c1o;
        long j = 0;
        this.A00 = 0L;
        this.A01 = 0L;
        transferInitializing(c1o);
        try {
            URL url = new URL(c1o.A06.toString());
            int i = c1o.A01;
            byte[] bArr = c1o.A0A;
            long j2 = c1o.A04;
            long j3 = c1o.A03;
            HttpURLConnection httpURLConnectionA00 = A00(url, c1o.A09, bArr, i, j2, j3, AnonymousClass002.A1Q(c1o.A00 & 1, 1));
            this.A05 = httpURLConnectionA00;
            this.A03 = httpURLConnectionA00.getResponseCode();
            String responseMessage = httpURLConnectionA00.getResponseMessage();
            int i2 = this.A03;
            if (i2 < 200 || i2 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionA00.getHeaderFields();
                if (this.A03 == 416 && j2 == AbstractC3074BxD.A00(httpURLConnectionA00.getHeaderField("Content-Range"))) {
                    this.A06 = true;
                    transferStarted(c1o);
                    if (j3 != -1) {
                        return j3;
                    }
                    return 0L;
                }
                InputStream errorStream = httpURLConnectionA00.getErrorStream();
                try {
                    bArrA00 = errorStream != null ? AbstractC3151Bzr.A00(errorStream) : Util.A07;
                } catch (IOException unused) {
                    bArrA00 = Util.A07;
                }
                A01();
                throw new HttpDataSource$InvalidResponseCodeException(c1o, this.A03 == 416 ? new DataSourceException() : null, responseMessage, headerFields, bArrA00, this.A03);
            }
            httpURLConnectionA00.getContentType();
            if (this.A03 == 200 && j2 != 0) {
                j = j2;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionA00.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase || j3 != -1) {
                this.A01 = j3;
            } else {
                long jA01 = AbstractC3074BxD.A01(httpURLConnectionA00.getHeaderField("Content-Length"), httpURLConnectionA00.getHeaderField("Content-Range"));
                this.A01 = jA01 != -1 ? jA01 - j : -1L;
            }
            try {
                InputStream inputStream = httpURLConnectionA00.getInputStream();
                this.A02 = inputStream;
                if (zEqualsIgnoreCase) {
                    this.A02 = new GZIPInputStream(inputStream);
                }
                this.A06 = true;
                transferStarted(c1o);
                if (j != 0) {
                    try {
                        byte[] bArr2 = new byte[4096];
                        while (j > 0) {
                            int i3 = this.A02.read(bArr2, 0, BV4.A01(j, 4096L));
                            if (Thread.currentThread().isInterrupted()) {
                                throw new HttpDataSource$HttpDataSourceException(c1o, new InterruptedIOException(), 2000, 1);
                            }
                            if (i3 == -1) {
                                throw new HttpDataSource$HttpDataSourceException(c1o);
                            }
                            j -= i3;
                            bytesTransferred(i3);
                        }
                    } catch (IOException e) {
                        A01();
                        if (e instanceof HttpDataSource$HttpDataSourceException) {
                            throw e;
                        }
                        throw new HttpDataSource$HttpDataSourceException(c1o, e, 2000, 1);
                    }
                }
                return this.A01;
            } catch (IOException e2) {
                A01();
                throw new HttpDataSource$HttpDataSourceException(c1o, e2, 2000, 1);
            }
        } catch (IOException e3) {
            A01();
            throw HttpDataSource$HttpDataSourceException.A00(c1o, e3, 1);
        }
    }

    @Override // X.C1L
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.A01;
            if (j != -1) {
                long j2 = j - this.A00;
                if (j2 == 0) {
                    return -1;
                }
                i2 = BV4.A01(i2, j2);
            }
            int i3 = this.A02.read(bArr, i, i2);
            if (i3 == -1) {
                return -1;
            }
            this.A00 += i3;
            bytesTransferred(i3);
            return i3;
        } catch (IOException e) {
            throw HttpDataSource$HttpDataSourceException.A00(this.A04, e, 2);
        }
    }
}
