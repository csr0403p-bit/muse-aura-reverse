package X;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.E2a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6349E2a implements InterfaceC5458Dit {
    public int A00;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public InterfaceC6413E4p A06;
    public C6350E2b A07;
    public E2Y A08;
    public boolean A09;
    public boolean A0A;
    public final E1P A0E = BV6.A0Y(4);
    public final E1P A0B = BV6.A0Y(9);
    public final E1P A0C = BV6.A0Y(11);
    public final E1P A0F = BV6.A0X();
    public final E2Z A0D = new E2Z();
    public int A01 = 1;

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ InterfaceC5458Dit AMF() {
        return this;
    }

    @Override // X.InterfaceC5458Dit
    public final void release() {
    }

    private E1P A00(E2K e2k) {
        int i = this.A02;
        E1P e1p = this.A0F;
        int length = e1p.A02.length;
        if (i > length) {
            e1p.A0T(new byte[Math.max(length * 2, i)], 0);
        } else {
            e1p.A0R(0);
        }
        e1p.A0Q(this.A02);
        e2k.readFully(e1p.A02, 0, this.A02);
        return e1p;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0005 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    @Override // X.InterfaceC5458Dit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AZ4(X.E2K r15, X.C5542DkK r16) throws androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6349E2a.AZ4(X.E2K, X.DkK):int");
    }

    @Override // X.InterfaceC5458Dit
    public final void AcL(long j, long j2) {
        if (j == 0) {
            this.A01 = 1;
            this.A09 = false;
        } else {
            this.A01 = 3;
        }
        this.A00 = 0;
    }

    @Override // X.InterfaceC5458Dit
    public final boolean Afs(E2K e2k) {
        E1P e1p = this.A0E;
        e2k.AXi(e1p.A02, 0, 3);
        e1p.A0R(0);
        if (e1p.A0B() != 4607062) {
            return false;
        }
        e2k.AXi(e1p.A02, 0, 2);
        e1p.A0R(0);
        if ((e1p.A0D() & 250) != 0) {
            return false;
        }
        e2k.AXi(e1p.A02, 0, 4);
        int iA05 = BV6.A05(e1p, 0);
        e2k.AbN();
        e2k.A47(iA05);
        E2K.A01(e1p, e2k, 4);
        return BV6.A05(e1p, 0) == 0;
    }

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ List AKl() {
        return ImmutableList.of();
    }

    @Override // X.InterfaceC5458Dit
    public final void ANb(InterfaceC6413E4p interfaceC6413E4p) {
        this.A06 = interfaceC6413E4p;
    }
}
