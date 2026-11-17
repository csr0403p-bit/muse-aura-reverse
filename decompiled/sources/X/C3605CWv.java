package X;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.CWv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3605CWv implements C1J {
    public C1J A00;
    public C1J A01;
    public C1J A02;
    public C1J A03;
    public C1J A04;
    public C1J A05;
    public C1J A06;
    public C1J A07;
    public final Context A08;
    public final C1J A09;
    public final List<CXB> A0A;

    private void A00(C1J c1j) {
        int i = 0;
        while (true) {
            List<CXB> list = this.A0A;
            if (i >= list.size()) {
                return;
            }
            c1j.addTransferListener(list.get(i));
            i++;
        }
    }

    @Override // X.C1J
    public final void close() {
        C1J c1j = this.A07;
        if (c1j != null) {
            try {
                c1j.close();
            } finally {
                this.A07 = null;
            }
        }
    }

    @Override // X.C1J
    public final Map<String, List<String>> getResponseHeaders() {
        C1J c1j = this.A07;
        return c1j == null ? Collections.EMPTY_MAP : c1j.getResponseHeaders();
    }

    @Override // X.C1J
    public final Uri getUri() {
        C1J c1j = this.A07;
        if (c1j == null) {
            return null;
        }
        return c1j.getUri();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd  */
    @Override // X.C1J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long open(X.C1O r5) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3605CWv.open(X.C1O):long");
    }

    @Override // X.C1L
    public final int read(byte[] bArr, int i, int i2) {
        C1J c1j = this.A07;
        c1j.getClass();
        return c1j.read(bArr, i, i2);
    }

    public C3605CWv(Context context, C1J c1j) {
        this.A08 = context.getApplicationContext();
        c1j.getClass();
        this.A09 = c1j;
        this.A0A = C3cG.A0h();
    }

    @Override // X.C1J
    public final void addTransferListener(CXB cxb) {
        cxb.getClass();
        this.A09.addTransferListener(cxb);
        this.A0A.add(cxb);
        C1J c1j = this.A03;
        if (c1j != null) {
            c1j.addTransferListener(cxb);
        }
        C1J c1j2 = this.A00;
        if (c1j2 != null) {
            c1j2.addTransferListener(cxb);
        }
        C1J c1j3 = this.A01;
        if (c1j3 != null) {
            c1j3.addTransferListener(cxb);
        }
        C1J c1j4 = this.A05;
        if (c1j4 != null) {
            c1j4.addTransferListener(cxb);
        }
        C1J c1j5 = this.A06;
        if (c1j5 != null) {
            c1j5.addTransferListener(cxb);
        }
        C1J c1j6 = this.A02;
        if (c1j6 != null) {
            c1j6.addTransferListener(cxb);
        }
        C1J c1j7 = this.A04;
        if (c1j7 != null) {
            c1j7.addTransferListener(cxb);
        }
    }
}
