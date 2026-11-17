package X;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.Dzs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6296Dzs implements InterfaceC5458Dit {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC6413E4p A04;
    public E2J A05;
    public C3114Bye A06;
    public E2S A07;
    public E2K A08;
    public final E1P A09 = BV6.A0Y(2);
    public long A03 = -1;

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ InterfaceC5458Dit AMF() {
        return this;
    }

    @Override // X.InterfaceC5458Dit
    public final void release() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a1, code lost:
    
        r23 = -9223372036854775807L;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    @Override // X.InterfaceC5458Dit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AZ4(X.E2K r29, X.C5542DkK r30) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6296Dzs.AZ4(X.E2K, X.DkK):int");
    }

    @Override // X.InterfaceC5458Dit
    public final void AcL(long j, long j2) {
        if (j == 0) {
            this.A02 = 0;
            this.A07 = null;
        } else if (this.A02 == 5) {
            E2S e2s = this.A07;
            e2s.getClass();
            e2s.AcL(j, j2);
        }
    }

    @Override // X.InterfaceC5458Dit
    public final boolean Afs(E2K e2k) {
        E1P e1p = this.A09;
        E2K.A03(e1p, e2k, 2);
        if (e1p.A0D() != 65496) {
            return false;
        }
        E2K.A02(e1p, e2k, 2);
        int iA0D = e1p.A0D();
        this.A00 = iA0D;
        if (iA0D == 65504) {
            E2K.A02(e1p, e2k, 2);
            e2k.A47(e1p.A0D() - 2);
            E2K.A02(e1p, e2k, 2);
            iA0D = e1p.A0D();
            this.A00 = iA0D;
        }
        return iA0D == 65505;
    }

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ List AKl() {
        return ImmutableList.of();
    }

    @Override // X.InterfaceC5458Dit
    public final void ANb(InterfaceC6413E4p interfaceC6413E4p) {
        this.A04 = interfaceC6413E4p;
    }
}
