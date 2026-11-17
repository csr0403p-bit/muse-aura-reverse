package X;

import java.io.IOException;

/* renamed from: X.Dtm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6003Dtm implements InterfaceC6006Dtp, InterfaceC5503Djf {
    public long A00 = -9223372036854775807L;
    public InterfaceC5503Djf A01;
    public InterfaceC6006Dtp A02;
    public InterfaceC6009Dts A03;
    public final long A04;
    public final Dy6 A05;
    public final InterfaceC5538DkF A06;

    public final void A00(Dy6 dy6) {
        long j = this.A04;
        long j2 = this.A00;
        if (j2 == -9223372036854775807L) {
            j2 = j;
        }
        InterfaceC6009Dts interfaceC6009Dts = this.A03;
        interfaceC6009Dts.getClass();
        InterfaceC6006Dtp interfaceC6006DtpA7x = interfaceC6009Dts.A7x(dy6, this.A06, j2);
        this.A02 = interfaceC6006DtpA7x;
        if (this.A01 != null) {
            interfaceC6006DtpA7x.AYP(this, j2);
        }
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final boolean A7A(Du1 du1) {
        InterfaceC6006Dtp interfaceC6006Dtp = this.A02;
        return interfaceC6006Dtp != null && interfaceC6006Dtp.A7A(du1);
    }

    @Override // X.InterfaceC6006Dtp
    public final void A94(long j, boolean z) {
        this.A02.A94(j, z);
    }

    @Override // X.InterfaceC6006Dtp
    public final long ACF(DpX dpX, long j) {
        return this.A02.ACF(dpX, j);
    }

    @Override // X.InterfaceC5487DjP
    public final long AD6(long j) {
        InterfaceC6006Dtp interfaceC6006Dtp = this.A02;
        if (interfaceC6006Dtp == null) {
            return 0L;
        }
        return interfaceC6006Dtp.AD6(j);
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final long AD8() {
        return this.A02.AD8();
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final long AI5() {
        return this.A02.AI5();
    }

    @Override // X.InterfaceC6006Dtp
    public final C5414DiA ALu() {
        return this.A02.ALu();
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final boolean AOd() {
        InterfaceC6006Dtp interfaceC6006Dtp = this.A02;
        return interfaceC6006Dtp != null && interfaceC6006Dtp.AOd();
    }

    @Override // X.InterfaceC6006Dtp
    public final void AQR() throws IOException {
        try {
            InterfaceC6006Dtp interfaceC6006Dtp = this.A02;
            if (interfaceC6006Dtp != null) {
                interfaceC6006Dtp.AQR();
                return;
            }
            InterfaceC6009Dts interfaceC6009Dts = this.A03;
            if (interfaceC6009Dts != null) {
                interfaceC6009Dts.AQS();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // X.InterfaceC5495DjX
    public final /* bridge */ /* synthetic */ void ASS(InterfaceC5487DjP interfaceC5487DjP) {
        this.A01.ASS(this);
    }

    @Override // X.InterfaceC5503Djf
    public final void AUv(InterfaceC6006Dtp interfaceC6006Dtp) {
        this.A01.AUv(this);
    }

    @Override // X.InterfaceC6006Dtp
    public final void AYP(InterfaceC5503Djf interfaceC5503Djf, long j) {
        this.A01 = interfaceC5503Djf;
        InterfaceC6006Dtp interfaceC6006Dtp = this.A02;
        if (interfaceC6006Dtp != null) {
            long j2 = this.A04;
            long j3 = this.A00;
            if (j3 == -9223372036854775807L) {
                j3 = j2;
            }
            interfaceC6006Dtp.AYP(this, j3);
        }
    }

    @Override // X.InterfaceC6006Dtp
    public final long AZF() {
        return this.A02.AZF();
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final void AZv(long j) {
        this.A02.AZv(j);
    }

    @Override // X.InterfaceC6006Dtp
    public final long AcP(long j) {
        return this.A02.AcP(j);
    }

    @Override // X.InterfaceC6006Dtp
    public final long AcS(InterfaceC6022DuF[] interfaceC6022DuFArr, InterfaceC5441Dic[] interfaceC5441DicArr, boolean[] zArr, boolean[] zArr2, long j) {
        long j2 = this.A00;
        if (j2 == -9223372036854775807L || j != this.A04) {
            j2 = j;
        }
        this.A00 = -9223372036854775807L;
        return this.A02.AcS(interfaceC6022DuFArr, interfaceC5441DicArr, zArr, zArr2, j2);
    }

    public C6003Dtm(Dy6 dy6, InterfaceC5538DkF interfaceC5538DkF, long j) {
        this.A05 = dy6;
        this.A06 = interfaceC5538DkF;
        this.A04 = j;
    }
}
