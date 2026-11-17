package X;

import android.os.SystemClock;
import java.util.List;

/* renamed from: X.DiS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5431DiS {
    public boolean A04;
    public boolean A05;
    public final boolean A09;
    public final C5536DkD A07 = new C5536DkD();
    public final C5536DkD A06 = new C5536DkD();
    public final List<C5440Dib> A08 = C3cG.A0h();
    public long A02 = -1;
    public long A01 = -1;
    public long A03 = -1;
    public long A00 = -1;
    public final C5440Dib A0A = A01();

    public final synchronized C5440Dib A01() {
        C5440Dib c5440Dib;
        c5440Dib = new C5440Dib(this);
        if (this.A09) {
            this.A08.add(c5440Dib);
            if (this.A05) {
                C5440Dib.A00(c5440Dib);
                c5440Dib.A00 = SystemClock.elapsedRealtime();
            }
        }
        return c5440Dib;
    }

    public final synchronized void A02(long j, long j2) {
        Integer num = C79.A00;
        if (j >= 0) {
            A03(j, num);
        }
        Integer num2 = C79.A01;
        if (j2 >= 0) {
            A03(j2, num2);
        }
    }

    public final synchronized void A03(long j, Integer num) {
        C5536DkD c5536DkD;
        C5535DkC c5535DkC;
        C5535DkC c5535DkC2;
        if (A04()) {
            long jA07 = BV5.A07(Math.min(BV4.A04(j), 600000L));
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                c5536DkD = this.A07;
            } else {
                if (iIntValue != 1) {
                    throw C60Q.A0U("Unsupported track: ", AbstractC4911DEe.A00(num));
                }
                c5536DkD = this.A06;
            }
            if (!c5536DkD.A01) {
                for (C5440Dib c5440Dib : this.A08) {
                    int iIntValue2 = num.intValue();
                    if (iIntValue2 == 0) {
                        c5535DkC2 = c5440Dib.A03;
                    } else {
                        if (iIntValue2 != 1) {
                            throw C60Q.A0U("Unsupported track: ", AbstractC4911DEe.A00(num));
                        }
                        c5535DkC2 = c5440Dib.A02;
                    }
                    c5535DkC2.A01 = false;
                }
            }
            c5536DkD.A00 = jA07;
            c5536DkD.A01 = true;
            for (C5440Dib c5440Dib2 : this.A08) {
                if (c5440Dib2.A04.A05) {
                    int iIntValue3 = num.intValue();
                    if (iIntValue3 == 0) {
                        c5535DkC = c5440Dib2.A03;
                    } else {
                        if (iIntValue3 != 1) {
                            throw C60Q.A0U("Unsupported track: ", AbstractC4911DEe.A00(num));
                        }
                        c5535DkC = c5440Dib2.A02;
                    }
                    if (!c5535DkC.A01 || jA07 < c5535DkC.A00) {
                        c5535DkC.A00 = jA07;
                        c5535DkC.A01 = true;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A04() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A09     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto La
            boolean r1 = r2.A04     // Catch: java.lang.Throwable -> Ld
            r0 = 1
            if (r1 == 0) goto Lb
        La:
            r0 = 0
        Lb:
            monitor-exit(r2)
            return r0
        Ld:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5431DiS.A04():boolean");
    }

    public C5431DiS(boolean z) {
        this.A09 = z;
    }

    public static void A00(C5431DiS c5431DiS, boolean z, boolean z2) {
        if (c5431DiS.A04()) {
            c5431DiS.A05 = false;
            c5431DiS.A02 = -1L;
            c5431DiS.A01 = -1L;
            c5431DiS.A03 = -1L;
            c5431DiS.A00 = -1L;
            if (z2) {
                c5431DiS.A07.A01 = false;
                c5431DiS.A06.A01 = false;
            }
            for (C5440Dib c5440Dib : c5431DiS.A08) {
                c5440Dib.A03.A01 = false;
                c5440Dib.A02.A01 = false;
                c5440Dib.A00 = SystemClock.elapsedRealtime();
                c5440Dib.A01 = z;
            }
        }
    }
}
