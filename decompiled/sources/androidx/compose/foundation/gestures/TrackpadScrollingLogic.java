package androidx.compose.foundation.gestures;

import X.AXN;
import X.BL3;
import X.BOZ;
import X.C1277AgN;
import X.C2292BSs;
import X.C2322BTw;
import X.G0V;
import X.GCV;
import X.HoC;
import X.HzR;

/* loaded from: classes4.dex */
public final class TrackpadScrollingLogic extends NonTouchScrollingLogic {
    public HoC A00;
    public final HzR<C1277AgN> A01;

    /* JADX WARN: Multi-variable type inference failed */
    public static final C1277AgN A00(HzR<C1277AgN> hzR) {
        BOZ bozA0C = BL3.A0C(new C2322BTw(C2292BSs.A00(hzR, 27), null, 1));
        C1277AgN c1277AgNA00 = null;
        while (bozA0C.hasNext()) {
            C1277AgN c1277AgN = (C1277AgN) bozA0C.next();
            c1277AgNA00 = c1277AgNA00 == null ? c1277AgN : c1277AgNA00.A00(c1277AgN);
        }
        return c1277AgNA00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, X.AgN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(androidx.compose.foundation.gestures.ScrollingLogic r13, X.C1277AgN r14, androidx.compose.foundation.gestures.TrackpadScrollingLogic r15, X.HtJ r16) {
        /*
            r3 = 11
            r4 = r16
            boolean r0 = r4 instanceof X.C2310BTk
            r9 = r15
            if (r0 == 0) goto L8f
            r5 = r4
            X.BTk r5 = (X.C2310BTk) r5
            int r0 = r5.$t
            if (r0 != r3) goto L8f
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8f
            int r2 = r2 - r1
            r5.A00 = r2
        L1b:
            java.lang.Object r1 = r5.A01
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r6 = 2
            r12 = 1
            if (r0 == 0) goto L2f
            if (r0 == r12) goto L67
            if (r0 != r6) goto L95
            X.Hwg.A00(r1)
        L2c:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L2f:
            X.Hqv r10 = X.C3cG.A10(r1)
            r10.element = r14
            X.AgI r7 = r15.A02
            long r0 = r14.A00
            long r2 = r14.A01
            r7.A00(r0, r2)
            X.HzR<X.AgN> r0 = r15.A01
            X.AgN r8 = A00(r0)
            if (r8 == 0) goto L57
            long r2 = r8.A00
            long r0 = r8.A01
            r7.A00(r2, r0)
            T r0 = r10.element
            X.AgN r0 = (X.C1277AgN) r0
            X.AgN r0 = r0.A00(r8)
            r10.element = r0
        L57:
            r11 = 0
            X.BUI r7 = new X.BUI
            r8 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            r5.A00 = r12
            java.lang.Object r0 = r15.A06(r7, r5)
            if (r0 != r4) goto L6a
            return r4
        L67:
            X.Hwg.A00(r1)
        L6a:
            X.G0V<X.Afj, X.HtJ<? super kotlin.Unit>, java.lang.Object> r7 = r15.A04
            X.AgI r3 = r15.A02
            X.AgJ r0 = r3.A00
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r1 = r0.A00(r2)
            X.AgJ r0 = r3.A01
            float r0 = r0.A00(r2)
            long r1 = X.AnonymousClass005.A0J(r1, r0)
            X.Afj r0 = new X.Afj
            r0.<init>(r1)
            r5.A00 = r6
            java.lang.Object r0 = r7.invoke(r0, r5)
            if (r0 != r4) goto L2c
            return r4
        L8f:
            X.BTk r5 = new X.BTk
            r5.<init>(r15, r4, r3)
            goto L1b
        L95:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TrackpadScrollingLogic.A01(androidx.compose.foundation.gestures.ScrollingLogic, X.AgN, androidx.compose.foundation.gestures.TrackpadScrollingLogic, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A02(androidx.compose.foundation.gestures.TrackpadScrollingLogic r22, X.C1247Afe r23) {
        /*
            r17 = 0
            r3 = r23
            java.util.List<X.Agk> r0 = r3.A05
            java.lang.Object r7 = X.AbstractC0878AGe.A0G(r0)
            X.Agk r7 = (X.C1299Agk) r7
            r11 = 1
            r5 = r22
            if (r7 == 0) goto L75
            java.util.List<X.Agm> r6 = r7.A02
            if (r6 != 0) goto L17
            X.AGi r6 = X.C0881AGi.A00
        L17:
            int r4 = r6.size()
            r2 = 0
            r10 = 0
        L1d:
            r13 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            if (r2 >= r4) goto L57
            java.lang.Object r8 = r6.get(r2)
            X.Agm r8 = (X.C1301Agm) r8
            long r0 = r8.A02
            long r13 = r13 ^ r0
            androidx.compose.foundation.gestures.ScrollingLogic r9 = r5.A03
            long r0 = r9.A05(r13)
            float r1 = r9.A03(r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L54
            X.HzR<X.AgN> r0 = r5.A01
            long r15 = r8.A04
            X.AgN r12 = new X.AgN
            r12.<init>(r13, r15, r17)
            java.lang.Object r0 = r0.AhZ(r12)
            boolean r0 = r0 instanceof X.C2zT
            r0 = r0 ^ 1
            if (r0 != 0) goto L53
            r0 = r10
            r10 = 0
            if (r0 == 0) goto L54
        L53:
            r10 = 1
        L54:
            int r2 = r2 + 1
            goto L1d
        L57:
            long r1 = r7.A09
            long r1 = r1 ^ r13
            int r3 = r3.A00
            r0 = 12
            boolean r23 = X.AnonymousClass002.A1Q(r3, r0)
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r5.A03
            long r3 = r0.A05(r1)
            float r3 = r0.A03(r3)
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L7a
            if (r23 != 0) goto L7a
            if (r10 != 0) goto L95
        L75:
            boolean r0 = r5.A01
            if (r0 != 0) goto L95
            return r17
        L7a:
            X.HzR<X.AgN> r6 = r5.A01
            long r3 = r7.A0E
            X.AgN r0 = new X.AgN
            r18 = r0
            r19 = r1
            r21 = r3
            r18.<init>(r19, r21, r23)
            java.lang.Object r0 = r6.AhZ(r0)
            boolean r0 = r0 instanceof X.C2zT
            r0 = r0 ^ 1
            if (r0 != 0) goto L95
            if (r10 == 0) goto L75
        L95:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TrackpadScrollingLogic.A02(androidx.compose.foundation.gestures.TrackpadScrollingLogic, X.Afe):boolean");
    }

    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/gestures/ScrollingLogic;LX/G0V<-LX/Afj;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/AXN;)V */
    public TrackpadScrollingLogic(ScrollingLogic scrollingLogic, AXN axn, G0V g0v) {
        super(scrollingLogic, axn, g0v);
        this.A01 = new GCV(Integer.MAX_VALUE, null);
    }
}
