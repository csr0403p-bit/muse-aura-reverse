package X;

import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.19q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC045719q {
    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0W<-LX/BRg;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;ZFLX/3TQ;LX/BFM;I)V */
    public static final void A00(final C3TQ c3tq, BFM bfm, final BRg bRg, final G0V g0v, final G0V g0v2, final G0V g0v3, final G0V g0v4, final G0W g0w, final float f, final int i, final boolean z) {
        bfm.AgG(-1595074580);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0w);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0v3);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0v4);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0t(bfm, z);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0B(bfm, f);
        }
        if ((100663296 & i) == 0) {
            iA0d |= AnonymousClass004.A0l(bfm, c3tq);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(38347923 & iA0d, 38347922), bfm, iA0d)) {
            boolean zA1B = AnonymousClass005.A1B(iA0d) | AnonymousClass005.A1J(iA0d) | AnonymousClass007.A1G(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new C05263Tu(c3tq, f, z);
                bfm.Ai0(objAaT);
            }
            EnumC1820Arj enumC1820ArjA0d = AnonymousClass001.A0d(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v5 = C1515AkP.A04;
            G0V g0vA0t = AnonymousClass002.A0t(bfm, objAaT, akqA04, g0v5);
            G0V<InterfaceC1516AkQ, Integer, Unit> g0v6 = C1515AkP.A03;
            if (bbi.A0M || !AnonymousClass007.A1K(bfm, i2)) {
                AnonymousClass006.A1U(g0v6, bfm, i2);
            }
            G0V<InterfaceC1516AkQ, BRg, Unit> g0v7 = C1515AkP.A05;
            BPg.A02(bfm, bRgA01, g0v7);
            if (g0v3 != null) {
                bfm.AgE(-1444611617);
                BRg bRgA00 = C1Z4.A00(BRg.A00, "Leading");
                AKH<Boolean> akh = ARb.A01;
                BRg bRgThen = bRgA00.then(ARW.A00);
                InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A09, false);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgThen);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA01, g0v5);
                BPg.A02(bfm, akqA042, g0vA0t);
                if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0D)) {
                    AnonymousClass006.A1U(g0v6, bfm, iA0D);
                }
                BPg.A02(bfm, bRgA012, g0v7);
                AnonymousClass005.A0q(bbi, bfm, g0v3, iA0d >> 12);
            } else {
                bfm.AgE(-1476701825);
            }
            BBI.A0R(bbi, false);
            if (g0v4 != null) {
                bfm.AgE(-1444322883);
                BRg bRgA002 = C1Z4.A00(BRg.A00, "Trailing");
                AKH<Boolean> akh2 = ARb.A01;
                BRg bRgThen2 = bRgA002.then(ARW.A00);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgThen2);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0a, g0v5);
                BPg.A02(bfm, akqA043, g0vA0t);
                if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0D2)) {
                    AnonymousClass006.A1U(g0v6, bfm, iA0D2);
                }
                BPg.A02(bfm, bRgA013, g0v7);
                AnonymousClass005.A0q(bbi, bfm, g0v4, iA0d >> 15);
            } else {
                bfm.AgE(-1476701825);
            }
            BBI.A0R(bbi, false);
            float fA01 = C3U4.A01(c3tq, enumC1820ArjA0d);
            float fA00 = C3U4.A00(c3tq, enumC1820ArjA0d);
            BS0 bs0 = BRg.A00;
            if (g0v3 != null) {
                fA01 -= 12.0f;
                if (fA01 < 0.0f) {
                    fA01 = 0.0f;
                }
            }
            if (g0v4 != null) {
                fA00 -= 12.0f;
                if (fA00 < 0.0f) {
                    fA00 = 0.0f;
                }
            }
            BRg bRgA0C = C3U4.A0C(bs0, fA01, 0.0f, fA00, 0.0f);
            if (g0w != null) {
                bfm.AgE(-1443222972);
                AnonymousClass001.A1G(C1Z4.A00(bs0, "Hint").then(bRgA0C), bfm, g0w, (iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            } else {
                bfm.AgE(-1476701825);
            }
            BBI.A0R(bbi, false);
            if (g0v2 != null) {
                bfm.AgE(-1443101018);
                BRg bRgThen3 = C1Z4.A00(bs0, "Label").then(bRgA0C);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                int iA0D3 = AnonymousClass001.A0D(bbi);
                AKQ akqA044 = BBI.A04(bbi);
                BRg bRgA014 = AxM.A01(bfm, bRgThen3);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0c, g0v5);
                BPg.A02(bfm, akqA044, g0vA0t);
                if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0D3)) {
                    AnonymousClass006.A1U(g0v6, bfm, iA0D3);
                }
                BPg.A02(bfm, bRgA014, g0v7);
                AnonymousClass005.A0q(bbi, bfm, g0v2, iA0d >> 6);
            } else {
                bfm.AgE(-1476701825);
            }
            BBI.A0R(bbi, false);
            BRg bRgThen4 = C1Z4.A00(bs0, "TextField").then(bRgA0C);
            InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(C2VU.A0E, true);
            int iA0D4 = AnonymousClass001.A0D(bbi);
            AKQ akqA045 = BBI.A04(bbi);
            BRg bRgA015 = AxM.A01(bfm, bRgThen4);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA012, g0v5);
            BPg.A02(bfm, akqA045, g0vA0t);
            if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0D4)) {
                AnonymousClass006.A1U(g0v6, bfm, iA0D4);
            }
            BPg.A02(bfm, bRgA015, g0v7);
            AnonymousClass004.A1C(bbi, bfm, g0v, iA0d >> 3, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: X.19b
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    BRg bRg2 = bRg;
                    G0V g0v8 = g0v;
                    G0V g0v9 = g0v2;
                    G0W g0w2 = g0w;
                    G0V g0v10 = g0v3;
                    G0V g0v11 = g0v4;
                    boolean z2 = z;
                    AbstractC045719q.A00(c3tq, (BFM) obj, bRg2, g0v8, g0v9, g0v10, g0v11, g0w2, f, AnonymousClass011.A00(i), z2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
