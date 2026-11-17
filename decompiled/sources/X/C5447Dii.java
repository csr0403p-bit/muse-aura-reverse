package X;

import java.io.IOException;

/* renamed from: X.Dii, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5447Dii implements InterfaceC6022DuF {
    public final int A00;
    public final /* synthetic */ C5427DiO A01;

    public C5447Dii(C5427DiO c5427DiO, int i) {
        this.A01 = c5427DiO;
        this.A00 = i;
    }

    @Override // X.InterfaceC6022DuF
    public final void AQQ() throws IOException {
        C5427DiO c5427DiO = this.A01;
        c5427DiO.A0H[this.A00].A08();
        C5427DiO.A03(c5427DiO);
    }

    @Override // X.InterfaceC6022DuF
    public final int AZE(Di2 di2, C5406Dhz c5406Dhz, int i) {
        C5427DiO c5427DiO = this.A01;
        int i2 = this.A00;
        if (c5427DiO.A0C || C5427DiO.A06(c5427DiO)) {
            return -3;
        }
        C5427DiO.A04(c5427DiO, i2);
        int iA05 = c5427DiO.A0H[i2].A05(di2, c5406Dhz, i, c5427DiO.A0B);
        if (iA05 == -3) {
            C5427DiO.A05(c5427DiO, i2);
        }
        return iA05;
    }

    @Override // X.InterfaceC6022DuF
    public final int Afl(long j) {
        C5427DiO c5427DiO = this.A01;
        int i = this.A00;
        if (c5427DiO.A0C || C5427DiO.A06(c5427DiO)) {
            return 0;
        }
        C5427DiO.A04(c5427DiO, i);
        C5426DiN c5426DiN = c5427DiO.A0H[i];
        int iA04 = c5426DiN.A04(j, c5427DiO.A0B);
        c5426DiN.A0B(iA04);
        if (iA04 == 0) {
            C5427DiO.A05(c5427DiO, i);
        }
        return iA04;
    }

    @Override // X.InterfaceC6022DuF
    public final boolean isReady() {
        C5427DiO c5427DiO = this.A01;
        return (c5427DiO.A0C || C5427DiO.A06(c5427DiO) || !c5427DiO.A0H[this.A00].A0E(c5427DiO.A0B)) ? false : true;
    }
}
