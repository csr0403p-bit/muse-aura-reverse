package X;

import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public final class GGL implements InterfaceC9378GGq {
    public final GGI A00;

    public static void A00(Object obj, int i, int i2) {
        ((GGL) obj).A00.A07(i, i2);
    }

    @Override // X.InterfaceC9378GGq
    public final void Aie(int i, boolean z) {
        GGH ggh = (GGH) this.A00;
        GGH.A01(ggh, 11);
        ggh.A0F(i << 3);
        byte b = z ? (byte) 1 : (byte) 0;
        byte[] bArr = ggh.A03;
        int i2 = ggh.A00;
        ggh.A00 = i2 + 1;
        bArr[i2] = b;
        ggh.A01++;
    }

    @Override // X.InterfaceC9378GGq
    public final void Aik(InterfaceC9366GGc interfaceC9366GGc, Object obj, int i) {
        GGI ggi = this.A00;
        int i2 = i << 3;
        ggi.A06(i2 | 3);
        interfaceC9366GGc.Aj3(ggi.A00, obj);
        ggi.A06(i2 | 4);
    }

    @Override // X.InterfaceC9378GGq
    public final void Aio(InterfaceC9366GGc interfaceC9366GGc, Object obj, int i) {
        GGI ggi = this.A00;
        GH2 gh2 = (GH2) obj;
        GHG.A09(ggi, i);
        ggi.A06(AbstractC9340GEx.A04(interfaceC9366GGc, gh2));
        interfaceC9366GGc.Aj3(ggi.A00, gh2);
    }

    @Override // X.InterfaceC9378GGq
    public final void Aiv(int i, int i2) {
        GGI ggi = this.A00;
        int iA0A = AbstractC7607F5u.A0A(i2);
        GGH ggh = (GGH) ggi;
        GHG.A07(ggh, i);
        ggh.A0F(iA0A);
    }

    public GGL(GGI ggi) {
        Charset charset = GGV.A03;
        this.A00 = ggi;
        ggi.A00 = this;
    }
}
