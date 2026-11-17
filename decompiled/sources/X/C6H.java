package X;

import android.os.Build;

/* loaded from: classes5.dex */
public final class C6H implements InterfaceC3231C4o {
    public final int A00;
    public final C3267C6q A01;

    @Override // X.InterfaceC3231C4o
    public final Integer AHt() {
        return C79.A0Z;
    }

    @Override // X.InterfaceC3231C4o
    public final void AY4(C3228C4l c3228C4l, EnumC3223C4g enumC3223C4g) {
        int i;
        C6I c6iA00;
        String strA0B;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 || (i = this.A00) == 0 || (c6iA00 = this.A01.A00(i)) == null) {
            return;
        }
        C3228C4l.A01(C6B.A1t, c3228C4l, c6iA00.A02());
        C3228C4l.A01(C6B.A1s, c3228C4l, c6iA00.A01());
        c3228C4l.A03(C6B.A6b, c6iA00.A09());
        C3228C4l.A01(C6B.A1v, c3228C4l, c6iA00.A03());
        C3228C4l.A01(C6B.A1x, c3228C4l, c6iA00.A04());
        C3228C4l.A01(C6B.A1y, c3228C4l, c6iA00.A07());
        c3228C4l.A02(C6B.A0d, c6iA00.A0C());
        c3228C4l.A03(C6B.A6d, c6iA00.A0A());
        C3228C4l.A01(C6B.A1u, c3228C4l, c6iA00.A05());
        C3228C4l.A01(C6B.A1w, c3228C4l, c6iA00.A06());
        if (i2 >= 37) {
            C6O.A00(c6iA00.A08(), c3228C4l);
        }
        if (enumC3223C4g != EnumC3223C4g.LARGE_REPORT || (strA0B = c6iA00.A0B()) == null) {
            return;
        }
        c3228C4l.A03(C6B.A6e, strA0B);
    }

    public C6H(C3267C6q c3267C6q) {
        C3246C5d c3246C5d = C3246C5d.A03;
        if (c3246C5d == null) {
            throw C3cG.A0Q("Did you call PreviousSessionHelper.init?");
        }
        this.A00 = c3246C5d.A01();
        this.A01 = c3267C6q;
    }
}
