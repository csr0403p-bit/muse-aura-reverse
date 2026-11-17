package X;

import kotlin.Unit;

/* renamed from: X.19w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC046219w {
    public static final long A00 = AYL.A06(0, 0, 0, 0);
    public static final BRg A01 = C10G.A09(BRg.A00, 48.0f, 48.0f);

    public static final Object A00(C3Tr c3Tr) {
        C19g c19g;
        Object objAIX = c3Tr.AIX();
        if (!(objAIX instanceof C19g) || (c19g = (C19g) objAIX) == null) {
            return null;
        }
        return ((C1AE) c19g).A00;
    }

    public static final void A01(long j, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        bfm.AgG(660142980);
        int iA0M = (i & 6) == 0 ? AnonymousClass004.A0M(bfm, j) | i : i;
        if ((i & 48) == 0) {
            iA0M |= AnonymousClass004.A0U(bfm, g0v);
        }
        if ((iA0M & 19) == 18 && bfm.AKh()) {
            bfm.Afo();
        } else {
            AnonymousClass001.A14(bfm, AnonymousClass003.A0T(C1AZ.A00, j), g0v, iA0M);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C046519z(j, g0v, i);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (JLX/Arm;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;I)V */
    public static final void A03(BFM bfm, C1822Arm c1822Arm, G0V g0v, int i, long j) {
        bfm.AgG(1208685580);
        int iA0M = (i & 6) == 0 ? AnonymousClass004.A0M(bfm, j) | i : i;
        if ((i & 48) == 0) {
            iA0M |= AnonymousClass004.A0e(bfm, c1822Arm);
        }
        if ((i & 384) == 0) {
            iA0M |= AnonymousClass004.A0V(bfm, g0v);
        }
        if ((iA0M & 147) == 146 && bfm.AKh()) {
            bfm.Afo();
        } else {
            C0y1.A00(bfm, c1822Arm, g0v, iA0M & 1022, j);
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C3c1(c1822Arm, g0v, i, 1, j);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/1A0;Ljava/lang/String;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/19h;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;ZZZLX/0dy;LX/3TQ;LX/19x;LX/G0V<-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;III)V */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x071d  */
    /* JADX WARN: Type inference failed for: r1v60, types: [androidx.compose.runtime.MutableState] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C0dy r50, X.C3TQ r51, X.C046319x r52, X.C1A0 r53, X.BFM r54, X.C19h r55, java.lang.String r56, X.G0V r57, X.G0V r58, X.G0V r59, X.G0V r60, X.G0V r61, X.G0V r62, X.G0V r63, X.G0V r64, X.G0V r65, int r66, int r67, int r68, boolean r69, boolean r70, boolean r71) {
        /*
            Method dump skipped, instructions count: 1965
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC046219w.A02(X.0dy, X.3TQ, X.19x, X.1A0, X.BFM, X.19h, java.lang.String, X.G0V, X.G0V, X.G0V, X.G0V, X.G0V, X.G0V, X.G0V, X.G0V, X.G0V, int, int, int, boolean, boolean, boolean):void");
    }
}
