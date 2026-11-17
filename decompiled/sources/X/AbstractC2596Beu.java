package X;

import android.util.Range;

/* renamed from: X.Beu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2596Beu {
    public static final Range<Integer> A00;
    public static final C2507Bcd A01;
    public static final C2594Bes<?> A02;
    public static final BpS<BdF, InterfaceC2436BbP> A03;
    public static final InterfaceC2616Bfh A04;

    static {
        InterfaceC2616Bfh interfaceC2616Bfh = new InterfaceC2616Bfh() { // from class: X.Bfi
            @Override // X.InterfaceC2616Bfh
            public final /* synthetic */ InterfaceC2620Bfm AHd() {
                return C2651Bgj.A01;
            }

            @Override // X.InterfaceC2616Bfh
            public final /* synthetic */ InterfaceC2620Bfm ALA() {
                return BfR.A00;
            }

            @Override // X.InterfaceC2616Bfh
            public final /* synthetic */ Bd1 AHY(InterfaceC2546BdX interfaceC2546BdX) {
                return Bd1.A00;
            }

            @Override // X.InterfaceC2616Bfh
            public final /* synthetic */ InterfaceC2620Bfm AP4() {
                return new C2651Bgj(AnonymousClass001.A0h());
            }

            @Override // X.InterfaceC2616Bfh
            public final /* synthetic */ void AW2(Integer num) {
            }

            @Override // X.InterfaceC2616Bfh
            public final /* synthetic */ void AWS(BmM bmM, BWz bWz) {
                bmM.A00();
            }
        };
        A04 = interfaceC2616Bfh;
        BpS<BdF, InterfaceC2436BbP> bpS = C2572Be4.A01;
        A03 = bpS;
        A00 = new Range<>(30, 30);
        C2507Bcd c2507Bcd = C2507Bcd.A07;
        A01 = c2507Bcd;
        C2582Bee c2582BeeA00 = C2582Bee.A00();
        c2582BeeA00.ANl(C2594Bes.A03, interfaceC2616Bfh);
        C2582Bee c2582Bee = new C2595Bet(c2582BeeA00).A00;
        BV6.A11(BfN.A07, c2582Bee, 5);
        c2582Bee.ANl(C2594Bes.A02, bpS);
        c2582Bee.ANl(InterfaceC2490BcH.A00, c2507Bcd);
        A02 = new C2594Bes<>(C2584Beg.A02(c2582Bee));
    }
}
