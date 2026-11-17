package X;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.E2f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6353E2f implements InterfaceC5458Dit {
    public boolean A00;
    public final C6354E2g A02 = new C6354E2g(null, 0, "audio/ac4");
    public final E1P A01 = BV6.A0Y(16384);

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
        int i = e2k.read(e1p.A02, 0, 16384);
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        r11.AbN();
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if ((r6 - r2) >= 8192) goto L32;
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
            if (r1 == r0) goto L87
            r11.AbN()
            r11.A47(r2)
            r6 = r2
        L1e:
            r5 = 0
        L1f:
            byte[] r0 = r4.A02
            r1 = 7
            r11.AXi(r0, r3, r1)
            r4.A0R(r3)
            int r7 = r4.A0D()
            r0 = 44096(0xac40, float:6.1792E-41)
            if (r7 == r0) goto L45
            r0 = 44097(0xac41, float:6.1793E-41)
            if (r7 == r0) goto L45
            r11.AbN()
            int r6 = r6 + 1
            int r1 = r6 - r2
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 >= r0) goto L97
            r11.A47(r6)
            goto L1e
        L45:
            r0 = 1
            int r5 = r5 + 1
            r10 = 4
            if (r5 < r10) goto L4c
            return r0
        L4c:
            byte[] r8 = r4.A02
            int r0 = r8.length
            r9 = 7
            if (r0 < r1) goto L97
            r0 = 2
            int r1 = X.BV6.A0D(r8, r0)
            r0 = 3
            r0 = r8[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 != r0) goto L85
            r0 = r8[r10]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 16
            r0 = 5
            int r0 = X.BV6.A0D(r8, r0)
            r1 = r1 | r0
            r0 = 6
            r0 = r8[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
        L74:
            r0 = 44097(0xac41, float:6.1793E-41)
            if (r7 != r0) goto L7b
            int r9 = r9 + 2
        L7b:
            int r1 = r1 + r9
            r0 = -1
            if (r1 == r0) goto L97
            int r0 = r1 + (-7)
            r11.A47(r0)
            goto L1f
        L85:
            r9 = 4
            goto L74
        L87:
            r0 = 3
            r4.A0S(r0)
            int r1 = r4.A09()
            int r0 = r1 + 10
            int r2 = r2 + r0
            r11.A47(r1)
            goto L8
        L97:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6353E2f.Afs(X.E2K):boolean");
    }

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ List AKl() {
        return ImmutableList.of();
    }
}
