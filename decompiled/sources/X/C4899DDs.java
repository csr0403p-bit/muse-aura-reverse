package X;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.DDs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4899DDs implements C1J {
    public Uri A00;
    public String A01;
    public final C1J A02;
    public final boolean A03;
    public final C4898DDr A04;

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // X.C1J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r3 = this;
            boolean r0 = r3.A03     // Catch: java.lang.Throwable -> L2e
            r2 = 0
            if (r0 == 0) goto L2b
            X.C1J r1 = r3.A02     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r1 instanceof X.InterfaceC4891DDk     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L2b
            X.DDk r1 = (X.InterfaceC4891DDk) r1     // Catch: java.lang.Throwable -> L2e
            java.util.Map r0 = r1.getResponseHeaders()     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L2b
            java.util.Map r1 = r1.getResponseHeaders()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "ETag"
            java.util.List r0 = X.BV4.A0z(r0, r1)     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L25
            java.lang.String r0 = X.C60Q.A0n(r0, r2)     // Catch: java.lang.Throwable -> L2e
        L23:
            r3.A01 = r0     // Catch: java.lang.Throwable -> L2e
        L25:
            X.C1J r0 = r3.A02     // Catch: java.lang.Throwable -> L2e
            r0.close()     // Catch: java.lang.Throwable -> L2e
            goto L2d
        L2b:
            r0 = 0
            goto L23
        L2d:
            return
        L2e:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4899DDs.close():void");
    }

    @Override // X.C1J
    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // X.C1J
    public final Uri getUri() {
        return this.A00;
    }

    @Override // X.C1J
    public final long open(C1O c1o) {
        if (this.A03 && this.A01 != null) {
            C4890DDe.A00(c1o).A0V.put("If-None-Match", this.A01);
        }
        this.A00 = c1o.A06;
        try {
            return this.A02.open(c1o);
        } catch (IOException | RuntimeException e) {
            throw e;
        }
    }

    @Override // X.C1L
    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.A02.read(bArr, i, i2);
        } catch (IOException | RuntimeException e) {
            throw e;
        }
    }

    public C4899DDs(C1J c1j, C4898DDr c4898DDr, boolean z) {
        this.A02 = c1j;
        this.A03 = z;
        this.A04 = c4898DDr;
    }

    @Override // X.C1J
    public final void addTransferListener(CXB cxb) {
        cxb.getClass();
        this.A02.addTransferListener(cxb);
    }
}
