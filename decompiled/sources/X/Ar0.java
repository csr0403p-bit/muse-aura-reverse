package X;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class Ar0 {
    /* JADX WARN: Incorrect types in method signature: (LX/G2k<-LX/BNk;-LX/Apd;-Lkotlin/jvm/functions/Function0<+LX/Ak4;>;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)LX/Ar4; */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.Ar4 A00(X.BFM r3, X.G2k r4, int r5) {
        /*
            r0 = r5 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto Ld
            boolean r0 = r3.A65(r4)
            if (r0 != 0) goto L12
        Ld:
            r1 = r5 & 6
            r0 = 0
            if (r1 != r2) goto L13
        L12:
            r0 = 1
        L13:
            java.lang.Object r2 = r3.AaT()
            if (r0 != 0) goto L1d
            java.lang.Object r0 = X.C78N.A00
            if (r2 != r0) goto L25
        L1d:
            X.Ar4 r2 = new X.Ar4
            r2.<init>(r4)
            X.BBI.A0T(r3, r2)
        L25:
            X.Ar4 r2 = (X.Ar4) r2
            boolean r0 = r3.A65(r2)
            java.lang.Object r1 = r3.AaT()
            if (r0 != 0) goto L35
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L3e
        L35:
            r0 = 22
            X.BSu r1 = X.C2294BSu.A00(r2, r0)
            r3.Ai0(r1)
        L3e:
            X.AnonymousClass001.A17(r3, r1, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ar0.A00(X.BFM, X.G2k, int):X.Ar4");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/AKH<LX/AXr;>;LX/G2k<-LX/BNk;-LX/Apd;-Lkotlin/jvm/functions/Function0<+LX/Ak4;>;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A01(BFM bfm, AKH akh, final BRg bRg, final G0V g0v, G2k g2k, int i) {
        bfm.AgG(-714464401);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, akh);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g2k);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = C3cG.A08(AGG.A00, null);
                BBI.A0T(bfm, objAaT);
            }
            final MutableState mutableState = (MutableState) objAaT;
            final Ar4 ar4A00 = A00(bfm, g2k, (iA0d >> 6) & 14);
            AnonymousClass003.A0m(bfm, akh.A04(ar4A00), new G0V() { // from class: X.0vz
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    BRg bRg2 = bRg;
                    MutableState mutableState2 = mutableState;
                    G0V g0v2 = g0v;
                    Ar4 ar4 = ar4A00;
                    BFM bfm2 = (BFM) obj;
                    int iA0F = AnonymousClass001.A0F(obj2);
                    if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0F & 3, 2), bfm2, iA0F)) {
                        Object objAaT2 = bfm2.AaT();
                        Object obj3 = C78N.A00;
                        if (objAaT2 == obj3) {
                            objAaT2 = new C3bS(mutableState2, 9);
                            bfm2.Ai0(objAaT2);
                        }
                        BRg bRgA00 = ASZ.A00(bRg2, (G0U) objAaT2);
                        InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(true);
                        BBI bbi = (BBI) bfm2;
                        int iA0J = AnonymousClass003.A0J(bbi);
                        AKQ akqA04 = BBI.A04(bbi);
                        BRg bRgA01 = AxM.A01(bfm2, bRgA00);
                        Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                        if (bbi.A0V == null) {
                            C00x.A00();
                            throw F60.createAndThrow();
                        }
                        AnonymousClass005.A0n(bfm2, bbi, function0);
                        AnonymousClass005.A0p(bfm2, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                        AnonymousClass001.A1H(bfm2, g0v2, 0);
                        Object objAaT3 = bfm2.AaT();
                        if (objAaT3 == obj3) {
                            objAaT3 = new C3bR(mutableState2, 3);
                            bfm2.Ai0(objAaT3);
                        }
                        ar4.A00((Function0) objAaT3, bfm2, 6);
                        BBI.A0R(bbi, true);
                    } else {
                        bfm2.Afo();
                    }
                    return Unit.INSTANCE;
                }
            }, 274270255);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTZ(akh, bRg, g0v, g2k, i, 0);
        }
    }
}
