package X;

import android.os.Trace;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.unit.Constraints;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.ApL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1727ApL {
    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/ApQ;LX/Arm;LX/G0U<-LX/Aux;Lkotlin/Unit;>;IZIILX/2K7;Ljava/util/List<LX/ApU<LX/Arl;>;>;LX/G0U<-Ljava/util/List<LX/AaC;>;Lkotlin/Unit;>;LX/Aup;LX/1DN;LX/G0U<-LX/AvG;Lkotlin/Unit;>;LX/013;)LX/BRg; */
    public static final BRg A00(AnonymousClass013 anonymousClass013, C1951Aup c1951Aup, BRg bRg, C1DN c1dn, ApQ apQ, C1822Arm c1822Arm, C2K7 c2k7, List list, G0U g0u, G0U g0u2, G0U g0u3, int i, int i2, int i3, boolean z) {
        BRg c1953Aur;
        BRg bRg2;
        if (c1951Aup == null) {
            c1953Aur = new C1950Auo(anonymousClass013, c1dn, apQ, c1822Arm, c2k7, list, g0u, g0u2, g0u3, i, i2, i3, z);
            bRg2 = BRg.A00;
        } else {
            c1953Aur = new C1953Aur(anonymousClass013, c1951Aup, c1dn, apQ, c1822Arm, c2k7, list, g0u, g0u2, i, i2, i3, z);
            bRg2 = c1951Aup.A05;
        }
        return C8j3.A0e(bRg, bRg2, c1953Aur);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/BRg;LX/Arm;LX/G0U<-LX/Aux;Lkotlin/Unit;>;IZIILX/1DN;LX/013;LX/BFM;II)V */
    public static final void A02(AnonymousClass013 anonymousClass013, BFM bfm, BRg bRg, C1DN c1dn, C1822Arm c1822Arm, final String str, G0U g0u, int i, int i2, int i3, final int i4, final int i5, boolean z) {
        C1951Aup c1951Aup;
        BRg bRgA00;
        AnonymousClass013 anonymousClass0132 = anonymousClass013;
        BRg bRg2 = bRg;
        C1DN c1dn2 = c1dn;
        C1822Arm c1822Arm2 = c1822Arm;
        G0U g0u2 = g0u;
        final int i6 = i;
        int i7 = i2;
        int i8 = i3;
        boolean zA1Q = z;
        bfm.AgG(-1040751001);
        int iA0d = (i4 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i4 : i4;
        int i9 = i5 & 2;
        if (i9 != 0) {
            iA0d |= 48;
        } else if ((i4 & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i10 = i5 & 4;
        if (i10 != 0) {
            iA0d |= 384;
        } else if ((i4 & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c1822Arm2);
        }
        int i11 = i5 & 8;
        if (i11 != 0) {
            iA0d |= 3072;
        } else if ((i4 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u2);
        }
        int i12 = i5 & 16;
        if (i12 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i4 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0G(bfm, i6);
        }
        int i13 = i5 & 32;
        int iA0s = 196608;
        if (i13 != 0) {
            iA0d |= iA0s;
        } else if ((i4 & 196608) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, zA1Q);
            iA0d |= iA0s;
        }
        int i14 = i5 & 64;
        int iA0I = 1572864;
        if (i14 != 0) {
            iA0d |= iA0I;
        } else if ((i4 & 1572864) == 0) {
            iA0I = AnonymousClass004.A0I(bfm, i7);
            iA0d |= iA0I;
        }
        int i15 = i5 & 128;
        int iA0J = 12582912;
        if (i15 != 0) {
            iA0d |= iA0J;
        } else if ((i4 & 12582912) == 0) {
            i15 = 0;
            iA0J = AnonymousClass004.A0J(bfm, i8);
            iA0d |= iA0J;
        }
        int i16 = i5 & 256;
        int iA0b = 100663296;
        if (i16 != 0) {
            iA0d |= iA0b;
        } else if ((i4 & 100663296) == 0) {
            i16 = 0;
            iA0b = AnonymousClass004.A0b(bfm, c1dn2);
            iA0d |= iA0b;
        }
        int i17 = i5 & 512;
        int i18 = 805306368;
        if (i17 != 0) {
            iA0d |= i18;
        } else if ((i4 & 805306368) == 0) {
            i18 = 268435456;
            if (AnonymousClass004.A1R(bfm, anonymousClass0132, i4, 1073741824)) {
                i18 = 536870912;
            }
            iA0d |= i18;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 306783379, 306783378), bfm, iA0d)) {
            if (i9 != 0) {
                bRg2 = BRg.A00;
            }
            if (i10 != 0) {
                c1822Arm2 = C1822Arm.A03;
            }
            if (i11 != 0) {
                g0u2 = null;
            }
            if (i12 != 0) {
                i6 = 1;
            }
            zA1Q = C60Q.A1Q(i13, zA1Q);
            if (i14 != 0) {
                i7 = Integer.MAX_VALUE;
            }
            if (i15 != 0) {
                i8 = 1;
            }
            if (i16 != 0) {
                c1dn2 = null;
            }
            if (i17 != 0) {
                anonymousClass0132 = null;
            }
            AZD.A00(i8, i7);
            BBI bbi = (BBI) bfm;
            InterfaceC2072Axn interfaceC2072Axn = (InterfaceC2072Axn) AKO.A07(AbstractC1965AvH.A00, bbi);
            if (interfaceC2072Axn != null) {
                bfm.AgE(356423075);
                long j = ((C1BT) AKO.A07(C1BR.A00, bbi)).A00;
                Object[] objArr = {interfaceC2072Axn};
                C0872AFu c0872AFuA01 = C0872AFu.A01(new C2296BSw(interfaceC2072Axn, 5), 7);
                boolean zA67 = bfm.A67(interfaceC2072Axn);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = C2298BSy.A00(interfaceC2072Axn, 0);
                    bfm.Ai0(objAaT);
                }
                long jA05 = C3cG.A05(AFz.A01(bfm, c0872AFuA01, (Function0) objAaT, objArr));
                boolean zA1T = AnonymousClass002.A1T(bfm, j, bfm.A64(jA05), bfm.A65(interfaceC2072Axn));
                Object objAaT2 = bfm.AaT();
                if (zA1T || objAaT2 == C78N.A00) {
                    objAaT2 = new C1951Aup(C2069Axk.A02, interfaceC2072Axn, jA05, j);
                    bfm.Ai0(objAaT2);
                }
                c1951Aup = (C1951Aup) objAaT2;
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(356914239);
                BBI.A0R(bbi, false);
                c1951Aup = null;
            }
            AKH<C2K7> akh = Am0.A06;
            final C2K7 c2k7 = (C2K7) AKO.A07(akh, bbi);
            Executor executor = (Executor) AKO.A07(ApP.A01, bbi);
            if (executor == null || !ApP.A01(str.length())) {
                bfm.AgE(1255914055);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1254298614);
                final EnumC1820Arj enumC1820Arj = (EnumC1820Arj) AKO.A07(Am0.A0A, bbi);
                final AXN axnA04 = AKO.A04(Am0.A04, bbi);
                try {
                    final C1822Arm c1822Arm3 = c1822Arm2;
                    executor.execute(new Runnable() { // from class: X.Azf
                        public static final String __redex_internal_original_name = "BasicText_androidKt$$ExternalSyntheticLambda2";

                        @Override // java.lang.Runnable
                        public final void run() {
                            C1822Arm c1822Arm4 = c1822Arm3;
                            EnumC1820Arj enumC1820Arj2 = enumC1820Arj;
                            String str2 = str;
                            AXN axn = axnA04;
                            C2K7 c2k72 = c2k7;
                            Trace.beginSection("BackgroundTextMeasurement");
                            try {
                                BDi bDiA00 = Snapshot.A00(null, null);
                                try {
                                    Snapshot snapshotA0A = bDiA00.A0A();
                                    try {
                                        C1822Arm c1822ArmA01 = AbstractC1823Arn.A01(c1822Arm4, enumC1820Arj2);
                                        C0881AGi c0881AGi = C0881AGi.A00;
                                        C1833Arx c1833Arx = new C1833Arx(c1822ArmA01, c2k72, axn, str2, c0881AGi, c0881AGi);
                                        c1833Arx.AHR();
                                        c1833Arx.AHj();
                                        bDiA00.A0T().A00();
                                    } finally {
                                        Snapshot.A06(snapshotA0A);
                                    }
                                } finally {
                                }
                            } finally {
                                Trace.endSection();
                            }
                        }
                    });
                } catch (RejectedExecutionException unused) {
                }
                BBI.A0R(bbi, false);
            }
            if (c1951Aup == null && g0u2 == null && anonymousClass0132 == null) {
                bfm.AgE(357875859);
                BBI.A0R(bbi, false);
                bRgA00 = bRg2.then(new C1952Auq(c1dn2, c1822Arm2, c2k7, str, i6, i7, i8, zA1Q));
            } else {
                bfm.AgE(357232113);
                bRgA00 = A00(anonymousClass0132, c1951Aup, bRg2, c1dn2, AnonymousClass005.A0X(str), c1822Arm2, (C2K7) AKO.A07(akh, bbi), null, g0u2, null, null, i6, i7, i8, zA1Q);
                BBI.A0R(bbi, false);
            }
            C1034ARx c1034ARx = C1034ARx.A00;
            int iA0J2 = AnonymousClass003.A0J(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA00);
            AKQ akqA04 = BBI.A04(bbi);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass003.A0o(bfm, c1034ARx, akqA04);
            AnonymousClass003.A0n(bfm, bRgA01);
            AnonymousClass002.A0w(bfm, iA0J2);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final AnonymousClass013 anonymousClass0133 = anonymousClass0132;
            final BRg bRg3 = bRg2;
            final C1DN c1dn3 = c1dn2;
            final C1822Arm c1822Arm4 = c1822Arm2;
            final G0U g0u3 = g0u2;
            final int i19 = i7;
            final int i20 = i8;
            final boolean z2 = zA1Q;
            bBbAAc.A06 = new G0V() { // from class: X.BIA
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    BRg bRg4 = bRg3;
                    C1822Arm c1822Arm5 = c1822Arm4;
                    G0U g0u4 = g0u3;
                    int i21 = i6;
                    boolean z3 = z2;
                    int i22 = i19;
                    int i23 = i20;
                    C1DN c1dn4 = c1dn3;
                    int i24 = i4;
                    AbstractC1727ApL.A02(null, (BFM) obj, bRg4, c1dn4, c1822Arm5, str2, g0u4, i21, i22, i23, AnonymousClass011.A00(i24), i5, z3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(final X.C1951Aup r35, X.BFM r36, final X.BRg r37, final X.C1DN r38, final X.ApQ r39, final X.C1822Arm r40, final X.C2K7 r41, java.util.Map r42, final X.G0U r43, final X.G0U r44, final int r45, final int r46, final int r47, final int r48, final int r49, final int r50, final boolean r51, final boolean r52) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1727ApL.A03(X.Aup, X.BFM, X.BRg, X.1DN, X.ApQ, X.Arm, X.2K7, java.util.Map, X.G0U, X.G0U, int, int, int, int, int, int, boolean, boolean):void");
    }

    @Deprecated(level = Hs1.A03, message = "Maintained for binary compatibility")
    public static final /* synthetic */ void A05(BFM bfm, BRg bRg, C1DN c1dn, C1822Arm c1822Arm, final String str, G0U g0u, int i, int i2, int i3, final int i4, final int i5, boolean z) {
        G0U g0u2 = g0u;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        BRg bRg2 = bRg;
        C1822Arm c1822Arm2 = c1822Arm;
        boolean zA1Q = z;
        bfm.AgG(-1186827822);
        int iA0d = (i4 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i4 : i4;
        int i9 = i5 & 2;
        if (i9 != 0) {
            iA0d |= 48;
        } else if ((i4 & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i10 = i5 & 4;
        if (i10 != 0) {
            iA0d |= 384;
        } else if ((i4 & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c1822Arm2);
        }
        int i11 = i5 & 8;
        if (i11 != 0) {
            iA0d |= 3072;
        } else if ((i4 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u2);
        }
        int i12 = i5 & 16;
        if (i12 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i4 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0G(bfm, i6);
        }
        int i13 = i5 & 32;
        int iA0s = 196608;
        if (i13 != 0) {
            iA0d |= iA0s;
        } else if ((196608 & i4) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, zA1Q);
            iA0d |= iA0s;
        }
        int i14 = i5 & 64;
        int iA0I = 1572864;
        if (i14 != 0) {
            iA0d |= iA0I;
        } else if ((i4 & 1572864) == 0) {
            iA0I = AnonymousClass004.A0I(bfm, i7);
            iA0d |= iA0I;
        }
        int i15 = i5 & 128;
        int iA0J = 12582912;
        if (i15 != 0) {
            iA0d |= iA0J;
        } else if ((i4 & 12582912) == 0) {
            i15 = 0;
            iA0J = AnonymousClass004.A0J(bfm, i8);
            iA0d |= iA0J;
        }
        int i16 = i5 & 256;
        int iA0b = 100663296;
        if (i16 != 0) {
            iA0d |= iA0b;
        } else if ((i4 & 100663296) == 0) {
            i16 = 0;
            iA0b = AnonymousClass004.A0b(bfm, c1dn);
            iA0d |= iA0b;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1G(iA0d), bfm, iA0d)) {
            if (i9 != 0) {
                bRg2 = BRg.A00;
            }
            if (i10 != 0) {
                c1822Arm2 = C1822Arm.A03;
            }
            if (i11 != 0) {
                g0u2 = null;
            }
            if (i12 != 0) {
                i6 = 1;
            }
            zA1Q = C60Q.A1Q(i13, zA1Q);
            if (i14 != 0) {
                i7 = Integer.MAX_VALUE;
            }
            if (i15 != 0) {
                i8 = 1;
            }
            if (i16 != 0) {
                c1dn = null;
            }
            A02(null, bfm, bRg2, c1dn, c1822Arm2, str, g0u2, i6, i7, i8, iA0d & 268435454, 512, zA1Q);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            final C1DN c1dn2 = c1dn;
            final C1822Arm c1822Arm3 = c1822Arm2;
            final G0U g0u3 = g0u2;
            final int i17 = i6;
            final int i18 = i7;
            final int i19 = i8;
            final boolean z2 = zA1Q;
            bBbAAc.A06 = new G0V() { // from class: X.0yw
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    BRg bRg4 = bRg3;
                    C1822Arm c1822Arm4 = c1822Arm3;
                    G0U g0u4 = g0u3;
                    int i20 = i17;
                    boolean z3 = z2;
                    int i21 = i18;
                    int i22 = i19;
                    C1DN c1dn3 = c1dn2;
                    int i23 = i4;
                    AbstractC1727ApL.A05((BFM) obj, bRg4, c1dn3, c1822Arm4, str2, g0u4, i20, i21, i22, AnonymousClass011.A00(i23), i5, z3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final List<HxE<AZE, Function0<C2ae>>> A01(List<? extends C3TG> list, Function0<Boolean> function0) {
        C1729ApO c1729ApO;
        int i;
        if (!AnonymousClass003.A1Y(function0)) {
            return null;
        }
        ArrayList arrayListA0t = C60Q.A0t(list);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3TG c3tg = list.get(i2);
            Object objAIX = c3tg.AIX();
            C7384Etj.A0Z(objAIX, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            C1700Aof c1700Aof = (C1700Aof) ((AbG) objAIX).A00;
            C1695AoZ c1695AoZ = c1700Aof.A00;
            C1733ApU c1733ApU = c1700Aof.A01;
            C1958Aux c1958Aux = (C1958Aux) c1695AoZ.A01.getValue();
            if (c1958Aux == null) {
                i = 7;
            } else {
                C1733ApU<AbstractC1699Aoe> c1733ApUA00 = C1695AoZ.A00(c1733ApU, c1958Aux);
                if (c1733ApUA00 == null) {
                    i = 8;
                } else {
                    BLU bluA02 = C2Un.A02(c1958Aux.A07(c1733ApUA00.A01, c1733ApUA00.A00).AD1());
                    c1729ApO = new C1729ApO(bluA02.A02 - bluA02.A01, bluA02.A00 - bluA02.A03, C2298BSy.A00(bluA02, 11));
                    int i3 = c1729ApO.A01;
                    int i4 = c1729ApO.A00;
                    AnonymousClass002.A1J(c3tg.AQW(Constraints.A07(i3, i3, i4, i4)), c1729ApO.A02, arrayListA0t);
                }
            }
            c1729ApO = new C1729ApO(0, 0, new C2283BSj(i));
            int i32 = c1729ApO.A01;
            int i42 = c1729ApO.A00;
            AnonymousClass002.A1J(c3tg.AQW(Constraints.A07(i32, i32, i42, i42)), c1729ApO.A02, arrayListA0t);
        }
        return arrayListA0t;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.BFM r34, X.BRg r35, X.C1DN r36, final X.ApQ r37, X.C1822Arm r38, java.util.Map r39, X.G0U r40, int r41, int r42, int r43, final int r44, final int r45, final int r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1727ApL.A04(X.BFM, X.BRg, X.1DN, X.ApQ, X.Arm, java.util.Map, X.G0U, int, int, int, int, int, int, boolean):void");
    }
}
