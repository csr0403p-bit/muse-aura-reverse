package X;

import android.util.Range;
import android.util.Size;

/* renamed from: X.BcK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2493BcK {
    public Range<Integer> A00;
    public Size A01;
    public C2507Bcd A02;
    public InterfaceC2585Beh A03;
    public Boolean A04;

    public final C2492BcJ A01() {
        Size size = this.A01;
        String strA0M = size == null ? " resolution" : "";
        C2507Bcd c2507Bcd = this.A02;
        if (c2507Bcd == null) {
            strA0M = FGI.A0M(strA0M, " dynamicRange");
        }
        Range<Integer> range = this.A00;
        if (range == null) {
            strA0M = FGI.A0M(strA0M, " expectedFrameRateRange");
        }
        Boolean bool = this.A04;
        if (bool == null) {
            strA0M = FGI.A0M(strA0M, " zslDisabled");
        }
        if (!strA0M.isEmpty()) {
            throw BV8.A0l(strA0M);
        }
        Range<Integer> range2 = AbstractC2481Bc8.A00;
        return new C2492BcJ(range, size, c2507Bcd, this.A03, bool.booleanValue());
    }

    public C2493BcK(int i) {
    }

    public static C2492BcJ A00(InterfaceC2585Beh interfaceC2585Beh, AbstractC2481Bc8 abstractC2481Bc8) {
        C2493BcK c2493BcKA00 = abstractC2481Bc8.A00();
        c2493BcKA00.A03 = interfaceC2585Beh;
        return c2493BcKA00.A01();
    }

    public C2493BcK() {
    }
}
