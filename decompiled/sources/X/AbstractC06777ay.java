package X;

import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.7ay, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC06777ay {
    public static final C7az A00;

    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/7az;LX/G0U<-LX/7b5;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A01(C7az c7az, BFM bfm, BRg bRg, final G0U g0u, int i, int i2) {
        final C7az c7az2 = c7az;
        BRg bRg2 = bRg;
        bfm.AgG(-625529233);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, c7az);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                c7az2 = A00;
            }
            A02(c7az2, bfm, bRg2, B1V.A00(bfm, new G0W() { // from class: X.7b4
                @Override // X.G0W
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    G0U g0u2 = g0u;
                    C7az c7az3 = c7az2;
                    BFM bfm2 = (BFM) obj2;
                    int iA0F = AnonymousClass001.A0F(obj3);
                    C7az c7az4 = AbstractC06777ay.A00;
                    if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0F & 17, 16), bfm2, iA0F)) {
                        Object objAaT = bfm2.AaT();
                        if (objAaT == C78N.A00) {
                            objAaT = new C7b5(C7b3.A01);
                            bfm2.Ai0(objAaT);
                        }
                        C7b5 c7b5 = (C7b5) objAaT;
                        c7b5.A00.clear();
                        g0u2.invoke(c7b5);
                        c7b5.A00(c7az3, bfm2, 0);
                    } else {
                        bfm2.Afo();
                    }
                    return Unit.INSTANCE;
                }
            }, -250345048), ((iA0d >> 3) & 14) | 384 | ((iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C8iI(c7az2, bRg2, g0u, i, i2, 1);
        }
    }

    static {
        long j = B6A.A08;
        long j2 = B6A.A01;
        A00 = new C7az(j, j2, j2, HxS.A04(HDi.A0O[(int) (j2 & 63)], B6A.A03(j2), B6A.A02(j2), B6A.A01(j2), 0.38f), HxS.A04(HDi.A0O[(int) (j2 & 63)], B6A.A03(j2), B6A.A02(j2), B6A.A01(j2), 0.38f));
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;ZLX/7az;LX/BRg;LX/G0W<-LX/B6A;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A00(final C7az c7az, BFM bfm, BRg bRg, final String str, final Function0 function0, G0W g0w, final int i, final int i2, final boolean z) {
        BRg bRg2 = bRg;
        G0W g0w2 = g0w;
        bfm.AgG(-2001167027);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c7az);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0w2);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g0w2 = null;
            }
            C1AC c1ac = C7b0.A03;
            C9m9 c9m9A00 = AcQ.A00(12.0f);
            boolean zA1C = AnonymousClass003.A1C(iA0d) | AnonymousClass003.A1F(458752, iA0d, 131072);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new BT8(function0, 0, z);
                bfm.Ai0(objAaT);
            }
            BRg bRgA07 = C3U4.A07(C10G.A0F(AnonymousClass001.A0R(C0v5.A04(bRg2, null, str, (Function0) objAaT, z)), 112.0f, 48.0f, 280.0f, 48.0f), 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(c9m9A00, bfm, c1ac);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0b);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA0D);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            if (g0w2 == null) {
                bfm.AgE(-1597947094);
            } else {
                BRg bRgA0E = C10G.A0E(C3cG.A09(bfm, -1597947093), 24.0f, Float.NaN, 24.0f, 24.0f);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA0E);
                AnonymousClass005.A0n(bfm, bbi, function02);
                BPg.A02(bfm, interfaceC1380AiAA0c, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA012, g0vA0u);
                AnonymousClass001.A1G(C60P.A04(z ? c7az.A03 : c7az.A01), bfm, g0w2, 0);
                BBI.A0R(bbi, true);
            }
            BBI.A0R(bbi, false);
            long j = z ? c7az.A04 : c7az.A02;
            long j2 = C7b0.A00;
            C1736ApY c1736ApY = C7b0.A04;
            long j3 = C7b0.A02;
            long j4 = C7b0.A01;
            C1822Arm c1822Arm = C1822Arm.A03;
            AbstractC1727ApL.A02(null, bfm, c90m.AiP(BRg.A00, 1.0f, true), null, new C1822Arm(null, null, c1736ApY, 5, 0, j, j2, j4, B6A.A07, j3), str, null, 0, 1, 0, (iA0d & 14) | 1572864, 952, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            final G0W g0w3 = g0w2;
            bBbAAc.A06 = new G0V() { // from class: X.7b1
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    boolean z2 = z;
                    C7az c7az2 = c7az;
                    BRg bRg4 = bRg3;
                    G0W g0w4 = g0w3;
                    Function0 function03 = function0;
                    int i5 = i;
                    int i6 = i2;
                    C7az c7az3 = AbstractC06777ay.A00;
                    AbstractC06777ay.A00(c7az2, (BFM) obj, bRg4, str2, function03, g0w4, AnonymousClass011.A00(i5), i6, z2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/7az;LX/BRg;LX/G0W<-LX/07C;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A02(C7az c7az, BFM bfm, BRg bRg, G0W g0w, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-527864079);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c7az) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1AC c1ac = C7b0.A03;
            BRg bRgA0T = AnonymousClass005.A0T(bfm, C3U4.A06(BGR.A01(C0lh.A02, C1b8.A01(AbstractC04540eo.A00(bRg2, C1D8.A00(4.0f), 3.0f, 28, 0L, 0L), c7az.A00)), 8.0f));
            int i4 = (iA0d << 3) & 7168;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0T);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            AnonymousClass001.A1G(C90l.A00, bfm, g0w, ((i4 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C8iI(bRg2, c7az, g0w, i, i2, 0);
        }
    }
}
