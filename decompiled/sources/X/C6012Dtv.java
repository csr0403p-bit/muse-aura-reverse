package X;

import java.io.IOException;

/* renamed from: X.Dtv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6012Dtv implements Du7, InterfaceC6021DuE {
    public C6014Dtx A00;
    public C6013Dtw A01;
    public final T A02;
    public final /* synthetic */ AbstractC6010Dtt A03;

    public C6012Dtv(AbstractC6010Dtt abstractC6010Dtt, T t) {
        this.A03 = abstractC6010Dtt;
        this.A01 = new C6013Dtw(null, abstractC6010Dtt.A04.A02, 0);
        this.A00 = new C6014Dtx(null, abstractC6010Dtt.A03.A02, 0);
        this.A02 = t;
    }

    private C5893Dra A00(C5893Dra c5893Dra) {
        long j = c5893Dra.A04;
        long j2 = c5893Dra.A03;
        if (j == j && j2 == j2) {
            return c5893Dra;
        }
        int i = c5893Dra.A00;
        int i2 = c5893Dra.A02;
        return new C5893Dra(c5893Dra.A05, c5893Dra.A06, i, i2, c5893Dra.A01, j, j2);
    }

    private boolean A01(Dy6 dy6, int i) {
        if (dy6 != null) {
            AbstractC6010Dtt abstractC6010Dtt = this.A03;
            T t = this.A02;
            if (abstractC6010Dtt instanceof AbstractC6008Dtr) {
                AbstractC6008Dtr abstractC6008Dtr = (AbstractC6008Dtr) abstractC6010Dtt;
                if (abstractC6008Dtr instanceof C6004Dtn) {
                    Object obj = dy6.A04;
                    C6007Dtq c6007Dtq = ((C6004Dtn) abstractC6008Dtr).A01;
                    Object obj2 = C6007Dtq.A02;
                    Object obj3 = c6007Dtq.A00;
                    if (obj3 != null && obj3.equals(obj)) {
                        obj = C6007Dtq.A02;
                    }
                    dy6 = dy6.A01(obj);
                }
            } else if (AnonymousClass001.A0F(t) != 0) {
                return false;
            }
        } else {
            dy6 = null;
        }
        AbstractC6010Dtt abstractC6010Dtt2 = this.A03;
        C6013Dtw c6013Dtw = this.A01;
        if (c6013Dtw.A00 != i || !C6xC.A00(c6013Dtw.A01, dy6)) {
            this.A01 = new C6013Dtw(dy6, abstractC6010Dtt2.A04.A02, i);
        }
        C6014Dtx c6014Dtx = this.A00;
        if (c6014Dtx.A00 == i && C6xC.A00(c6014Dtx.A01, dy6)) {
            return true;
        }
        this.A00 = new C6014Dtx(dy6, abstractC6010Dtt2.A03.A02, i);
        return true;
    }

    @Override // X.InterfaceC6021DuE
    public final void ASj(Dy6 dy6, int i) {
        if (A01(dy6, i)) {
            this.A00.A00();
        }
    }

    @Override // X.InterfaceC6021DuE
    public final void ASk(Dy6 dy6, int i) {
        if (A01(dy6, i)) {
            this.A00.A01();
        }
    }

    @Override // X.InterfaceC6021DuE
    public final void ASl(Dy6 dy6, int i, int i2) {
        if (A01(dy6, i)) {
            this.A00.A03(i2);
        }
    }

    @Override // X.InterfaceC6021DuE
    public final void ASm(Dy6 dy6, Exception exc, int i) {
        if (A01(dy6, i)) {
            this.A00.A04(exc);
        }
    }

    @Override // X.InterfaceC6021DuE
    public final void ASo(Dy6 dy6, int i) {
        if (A01(dy6, i)) {
            this.A00.A02();
        }
    }

    @Override // X.Du7
    public final void onDownstreamFormatChanged(int i, Dy6 dy6, C5893Dra c5893Dra) {
        if (A01(dy6, i)) {
            C6013Dtw c6013Dtw = this.A01;
            c6013Dtw.A06(new Du8(A00(c5893Dra), c6013Dtw));
        }
    }

    @Override // X.Du7
    public final void onLoadCanceled(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra) {
        if (A01(dy6, i)) {
            C6013Dtw c6013Dtw = this.A01;
            c6013Dtw.A06(new C7579F4s(c5072DTn, A00(c5893Dra), c6013Dtw, 1));
        }
    }

    @Override // X.Du7
    public final void onLoadCompleted(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra) {
        if (A01(dy6, i)) {
            C6013Dtw c6013Dtw = this.A01;
            c6013Dtw.A06(new C7579F4s(c5072DTn, A00(c5893Dra), c6013Dtw, 0));
        }
    }

    @Override // X.Du7
    public final void onLoadError(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra, IOException iOException, boolean z) {
        if (A01(dy6, i)) {
            C6013Dtw c6013Dtw = this.A01;
            c6013Dtw.A06(new Du5(c5072DTn, A00(c5893Dra), c6013Dtw, iOException, z));
        }
    }

    @Override // X.Du7
    public final void onLoadStarted(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra, int i2) {
        if (A01(dy6, i)) {
            C6013Dtw c6013Dtw = this.A01;
            c6013Dtw.A06(new Du6(c5072DTn, A00(c5893Dra), c6013Dtw, i2));
        }
    }

    @Override // X.Du7
    public final void onUpstreamDiscarded(int i, Dy6 dy6, C5893Dra c5893Dra) {
        if (A01(dy6, i)) {
            C6013Dtw c6013Dtw = this.A01;
            C5893Dra c5893DraA00 = A00(c5893Dra);
            Dy6 dy62 = c6013Dtw.A01;
            dy62.getClass();
            c6013Dtw.A06(new C7579F4s(dy62, c5893DraA00, c6013Dtw, 2));
        }
    }
}
