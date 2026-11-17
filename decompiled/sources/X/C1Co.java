package X;

import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.jvm.functions.Function0;

/* renamed from: X.1Co, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1Co {
    public static final long A00;

    public static final float A00(C2av c2av, float f) {
        float fA03 = AnonymousClass003.A03(((C1390AiL) c2av).A0D);
        if (Float.isNaN(fA03) || fA03 == 0.0f) {
            return 1.0f;
        }
        return 1.0f - ((((1.0f - f) * 0.0f) + (f * Math.min(c2av.Ah4(48.0f), fA03))) / fA03);
    }

    public static final float A01(C2av c2av, float f) {
        float fA00 = AWA.A00(((C1390AiL) c2av).A0D);
        if (Float.isNaN(fA00) || fA00 == 0.0f) {
            return 1.0f;
        }
        return 1.0f - ((((1.0f - f) * 0.0f) + (f * Math.min(c2av.Ah4(24.0f), fA00))) / fA00);
    }

    static {
        long jA0J = AnonymousClass005.A0J(0.5f, 0.0f);
        long j = C15k.A01;
        A00 = jA0J;
    }

    /* JADX WARN: Incorrect types in method signature: (ZLX/G0U<-LX/1Vj;Ljava/lang/Boolean;>;LX/BFM;II)LX/1Pn; */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1Pn A02(X.BFM r9, X.G0U r10, int r11, int r12, boolean r13) {
        /*
            r0 = r12 & 1
            if (r0 == 0) goto L5
            r13 = 0
        L5:
            r0 = r12 & 2
            if (r0 == 0) goto L10
            r0 = 19
            X.3bp r10 = new X.3bp
            r10.<init>(r0)
        L10:
            X.1Vj r6 = X.C1Vj.Hidden
            r0 = r11 & 14
            r2 = r0 | 384(0x180, float:5.38E-43)
            X.AOc<java.lang.Float> r0 = X.C1AP.A00
            r8 = 0
            X.AKH<X.AXN> r0 = X.Am0.A04
            java.lang.Object r7 = r9.A6v(r0)
            X.AXN r7 = (X.AXN) r7
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            java.lang.Object[] r5 = new java.lang.Object[]{r1, r10, r0}
            r0 = 14
            X.3bo r1 = new X.3bo
            r1.<init>(r0)
            X.1Cs r0 = new X.1Cs
            r0.<init>(r7, r10, r13)
            X.AFu r4 = new X.AFu
            r4.<init>(r1, r0)
            r0 = r2 & 14
            r0 = r0 ^ 6
            r3 = 4
            if (r0 <= r3) goto L4b
            boolean r0 = r9.A66(r13)
            if (r0 != 0) goto L50
        L4b:
            r1 = r2 & 6
            r0 = 0
            if (r1 != r3) goto L51
        L50:
            r0 = 1
        L51:
            boolean r2 = X.AnonymousClass001.A1R(r9, r7, r0)
            boolean r1 = r9.A65(r10)
            r0 = 1
            if (r1 != 0) goto L5d
            r0 = 0
        L5d:
            r2 = r2 | r0
            boolean r0 = r9.A66(r8)
            if (r0 == 0) goto L65
            r8 = 1
        L65:
            r2 = r2 | r8
            java.lang.Object r0 = r9.AaT()
            if (r2 != 0) goto L70
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L78
        L70:
            X.1Ct r0 = new X.1Ct
            r0.<init>(r6, r7, r10, r13)
            r9.Ai0(r0)
        L78:
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            java.lang.Object r0 = X.AFz.A02(r9, r4, r0, r5, r3)
            X.1Pn r0 = (X.C1Pn) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1Co.A02(X.BFM, X.G0U, int, int, boolean):X.1Pn");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/1eP;LX/AT5<Ljava/lang/Float;LX/AOW;>;LX/3UX;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/G0U<-Ljava/lang/Float;Lkotlin/Unit;>;LX/BRg;LX/1Pn;FLX/1DM;JJFLX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;+LX/1Ny;>;LX/G0W<-LX/07C;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;III)V */
    /* JADX WARN: Removed duplicated region for block: B:107:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.AT5 r31, X.InterfaceC05151eP r32, X.C1Pn r33, X.BFM r34, X.BRg r35, X.C1DM r36, kotlin.jvm.functions.Function0 r37, final X.G0U r38, X.G0V r39, X.G0V r40, X.G0W r41, X.C3UX r42, float r43, float r44, int r45, int r46, int r47, long r48, long r50) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1Co.A03(X.AT5, X.1eP, X.1Pn, X.BFM, X.BRg, X.1DM, kotlin.jvm.functions.Function0, X.G0U, X.G0V, X.G0V, X.G0W, X.3UX, float, float, int, int, int, long, long):void");
    }

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/BRg;LX/1Pn;FLX/1DM;JJFJLX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;+LX/1Ny;>;LX/BA3;LX/G0W<-LX/07C;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;III)V */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.BA3 r31, X.C1Pn r32, X.BFM r33, X.BRg r34, X.C1DM r35, kotlin.jvm.functions.Function0 r36, X.G0V r37, X.G0V r38, X.G0W r39, float r40, float r41, int r42, int r43, int r44, long r45, long r47, long r49) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1Co.A04(X.BA3, X.1Pn, X.BFM, X.BRg, X.1DM, kotlin.jvm.functions.Function0, X.G0V, X.G0V, X.G0W, float, float, int, int, int, long, long, long):void");
    }

    /* JADX WARN: Incorrect types in method signature: (JLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;ZLX/BFM;I)V */
    public static final void A05(BFM bfm, Function0 function0, int i, long j, boolean z) {
        bfm.AgG(951870469);
        int iA0M = (i & 6) == 0 ? AnonymousClass004.A0M(bfm, j) | i : i;
        if ((i & 48) == 0) {
            iA0M |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0M |= AnonymousClass004.A0p(bfm, z);
        }
        if ((iA0M & 147) == 146 && bfm.AKh()) {
            bfm.Afo();
        } else if (j != 16) {
            C1BO c1boA01 = C31t.A01(AnonymousClass001.A0K(300, 0), bfm, AnonymousClass006.A00(z ? 1 : 0), 48, 28);
            String strA00 = C1EO.A00(bfm, R.string._name_removed__res_0x7f1206ee);
            bfm.AgE(-1785653838);
            BRg bRgA0Y = BRg.A00;
            if (z) {
                int i2 = iA0M & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
                boolean z2 = i2 == 32;
                Object objAaT = bfm.AaT();
                if (z2 || objAaT == C78N.A00) {
                    objAaT = new C05383bk(function0, null, 6);
                    bfm.Ai0(objAaT);
                }
                C1247Afe c1247Afe = AaM.A00;
                AaL aaL = new AaL(new C5KQ((G0V) objAaT), function0, null, null);
                boolean zA1Q = AnonymousClass002.A1Q(i2, 32) | bfm.A65(strA00);
                Object objAaT2 = bfm.AaT();
                if (zA1Q || objAaT2 == C78N.A00) {
                    objAaT2 = new C1Cr(strA00, function0);
                    bfm.Ai0(objAaT2);
                }
                bRgA0Y = AnonymousClass001.A0Y(aaL, objAaT2, true);
            }
            AnonymousClass001.A1D(bfm);
            BRg bRgThen = C10G.A01.then(bRgA0Y);
            boolean zA65 = bfm.A65(c1boA01) | ((iA0M & 14) == 4);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == C78N.A00) {
                objAaT3 = new C15q(j, c1boA01);
                bfm.Ai0(objAaT3);
            }
            C0zJ.A00(bRgThen, (G0U) objAaT3, bfm, 0);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C1Cn(function0, i, j, z);
        }
    }
}
