package X;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class Ar1 {
    public static final void A01(BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(155925518);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            boolean zA1X = AnonymousClass002.A1X(AKO.A07(AbstractC1087AXv.A00, bbi));
            boolean zA1X2 = AnonymousClass002.A1X(AKO.A07(AbstractC1087AXv.A01, bbi));
            if (zA1X) {
                if (zA1X2) {
                    bfm.AgE(-1977187922);
                    InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(true);
                    int iA0J = AnonymousClass003.A0J(bbi);
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, bRg2);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbi.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                    AnonymousClass004.A1C(bbi, bfm, g0v, iA0d >> 3, true);
                } else {
                    bfm.AgE(-1976997706);
                    Ar2.A02(bRg2, g0v, bfm, iA0d & 126, 0);
                }
            } else if (zA1X2) {
                bfm.AgE(-1976846922);
                AbstractC1789Aqz.A03(bfm, bRg2, g0v, iA0d & 126);
            } else {
                bfm.AgE(-1976716505);
                A00(bfm, bRg2, g0v, iA0d & 126);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTI(bRg2, i, g0v, i2, 4);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A00(BFM bfm, final BRg bRg, final G0V g0v, int i) {
        bfm.AgG(790527681);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = C3cG.A08(AGG.A00, null);
                BBI.A0T(bfm, objAaT);
            }
            final MutableState mutableState = (MutableState) objAaT;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = C2298BSy.A00(mutableState, 15);
                bfm.Ai0(objAaT2);
            }
            final Function0 function0 = (Function0) objAaT2;
            final Ar4 ar4A00 = Ar0.A00(bfm, Ar3.A00, 6);
            AKT.A02(bfm, B1V.A00(bfm, new G0V() { // from class: X.0vy
                @Override // X.G0V
                public final Object invoke(Object obj2, Object obj3) {
                    BRg bRg2 = bRg;
                    MutableState mutableState2 = mutableState;
                    G0V g0v2 = g0v;
                    Ar4 ar4 = ar4A00;
                    Function0<? extends InterfaceC1497Ak4> function02 = function0;
                    BFM bfm2 = (BFM) obj2;
                    int iA0F = AnonymousClass001.A0F(obj3);
                    if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0F & 3, 2), bfm2, iA0F)) {
                        Object objAaT3 = bfm2.AaT();
                        if (objAaT3 == C78N.A00) {
                            objAaT3 = new C3bS(mutableState2, 8);
                            bfm2.Ai0(objAaT3);
                        }
                        BRg bRgA00 = ASZ.A00(bRg2, (G0U) objAaT3);
                        InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(true);
                        BBI bbi = (BBI) bfm2;
                        int iA0J = AnonymousClass003.A0J(bbi);
                        AKQ akqA04 = BBI.A04(bbi);
                        BRg bRgA01 = AxM.A01(bfm2, bRgA00);
                        Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                        if (bbi.A0V == null) {
                            C00x.A00();
                            throw F60.createAndThrow();
                        }
                        AnonymousClass005.A0n(bfm2, bbi, function03);
                        AnonymousClass005.A0p(bfm2, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                        AnonymousClass001.A1H(bfm2, g0v2, 0);
                        ar4.A00(function02, bfm2, 6);
                        BBI.A0R(bbi, true);
                    } else {
                        bfm2.Afo();
                    }
                    return Unit.INSTANCE;
                }
            }, 1070596993), new AKJ[]{AbstractC1087AXv.A01.A04(Ar2.A00(bfm, function0, null, 2)), AbstractC1087AXv.A00.A04(ar4A00)}, 56);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            BBb.A00(bBbAAc, bRg, g0v, i, 9);
        }
    }
}
