package X;

import android.util.Rational;
import android.util.Size;

/* renamed from: X.BdZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2548BdZ {
    public final Rational A00;
    public final boolean A01;
    public final int A02;
    public final int A03;

    public static Size A00(InterfaceC2551Bdc interfaceC2551Bdc, C2548BdZ c2548BdZ) {
        int iA00 = InterfaceC2586Bei.A00(InterfaceC2551Bdc.A09, interfaceC2551Bdc, 0);
        Size size = (Size) interfaceC2551Bdc.Abl(InterfaceC2551Bdc.A08, null);
        int i = c2548BdZ.A02;
        int i2 = c2548BdZ.A03;
        if (size == null) {
            return size;
        }
        int iA01 = AbstractC2467Bbu.A01(AbstractC2467Bbu.A00(iA00), i2, AnonymousClass002.A1Q(1, i));
        return (iA01 == 90 || iA01 == 270) ? BV8.A0a(size) : size;
    }

    public C2548BdZ(Rational rational, InterfaceC2544BdV interfaceC2544BdV) {
        this.A03 = interfaceC2544BdV.AKN();
        this.A02 = interfaceC2544BdV.AH3();
        this.A00 = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        this.A01 = z;
    }
}
