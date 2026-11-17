package X;

/* renamed from: X.Dto, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6005Dto implements InterfaceC6022DuF {
    public boolean A00;
    public final InterfaceC6022DuF A01;
    public final /* synthetic */ C6001Dtk A02;

    public C6005Dto(C6001Dtk c6001Dtk, InterfaceC6022DuF interfaceC6022DuF) {
        this.A02 = c6001Dtk;
        this.A01 = interfaceC6022DuF;
    }

    @Override // X.InterfaceC6022DuF
    public final void AQQ() {
        this.A01.AQQ();
    }

    @Override // X.InterfaceC6022DuF
    public final int AZE(Di2 di2, C5406Dhz c5406Dhz, int i) {
        C6001Dtk c6001Dtk = this.A02;
        if (AnonymousClass002.A1L((c6001Dtk.A01 > (-9223372036854775807L) ? 1 : (c6001Dtk.A01 == (-9223372036854775807L) ? 0 : -1)))) {
            return -3;
        }
        if (this.A00) {
            ((AbstractC5364DhG) di2).A00 = 4;
            return -4;
        }
        long jAD8 = c6001Dtk.AD8();
        int iAZE = this.A01.AZE(di2, c5406Dhz, i);
        if (iAZE != -5) {
            long j = c6001Dtk.A00;
            if (j == Long.MIN_VALUE || (iAZE != -4 ? !(iAZE == -3 && jAD8 == Long.MIN_VALUE && !di2.A03) : di2.A00 < j)) {
                return iAZE;
            }
            di2.A02();
            ((AbstractC5364DhG) di2).A00 = 4;
            this.A00 = true;
            return -4;
        }
        C6154Dwx c6154Dwx = c5406Dhz.A00;
        c6154Dwx.getClass();
        int i2 = c6154Dwx.A0B;
        if (i2 != 0 || c6154Dwx.A0C != 0) {
            if (c6001Dtk.A02 != 0) {
                i2 = 0;
            }
            int i3 = c6001Dtk.A00 == Long.MIN_VALUE ? c6154Dwx.A0C : 0;
            C6162Dx5 c6162Dx5A01 = C6162Dx5.A01(c6154Dwx);
            c6162Dx5A01.A09 = i2;
            c6162Dx5A01.A0A = i3;
            c5406Dhz.A00 = BV6.A0U(c6162Dx5A01);
        }
        return -5;
    }

    @Override // X.InterfaceC6022DuF
    public final int Afl(long j) {
        if (AnonymousClass002.A1L((this.A02.A01 > (-9223372036854775807L) ? 1 : (this.A02.A01 == (-9223372036854775807L) ? 0 : -1)))) {
            return -3;
        }
        return this.A01.Afl(j);
    }

    @Override // X.InterfaceC6022DuF
    public final boolean isReady() {
        return !AnonymousClass002.A1L((this.A02.A01 > (-9223372036854775807L) ? 1 : (this.A02.A01 == (-9223372036854775807L) ? 0 : -1))) && this.A01.isReady();
    }
}
