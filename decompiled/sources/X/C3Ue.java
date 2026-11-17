package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.3Ue, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C3Ue {
    public static final C0918AHu<Alignment, InterfaceC1380AiA> A00 = A00(true);
    public static final C0918AHu<Alignment, InterfaceC1380AiA> A01 = A00(false);
    public static final InterfaceC1380AiA A02 = new C05313Uh(C2VU.A0E, false);
    public static final InterfaceC1380AiA A03 = new InterfaceC1380AiA() { // from class: X.3Uf
        @Override // X.InterfaceC1380AiA
        public final /* synthetic */ int maxIntrinsicHeight(C3TF c3tf, List list, int i) {
            return AXQ.A00(c3tf, this, list, i);
        }

        @Override // X.InterfaceC1380AiA
        public final /* synthetic */ int maxIntrinsicWidth(C3TF c3tf, List list, int i) {
            return AXQ.A01(c3tf, this, list, i);
        }

        @Override // X.InterfaceC1380AiA
        /* renamed from: measure-3p2s80s */
        public final InterfaceC1134Abi mo7measure3p2s80s(AXY axy, List<? extends C3TG> list, long j) {
            int iA03 = Constraints.A03(j);
            int iA02 = Constraints.A02(j);
            return axy.APV(AGH.A0E(), new C3bM(4), iA03, iA02);
        }

        @Override // X.InterfaceC1380AiA
        public final /* synthetic */ int minIntrinsicHeight(C3TF c3tf, List list, int i) {
            return AXQ.A02(c3tf, this, list, i);
        }

        @Override // X.InterfaceC1380AiA
        public final /* synthetic */ int minIntrinsicWidth(C3TF c3tf, List list, int i) {
            return AXQ.A03(c3tf, this, list, i);
        }
    };

    public static final C0918AHu<Alignment, InterfaceC1380AiA> A00(boolean z) {
        C0918AHu<Alignment, InterfaceC1380AiA> c0918AHu = new C0918AHu<>(9);
        A02(c0918AHu, C2VU.A0E, z);
        A02(c0918AHu, C2VU.A0C, z);
        A02(c0918AHu, C2VU.A0D, z);
        A02(c0918AHu, C2VU.A0B, z);
        A02(c0918AHu, C2VU.A09, z);
        A02(c0918AHu, C2VU.A0A, z);
        A02(c0918AHu, C2VU.A08, z);
        A02(c0918AHu, C2VU.A06, z);
        A02(c0918AHu, C2VU.A07, z);
        return c0918AHu;
    }

    public static final InterfaceC1380AiA A01(Alignment alignment, boolean z) {
        InterfaceC1380AiA interfaceC1380AiAA05 = (z ? A00 : A01).A05(alignment);
        return interfaceC1380AiAA05 == null ? new C05313Uh(alignment, z) : interfaceC1380AiAA05;
    }

    public static void A02(C0918AHu c0918AHu, Alignment alignment, boolean z) {
        c0918AHu.A0E(alignment, new C05313Uh(alignment, z));
    }

    public static final void A03(Alignment alignment, C3TG c3tg, AYU ayu, AZE aze, EnumC1820Arj enumC1820Arj, int i, int i2) {
        Alignment alignment2;
        C2Yh c2Yh;
        Object objAIX = c3tg.AIX();
        if (!(objAIX instanceof C2Yh) || (c2Yh = (C2Yh) objAIX) == null || (alignment2 = c2Yh.A00) == null) {
            alignment2 = alignment;
        }
        ayu.A0B(aze, 0.0f, alignment2.A4F(enumC1820Arj, (aze.A01 << 32) | (aze.A00 & 4294967295L), (i2 & 4294967295L) | (i << 32)));
    }

    public static final void A04(final BRg bRg, BFM bfm, final int i) {
        bfm.AgG(-211209833);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            InterfaceC1380AiA interfaceC1380AiA = A03;
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg);
            AKQ akqA04 = BBI.A04(bbi);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass003.A0o(bfm, interfaceC1380AiA, akqA04);
            AnonymousClass003.A0n(bfm, bRgA01);
            AnonymousClass002.A0w(bfm, iA0J);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: X.3Ug
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    BRg bRg2 = bRg;
                    int i2 = i;
                    C0918AHu<Alignment, InterfaceC1380AiA> c0918AHu = C3Ue.A00;
                    C3Ue.A04(bRg2, (BFM) obj, AnonymousClass011.A00(i2));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
