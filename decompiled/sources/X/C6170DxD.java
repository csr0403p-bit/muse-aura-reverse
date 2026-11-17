package X;

import androidx.media3.common.util.Util;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.io.EOFException;

/* renamed from: X.DxD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6170DxD implements InterfaceC5563Dkg {
    public C6154Dwx A00;
    public boolean A01;
    public InterfaceC6304E0a A04;
    public final InterfaceC5563Dkg A07;
    public final InterfaceC5885DrL A08;
    public int A03 = 0;
    public int A02 = 0;
    public byte[] A05 = Util.A07;
    public final E1P A06 = BV6.A0X();

    @Override // X.InterfaceC5563Dkg
    public final /* synthetic */ int Abu(C1L c1l, int i, boolean z) {
        return Aby(c1l, i, 0, z);
    }

    @Override // X.InterfaceC5563Dkg
    public final /* synthetic */ void Abv(E1P e1p, int i) {
        Abw(e1p, i, 0);
    }

    private void A00(int i) {
        byte[] bArr = this.A05;
        int length = bArr.length;
        int i2 = this.A02;
        if (length - i2 < i) {
            int i3 = this.A03;
            int i4 = i2 - i3;
            int iMax = Math.max(i4 * 2, i + i4);
            byte[] bArr2 = iMax <= length ? bArr : new byte[iMax];
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            this.A03 = 0;
            this.A02 = i4;
            this.A05 = bArr2;
        }
    }

    @Override // X.InterfaceC5563Dkg
    public final void ABq(C6154Dwx c6154Dwx) {
        String str = c6154Dwx.A0b;
        str.getClass();
        C1G.A07(AnonymousClass002.A1Q(AbstractC6161Dx4.A01(str), 3));
        if (!c6154Dwx.equals(this.A00)) {
            this.A00 = c6154Dwx;
            InterfaceC5885DrL interfaceC5885DrL = this.A08;
            this.A04 = interfaceC5885DrL.Agg(c6154Dwx) ? interfaceC5885DrL.A7S(c6154Dwx) : null;
        }
        InterfaceC6304E0a interfaceC6304E0a = this.A04;
        InterfaceC5563Dkg interfaceC5563Dkg = this.A07;
        if (interfaceC6304E0a != null) {
            C6162Dx5 c6162Dx5A01 = C6162Dx5.A01(c6154Dwx);
            c6162Dx5A01.A06("application/x-media3-cues");
            c6162Dx5A01.A0U = str;
            c6162Dx5A01.A0P = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
            c6162Dx5A01.A06 = this.A08.AEI(c6154Dwx);
            c6154Dwx = BV6.A0U(c6162Dx5A01);
        }
        interfaceC5563Dkg.ABq(c6154Dwx);
    }

    @Override // X.InterfaceC5563Dkg
    public final void Abw(E1P e1p, int i, int i2) {
        if (this.A04 == null) {
            this.A07.Abw(e1p, i, i2);
            return;
        }
        A00(i);
        e1p.A0U(this.A05, this.A02, i);
        this.A02 += i;
    }

    @Override // X.InterfaceC5563Dkg
    public final int Aby(C1L c1l, int i, int i2, boolean z) throws EOFException {
        if (this.A04 == null) {
            return this.A07.Aby(c1l, i, i2, z);
        }
        A00(i);
        int i3 = c1l.read(this.A05, this.A02, i);
        if (i3 != -1) {
            this.A02 += i3;
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // X.InterfaceC5563Dkg
    public final void Abz(DjB djB, final int i, int i2, int i3, final long j) {
        if (this.A04 == null) {
            this.A07.Abz(djB, i, i2, i3, j);
            return;
        }
        C1G.A09(AnonymousClass002.A1Y(djB), "DRM on subtitles is not supported");
        int i4 = (this.A02 - i3) - i2;
        try {
            InterfaceC6304E0a interfaceC6304E0a = this.A04;
            byte[] bArr = this.A05;
            interfaceC6304E0a.AXd(new InterfaceC5344Dgn() { // from class: X.Dxg
                @Override // X.InterfaceC5344Dgn
                public final void accept(Object obj) {
                    C6170DxD c6170DxD = this.A02;
                    long j2 = j;
                    int i5 = i;
                    E00 e00 = (E00) obj;
                    C1G.A05(c6170DxD.A00);
                    byte[] bArrA00 = E0I.A00(e00.A03, e00.A00);
                    E1P e1p = c6170DxD.A06;
                    int length = bArrA00.length;
                    e1p.A0T(bArrA00, length);
                    InterfaceC5563Dkg interfaceC5563Dkg = c6170DxD.A07;
                    interfaceC5563Dkg.Abv(e1p, length);
                    long j3 = e00.A02;
                    long j4 = c6170DxD.A00.A0R;
                    int i6 = (j4 > LinkEncryptedPairingKt.LINK_COUNTER_MAX ? 1 : (j4 == LinkEncryptedPairingKt.LINK_COUNTER_MAX ? 0 : -1));
                    if (j3 == -9223372036854775807L) {
                        C1G.A08(AnonymousClass002.A1M(i6));
                    } else {
                        j2 = i6 == 0 ? j3 + j2 : j3 + j4;
                    }
                    InterfaceC5563Dkg.A01(interfaceC5563Dkg, i5 | 1, length, j2);
                }
            }, E03.A02, bArr, i4, i2);
        } catch (RuntimeException e) {
            if (!this.A01) {
                throw e;
            }
            CNC.A06("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.A03 = i5;
        if (i5 == this.A02) {
            this.A03 = 0;
            this.A02 = 0;
        }
    }

    public C6170DxD(InterfaceC5563Dkg interfaceC5563Dkg, InterfaceC5885DrL interfaceC5885DrL) {
        this.A07 = interfaceC5563Dkg;
        this.A08 = interfaceC5885DrL;
    }

    @Override // X.InterfaceC5563Dkg
    public final /* synthetic */ void A9m(long j) {
    }
}
