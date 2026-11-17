package X;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DF4 implements C1J {
    public long A00;
    public Uri A01;
    public Map<String, List<String>> A02;
    public final C1J A03;

    @Override // X.C1J
    public final void close() {
        this.A03.close();
    }

    @Override // X.C1J
    public final Map<String, List<String>> getResponseHeaders() {
        return this.A03.getResponseHeaders();
    }

    @Override // X.C1J
    public final Uri getUri() {
        return this.A03.getUri();
    }

    @Override // X.C1J
    public final long open(C1O c1o) {
        this.A01 = c1o.A06;
        this.A02 = Collections.EMPTY_MAP;
        try {
            C1J c1j = this.A03;
            long jOpen = c1j.open(c1o);
            Uri uri = c1j.getUri();
            if (uri != null) {
                this.A01 = uri;
            }
            this.A02 = c1j.getResponseHeaders();
            return jOpen;
        } catch (Throwable th) {
            C1J c1j2 = this.A03;
            Uri uri2 = c1j2.getUri();
            if (uri2 != null) {
                this.A01 = uri2;
            }
            this.A02 = c1j2.getResponseHeaders();
            throw th;
        }
    }

    @Override // X.C1L
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.A03.read(bArr, i, i2);
        if (i3 != -1) {
            this.A00 += i3;
        }
        return i3;
    }

    public DF4(C1J c1j) {
        c1j.getClass();
        this.A03 = c1j;
        this.A01 = Uri.EMPTY;
        this.A02 = Collections.EMPTY_MAP;
    }

    @Override // X.C1J
    public final void addTransferListener(CXB cxb) {
        cxb.getClass();
        this.A03.addTransferListener(cxb);
    }
}
