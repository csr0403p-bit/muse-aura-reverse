package X;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes5.dex */
public final class E2e implements InterfaceC5458Dit {
    public boolean A00;
    public final E2W A02 = new E2W(null, 0, "audio/ac3");
    public final E1P A01 = BV6.A0Y(2786);

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ InterfaceC5458Dit AMF() {
        return this;
    }

    @Override // X.InterfaceC5458Dit
    public final void AcL(long j, long j2) {
        this.A00 = false;
        this.A02.AcK();
    }

    @Override // X.InterfaceC5458Dit
    public final void release() {
    }

    @Override // X.InterfaceC5458Dit
    public final void ANb(InterfaceC6413E4p interfaceC6413E4p) {
        this.A02.A84(interfaceC6413E4p, new E4I(Integer.MIN_VALUE, 0, 1));
        interfaceC6413E4p.AAe();
        E2A.A00(interfaceC6413E4p, -9223372036854775807L);
    }

    @Override // X.InterfaceC5458Dit
    public final int AZ4(E2K e2k, C5542DkK c5542DkK) {
        E1P e1p = this.A01;
        int i = e2k.read(e1p.A02, 0, 2786);
        if (i == -1) {
            return -1;
        }
        e1p.A0R(0);
        e1p.A0Q(i);
        if (!this.A00) {
            this.A02.A03 = 0L;
            this.A00 = true;
        }
        this.A02.A6w(e1p);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if ((r6 - r2) >= 8192) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        r11.AbN();
        r6 = r6 + 1;
     */
    @Override // X.InterfaceC5458Dit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Afs(X.E2K r11) {
        /*
            r10 = this;
            r5 = 10
            X.E1P r4 = X.BV6.A0Y(r5)
            r3 = 0
            r2 = 0
        L8:
            X.E2K.A01(r4, r11, r5)
            r4.A0R(r3)
            int r1 = r4.A0B()
            r0 = 4801587(0x494433, float:6.728456E-39)
            if (r1 == r0) goto L7b
            r11.AbN()
            r11.A47(r2)
            r6 = r2
        L1e:
            r5 = 0
        L1f:
            byte[] r0 = r4.A02
            r9 = 6
            r11.AXi(r0, r3, r9)
            r4.A0R(r3)
            int r1 = r4.A0D()
            r0 = 2935(0xb77, float:4.113E-42)
            if (r1 == r0) goto L3f
            r11.AbN()
            int r6 = r6 + 1
            int r1 = r6 - r2
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r0) goto L8b
            r11.A47(r6)
            goto L1e
        L3f:
            r0 = 1
            int r5 = r5 + 1
            r10 = 4
            if (r5 < r10) goto L46
            return r0
        L46:
            byte[] r8 = r4.A02
            int r0 = r8.length
            if (r0 < r9) goto L8b
            r0 = 5
            r0 = r8[r0]
            r1 = r0 & 248(0xf8, float:3.48E-43)
            r7 = 3
            int r1 = r1 >> r7
            r0 = 10
            if (r1 <= r0) goto L6f
            r0 = 2
            r0 = r8[r0]
            r0 = r0 & 7
            int r1 = r0 << 8
            r0 = r8[r7]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r1
            int r0 = r0 + 1
            int r1 = r0 * 2
        L66:
            r0 = -1
            if (r1 == r0) goto L8b
            int r0 = r1 + (-6)
            r11.A47(r0)
            goto L1f
        L6f:
            r0 = r8[r10]
            r1 = r0 & 192(0xc0, float:2.69E-43)
            int r1 = r1 >> r9
            r0 = r0 & 63
            int r1 = X.AbstractC6364E2q.A00(r1, r0)
            goto L66
        L7b:
            r0 = 3
            r4.A0S(r0)
            int r1 = r4.A09()
            int r0 = r1 + 10
            int r2 = r2 + r0
            r11.A47(r1)
            goto L8
        L8b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E2e.Afs(X.E2K):boolean");
    }

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ List AKl() {
        return ImmutableList.of();
    }
}
