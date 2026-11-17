package X;

/* renamed from: X.Dtl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6002Dtl implements InterfaceC6006Dtp, InterfaceC5503Djf {
    public InterfaceC5503Djf A00;
    public final InterfaceC6006Dtp A01;
    public final long A02;

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final boolean A7A(Du1 du1) {
        InterfaceC6006Dtp interfaceC6006Dtp = this.A01;
        long j = du1.A02;
        return interfaceC6006Dtp.A7A(new Du1(du1.A01, j - this.A02, du1.A00));
    }

    @Override // X.InterfaceC6006Dtp
    public final void A94(long j, boolean z) {
        this.A01.A94(j - this.A02, z);
    }

    @Override // X.InterfaceC6006Dtp
    public final long ACF(DpX dpX, long j) {
        InterfaceC6006Dtp interfaceC6006Dtp = this.A01;
        long j2 = this.A02;
        return interfaceC6006Dtp.ACF(dpX, j - j2) + j2;
    }

    @Override // X.InterfaceC5487DjP
    public final long AD6(long j) {
        return this.A01.AD6(j);
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final long AD8() {
        long jAD8 = this.A01.AD8();
        if (jAD8 != Long.MIN_VALUE) {
            return jAD8 + this.A02;
        }
        return Long.MIN_VALUE;
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final long AI5() {
        long jAI5 = this.A01.AI5();
        if (jAI5 != Long.MIN_VALUE) {
            return jAI5 + this.A02;
        }
        return Long.MIN_VALUE;
    }

    @Override // X.InterfaceC6006Dtp
    public final C5414DiA ALu() {
        return this.A01.ALu();
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final boolean AOd() {
        return this.A01.AOd();
    }

    @Override // X.InterfaceC6006Dtp
    public final void AQR() {
        this.A01.AQR();
    }

    @Override // X.InterfaceC5495DjX
    public final /* bridge */ /* synthetic */ void ASS(InterfaceC5487DjP interfaceC5487DjP) {
        InterfaceC5503Djf interfaceC5503Djf = this.A00;
        interfaceC5503Djf.getClass();
        interfaceC5503Djf.ASS(this);
    }

    @Override // X.InterfaceC5503Djf
    public final void AUv(InterfaceC6006Dtp interfaceC6006Dtp) {
        InterfaceC5503Djf interfaceC5503Djf = this.A00;
        interfaceC5503Djf.getClass();
        interfaceC5503Djf.AUv(this);
    }

    @Override // X.InterfaceC6006Dtp
    public final void AYP(InterfaceC5503Djf interfaceC5503Djf, long j) {
        this.A00 = interfaceC5503Djf;
        this.A01.AYP(this, j - this.A02);
    }

    @Override // X.InterfaceC6006Dtp
    public final long AZF() {
        long jAZF = this.A01.AZF();
        if (jAZF != -9223372036854775807L) {
            return jAZF + this.A02;
        }
        return -9223372036854775807L;
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final void AZv(long j) {
        this.A01.AZv(j - this.A02);
    }

    @Override // X.InterfaceC6006Dtp
    public final long AcP(long j) {
        InterfaceC6006Dtp interfaceC6006Dtp = this.A01;
        long j2 = this.A02;
        return interfaceC6006Dtp.AcP(j - j2) + j2;
    }

    @Override // X.InterfaceC6006Dtp
    public final long AcS(InterfaceC6022DuF[] interfaceC6022DuFArr, InterfaceC5441Dic[] interfaceC5441DicArr, boolean[] zArr, boolean[] zArr2, long j) {
        int length = interfaceC6022DuFArr.length;
        InterfaceC6022DuF[] interfaceC6022DuFArr2 = new InterfaceC6022DuF[length];
        int i = 0;
        while (true) {
            InterfaceC6022DuF interfaceC6022DuF = null;
            if (i >= length) {
                break;
            }
            Du0 du0 = (Du0) interfaceC6022DuFArr[i];
            if (du0 != null) {
                interfaceC6022DuF = du0.A00;
            }
            interfaceC6022DuFArr2[i] = interfaceC6022DuF;
            i++;
        }
        InterfaceC6006Dtp interfaceC6006Dtp = this.A01;
        long j2 = this.A02;
        long jAcS = interfaceC6006Dtp.AcS(interfaceC6022DuFArr2, interfaceC5441DicArr, zArr, zArr2, j - j2);
        for (int i2 = 0; i2 < length; i2++) {
            InterfaceC6022DuF interfaceC6022DuF2 = interfaceC6022DuFArr2[i2];
            if (interfaceC6022DuF2 == null) {
                interfaceC6022DuFArr[i2] = null;
            } else {
                InterfaceC6022DuF interfaceC6022DuF3 = interfaceC6022DuFArr[i2];
                if (interfaceC6022DuF3 == null || ((Du0) interfaceC6022DuF3).A00 != interfaceC6022DuF2) {
                    interfaceC6022DuFArr[i2] = new Du0(interfaceC6022DuF2, j2);
                }
            }
        }
        return jAcS + j2;
    }

    public C6002Dtl(InterfaceC6006Dtp interfaceC6006Dtp, long j) {
        this.A01 = interfaceC6006Dtp;
        this.A02 = j;
    }
}
