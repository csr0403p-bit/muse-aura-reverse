package X;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class Dh1 implements DFB<C5580Dky> {
    public final DmR A00;
    public final C5507Djj A01;
    public final C5357Dh2 A02;
    public final C5358Dh3 A03;
    public final boolean A04;
    public final Dn8 A05;
    public final /* synthetic */ C5593DlT A06;

    public Dh1(DmR dmR, Dn8 dn8, C5507Djj c5507Djj, C5593DlT c5593DlT, C5357Dh2 c5357Dh2, C5358Dh3 c5358Dh3, boolean z) {
        this.A06 = c5593DlT;
        this.A03 = c5358Dh3;
        this.A05 = dn8;
        this.A00 = dmR;
        this.A04 = z;
        this.A01 = c5507Djj;
        this.A02 = c5357Dh2;
    }

    @Override // X.DFB
    public final /* bridge */ /* synthetic */ void AVu(C5580Dky c5580Dky) {
        String str;
        C5580Dky c5580Dky2 = c5580Dky;
        this.A02.A00(C79.A0C);
        C5593DlT c5593DlT = this.A06;
        DEM dem = c5593DlT.A09;
        if (dem != null && (str = c5580Dky2.A0Q) != null) {
            dem.A05(this.A00.A03.A0Q, str, c5580Dky2.A03);
        }
        if (this.A04) {
            long jA00 = C5593DlT.A00(this.A00, this.A01, c5593DlT);
            AbstractC3426CMt.A03("HeroExo2LiveInitHelper", "Inline manifest was null, setting live edge latency now to: %d", BV4.A1X(jA00));
            this.A03.A04 = jA00;
        }
        C5358Dh3 c5358Dh3 = this.A03;
        c5358Dh3.A0E = c5580Dky2;
        if (c5358Dh3.A08 != null) {
            if (c5358Dh3.A0S.A1K) {
                C5358Dh3.A08(c5358Dh3, false);
            } else {
                C5358Dh3.A07(c5358Dh3, false);
            }
        }
        c5593DlT.A0U.AVu(c5580Dky2);
    }

    @Override // X.DFB
    public final void AVv(IOException iOException) {
        this.A05.A00(iOException);
        this.A06.A0U.AVv(iOException);
    }
}
