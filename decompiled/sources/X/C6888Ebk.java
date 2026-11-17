package X;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: X.Ebk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6888Ebk implements InterfaceC6834Eam {
    public long A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final InterfaceC6834Eam A04;
    public final long A05;
    public final /* synthetic */ C6871EbT A06;

    public C6888Ebk(C6871EbT c6871EbT, InterfaceC6834Eam interfaceC6834Eam, long j) {
        C7384Etj.A0Y(interfaceC6834Eam, 1);
        this.A06 = c6871EbT;
        this.A04 = interfaceC6834Eam;
        this.A05 = j;
        this.A03 = true;
        if (j == 0) {
            A00(null);
        }
    }

    private final <E extends IOException> E A00(E e) {
        if (this.A02) {
            return e;
        }
        this.A02 = true;
        if (e == null && this.A03) {
            this.A03 = false;
        }
        C6871EbT c6871EbT = this.A06;
        if (e != null) {
            C6871EbT.A00(e, c6871EbT);
        }
        return (E) c6871EbT.A01.A02(e, c6871EbT, false, true);
    }

    @Override // X.InterfaceC6834Eam
    public final long AZ7(C6818EaW c6818EaW, long j) throws IOException {
        C7384Etj.A0Y(c6818EaW, 0);
        if (this.A01) {
            throw BV4.A0R();
        }
        try {
            long jAZ7 = this.A04.AZ7(c6818EaW, j);
            if (this.A03) {
                this.A03 = false;
            }
            if (jAZ7 == -1) {
                A00(null);
                return -1L;
            }
            long j2 = this.A00 + jAZ7;
            long j3 = this.A05;
            if (j3 != -1 && j2 > j3) {
                StringBuilder sbA0g = C3cG.A0g("expected ");
                sbA0g.append(j3);
                throw new ProtocolException(BV7.A0z(" bytes but received ", sbA0g, j2));
            }
            this.A00 = j2;
            if (j2 == j3) {
                A00(null);
            }
            return jAZ7;
        } catch (IOException e) {
            throw A00(e);
        }
    }

    @Override // X.InterfaceC6834Eam
    public final C6848Eb1 Ags() {
        return this.A04.Ags();
    }

    @Override // X.InterfaceC6834Eam, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.A01) {
            return;
        }
        this.A01 = true;
        try {
            this.A04.close();
            A00(null);
        } catch (IOException e) {
            throw A00(e);
        }
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(C3cI.A0Y(this));
        sbA0w.append('(');
        return AnonymousClass007.A0Z(this.A04, sbA0w);
    }
}
