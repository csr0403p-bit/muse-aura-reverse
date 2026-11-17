package X;

import androidx.media3.common.util.Util;

/* renamed from: X.Dny, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5715Dny implements InterfaceC5858Dqs {
    public float A01;
    public float A07;
    public final float A0C;
    public final float A0D;
    public final long A0E;
    public final float A0F;
    public final float A0G;
    public final long A0H;
    public final long A0I;
    public long A09 = -9223372036854775807L;
    public long A0B = -9223372036854775807L;
    public long A0A = -9223372036854775807L;
    public long A04 = -9223372036854775807L;
    public float A00 = 1.0f;
    public long A08 = -9223372036854775807L;
    public long A03 = -9223372036854775807L;
    public long A02 = -9223372036854775807L;
    public long A06 = -9223372036854775807L;
    public long A05 = -9223372036854775807L;

    private void A00() {
        long j;
        long j2 = this.A09;
        if (j2 != -9223372036854775807L) {
            j = this.A0B;
            if (j == -9223372036854775807L) {
                long j3 = this.A0A;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.A04;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.A03 != j) {
            this.A03 = j;
            this.A02 = j;
            this.A06 = -9223372036854775807L;
            this.A05 = -9223372036854775807L;
            this.A08 = -9223372036854775807L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    @Override // X.InterfaceC5858Dqs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float ACE(long r14, long r16) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5715Dny.ACE(long, long):float");
    }

    @Override // X.InterfaceC5858Dqs
    public final long ALV() {
        return this.A02;
    }

    @Override // X.InterfaceC5858Dqs
    public final void ARQ() {
        long j = this.A02;
        if (j != -9223372036854775807L) {
            long j2 = j + this.A0I;
            this.A02 = j2;
            long j3 = this.A04;
            if (j3 != -9223372036854775807L && j2 > j3) {
                this.A02 = j3;
            }
            this.A08 = -9223372036854775807L;
        }
    }

    @Override // X.InterfaceC5858Dqs
    public final void Adf(C5777DpJ c5777DpJ) {
        this.A09 = Util.A0A(c5777DpJ.A04);
        this.A0A = Util.A0A(c5777DpJ.A03);
        this.A04 = Util.A0A(c5777DpJ.A02);
        float f = c5777DpJ.A01;
        if (f == -3.4028235E38f) {
            f = this.A0G;
        }
        this.A07 = f;
        float f2 = c5777DpJ.A00;
        if (f2 == -3.4028235E38f) {
            f2 = this.A0F;
        }
        this.A01 = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.A09 = -9223372036854775807L;
        }
        A00();
    }

    @Override // X.InterfaceC5858Dqs
    public final void Aev(long j) {
        this.A0B = j;
        A00();
    }

    public C5715Dny(float f, float f2, float f3, float f4, long j, long j2, long j3) {
        this.A0G = f;
        this.A0F = f2;
        this.A0E = j;
        this.A0D = f3;
        this.A0H = j2;
        this.A0I = j3;
        this.A0C = f4;
        this.A07 = f;
        this.A01 = f2;
    }
}
