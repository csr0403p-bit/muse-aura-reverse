package X;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes5.dex */
public final class E38 implements InterfaceC5458Dit {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public C5402Dhv A05;
    public InterfaceC6413E4p A06;
    public E3A A07;
    public InterfaceC5563Dkg A08;
    public E5V A09;
    public final E1P A0A;
    public final E5Z A0B;
    public final byte[] A0C;

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ InterfaceC5458Dit AMF() {
        return this;
    }

    @Override // X.InterfaceC5458Dit
    public final void AcL(long j, long j2) {
        if (j == 0) {
            this.A03 = 0;
        } else {
            E5V e5v = this.A09;
            if (e5v != null) {
                e5v.A01(j2);
            }
        }
        this.A04 = j2 != 0 ? -1L : 0L;
        this.A00 = 0;
        this.A0A.A0P(0);
    }

    @Override // X.InterfaceC5458Dit
    public final void release() {
    }

    @Override // X.InterfaceC5458Dit
    public final void ANb(InterfaceC6413E4p interfaceC6413E4p) {
        this.A06 = interfaceC6413E4p;
        this.A08 = interfaceC6413E4p.AhC(0, 1);
        interfaceC6413E4p.AAe();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0245 A[PHI: r1 r13
  0x0245: PHI (r1v9 X.Dhv) = (r1v8 X.Dhv), (r1v10 X.Dhv) binds: [B:102:0x0242, B:96:0x01f5] A[DONT_GENERATE, DONT_INLINE]
  0x0245: PHI (r13v2 X.Dhv) = (r13v0 X.Dhv), (r13v4 X.Dhv) binds: [B:102:0x0242, B:96:0x01f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x033d  */
    @Override // X.InterfaceC5458Dit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AZ4(X.E2K r27, X.C5542DkK r28) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E38.AZ4(X.E2K, X.DkK):int");
    }

    @Override // X.InterfaceC5458Dit
    public final boolean Afs(E2K e2k) {
        new E2H().A00(e2k, E2P.A01);
        E1P e1pA0Y = BV6.A0Y(4);
        e2k.AXi(e1pA0Y.A02, 0, 4);
        return e1pA0Y.A0H() == 1716281667;
    }

    public E38(int i) {
        this.A0C = new byte[42];
        E1P e1p = new E1P();
        e1p.A02 = new byte[32768];
        e1p.A00 = 0;
        this.A0A = e1p;
        this.A0B = new E5Z();
        this.A03 = 0;
    }

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ List AKl() {
        return ImmutableList.of();
    }

    public E38() {
        this(0);
    }
}
