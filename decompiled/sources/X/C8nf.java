package X;

import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.jvm.functions.Function0;

/* renamed from: X.8nf, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8nf {
    /* JADX WARN: Incorrect types in method signature: (LX/8ni;Ljava/lang/String;LX/BRg;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/G0W<-LX/8ni;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A00(BFM bfm, BRg bRg, C8ni c8ni, String str, Function0 function0, G0W g0w, int i) {
        BRg bRgA02;
        BRg bRgA04;
        BBI bbiA0M;
        C7384Etj.A0Y(c8ni, 0);
        AnonymousClass005.A11(str, bRg, function0, 1);
        C7384Etj.A0Y(g0w, 4);
        bfm.AgG(1028498903);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c8ni) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            C8nh c8nh = (C8nh) c8ni;
            AnonymousClass962 anonymousClass962 = c8nh.A01;
            C1D3 c1d3A00 = C1D8.A00(anonymousClass962.A0A);
            if (c8nh.A03) {
                bRgA04 = BRg.A00;
                bRgA02 = C1DI.A02(bRgA04, c1d3A00, anonymousClass962.A07, anonymousClass962.A0J);
            } else {
                bRgA02 = BRg.A00;
                bRgA04 = bRgA02;
            }
            int i2 = iA0d & 14;
            boolean zA1Q = AnonymousClass002.A1Q(i2, 4) | AnonymousClass004.A1I(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = new C2348BUw(str, c8ni, 0);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT, true);
            if (c8nh.A02) {
                bfm.AgE(544999042);
                C1YD c1ydA0A = C3cG.A0A(0);
                boolean zA1M = AnonymousClass004.A1M(iA0d);
                Object objAaT2 = bfm.AaT();
                if (zA1M || objAaT2 == C78N.A00) {
                    objAaT2 = new C2327BUb(function0, 1);
                    bfm.Ai0(objAaT2);
                }
                bRgA04 = C0v5.A04(bRgA04, c1ydA0A, null, (Function0) objAaT2, true);
                bbiA0M = C3cG.A07(bfm);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, 545000575);
            }
            BRg bRgA09 = C3U4.A09(C8j3.A0e(C1b8.A01(C11U.A03(AbstractC04540eo.A00(AnonymousClass001.A0U(bRg, anonymousClass962.A0C), c1d3A00, anonymousClass962.A0B, 28, 0L, 0L), c1d3A00).then(bRgA02), anonymousClass962.A0M), bRgA0Y, bRgA04), anonymousClass962.A0D);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(true);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            AnonymousClass001.A1G(c8ni, bfm, g0w, ((iA0d >> 9) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | i2);
            BBI.A0R(bbiA0M, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C8ng(bRg, c8ni, str, function0, g0w, i);
        }
    }
}
