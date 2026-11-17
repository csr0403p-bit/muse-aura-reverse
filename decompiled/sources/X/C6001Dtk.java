package X;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;

/* renamed from: X.Dtk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6001Dtk implements InterfaceC6006Dtp, InterfaceC5503Djf {
    public long A00;
    public long A01;
    public long A02;
    public ClippingMediaSource$IllegalClippingException A03;
    public InterfaceC5503Djf A04;
    public C6005Dto[] A05 = new C6005Dto[0];
    public final InterfaceC6006Dtp A06;

    @Override // X.InterfaceC6006Dtp
    public final long ACF(DpX dpX, long j) {
        DpX dpX2 = dpX;
        long j2 = this.A02;
        if (j == j2) {
            return j2;
        }
        long j3 = dpX.A01;
        long jMax = Math.max(0L, Math.min(j3, j - j2));
        long j4 = dpX.A00;
        long j5 = this.A00;
        long jMax2 = Math.max(0L, Math.min(j4, j5 == Long.MIN_VALUE ? LinkEncryptedPairingKt.LINK_COUNTER_MAX : j5 - j));
        if (jMax != j3 || jMax2 != j4) {
            dpX2 = new DpX(jMax, jMax2);
        }
        return this.A06.ACF(dpX2, j);
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final boolean A7A(Du1 du1) {
        return this.A06.A7A(du1);
    }

    @Override // X.InterfaceC6006Dtp
    public final void A94(long j, boolean z) {
        this.A06.A94(j, z);
    }

    @Override // X.InterfaceC5487DjP
    public final long AD6(long j) {
        return this.A06.AD6(j);
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final long AD8() {
        long jAD8 = this.A06.AD8();
        if (jAD8 != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || jAD8 < j) {
                return jAD8;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final long AI5() {
        long jAI5 = this.A06.AI5();
        if (jAI5 != Long.MIN_VALUE) {
            long j = this.A00;
            if (j == Long.MIN_VALUE || jAI5 < j) {
                return jAI5;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // X.InterfaceC6006Dtp
    public final C5414DiA ALu() {
        return this.A06.ALu();
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final boolean AOd() {
        return this.A06.AOd();
    }

    @Override // X.InterfaceC6006Dtp
    public final void AQR() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.A03;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        this.A06.AQR();
    }

    @Override // X.InterfaceC5495DjX
    public final /* bridge */ /* synthetic */ void ASS(InterfaceC5487DjP interfaceC5487DjP) {
        InterfaceC5503Djf interfaceC5503Djf = this.A04;
        interfaceC5503Djf.getClass();
        interfaceC5503Djf.ASS(this);
    }

    @Override // X.InterfaceC5503Djf
    public final void AUv(InterfaceC6006Dtp interfaceC6006Dtp) {
        if (this.A03 == null) {
            InterfaceC5503Djf interfaceC5503Djf = this.A04;
            interfaceC5503Djf.getClass();
            interfaceC5503Djf.AUv(this);
        }
    }

    @Override // X.InterfaceC6006Dtp
    public final void AYP(InterfaceC5503Djf interfaceC5503Djf, long j) {
        this.A04 = interfaceC5503Djf;
        this.A06.AYP(this, j);
    }

    @Override // X.InterfaceC6006Dtp
    public final long AZF() {
        if (AnonymousClass002.A1L((this.A01 > (-9223372036854775807L) ? 1 : (this.A01 == (-9223372036854775807L) ? 0 : -1)))) {
            long j = this.A01;
            this.A01 = -9223372036854775807L;
            long jAZF = AZF();
            return jAZF != -9223372036854775807L ? jAZF : j;
        }
        long jAZF2 = this.A06.AZF();
        if (jAZF2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.A02;
        long j3 = this.A00;
        long jMax = Math.max(jAZF2, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // X.InterfaceC6006Dtp, X.InterfaceC5487DjP
    public final void AZv(long j) {
        this.A06.AZv(j);
    }

    @Override // X.InterfaceC6006Dtp
    public final long AcS(InterfaceC6022DuF[] interfaceC6022DuFArr, InterfaceC5441Dic[] interfaceC5441DicArr, boolean[] zArr, boolean[] zArr2, long j) {
        long j2;
        int length = interfaceC6022DuFArr.length;
        C6005Dto[] c6005DtoArr = new C6005Dto[length];
        this.A05 = c6005DtoArr;
        InterfaceC6022DuF[] interfaceC6022DuFArr2 = new InterfaceC6022DuF[length];
        int i = 0;
        while (true) {
            InterfaceC6022DuF interfaceC6022DuF = null;
            if (i >= length) {
                break;
            }
            C6005Dto c6005Dto = (C6005Dto) interfaceC6022DuFArr[i];
            c6005DtoArr[i] = c6005Dto;
            if (c6005Dto != null) {
                interfaceC6022DuF = c6005Dto.A01;
            }
            interfaceC6022DuFArr2[i] = interfaceC6022DuF;
            i++;
        }
        long jAcS = this.A06.AcS(interfaceC6022DuFArr2, interfaceC5441DicArr, zArr, zArr2, j);
        long j3 = this.A00;
        long jMax = Math.max(jAcS, j);
        if (j3 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j3);
        }
        if (AnonymousClass002.A1L((this.A01 > (-9223372036854775807L) ? 1 : (this.A01 == (-9223372036854775807L) ? 0 : -1)))) {
            if (jAcS >= j) {
                if (jAcS != 0) {
                    for (InterfaceC5441Dic interfaceC5441Dic : interfaceC5441DicArr) {
                        if (interfaceC5441Dic != null) {
                            C6154Dwx c6154DwxAKF = interfaceC5441Dic.AKF();
                            if (!AbstractC6161Dx4.A0A(c6154DwxAKF.A0b, c6154DwxAKF.A0W)) {
                            }
                        }
                    }
                }
                j2 = -9223372036854775807L;
            }
            j2 = jMax;
            break;
        } else {
            j2 = -9223372036854775807L;
        }
        this.A01 = j2;
        for (int i2 = 0; i2 < length; i2++) {
            InterfaceC6022DuF interfaceC6022DuF2 = interfaceC6022DuFArr2[i2];
            C6005Dto[] c6005DtoArr2 = this.A05;
            if (interfaceC6022DuF2 == null) {
                c6005DtoArr2[i2] = null;
            } else {
                C6005Dto c6005Dto2 = c6005DtoArr2[i2];
                if (c6005Dto2 == null || c6005Dto2.A01 != interfaceC6022DuFArr2[i2]) {
                    c6005DtoArr2[i2] = new C6005Dto(this, interfaceC6022DuFArr2[i2]);
                }
            }
            interfaceC6022DuFArr[i2] = c6005DtoArr2[i2];
        }
        return jMax;
    }

    public C6001Dtk(InterfaceC6006Dtp interfaceC6006Dtp, long j, long j2, boolean z) {
        this.A06 = interfaceC6006Dtp;
        this.A01 = z ? j : -9223372036854775807L;
        this.A02 = j;
        this.A00 = j2;
    }

    @Override // X.InterfaceC6006Dtp
    public final long AcP(long j) {
        this.A01 = -9223372036854775807L;
        for (C6005Dto c6005Dto : this.A05) {
            if (c6005Dto != null) {
                c6005Dto.A00 = false;
            }
        }
        long jAcP = this.A06.AcP(j);
        long j2 = this.A02;
        long j3 = this.A00;
        long jMax = Math.max(jAcP, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }
}
