package X;

import android.os.SystemClock;

/* renamed from: X.Dib, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5440Dib {
    public long A00;
    public boolean A01;
    public final /* synthetic */ C5431DiS A04;
    public final C5535DkC A03 = new C5535DkC();
    public final C5535DkC A02 = new C5535DkC();

    public C5440Dib(C5431DiS c5431DiS) {
        this.A04 = c5431DiS;
        this.A00 = c5431DiS.A09 ? SystemClock.elapsedRealtime() : 0L;
    }

    public static void A00(C5440Dib c5440Dib) {
        C5535DkC c5535DkC = c5440Dib.A03;
        C5431DiS c5431DiS = c5440Dib.A04;
        C5536DkD c5536DkD = c5431DiS.A07;
        boolean z = c5536DkD.A01;
        c5535DkC.A01 = z;
        if (z) {
            c5535DkC.A00 = c5536DkD.A00;
        }
        C5535DkC c5535DkC2 = c5440Dib.A02;
        C5536DkD c5536DkD2 = c5431DiS.A06;
        boolean z2 = c5536DkD2.A01;
        c5535DkC2.A01 = z2;
        if (z2) {
            c5535DkC2.A00 = c5536DkD2.A00;
        }
    }
}
