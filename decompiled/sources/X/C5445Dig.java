package X;

import androidx.media3.common.util.Util;
import java.io.IOException;

/* renamed from: X.Dig, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5445Dig implements InterfaceC6022DuF {
    public C5483DjL A00;
    public int A01;
    public boolean A03;
    public boolean A04;
    public long[] A05;
    public final C6154Dwx A06;
    public final DA0 A07 = new DA0();
    public long A02 = -9223372036854775807L;

    @Override // X.InterfaceC6022DuF
    public final void AQQ() {
    }

    public final void A00(long j) {
        int iA07 = Util.A07(this.A05, j, true);
        this.A01 = iA07;
        if (!this.A03 || iA07 != this.A05.length) {
            j = -9223372036854775807L;
        }
        this.A02 = j;
    }

    public final void A01(C5483DjL c5483DjL, boolean z) {
        int i = this.A01;
        long j = i == 0 ? -9223372036854775807L : this.A05[i - 1];
        this.A03 = z;
        this.A00 = c5483DjL;
        long[] jArr = c5483DjL.A02;
        this.A05 = jArr;
        long j2 = this.A02;
        if (j2 != -9223372036854775807L) {
            A00(j2);
        } else if (j != -9223372036854775807L) {
            this.A01 = Util.A07(jArr, j, false);
        }
    }

    @Override // X.InterfaceC6022DuF
    public final int AZE(Di2 di2, C5406Dhz c5406Dhz, int i) throws IOException {
        int i2 = this.A01;
        boolean zA1Q = AnonymousClass002.A1Q(i2, this.A05.length);
        if (zA1Q && !this.A03) {
            ((AbstractC5364DhG) di2).A00 = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.A04) {
            c5406Dhz.A00 = this.A06;
            this.A04 = true;
            return -5;
        }
        if (zA1Q) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.A01 = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrA00 = this.A07.A00(this.A00.A03[i2]);
            di2.A04(bArrA00.length);
            di2.A01.put(bArrA00);
        }
        di2.A00 = this.A05[i2];
        ((AbstractC5364DhG) di2).A00 = 1;
        return -4;
    }

    @Override // X.InterfaceC6022DuF
    public final int Afl(long j) {
        int iMax = Math.max(this.A01, Util.A07(this.A05, j, true));
        int i = iMax - this.A01;
        this.A01 = iMax;
        return i;
    }

    @Override // X.InterfaceC6022DuF
    public final boolean isReady() {
        return true;
    }

    public C5445Dig(C6154Dwx c6154Dwx, C5483DjL c5483DjL, boolean z) {
        this.A06 = c6154Dwx;
        this.A00 = c5483DjL;
        this.A05 = c5483DjL.A02;
        A01(c5483DjL, z);
    }
}
