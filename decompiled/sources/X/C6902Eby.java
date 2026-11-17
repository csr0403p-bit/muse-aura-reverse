package X;

import com.facebook.acra.util.HttpRequestMultipart;

/* renamed from: X.Eby, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6902Eby implements InterfaceC6833Eal {
    public boolean A00;
    public final Eb2 A01;
    public final /* synthetic */ C6863EbL A02;

    @Override // X.InterfaceC6833Eal
    public final void Aib(C6818EaW c6818EaW, long j) {
        C7384Etj.A0Y(c6818EaW, 0);
        if (this.A00) {
            throw BV4.A0R();
        }
        if (j != 0) {
            EcA ecA = this.A02.A05;
            ecA.Ail(j);
            ecA.Aj6(HttpRequestMultipart.LINE_FEED);
            ecA.Aib(c6818EaW, j);
            ecA.Aj6(HttpRequestMultipart.LINE_FEED);
        }
    }

    @Override // X.InterfaceC6833Eal, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.A00) {
            this.A00 = true;
            C6863EbL c6863EbL = this.A02;
            c6863EbL.A05.Aj6("0\r\n\r\n");
            Eb2 eb2 = this.A01;
            C6848Eb1 c6848Eb1 = eb2.A00;
            eb2.A00 = C6848Eb1.A03;
            c6848Eb1.A01();
            c6848Eb1.A02();
            c6863EbL.A00 = 3;
        }
    }

    @Override // X.InterfaceC6833Eal, java.io.Flushable
    public final synchronized void flush() {
        if (!this.A00) {
            this.A02.A05.flush();
        }
    }

    public C6902Eby(C6863EbL c6863EbL) {
        this.A02 = c6863EbL;
        C6848Eb1 c6848Eb1 = C6848Eb1.A03;
        C6848Eb1 c6848Eb1Ags = c6863EbL.A05.Ags();
        C7384Etj.A0Y(c6848Eb1Ags, 0);
        Eb2 eb2 = new Eb2();
        eb2.A00 = c6848Eb1Ags;
        this.A01 = eb2;
    }

    @Override // X.InterfaceC6833Eal
    public final C6848Eb1 Ags() {
        return this.A01;
    }
}
