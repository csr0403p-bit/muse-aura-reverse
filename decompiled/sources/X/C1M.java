package X;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class C1M implements C1J {
    public long A00;
    public boolean A01;
    public final C1N A02;
    public final C1J A03;

    @Override // X.C1J
    public final void close() {
        try {
            this.A03.close();
        } finally {
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        }
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
        long jOpen = this.A03.open(c1o);
        this.A00 = jOpen;
        if (jOpen == 0) {
            return 0L;
        }
        if (c1o.A03 == -1 && jOpen != -1) {
            c1o = c1o.A00(0L, jOpen);
        }
        this.A01 = true;
        this.A02.AXT(c1o);
        return this.A00;
    }

    @Override // X.C1L
    public final int read(byte[] bArr, int i, int i2) {
        if (this.A00 == 0) {
            return -1;
        }
        int i3 = this.A03.read(bArr, i, i2);
        if (i3 <= 0) {
            return i3;
        }
        this.A02.write(bArr, i, i3);
        long j = this.A00;
        if (j == -1) {
            return i3;
        }
        this.A00 = j - i3;
        return i3;
    }

    public C1M(C1N c1n, C1J c1j) {
        this.A03 = c1j;
        this.A02 = c1n;
    }

    @Override // X.C1J
    public final void addTransferListener(CXB cxb) {
        cxb.getClass();
        this.A03.addTransferListener(cxb);
    }
}
