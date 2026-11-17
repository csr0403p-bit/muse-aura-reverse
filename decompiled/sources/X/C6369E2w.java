package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.E2w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6369E2w implements InterfaceC6401E4d {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public C6154Dwx A05;
    public InterfaceC5563Dkg A06;
    public String A07;
    public final int A0C;
    public final E1P A0D;
    public final String A0E;
    public int A09 = 0;
    public long A0B = -9223372036854775807L;
    public final AtomicInteger A0F = new AtomicInteger();
    public int A08 = -1;
    public int A0A = -1;

    @Override // X.InterfaceC6401E4d
    public final void AcK() {
        this.A09 = 0;
        this.A00 = 0;
        this.A03 = 0;
        this.A0B = -9223372036854775807L;
        this.A0F.set(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0474, code lost:
    
        r0 = "Multiple audio presentations or assets not supported";
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0488, code lost:
    
        throw androidx.media3.common.ParserException.A00(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x040b  */
    @Override // X.InterfaceC6401E4d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A6w(X.E1P r21) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6369E2w.A6w(X.E1P):void");
    }

    public C6369E2w(String str, int i, int i2) {
        this.A0D = BV6.A0Z(new byte[i2]);
        this.A0E = str;
        this.A0C = i;
    }

    public static void A00(C6369E2w c6369E2w, String str, int i, int i2) {
        if (i2 == -2147483647 || i == -1) {
            return;
        }
        C6154Dwx c6154Dwx = c6369E2w.A05;
        if (c6154Dwx != null && i == c6154Dwx.A06 && i2 == c6154Dwx.A0L && C6xC.A00(str, c6154Dwx.A0b)) {
            return;
        }
        C6154Dwx c6154Dwx2 = c6369E2w.A05;
        C6162Dx5 c6162Dx5A00 = c6154Dwx2 == null ? C6162Dx5.A00() : C6162Dx5.A01(c6154Dwx2);
        c6162Dx5A00.A0W = c6369E2w.A07;
        c6162Dx5A00.A05("video/mp2t");
        C6162Dx5.A03(c6162Dx5A00, str, i, i2);
        c6162Dx5A00.A0Y = c6369E2w.A0E;
        c6162Dx5A00.A0H = c6369E2w.A0C;
        C6154Dwx c6154DwxA0U = BV6.A0U(c6162Dx5A00);
        c6369E2w.A05 = c6154DwxA0U;
        c6369E2w.A06.ABq(c6154DwxA0U);
    }

    private boolean A01(E1P e1p, byte[] bArr, int i) {
        int iA04 = e1p.A04();
        int i2 = this.A00;
        int iA0F = C8j3.A0F(i, i2, iA04);
        e1p.A0U(bArr, i2, iA0F);
        int i3 = this.A00 + iA0F;
        this.A00 = i3;
        return AnonymousClass002.A1Q(i3, i);
    }

    @Override // X.InterfaceC6401E4d
    public final void A84(InterfaceC6413E4p interfaceC6413E4p, E4I e4i) {
        this.A07 = E4I.A01(e4i);
        this.A06 = E4I.A00(interfaceC6413E4p, e4i);
    }

    @Override // X.InterfaceC6401E4d
    public final void AXY(boolean z) {
    }

    @Override // X.InterfaceC6401E4d
    public final void AXZ(long j, int i) {
        this.A0B = j;
    }
}
