package X;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Aqz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1789Aqz {
    public static final C11N A00 = new C11N(true);

    public static final void A00(AqW aqW, InterfaceC2266BNk interfaceC2266BNk, BFM bfm, int i) {
        bfm.AgG(1904307118);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(interfaceC2266BNk, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, aqW);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            bfm.AgE(-1009482584);
            BBI bbi = (BBI) bfm;
            Object objA07 = AKO.A07(AndroidCompositionLocals_androidKt.A01, bbi);
            BBI.A0R(bbi, false);
            boolean zA67 = bfm.A67(aqW);
            if ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(interfaceC2266BNk))) {
                z = true;
            }
            boolean zA1V = AnonymousClass002.A1V(bfm, objA07, zA67, z);
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new C8iG(objA07, aqW, interfaceC2266BNk, 0);
                bfm.Ai0(objAaT);
            }
            AbstractC06777ay.A01(null, bfm, null, (G0U) objAaT, 0, 3);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            BBb.A00(bBbAAc, interfaceC2266BNk, aqW, i, 7);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BNk;LX/Apd;Lkotlin/jvm/functions/Function0<+LX/Ak4;>;LX/BFM;I)V */
    public static final void A01(InterfaceC2266BNk interfaceC2266BNk, InterfaceC1740Apd interfaceC1740Apd, BFM bfm, Function0 function0, int i) {
        bfm.AgG(-2040393164);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(interfaceC2266BNk, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(interfaceC1740Apd, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            boolean z2 = (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A65(interfaceC1740Apd));
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new C1196AeD(new AWG(new BTB(18, interfaceC1740Apd, function0)));
                BBI.A0T(bfm, objAaT);
            }
            C1196AeD c1196AeD = (C1196AeD) objAaT;
            if ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(interfaceC2266BNk))) {
                z = true;
            }
            Object objAaT2 = bfm.AaT();
            if (z || objAaT2 == C78N.A00) {
                objAaT2 = C2298BSy.A00(interfaceC2266BNk, 14);
                bfm.Ai0(objAaT2);
            }
            AYW.A01(bfm, c1196AeD, A00, (Function0) objAaT2, B1V.A00(bfm, new BTC(8, interfaceC1740Apd, interfaceC2266BNk), 1315155414), 3456, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new BTR(interfaceC2266BNk, interfaceC1740Apd, function0, i, 3);
        }
    }

    public static final void A02(BFM bfm, int i, int i2, long j) {
        BBb bBbAAc;
        bfm.AgG(-1240244237);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0N(bfm, j);
        }
        int i3 = 0;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 19, 18), bfm, iA0D)) {
            Context contextA00 = AKO.A00(AndroidCompositionLocals_androidKt.A01, (BBI) bfm);
            boolean zA1B = AnonymousClass003.A1B(iA0D) | bfm.A65(contextA00);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = Integer.valueOf(contextA00.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
                bfm.Ai0(objAaT);
            }
            int iA0F = AnonymousClass001.A0F(objAaT);
            if (iA0F == -1) {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                }
                bBbAAc.A06 = new C2288BSo(i, i2, j, i3);
            }
            AVy aVyA00 = AbstractC8407FdO.A00(bfm, iA0F);
            boolean zA1N = AnonymousClass001.A1N(iA0D);
            Object objAaT2 = bfm.AaT();
            if (zA1N || objAaT2 == C78N.A00) {
                objAaT2 = j == 16 ? null : AnonymousClass002.A0S(j);
                bfm.Ai0(objAaT2);
            }
            BS0 bs0 = BRg.A00;
            C1AC c1ac = C7b0.A03;
            C3Ue.A04(C10G.A07(bs0, 24.0f).then(new AYN(C2VU.A09, (C1423Ais) objAaT2, aVyA00, B18.A02, 1.0f)), bfm, 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            i3 = 1;
            bBbAAc.A06 = new C2288BSo(i, i2, j, i3);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A03(BFM bfm, BRg bRg, G0V g0v, int i) {
        bfm.AgG(1392105195);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            Ar0.A01(bfm, AbstractC1087AXv.A00, bRg, g0v, Ar3.A01, (iA0d & 14) | 432 | ((iA0d << 6) & 7168));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            BBb.A00(bBbAAc, bRg, g0v, i, 8);
        }
    }
}
