package X;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.Eac, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6824Eac implements InterfaceC6833Eal {
    public final OutputStream A00;
    public final C6848Eb1 A01;

    @Override // X.InterfaceC6833Eal
    public final void Aib(C6818EaW c6818EaW, long j) throws IOException {
        long j2 = j;
        C7384Etj.A0Y(c6818EaW, 0);
        AbstractC6789EZy.A01(c6818EaW.A00, 0L, j2);
        while (j2 > 0) {
            this.A01.A05();
            C6830Eai c6830Eai = c6818EaW.A01;
            C7384Etj.A0X(c6830Eai);
            int i = c6830Eai.A00;
            int i2 = c6830Eai.A01;
            int iA01 = BV4.A01(j2, i - i2);
            this.A00.write(c6830Eai.A06, i2, iA01);
            int i3 = c6830Eai.A01 + iA01;
            c6830Eai.A01 = i3;
            long j3 = iA01;
            j2 -= j3;
            c6818EaW.A00 -= j3;
            C6830Eai.A00(c6818EaW, c6830Eai, i3);
        }
    }

    @Override // X.InterfaceC6833Eal
    public final C6848Eb1 Ags() {
        return this.A01;
    }

    @Override // X.InterfaceC6833Eal, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.A00.close();
    }

    @Override // X.InterfaceC6833Eal, java.io.Flushable
    public final void flush() throws IOException {
        this.A00.flush();
    }

    public C6824Eac(OutputStream outputStream, C6848Eb1 c6848Eb1) {
        this.A00 = outputStream;
        this.A01 = c6848Eb1;
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("sink("));
    }
}
