package X;

/* renamed from: X.Ebw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6900Ebw implements InterfaceC6833Eal {
    public boolean A00;
    public final Eb2 A01;
    public final /* synthetic */ C6863EbL A02;

    @Override // X.InterfaceC6833Eal
    public final void Aib(C6818EaW c6818EaW, long j) {
        C7384Etj.A0Y(c6818EaW, 0);
        if (this.A00) {
            throw BV4.A0R();
        }
        long j2 = c6818EaW.A00;
        byte[] bArr = AbstractC6843Eav.A06;
        if (j < 0 || 0 > j2 || j2 < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.A02.A05.Aib(c6818EaW, j);
    }

    public C6900Ebw(C6863EbL c6863EbL) {
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

    @Override // X.InterfaceC6833Eal, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        C6863EbL c6863EbL = this.A02;
        Eb2 eb2 = this.A01;
        C6848Eb1 c6848Eb1 = eb2.A00;
        eb2.A00 = C6848Eb1.A03;
        c6848Eb1.A01();
        c6848Eb1.A02();
        c6863EbL.A00 = 3;
    }

    @Override // X.InterfaceC6833Eal, java.io.Flushable
    public final void flush() {
        if (this.A00) {
            return;
        }
        this.A02.A05.flush();
    }
}
