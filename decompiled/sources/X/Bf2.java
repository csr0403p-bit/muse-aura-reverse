package X;

import android.util.Size;

/* loaded from: classes5.dex */
public abstract class Bf2 {
    public static final Bf7 A00;
    public static final Size A01;
    public static final C2507Bcd A02;
    public static final C2601Bez A03;

    static {
        Size sizeA0P = BV6.A0P(640, 480);
        A01 = sizeA0P;
        C2507Bcd c2507Bcd = C2507Bcd.A07;
        A02 = c2507Bcd;
        Bf1 bf1 = Bf1.A00;
        Size size = AbstractC2484BcB.A05;
        C2549Bda c2549Bda = new C2549Bda();
        c2549Bda.A01 = size;
        c2549Bda.A00 = 1;
        C2601Bez c2601Bez = new C2601Bez(bf1, c2549Bda, 0);
        A03 = c2601Bez;
        C2582Bee c2582Bee = new Bf3().A00;
        c2582Bee.ANl(InterfaceC2551Bdc.A02, sizeA0P);
        BV6.A11(BfN.A07, c2582Bee, 1);
        BV6.A11(InterfaceC2551Bdc.A07, c2582Bee, 0);
        c2582Bee.ANl(InterfaceC2551Bdc.A05, c2601Bez);
        if (!C6xC.A00(c2507Bcd, c2507Bcd)) {
            throw C8j3.A18("ImageAnalysis currently only supports SDR");
        }
        c2582Bee.ANl(InterfaceC2490BcH.A00, c2507Bcd);
        A00 = new Bf7(C2584Beg.A02(c2582Bee));
    }
}
