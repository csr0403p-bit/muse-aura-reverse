package X;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EYF {
    public EYK A05 = EYK.A02;
    public HOE A02 = HOE.A01;
    public InterfaceC6749EYj A00 = HCC.A01;
    public final Map A0A = BV4.A0u();
    public final List<EYY> A08 = C3cG.A0h();
    public final List<EYY> A09 = C3cG.A0h();
    public boolean A06 = true;
    public C6738EXw A01 = EYC.A0G;
    public EY0 A04 = EYC.A0I;
    public EY0 A03 = EYC.A0H;
    public final ArrayDeque A07 = BV4.A0s();

    public final EYC A00() {
        List<EYY> list = this.A08;
        int size = list.size();
        List<EYY> list2 = this.A09;
        ArrayList arrayListA11 = C60O.A11(size + list2.size() + 3);
        arrayListA11.addAll(list);
        Collections.reverse(arrayListA11);
        ArrayList arrayListA0t = BV4.A0t(list2);
        Collections.reverse(arrayListA0t);
        arrayListA11.addAll(arrayListA0t);
        boolean z = EYZ.A03;
        EY0 ey0 = EYC.A0H;
        EYK eyk = this.A05;
        InterfaceC6749EYj interfaceC6749EYj = this.A00;
        HashMap mapA0w = BV4.A0w(this.A0A);
        boolean z2 = this.A06;
        return new EYC(interfaceC6749EYj, this.A01, this.A02, this.A04, this.A03, eyk, BV4.A0t(list), BV4.A0t(list2), arrayListA11, BV4.A0t(this.A07), mapA0w, z2);
    }
}
