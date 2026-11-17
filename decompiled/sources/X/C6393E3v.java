package X;

import java.io.EOFException;

/* renamed from: X.E3v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6393E3v {
    public int A00;
    public boolean A01;
    public final E1P A02;
    public final C6392E3u A03 = new C6392E3u();

    public final boolean A00(E2K e2k) {
        C6392E3u c6392E3u;
        int i;
        int i2;
        C1G.A08(AnonymousClass002.A1X(e2k));
        if (this.A01) {
            this.A01 = false;
            this.A02.A0P(0);
        }
        while (!this.A01) {
            int i3 = this.A00;
            if (i3 < 0) {
                C6392E3u c6392E3u2 = this.A03;
                if (c6392E3u2.A00(e2k, -1L) && c6392E3u2.A01(e2k, true)) {
                    int i4 = c6392E3u2.A01;
                    if ((c6392E3u2.A03 & 1) == 1 && this.A02.A00 == 0) {
                        int i5 = 0;
                        i3 = 0;
                        do {
                            int i6 = i3;
                            if (i3 >= c6392E3u2.A02) {
                                break;
                            }
                            i3++;
                            i2 = c6392E3u2.A05[i6];
                            i5 += i2;
                        } while (i2 == 255);
                        i4 += i5;
                    } else {
                        i3 = 0;
                    }
                    try {
                        e2k.Afm(i4);
                        this.A00 = i3;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int i7 = 0;
            int i8 = 0;
            do {
                int i9 = i8 + i3;
                c6392E3u = this.A03;
                if (i9 >= c6392E3u.A02) {
                    break;
                }
                int i10 = i8;
                i8++;
                i = c6392E3u.A05[i10 + i3];
                i7 += i;
            } while (i == 255);
            int i11 = i3 + i8;
            if (i7 > 0) {
                E1P e1p = this.A02;
                e1p.A0O(e1p.A00 + i7);
                e2k.readFully(e1p.A02, e1p.A00, i7);
                e1p.A0Q(e1p.A00 + i7);
                this.A01 = AnonymousClass002.A1P(c6392E3u.A05[i11 - 1], 255);
            }
            if (i11 == c6392E3u.A02) {
                i11 = -1;
            }
            this.A00 = i11;
        }
        return true;
    }

    public C6393E3v() {
        E1P e1p = new E1P();
        e1p.A02 = new byte[65025];
        e1p.A00 = 0;
        this.A02 = e1p;
        this.A00 = -1;
    }
}
