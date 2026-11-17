package X;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.E2d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6352E2d implements InterfaceC5458Dit {
    public long A00;
    public InterfaceC6413E4p A01;
    public boolean A02;
    public long A03;
    public boolean A04;
    public final C6340E1q A05;
    public final E1P A06;
    public final E2U A07;
    public final E1P A08;

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ InterfaceC5458Dit AMF() {
        return this;
    }

    @Override // X.InterfaceC5458Dit
    public final void AcL(long j, long j2) {
        this.A04 = false;
        this.A07.AcK();
        this.A03 = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    @Override // X.InterfaceC5458Dit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Afs(X.E2K r10) {
        /*
            r9 = this;
            r4 = 0
            r3 = 0
        L2:
            X.E1P r6 = r9.A06
            byte[] r1 = r6.A02
            r0 = 10
            r10.AXi(r1, r4, r0)
            r6.A0R(r4)
            int r1 = r6.A0B()
            r0 = 4801587(0x494433, float:6.728456E-39)
            if (r1 == r0) goto L77
            r10.AbN()
            r10.A47(r3)
            long r0 = r9.A00
            r7 = -1
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L28
            long r0 = (long) r3
            r9.A00 = r0
        L28:
            r7 = r3
            r5 = 0
            r2 = 0
        L2b:
            byte[] r1 = r6.A02
            r0 = 2
            r10.AXi(r1, r4, r0)
            r6.A0R(r4)
            int r1 = r6.A0D()
            r0 = 65526(0xfff6, float:9.1821E-41)
            r1 = r1 & r0
            r0 = 65520(0xfff0, float:9.1813E-41)
            if (r1 != r0) goto L4c
            r8 = 1
            int r5 = r5 + 1
            r1 = 4
            if (r5 < r1) goto L57
            r0 = 188(0xbc, float:2.63E-43)
            if (r2 <= r0) goto L57
            return r8
        L4c:
            int r7 = r7 + 1
            r10.AbN()
            r10.A47(r7)
            r5 = 0
            r2 = 0
            goto L70
        L57:
            X.E2K.A01(r6, r10, r1)
            X.E1q r1 = r9.A05
            r0 = 14
            r1.A0B(r0)
            r0 = 13
            int r1 = r1.A08(r0)
            r0 = 6
            if (r1 <= r0) goto L4c
            int r0 = r1 + (-6)
            r10.A47(r0)
            int r2 = r2 + r1
        L70:
            int r1 = r7 - r3
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r0) goto L2b
            return r4
        L77:
            r0 = 3
            r6.A0S(r0)
            int r1 = r6.A09()
            int r0 = r1 + 10
            int r3 = r3 + r0
            r10.A47(r1)
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6352E2d.Afs(X.E2K):boolean");
    }

    @Override // X.InterfaceC5458Dit
    public final void release() {
    }

    @Override // X.InterfaceC5458Dit
    public final void ANb(InterfaceC6413E4p interfaceC6413E4p) {
        this.A01 = interfaceC6413E4p;
        this.A07.A84(interfaceC6413E4p, new E4I(Integer.MIN_VALUE, 0, 1));
        interfaceC6413E4p.AAe();
    }

    @Override // X.InterfaceC5458Dit
    public final int AZ4(E2K e2k, C5542DkK c5542DkK) {
        C1G.A05(this.A01);
        E1P e1p = this.A08;
        int i = e2k.read(e1p.A02, 0, 2048);
        boolean zA1Q = AnonymousClass002.A1Q(i, -1);
        if (!this.A02) {
            E2A.A00(this.A01, -9223372036854775807L);
            this.A02 = true;
        }
        if (zA1Q) {
            return -1;
        }
        e1p.A0R(0);
        e1p.A0Q(i);
        if (!this.A04) {
            this.A07.A09 = this.A03;
            this.A04 = true;
        }
        this.A07.A6w(e1p);
        return 0;
    }

    public C6352E2d(int i) {
        this.A07 = new E2U(0, null, true, "audio/mp4a-latm");
        this.A08 = BV6.A0Y(2048);
        this.A00 = -1L;
        E1P e1pA0Y = BV6.A0Y(10);
        this.A06 = e1pA0Y;
        this.A05 = new C6340E1q(e1pA0Y.A02);
    }

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ List AKl() {
        return ImmutableList.of();
    }

    public C6352E2d() {
        this(0);
    }
}
