package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.EaZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6821EaZ implements InterfaceC6834Eam {
    public final InputStream A00;
    public final C6848Eb1 A01;

    @Override // X.InterfaceC6834Eam
    public final long AZ7(C6818EaW c6818EaW, long j) throws IOException {
        String message;
        C7384Etj.A0Y(c6818EaW, 0);
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw BV5.A0R("byteCount < 0: ", j);
        }
        try {
            this.A01.A05();
            C6830Eai c6830EaiA06 = c6818EaW.A06(1);
            int i = this.A00.read(c6830EaiA06.A06, c6830EaiA06.A00, BV4.A01(j, 8192 - r5));
            if (i == -1) {
                C6830Eai.A00(c6818EaW, c6830EaiA06, c6830EaiA06.A01);
                return -1L;
            }
            c6830EaiA06.A00 += i;
            long j2 = i;
            c6818EaW.A00 += j2;
            return j2;
        } catch (AssertionError e) {
            if (e.getCause() == null || (message = e.getMessage()) == null || !C7BY.A0q(message, "getsockname failed", false)) {
                throw e;
            }
            throw new IOException(e);
        }
    }

    @Override // X.InterfaceC6834Eam
    public final C6848Eb1 Ags() {
        return this.A01;
    }

    @Override // X.InterfaceC6834Eam, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A00.close();
    }

    public C6821EaZ(InputStream inputStream, C6848Eb1 c6848Eb1) {
        this.A00 = inputStream;
        this.A01 = c6848Eb1;
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("source("));
    }
}
