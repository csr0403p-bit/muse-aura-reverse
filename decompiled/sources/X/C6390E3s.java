package X;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.E3s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6390E3s implements InterfaceC5458Dit {
    public int A00;
    public int A01;
    public InterfaceC6413E4p A02;
    public InterfaceC5563Dkg A03;
    public final int A04;
    public final int A05;
    public final String A06;

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ InterfaceC5458Dit AMF() {
        return this;
    }

    @Override // X.InterfaceC5458Dit
    public final void release() {
    }

    @Override // X.InterfaceC5458Dit
    public final void ANb(InterfaceC6413E4p interfaceC6413E4p) {
        this.A02 = interfaceC6413E4p;
        String str = this.A06;
        InterfaceC5563Dkg interfaceC5563DkgAhC = interfaceC6413E4p.AhC(1024, 4);
        this.A03 = interfaceC5563DkgAhC;
        C6162Dx5 c6162Dx5A00 = C6162Dx5.A00();
        c6162Dx5A00.A05(str);
        c6162Dx5A00.A06(str);
        InterfaceC5563Dkg.A00(c6162Dx5A00, interfaceC5563DkgAhC);
        this.A02.AAe();
        this.A02.AcM(new C6409E4l());
        this.A01 = 1;
    }

    @Override // X.InterfaceC5458Dit
    public final int AZ4(E2K e2k, C5542DkK c5542DkK) {
        int i;
        int i2 = this.A01;
        if (i2 != 1) {
            if (i2 == 2) {
                return -1;
            }
            throw BV4.A0T();
        }
        InterfaceC5563Dkg interfaceC5563Dkg = this.A03;
        interfaceC5563Dkg.getClass();
        int iAbu = interfaceC5563Dkg.Abu(e2k, 1024, true);
        if (iAbu == -1) {
            this.A01 = 2;
            i = 0;
            this.A03.Abz(null, 1, this.A00, 0, 0L);
        } else {
            i = this.A00 + iAbu;
        }
        this.A00 = i;
        return 0;
    }

    @Override // X.InterfaceC5458Dit
    public final void AcL(long j, long j2) {
        if (j == 0 || this.A01 == 1) {
            this.A01 = 1;
            this.A00 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // X.InterfaceC5458Dit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Afs(X.E2K r7) {
        /*
            r6 = this;
            int r5 = r6.A04
            r4 = 1
            r3 = 0
            r2 = -1
            if (r5 == r2) goto Lc
            int r1 = r6.A05
            r0 = 1
            if (r1 != r2) goto Ld
        Lc:
            r0 = 0
        Ld:
            X.C1G.A08(r0)
            int r1 = r6.A05
            X.E1P r0 = X.BV6.A0Y(r1)
            X.E2K.A01(r0, r7, r1)
            int r0 = r0.A0D()
            if (r0 != r5) goto L20
            return r4
        L20:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6390E3s.Afs(X.E2K):boolean");
    }

    public C6390E3s(int i, int i2, String str) {
        this.A04 = i;
        this.A05 = i2;
        this.A06 = str;
    }

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ List AKl() {
        return ImmutableList.of();
    }
}
