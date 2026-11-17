package X;

import androidx.compose.runtime.MutableState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.11P, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C11P {
    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/AOI<Ljava/lang/Boolean;>;Landroidx/compose/runtime/MutableState<LX/15k;>;LX/AYw;LX/1DM;JFFLX/1DH;LX/G0W<-LX/07C;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A00(AOI aoi, C1DH c1dh, C1110AYw c1110AYw, BFM bfm, MutableState mutableState, BRg bRg, C1DM c1dm, G0W g0w, float f, float f2, int i, long j) {
        bfm.AgG(-151448888);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(aoi, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, mutableState);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, c1110AYw);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, c1dm);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0R(bfm, j);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0A(bfm, f);
        }
        if ((i & 12582912) == 0) {
            iA0d |= AnonymousClass004.A0B(bfm, f2);
        }
        if ((i & 100663296) == 0) {
            iA0d |= AnonymousClass004.A0l(bfm, c1dh);
        }
        if ((i & 805306368) == 0) {
            iA0d |= AnonymousClass004.A0c(bfm, g0w);
        }
        if ((iA0d & 306783379) == 306783378 && bfm.AKh()) {
            bfm.Afo();
        } else {
            AOP aopA03 = AOR.A03(aoi, bfm, "DropDownMenu", (((iA0d >> 3) & 14) | 48) & 126, 0);
            C31w<Float, AOW> c31w = AVd.A02;
            AOH<S> aoh = aopA03.A02;
            boolean zA1X = AnonymousClass001.A1X(aoh.A09());
            bfm.AgE(2139028452);
            BBI bbi = (BBI) bfm;
            Float fA0b = AnonymousClass005.A0b(bbi, zA1X ? 1.0f : 0.8f);
            MutableState mutableState2 = aopA03.A07;
            boolean zA1X2 = AnonymousClass001.A1X(mutableState2.getValue());
            bfm.AgE(2139028452);
            Float fA0b2 = AnonymousClass005.A0b(bbi, zA1X2 ? 1.0f : 0.8f);
            AOB aobA03 = aopA03.A03();
            bfm.AgE(1033023423);
            ASj aSj = aobA03.APD(false, true) ? new ASj(C2HU.A03, 120, 0) : AnonymousClass001.A0K(1, 74);
            BBI.A0R(bbi, false);
            AOQ aoqA01 = AOR.A01(aSj, aopA03, c31w, bfm, fA0b, fA0b2, 0);
            boolean zA1X3 = AnonymousClass001.A1X(aoh.A09());
            bfm.AgE(-249413128);
            Float fA0b3 = AnonymousClass005.A0b(bbi, AnonymousClass006.A00(zA1X3 ? 1 : 0));
            boolean zA1X4 = AnonymousClass001.A1X(mutableState2.getValue());
            bfm.AgE(-249413128);
            Float fA0b4 = AnonymousClass005.A0b(bbi, AnonymousClass006.A00(zA1X4 ? 1 : 0));
            AOB aobA032 = aopA03.A03();
            bfm.AgE(-1355418157);
            ASj aSjA0K = AnonymousClass001.A0K(aobA032.APD(false, true) ? 30 : 75, 0);
            BBI.A0R(bbi, false);
            AOQ aoqA012 = AOR.A01(aSjA0K, aopA03, c31w, bfm, fA0b3, fA0b4, 0);
            boolean zA1G = AnonymousClass003.A1G(bfm, C11Q.A00);
            BS0 bs0 = BRg.A00;
            boolean zA1W = AnonymousClass002.A1W(bfm, aoqA012, AnonymousClass003.A1S(bfm, aoqA01, zA1G), (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0d & 64) != 0 && bfm.A67(aoi))) | AnonymousClass006.A1W(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = new C11X(aoi, mutableState, aoqA01, aoqA012, zA1G);
                bfm.Ai0(objAaT);
            }
            C11R.A02(c1dh, bfm, AnonymousClass001.A0W(bs0, objAaT), c1dm, B1V.A00(bfm, new C3c3(c1110AYw, bRg, g0w, 1), 1573559053), f, f2, 8, j, 0L);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C11J(aoi, c1dh, c1110AYw, mutableState, bRg, c1dm, g0w, f, f2, i, j);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/BRg;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;ZLX/0jF;LX/3TQ;LX/AWd;LX/BFM;I)V */
    public static final void A01(InterfaceC1072AWd interfaceC1072AWd, C3TQ c3tq, C0jF c0jF, BFM bfm, BRg bRg, Function0 function0, G0V g0v, G0V g0v2, G0V g0v3, int i, boolean z) {
        bfm.AgG(-1564716777);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0v) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, g0v2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, g0v3);
        }
        if ((196608 & i) == 0) {
            iA0T |= AnonymousClass004.A0s(bfm, z);
        }
        if ((1572864 & i) == 0) {
            iA0T |= AnonymousClass004.A0j(bfm, c0jF);
        }
        if ((12582912 & i) == 0) {
            iA0T |= AnonymousClass004.A0k(bfm, c3tq);
        }
        if ((100663296 & i) == 0) {
            iA0T |= AnonymousClass004.A0l(bfm, interfaceC1072AWd);
        }
        if ((38347923 & iA0T) == 38347922 && bfm.AKh()) {
            bfm.Afo();
        } else {
            BRg bRgA0D = C3U4.A0D(C10G.A0F(AnonymousClass001.A0R(C0v5.A01(AbstractC05051Yk.A00(bfm, 0.0f, 6, 6, true), interfaceC1072AWd, bRg, null, null, function0, z)), 112.0f, 48.0f, 280.0f, Float.NaN), c3tq);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A04, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0D);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass003.A0o(bfm, interfaceC1380AiAA00, akqA04);
            G0V<InterfaceC1516AkQ, Integer, Unit> g0v4 = C1515AkP.A03;
            if (bbi.A0M || !AnonymousClass007.A1K(bfm, iA0J)) {
                AnonymousClass006.A1U(g0v4, bfm, iA0J);
            }
            AnonymousClass001.A16(bfm, bRgA01);
            C0yq.A01(((HWA) bfm.A6v(C1A1.A00)).A09, B1V.A00(bfm, new C0jD(C90m.A00, c0jF, g0v2, g0v3, g0v, z), 1065051884), bfm, 48);
            BBI.A0R(bbi, true);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C11K(interfaceC1072AWd, c3tq, c0jF, bRg, function0, g0v, g0v2, g0v3, i, z);
        }
    }
}
