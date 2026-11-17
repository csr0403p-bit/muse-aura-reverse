package X;

import androidx.media3.common.ParserException;
import java.io.EOFException;

/* renamed from: X.E3u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6392E3u {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public final int[] A05 = new int[255];
    public final E1P A06 = BV6.A0Y(255);

    public final boolean A01(E2K e2k, boolean z) throws ParserException, EOFException {
        this.A03 = 0;
        this.A04 = 0L;
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0;
        E1P e1p = this.A06;
        e1p.A0P(27);
        try {
            if (!e2k.AXj(e1p.A02, 0, 27, z) || e1p.A0H() != 1332176723) {
                return false;
            }
            if (e1p.A0A() != 0) {
                if (z) {
                    return false;
                }
                throw ParserException.A00("unsupported bit stream revision");
            }
            this.A03 = e1p.A0A();
            this.A04 = e1p.A0E();
            e1p.A0F();
            e1p.A0F();
            e1p.A0F();
            int iA0A = e1p.A0A();
            this.A02 = iA0A;
            this.A01 = iA0A + 27;
            e1p.A0P(iA0A);
            if (!e2k.AXj(e1p.A02, 0, iA0A, z)) {
                return false;
            }
            for (int i = 0; i < this.A02; i++) {
                int[] iArr = this.A05;
                int iA0A2 = e1p.A0A();
                iArr[i] = iA0A2;
                this.A00 += iA0A2;
            }
            return true;
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public final boolean A00(E2K e2k, long j) {
        C1G.A07(AnonymousClass002.A1M((e2k.AIu() > e2k.AIf() ? 1 : (e2k.AIu() == e2k.AIf() ? 0 : -1))));
        E1P e1p = this.A06;
        e1p.A0P(4);
        while (true) {
            if (j != -1 && e2k.AIu() + 4 >= j) {
                break;
            }
            try {
                if (!e2k.AXj(e1p.A02, 0, 4, true)) {
                    break;
                }
                e1p.A0R(0);
                if (e1p.A0H() == 1332176723) {
                    e2k.AbN();
                    return true;
                }
                e2k.Afm(1);
            } catch (EOFException unused) {
            }
        }
        do {
            if (j != -1 && e2k.AIu() >= j) {
                break;
            }
        } while (e2k.Afj(1) != -1);
        return false;
    }
}
