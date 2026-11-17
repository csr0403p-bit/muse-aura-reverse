package androidx.compose.foundation.gestures;

import X.AXN;
import X.AbstractC0878AGe;
import X.BL3;
import X.BOZ;
import X.C1247Afe;
import X.C1259Afy;
import X.C1269AgE;
import X.C1299Agk;
import X.C2292BSs;
import X.C2322BTw;
import X.C2zT;
import X.G0V;
import X.GCV;
import X.HoC;
import X.HzR;
import X.InterfaceC1180Adj;
import X.InterfaceC1258Afu;
import X.InterfaceC1285AgV;

/* loaded from: classes4.dex */
public final class MouseWheelScrollingLogic extends NonTouchScrollingLogic {
    public HoC A00;
    public final HzR<C1269AgE> A01;
    public final InterfaceC1285AgV A02;

    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;LX/Hqv<LX/AgE;>;LX/ASv;Landroidx/compose/foundation/gestures/ScrollingLogic;LX/Hqv<LX/AT7<Ljava/lang/Float;LX/AOW;>;>;JLX/HtJ<-Ljava/lang/Boolean;>;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, X.AT7] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, X.AgE] */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.foundation.gestures.NonTouchScrollingLogic] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(androidx.compose.foundation.gestures.MouseWheelScrollingLogic r7, androidx.compose.foundation.gestures.ScrollingLogic r8, X.HtJ r9, X.C1051ASv r10, X.C10543Hqv r11, X.C10543Hqv r12, long r13) {
        /*
            r3 = 2
            boolean r0 = r9 instanceof X.C2319BTt
            if (r0 == 0) goto L97
            r4 = r9
            X.BTt r4 = (X.C2319BTt) r4
            int r0 = r4.$t
            if (r0 != r3) goto L97
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L97
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r1 = r4.A06
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r6 = 0
            r3 = 1
            if (r0 == 0) goto L74
            if (r0 != r3) goto L9e
            java.lang.Object r12 = r4.A05
            X.Hqv r12 = (X.C10543Hqv) r12
            java.lang.Object r8 = r4.A04
            androidx.compose.foundation.gestures.ScrollingLogic r8 = (androidx.compose.foundation.gestures.ScrollingLogic) r8
            java.lang.Object r10 = r4.A03
            X.ASv r10 = (X.C1051ASv) r10
            java.lang.Object r11 = r4.A02
            X.Hqv r11 = (X.C10543Hqv) r11
            java.lang.Object r7 = r4.A01
            androidx.compose.foundation.gestures.NonTouchScrollingLogic r7 = (androidx.compose.foundation.gestures.NonTouchScrollingLogic) r7
            X.Hwg.A00(r1)
        L3a:
            X.AgE r1 = (X.C1269AgE) r1
            if (r1 == 0) goto L6f
            T r0 = r11.element
            X.AgE r0 = (X.C1269AgE) r0
            boolean r6 = r0.A02
            long r2 = r1.A01
            long r4 = r1.A00
            X.AgE r1 = new X.AgE
            r1.<init>(r2, r4, r6)
            r11.element = r1
            long r0 = r1.A01
            long r0 = r8.A05(r0)
            float r0 = r8.A03(r0)
            r10.element = r0
            r0 = 0
            X.AT7 r0 = X.ATB.A00(r0, r0)
            r12.element = r0
            X.AgI r0 = r7.A02
            r0.A00(r4, r2)
            float r0 = r10.element
            boolean r0 = X.AbstractC1252Afl.A00(r0)
            r6 = r0 ^ 1
        L6f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L74:
            X.Hwg.A00(r1)
            r1 = 0
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 < 0) goto L6f
            r1 = 0
            r0 = 13
            X.BU2 r0 = X.BU2.A0O(r7, r1, r0)
            r4.A01 = r7
            r4.A02 = r11
            r4.A03 = r10
            r4.A04 = r8
            r4.A05 = r12
            r4.A00 = r3
            java.lang.Object r1 = X.GAX.A01(r4, r0, r13)
            if (r1 != r5) goto L3a
            return r5
        L97:
            X.BTt r4 = new X.BTt
            r4.<init>(r3, r9)
            goto L17
        L9e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.A03(androidx.compose.foundation.gestures.MouseWheelScrollingLogic, androidx.compose.foundation.gestures.ScrollingLogic, X.HtJ, X.ASv, X.Hqv, X.Hqv, long):java.lang.Object");
    }

    public static final float A00(MouseWheelScrollingLogic mouseWheelScrollingLogic, InterfaceC1258Afu interfaceC1258Afu, float f) {
        ScrollingLogic scrollingLogic = mouseWheelScrollingLogic.A03;
        long jA04 = scrollingLogic.A04(ScrollingLogic.A00(scrollingLogic, f, f));
        ScrollingLogic scrollingLogic2 = ((C1259Afy) interfaceC1258Afu).A00;
        return scrollingLogic.A02(scrollingLogic.A05(ScrollingLogic.A01(scrollingLogic2.A04, scrollingLogic2, 1, jA04)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C1269AgE A01(HzR<C1269AgE> hzR) {
        BOZ bozA0C = BL3.A0C(new C2322BTw(C2292BSs.A00(hzR, 24), null, 1));
        C1269AgE c1269AgEA00 = null;
        while (bozA0C.hasNext()) {
            C1269AgE c1269AgE = (C1269AgE) bozA0C.next();
            c1269AgEA00 = c1269AgEA00 == null ? c1269AgE : c1269AgEA00.A00(c1269AgE);
        }
        return c1269AgEA00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Type inference failed for: r0v11, types: [T, X.AT7] */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, X.AgE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(X.C1269AgE r15, androidx.compose.foundation.gestures.MouseWheelScrollingLogic r16, androidx.compose.foundation.gestures.ScrollingLogic r17, X.HtJ r18, float r19, float r20) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic.A02(X.AgE, androidx.compose.foundation.gestures.MouseWheelScrollingLogic, androidx.compose.foundation.gestures.ScrollingLogic, X.HtJ, float, float):java.lang.Object");
    }

    public static final boolean A04(MouseWheelScrollingLogic mouseWheelScrollingLogic, C1247Afe c1247Afe) {
        long jA5m = mouseWheelScrollingLogic.A02.A5m(c1247Afe);
        ScrollingLogic scrollingLogic = mouseWheelScrollingLogic.A03;
        float fA03 = scrollingLogic.A03(scrollingLogic.A05(jA5m));
        if (fA03 != 0.0f) {
            InterfaceC1180Adj interfaceC1180Adj = scrollingLogic.A05;
            if (fA03 > 0.0f ? interfaceC1180Adj.ADO() : interfaceC1180Adj.ADN()) {
                return !(mouseWheelScrollingLogic.A01.AhZ(new C1269AgE(jA5m, ((C1299Agk) AbstractC0878AGe.A0F(c1247Afe.A05)).A0E, false)) instanceof C2zT);
            }
        }
        return ((NonTouchScrollingLogic) mouseWheelScrollingLogic).A01;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/gestures/ScrollingLogic;LX/AgV;LX/G0V<-LX/Afj;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/AXN;)V */
    public MouseWheelScrollingLogic(InterfaceC1285AgV interfaceC1285AgV, ScrollingLogic scrollingLogic, AXN axn, G0V g0v) {
        super(scrollingLogic, axn, g0v);
        this.A02 = interfaceC1285AgV;
        this.A01 = new GCV(Integer.MAX_VALUE, null);
    }
}
