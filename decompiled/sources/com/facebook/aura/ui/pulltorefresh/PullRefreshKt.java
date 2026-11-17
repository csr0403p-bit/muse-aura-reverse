package com.facebook.aura.ui.pulltorefresh;

import X.ASF;
import X.AbstractC2139Az7;
import X.AnonymousClass005;
import X.BFM;
import X.BRg;
import X.C2048AxK;
import X.C8jn;
import X.G0U;
import X.G0V;
import X.HtJ;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class PullRefreshKt {
    public static final BRg pullRefresh(BRg bRg, G0U<? super Float, Float> g0u, G0V<? super Float, ? super HtJ<? super Unit>, ? extends Object> g0v, boolean z, BFM bfm, int i, int i2) {
        AnonymousClass005.A0x(bRg, g0u, g0v);
        if ((i2 & 4) != 0) {
            z = true;
        }
        G0U<ASF, Unit> g0u2 = AbstractC2139Az7.A00;
        BRg bRgA00 = C8jn.A00(BRg.A00, new PullRefreshNestedScrollConnection(g0u, g0v, z), null);
        C2048AxK c2048AxK = new C2048AxK(g0u2);
        return bRg.then(c2048AxK).then(bRgA00).then(c2048AxK.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg pullRefresh(X.BRg r13, com.facebook.aura.ui.pulltorefresh.PullRefreshState r14, boolean r15, X.BFM r16, int r17, int r18) {
        /*
            r9 = r15
            boolean r12 = X.AnonymousClass004.A1b(r13, r14)
            r0 = r18 & 2
            r5 = 1
            if (r0 == 0) goto Lb
            r9 = 1
        Lb:
            r0 = 1385046041(0x528e2019, float:3.05211933E11)
            r10 = r16
            r10.AgE(r0)
            X.G0U<X.ASF, kotlin.Unit> r3 = X.AbstractC2139Az7.A00
            X.BS0 r6 = X.BRg.A00
            r0 = r17 & 112(0x70, float:1.57E-43)
            r4 = r0 ^ 48
            r2 = 32
            if (r4 <= r2) goto L25
            boolean r0 = r10.A67(r14)
            if (r0 != 0) goto L2a
        L25:
            r1 = r17 & 48
            r0 = 0
            if (r1 != r2) goto L2b
        L2a:
            r0 = 1
        L2b:
            java.lang.Object r7 = r10.AaT()
            if (r0 != 0) goto L35
            java.lang.Object r0 = X.C78N.A00
            if (r7 != r0) goto L3d
        L35:
            com.facebook.aura.ui.pulltorefresh.PullRefreshKt$pullRefresh$2$1$1 r7 = new com.facebook.aura.ui.pulltorefresh.PullRefreshKt$pullRefresh$2$1$1
            r7.<init>(r14)
            r10.Ai0(r7)
        L3d:
            X.EnQ r7 = (X.InterfaceC7353EnQ) r7
            X.G0U r7 = (X.G0U) r7
            if (r4 <= r2) goto L49
            boolean r0 = r10.A67(r14)
            if (r0 != 0) goto L4e
        L49:
            r0 = r17 & 48
            if (r0 == r2) goto L4e
            r5 = 0
        L4e:
            java.lang.Object r8 = r10.AaT()
            if (r5 != 0) goto L58
            java.lang.Object r0 = X.C78N.A00
            if (r8 != r0) goto L61
        L58:
            r0 = 0
            com.facebook.aura.ui.pulltorefresh.PullRefreshKt$pullRefresh$2$2$1 r8 = new com.facebook.aura.ui.pulltorefresh.PullRefreshKt$pullRefresh$2$2$1
            r8.<init>(r14, r0)
            r10.Ai0(r8)
        L61:
            X.G0V r8 = (X.G0V) r8
            int r0 = r17 << 3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r11 = r0 | 6
            X.BRg r1 = pullRefresh(r6, r7, r8, r9, r10, r11, r12)
            X.AxK r2 = new X.AxK
            r2.<init>(r3)
            X.BRg r0 = r13.then(r2)
            X.BRg r1 = r0.then(r1)
            X.AxJ r0 = r2.A00
            X.BRg r0 = r1.then(r0)
            X.AnonymousClass001.A1D(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.pulltorefresh.PullRefreshKt.pullRefresh(X.BRg, com.facebook.aura.ui.pulltorefresh.PullRefreshState, boolean, X.BFM, int, int):X.BRg");
    }
}
