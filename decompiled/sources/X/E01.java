package X;

import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes5.dex */
public final class E01 implements InterfaceC5458Dit {
    public int A00;
    public InterfaceC5563Dkg A02;
    public final InterfaceC6304E0a A07;
    public byte[] A03 = Util.A07;
    public final E1P A06 = BV6.A0X();
    public final List<E02> A08 = C3cG.A0h();
    public int A05 = 0;
    public long[] A04 = Util.A0B;
    public long A01 = -9223372036854775807L;

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ InterfaceC5458Dit AMF() {
        return this;
    }

    @Override // X.InterfaceC5458Dit
    public final void ANb(InterfaceC6413E4p interfaceC6413E4p) {
        C1G.A08(AnonymousClass002.A1M(this.A05));
        this.A02 = interfaceC6413E4p.AhC(0, 3);
        this.A05 = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000a  */
    @Override // X.InterfaceC5458Dit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AZ4(X.E2K r12, X.C5542DkK r13) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E01.AZ4(X.E2K, X.DkK):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009  */
    @Override // X.InterfaceC5458Dit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AcL(long r5, long r7) {
        /*
            r4 = this;
            int r3 = r4.A05
            r2 = 1
            if (r3 == 0) goto L9
            r1 = 5
            r0 = 1
            if (r3 != r1) goto La
        L9:
            r0 = 0
        La:
            X.C1G.A08(r0)
            r4.A01 = r7
            r0 = 2
            if (r3 == r0) goto L16
            r0 = 4
            if (r3 != r0) goto L18
            r2 = 3
        L16:
            r4.A05 = r2
        L18:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E01.AcL(long, long):void");
    }

    @Override // X.InterfaceC5458Dit
    public final void release() {
        if (this.A05 != 5) {
            this.A07.reset();
            this.A05 = 5;
        }
    }

    public E01(InterfaceC6304E0a interfaceC6304E0a) {
        this.A07 = interfaceC6304E0a;
    }

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ List AKl() {
        return ImmutableList.of();
    }

    @Override // X.InterfaceC5458Dit
    public final boolean Afs(E2K e2k) {
        return true;
    }
}
