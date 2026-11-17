package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;

/* renamed from: X.1Bq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC04661Bq {
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.APu r27, X.APt r28, X.AOP r29, X.BFM r30, X.BRg r31, X.G0U r32, X.G0V r33, X.G0W r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC04661Bq.A03(X.APu, X.APt, X.AOP, X.BFM, X.BRg, X.G0U, X.G0V, X.G0W, int, int):void");
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/AOP<TT;>;LX/G0U<-TT;Ljava/lang/Boolean;>;LX/BRg;LX/APu;LX/APt;LX/G0W<-LX/1Cd;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A05(APu aPu, APt aPt, AOP aop, BFM bfm, BRg bRg, G0U g0u, G0W g0w, int i, int i2) {
        APu aPuA00 = aPu;
        BRg bRg2 = bRg;
        APt aPtA00 = aPt;
        bfm.AgG(-1699747442);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, aop) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, aPuA00);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, aPtA00);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                aPuA00 = AbstractC1011APs.A03(0.0f, 3).A00(AbstractC1011APs.A07(AnonymousClass005.A0O(), C2VU.A07, new C05433bp(7)));
            }
            if (i5 != 0) {
                aPtA00 = AbstractC1011APs.A0H(AnonymousClass005.A0O(), C2VU.A07, new C05433bp(10)).A00(AbstractC1011APs.A0E(C1003AOr.A00(null)));
            }
            A04(aPuA00, aPtA00, aop, bfm, bRg2, g0u, g0w, iA0d & 524286);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C1BQ(aPuA00, aPtA00, aop, bRg2, g0u, g0w, i, i2);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/07C;LX/AOI<Ljava/lang/Boolean;>;LX/BRg;LX/APu;LX/APt;Ljava/lang/String;LX/G0W<-LX/1Cd;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A01(APu aPu, APt aPt, AOI aoi, C07C c07c, BFM bfm, BRg bRg, String str, G0W g0w, int i, int i2) {
        APu aPuA00 = aPu;
        BRg bRg2 = bRg;
        APt aPtA00 = aPt;
        String str2 = str;
        bfm.AgG(-1238803325);
        int iA06 = (i & 48) == 0 ? AnonymousClass002.A06(AnonymousClass004.A1Y(aoi, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA06 |= 384;
        } else if ((i & 384) == 0) {
            iA06 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA06 |= 3072;
        } else if ((i & 3072) == 0) {
            iA06 |= AnonymousClass004.A0g(bfm, aPuA00);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA06 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA06 |= AnonymousClass004.A0h(bfm, aPtA00);
        }
        int i6 = i2 & 16;
        int iA0i = 196608;
        if (i6 != 0) {
            iA06 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, str2);
            iA06 |= iA0i;
        }
        if ((1572864 & i) == 0) {
            iA06 |= AnonymousClass004.A0Z(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599185 & iA06, 599184), bfm, iA06)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                aPuA00 = AbstractC1011APs.A01(null, 15).A00(AbstractC1011APs.A03(0.0f, 3));
            }
            if (i5 != 0) {
                aPtA00 = AbstractC1011APs.A0B(null, 15).A00(AbstractC1011APs.A0E(C1003AOr.A00(null)));
            }
            if (i6 != 0) {
                str2 = "AnimatedVisibility";
            }
            int i7 = iA06 >> 3;
            AOP aopA03 = AOR.A03(aoi, bfm, str2, (i7 & 14) | ((iA06 >> 12) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new C05433bp(1);
                bfm.Ai0(objAaT);
            }
            A04(aPuA00, aPtA00, aopA03, bfm, bRg2, (G0U) objAaT, g0w, AnonymousClass001.A07(i7, AnonymousClass003.A07(iA06, (iA06 & 896) | 48)));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C11e(aPuA00, aPtA00, aoi, c07c, bRg2, str2, g0w, i, i2);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AOI<Ljava/lang/Boolean;>;LX/BRg;LX/APu;LX/APt;Ljava/lang/String;LX/G0W<-LX/1Cd;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A02(APu aPu, APt aPt, AOI aoi, BFM bfm, BRg bRg, String str, G0W g0w, int i, int i2) {
        BRg bRg2 = bRg;
        APu aPuA00 = aPu;
        APt aPtA00 = aPt;
        String str2 = str;
        bfm.AgG(657024243);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(aoi, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, aPuA00);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, aPtA00);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, str2);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA05, 74898), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                aPuA00 = AbstractC1011APs.A03(0.0f, 3).A00(AbstractC1011APs.A07(AnonymousClass005.A0O(), C2VU.A07, new C05433bp(7)));
            }
            if (i5 != 0) {
                aPtA00 = AbstractC1011APs.A0E(C1003AOr.A00(null)).A00(AbstractC1011APs.A0H(AnonymousClass005.A0O(), C2VU.A07, new C05433bp(10)));
            }
            if (i6 != 0) {
                str2 = "AnimatedVisibility";
            }
            AOP aopA03 = AOR.A03(aoi, bfm, str2, (iA05 & 14) | ((iA05 >> 9) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new C05433bp(4);
                bfm.Ai0(objAaT);
            }
            int i7 = iA05 << 3;
            A04(aPuA00, aPtA00, aopA03, bfm, bRg2, (G0U) objAaT, g0w, AnonymousClass001.A08(iA05, (i7 & 57344) | (i7 & 896) | 48 | (i7 & 7168)));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C18q(aPuA00, aPtA00, aoi, bRg2, str2, g0w, i, i2);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/07C;ZLX/BRg;LX/APu;LX/APt;Ljava/lang/String;LX/G0W<-LX/1Cd;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A06(APu aPu, APt aPt, C07C c07c, BFM bfm, BRg bRg, String str, G0W g0w, int i, int i2, boolean z) {
        APu aPuA00 = aPu;
        BRg bRg2 = bRg;
        APt aPtA00 = aPt;
        String str2 = str;
        bfm.AgG(1799879339);
        int iA0o = (i & 48) == 0 ? AnonymousClass004.A0o(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0o |= 384;
        } else if ((i & 384) == 0) {
            iA0o |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0o |= 3072;
        } else if ((i & 3072) == 0) {
            iA0o |= AnonymousClass004.A0g(bfm, aPuA00);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0o |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0o |= AnonymousClass004.A0h(bfm, aPtA00);
        }
        int i6 = i2 & 16;
        int iA0i = 196608;
        if (i6 != 0) {
            iA0o |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, str2);
            iA0o |= iA0i;
        }
        if ((1572864 & i) == 0) {
            iA0o |= AnonymousClass004.A0Z(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599185 & iA0o, 599184), bfm, iA0o)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                aPuA00 = AbstractC1011APs.A03(0.0f, 3).A00(AbstractC1011APs.A01(null, 15));
            }
            if (i5 != 0) {
                aPtA00 = AbstractC1011APs.A0E(C1003AOr.A00(null)).A00(AbstractC1011APs.A0B(null, 15));
            }
            if (i6 != 0) {
                str2 = "AnimatedVisibility";
            }
            int i7 = iA0o >> 3;
            AOP aopA04 = AOR.A04(bfm, Boolean.valueOf(z), str2, (i7 & 14) | ((iA0o >> 12) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new C05433bp(3);
                bfm.Ai0(objAaT);
            }
            A04(aPuA00, aPtA00, aopA04, bfm, bRg2, (G0U) objAaT, g0w, AnonymousClass001.A07(i7, AnonymousClass003.A07(iA0o, (iA0o & 896) | 48)));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C1Ys(aPuA00, aPtA00, c07c, bRg2, g0w, str2, i, i2, 1, z);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/08R;ZLX/BRg;LX/APu;LX/APt;Ljava/lang/String;LX/G0W<-LX/1Cd;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A07(APu aPu, APt aPt, C08R c08r, BFM bfm, BRg bRg, String str, G0W g0w, int i, int i2, boolean z) {
        APu aPuA00 = aPu;
        BRg bRg2 = bRg;
        APt aPtA00 = aPt;
        String str2 = str;
        bfm.AgG(234057107);
        int iA0o = (i & 48) == 0 ? AnonymousClass004.A0o(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0o |= 384;
        } else if ((i & 384) == 0) {
            iA0o |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0o |= 3072;
        } else if ((i & 3072) == 0) {
            iA0o |= AnonymousClass004.A0g(bfm, aPuA00);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0o |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0o |= AnonymousClass004.A0h(bfm, aPtA00);
        }
        int i6 = i2 & 16;
        int iA0i = 196608;
        if (i6 != 0) {
            iA0o |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, str2);
            iA0o |= iA0i;
        }
        if ((1572864 & i) == 0) {
            iA0o |= AnonymousClass004.A0Z(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599185 & iA0o, 599184), bfm, iA0o)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                AQI aqiA03 = AbstractC1011APs.A03(0.0f, 3);
                C1003AOr c1003AOrA0O = AnonymousClass005.A0O();
                Object obj = C2VU.A01;
                aPuA00 = aqiA03.A00(AbstractC1011APs.A07(c1003AOrA0O, obj.equals(C2VU.A02) ? C2VU.A0B : obj.equals(obj) ? C2VU.A0A : C2VU.A09, new C05463bs(new C05433bp(6), 4)));
            }
            if (i5 != 0) {
                AQJ aqjA0E = AbstractC1011APs.A0E(C1003AOr.A00(null));
                C1003AOr c1003AOrA0O2 = AnonymousClass005.A0O();
                Object obj2 = C2VU.A01;
                aPtA00 = aqjA0E.A00(AbstractC1011APs.A0H(c1003AOrA0O2, obj2.equals(C2VU.A02) ? C2VU.A0B : obj2.equals(obj2) ? C2VU.A0A : C2VU.A09, new C05463bs(new C05433bp(9), 5)));
            }
            if (i6 != 0) {
                str2 = "AnimatedVisibility";
            }
            int i7 = iA0o >> 3;
            AOP aopA04 = AOR.A04(bfm, Boolean.valueOf(z), str2, (i7 & 14) | ((iA0o >> 12) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new C05433bp(2);
                bfm.Ai0(objAaT);
            }
            A04(aPuA00, aPtA00, aopA04, bfm, bRg2, (G0U) objAaT, g0w, AnonymousClass001.A07(i7, AnonymousClass003.A07(iA0o, (iA0o & 896) | 48)));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C1Ys(aPuA00, aPtA00, c08r, bRg2, g0w, str2, i, i2, 0, z);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (ZLX/BRg;LX/APu;LX/APt;Ljava/lang/String;LX/G0W<-LX/1Cd;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A08(APu aPu, APt aPt, BFM bfm, BRg bRg, String str, G0W g0w, int i, int i2, boolean z) {
        BRg bRg2 = bRg;
        APu aPuA00 = aPu;
        APt aPtA00 = aPt;
        String str2 = str;
        bfm.AgG(-1448730565);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, aPuA00);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0n |= 3072;
        } else if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, aPtA00);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            iA0n |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0h(bfm, str2);
        }
        if ((196608 & i) == 0) {
            iA0n |= AnonymousClass004.A0Y(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                aPuA00 = AbstractC1011APs.A03(0.0f, 3).A00(AbstractC1011APs.A07(AnonymousClass005.A0O(), C2VU.A07, new C05433bp(7)));
            }
            if (i5 != 0) {
                aPtA00 = AbstractC1011APs.A0H(AnonymousClass005.A0O(), C2VU.A07, new C05433bp(10)).A00(AbstractC1011APs.A0E(C1003AOr.A00(null)));
            }
            if (i6 != 0) {
                str2 = "AnimatedVisibility";
            }
            AOP aopA04 = AOR.A04(bfm, Boolean.valueOf(z), str2, (iA0n & 14) | ((iA0n >> 9) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new C05433bp(0);
                bfm.Ai0(objAaT);
            }
            int i7 = iA0n << 3;
            A04(aPuA00, aPtA00, aopA04, bfm, bRg2, (G0U) objAaT, g0w, AnonymousClass001.A08(iA0n, (i7 & 57344) | (i7 & 896) | 48 | (i7 & 7168)));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C0Y6(aPuA00, aPtA00, bRg2, str2, g0w, i, i2, z);
        }
    }

    public static final EnumC04711Bv A00(AOP aop, BFM bfm, Object obj, G0U g0u) {
        EnumC04711Bv enumC04711Bv;
        BBI bbi;
        boolean z;
        bfm.Ag8(-422486745, aop);
        if (aop.A0G()) {
            bfm.AgE(-212166497);
            bbi = (BBI) bfm;
            z = false;
            BBI.A0R(bbi, false);
            enumC04711Bv = ((Boolean) g0u.invoke(obj)).booleanValue() ? EnumC04711Bv.A04 : ((Boolean) g0u.invoke(aop.A02.A09())).booleanValue() ? EnumC04711Bv.A02 : EnumC04711Bv.A03;
        } else {
            bfm.AgE(-211892364);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new ParcelableSnapshotMutableState(AGF.A01(), false);
                bfm.Ai0(objAaT);
            }
            MutableState mutableState = (MutableState) objAaT;
            if (((Boolean) g0u.invoke(aop.A02.A09())).booleanValue()) {
                mutableState.Af8(true);
            }
            enumC04711Bv = ((Boolean) g0u.invoke(obj)).booleanValue() ? EnumC04711Bv.A04 : ((Boolean) mutableState.getValue()).booleanValue() ? EnumC04711Bv.A02 : EnumC04711Bv.A03;
            bbi = (BBI) bfm;
            z = false;
            BBI.A0R(bbi, false);
        }
        BBI.A0R(bbi, z);
        return enumC04711Bv;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/AOP<TT;>;LX/G0U<-TT;Ljava/lang/Boolean;>;LX/BRg;LX/APu;LX/APt;LX/G0W<-LX/1Cd;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A04(APu aPu, APt aPt, AOP aop, BFM bfm, BRg bRg, G0U g0u, G0W g0w, int i) {
        bfm.AgG(1706321816);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, aop) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, aPu);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, aPt);
        }
        if ((i & 196608) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            int i2 = iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            int i3 = iA0d & 14;
            boolean zA1Q = AnonymousClass002.A1Q(i2, 32) | (i3 == 4);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = new C3S4(aop, g0u);
                bfm.Ai0(objAaT);
            }
            BRg bRgA00 = C3UC.A00(bRg, (G0W) objAaT);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = new C05423bo(2);
                bfm.Ai0(objAaT2);
            }
            A03(aPu, aPt, aop, bfm, bRgA00, g0u, (G0V) objAaT2, g0w, AnonymousClass001.A0A(iA0d, i2 | 196608 | i3 | (iA0d & 7168)) | ((iA0d << 6) & 29360128), 64);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C1BP(aPu, aPt, aop, bRg, g0u, g0w, i);
        }
    }
}
