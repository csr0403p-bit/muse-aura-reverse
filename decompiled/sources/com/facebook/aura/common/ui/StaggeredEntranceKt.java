package com.facebook.aura.common.ui;

/* loaded from: classes.dex */
public abstract class StaggeredEntranceKt {
    public static final int StaggeredEntranceDurationMs = 380;
    public static final int StaggeredEntranceMaxStaggerSteps = 10;
    public static final long StaggeredEntranceScreenDelayMs = 250;
    public static final float StaggeredEntranceSlideOffset = 24.0f;
    public static final long StaggeredEntranceStaggerMs = 80;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg staggeredEntrance(X.BRg r15, int r16, long r17, X.BFM r19, int r20, int r21) {
        /*
            r9 = r17
            r1 = 0
            X.C7384Etj.A0Y(r15, r1)
            r0 = r21 & 2
            if (r0 == 0) goto Lc
            r9 = 0
        Lc:
            r6 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = r19
            java.lang.Object r0 = r3.AaT()
            java.lang.Object r2 = X.C78N.A00
            if (r0 != r2) goto L1e
            com.facebook.aura.common.ui.StaggeredEntranceKt$staggeredEntrance$hasAnimated$2$1 r0 = com.facebook.aura.common.ui.StaggeredEntranceKt$staggeredEntrance$hasAnimated$2$1.INSTANCE
            r3.Ai0(r0)
        L1e:
            androidx.compose.runtime.MutableState r13 = X.AnonymousClass006.A0K(r3, r0, r1)
            java.lang.Object r12 = r3.AaT()
            if (r12 != r2) goto L34
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r13)
            float r0 = X.AnonymousClass006.A00(r0)
            X.AT5 r12 = X.AnonymousClass002.A0I(r3, r0)
        L34:
            X.AT5 r12 = (X.AT5) r12
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            boolean r5 = r3.A65(r13)
            r7 = r20
            r0 = r7 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            if (r0 <= r8) goto L4c
            boolean r0 = r3.A64(r9)
            if (r0 != 0) goto L51
        L4c:
            r1 = r7 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r8) goto L52
        L51:
            r0 = 1
        L52:
            r5 = r5 | r0
            r0 = r20 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            r11 = r16
            if (r0 <= r1) goto L63
            boolean r0 = r3.A63(r11)
            if (r0 != 0) goto L67
        L63:
            r0 = r20 & 48
            if (r0 != r1) goto L68
        L67:
            r6 = 1
        L68:
            boolean r0 = X.AnonymousClass002.A1V(r3, r12, r6, r5)
            java.lang.Object r8 = r3.AaT()
            if (r0 != 0) goto L74
            if (r8 != r2) goto L7d
        L74:
            r14 = 0
            com.facebook.aura.common.ui.StaggeredEntranceKt$staggeredEntrance$1$1 r8 = new com.facebook.aura.common.ui.StaggeredEntranceKt$staggeredEntrance$1$1
            r8.<init>(r9, r11, r12, r13, r14)
            r3.Ai0(r8)
        L7d:
            X.AnonymousClass001.A18(r3, r8, r4)
            boolean r1 = r3.A67(r12)
            java.lang.Object r0 = r3.AaT()
            if (r1 != 0) goto L8c
            if (r0 != r2) goto L94
        L8c:
            com.facebook.aura.common.ui.StaggeredEntranceKt$staggeredEntrance$2$1 r0 = new com.facebook.aura.common.ui.StaggeredEntranceKt$staggeredEntrance$2$1
            r0.<init>(r12)
            r3.Ai0(r0)
        L94:
            X.BRg r0 = X.AnonymousClass001.A0W(r15, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.common.ui.StaggeredEntranceKt.staggeredEntrance(X.BRg, int, long, X.BFM, int, int):X.BRg");
    }
}
