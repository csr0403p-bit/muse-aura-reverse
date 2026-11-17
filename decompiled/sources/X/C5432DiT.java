package X;

import android.util.Log;
import com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$InvalidSegmentNumberException;
import java.util.Locale;

/* renamed from: X.DiT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5432DiT {
    public long A00;
    public long A01;
    public DhD A02;
    public AbstractC5553DkW A03;
    public final long A04;
    public final InterfaceC5417DiD A05;
    public final DEY A06;
    public final C5376DhT A07;
    public final boolean A08;

    public final long A01() {
        if (this.A02.AK9(this.A00) == -1) {
            return -1L;
        }
        DhD dhD = this.A02;
        return BV7.A0S(dhD.AFg() + this.A01, dhD.AK9(this.A00));
    }

    public final long A02(long j) {
        return BV7.A0S(this.A02.AFd(this.A00, j) + this.A01, this.A02.ACe(this.A00, j));
    }

    public final long A03(long j) throws DefaultDashChunkSource$InvalidSegmentNumberException {
        DhD dhD = this.A02;
        long j2 = this.A01;
        long j3 = j - j2;
        long jAFg = dhD.AFg();
        if (j3 >= jAFg) {
            return dhD.AEz(j3, this.A00);
        }
        String str = String.format(Locale.US, "Segment number without shift number is behind, segmentNum=%d ,segmentNumShift=%d ,firstSegmentNum=%d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(jAFg));
        Log.d("DefaultDashChunkSource", str);
        throw new DefaultDashChunkSource$InvalidSegmentNumberException(str);
    }

    public final long A05(long j) {
        return this.A02.AKA(j, this.A00) + this.A01;
    }

    public final boolean A06(long j, boolean z) {
        DhD dhD = this.A02;
        if (!z) {
            long jA0S = BV7.A0S(dhD.AFg(), dhD.AK9(this.A00));
            return C8j3.A1R((j > (this.A04 + this.A02.ALf(jA0S) + this.A02.AEz(jA0S, this.A00)) ? 1 : (j == (this.A04 + this.A02.ALf(jA0S) + this.A02.AEz(jA0S, this.A00)) ? 0 : -1)));
        }
        long jAK9 = dhD.AK9(this.A00);
        if (jAK9 != -1) {
            if (jAK9 <= 0) {
                return false;
            }
            DhD dhD2 = this.A02;
            long jA0S2 = BV7.A0S(dhD2.AFg(), jAK9);
            if (j >= this.A04 + dhD2.ALf(jA0S2) + this.A02.AEz(jA0S2, this.A00)) {
                return false;
            }
        }
        return true;
    }

    public C5432DiT(InterfaceC5417DiD interfaceC5417DiD, DEY dey, DhD dhD, C5376DhT c5376DhT, AbstractC5553DkW abstractC5553DkW, long j, long j2, long j3, boolean z) {
        this.A04 = j;
        this.A00 = j2;
        this.A03 = abstractC5553DkW;
        this.A07 = c5376DhT;
        this.A01 = j3;
        this.A05 = interfaceC5417DiD;
        this.A02 = dhD;
        this.A08 = z;
        this.A06 = dey == null ? new DEY(true) : dey;
    }

    public static long A00(DhD dhD, int i, long j, long j2) {
        long jAK9 = dhD.AK9(j2);
        if (i <= 0 || jAK9 == -1 || jAK9 <= 0) {
            return j;
        }
        long jA0S = BV7.A0S(jAK9, j);
        return Math.max(j, Math.min(dhD.AKA((dhD.ALf(jA0S) + dhD.AEz(jA0S, j2)) - BV6.A0H(i), j2), jA0S));
    }

    public final long A04(long j) {
        return DhD.A00(this, j) + this.A02.AEz(j - this.A01, this.A00);
    }
}
