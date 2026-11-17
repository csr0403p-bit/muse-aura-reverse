package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Bgb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2644Bgb extends BgZ {
    public final C2400BaD A03 = new C2400BaD();
    public boolean A02 = true;
    public boolean A01 = false;
    public List<InterfaceC2641BgM> A00 = C3cG.A0h();

    public final C2643Bga A00() {
        if (!this.A02) {
            throw C60O.A0i("Unsupported session configuration combination");
        }
        ArrayList arrayListA0t = BV4.A0t(this.A08);
        C2400BaD c2400BaD = this.A03;
        if (c2400BaD.A00) {
            Collections.sort(arrayListA0t, new C7573F4m(c2400BaD, 0));
        }
        C7582F4v c7582F4v = !this.A00.isEmpty() ? new C7582F4v(this, 4) : null;
        ArrayList arrayListA0t2 = BV4.A0t(this.A05);
        ArrayList arrayListA0t3 = BV4.A0t(this.A06);
        ArrayList arrayListA0t4 = BV4.A0t(this.A07);
        return new C2643Bga(super.A01, this.A04.A01(), c7582F4v, super.A03, arrayListA0t, arrayListA0t2, arrayListA0t3, arrayListA0t4, super.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C2643Bga r8) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2644Bgb.A01(X.Bga):void");
    }
}
