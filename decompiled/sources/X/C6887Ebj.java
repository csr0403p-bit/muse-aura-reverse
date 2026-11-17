package X;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: X.Ebj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6887Ebj implements InterfaceC6833Eal {
    public long A00;
    public boolean A01;
    public boolean A02;
    public final InterfaceC6833Eal A03;
    public final /* synthetic */ C6871EbT A04;

    /* JADX WARN: Incorrect types in method signature: (LX/Eal;J)V */
    public C6887Ebj(C6871EbT c6871EbT, InterfaceC6833Eal interfaceC6833Eal) {
        C7384Etj.A0Y(interfaceC6833Eal, 1);
        this.A04 = c6871EbT;
        this.A03 = interfaceC6833Eal;
    }

    @Override // X.InterfaceC6833Eal
    public final void Aib(C6818EaW c6818EaW, long j) throws IOException {
        C7384Etj.A0Y(c6818EaW, 0);
        if (this.A01) {
            throw BV4.A0R();
        }
        long j2 = this.A00 + j;
        if (j2 > 0) {
            StringBuilder sbA0g = C3cG.A0g("expected ");
            sbA0g.append(0L);
            throw new ProtocolException(BV7.A0z(" bytes but received ", sbA0g, j2));
        }
        try {
            this.A03.Aib(c6818EaW, j);
            this.A00 += j;
        } catch (IOException e) {
            throw A00(e);
        }
    }

    private final <E extends IOException> E A00(E e) {
        if (this.A02) {
            return e;
        }
        this.A02 = true;
        C6871EbT c6871EbT = this.A04;
        if (e != null) {
            C6871EbT.A00(e, c6871EbT);
        }
        return (E) c6871EbT.A01.A02(e, c6871EbT, true, false);
    }

    @Override // X.InterfaceC6833Eal
    public final C6848Eb1 Ags() {
        return this.A03.Ags();
    }

    @Override // X.InterfaceC6833Eal, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        if (this.A00 != 0) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            this.A03.close();
            A00(null);
        } catch (IOException e) {
            throw A00(e);
        }
    }

    @Override // X.InterfaceC6833Eal, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.A03.flush();
        } catch (IOException e) {
            throw A00(e);
        }
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(C3cI.A0Y(this));
        sbA0w.append('(');
        return AnonymousClass007.A0Z(this.A03, sbA0w);
    }
}
