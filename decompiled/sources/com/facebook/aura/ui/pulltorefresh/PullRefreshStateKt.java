package com.facebook.aura.ui.pulltorefresh;

/* loaded from: classes.dex */
public abstract class PullRefreshStateKt {
    public static final float DragMultiplier = 0.5f;

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* renamed from: rememberPullRefreshState-1yyLQnY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.ui.pulltorefresh.PullRefreshState m2371rememberPullRefreshState1yyLQnY(boolean r14, kotlin.jvm.functions.Function0<kotlin.Unit> r15, float r16, float r17, X.ASj<java.lang.Float> r18, boolean r19, X.BFM r20, int r21, int r22) {
        /*
            r5 = r16
            r1 = r17
            r13 = r18
            r0 = 1
            X.C7384Etj.A0Y(r15, r0)
            r0 = r22 & 4
            if (r0 == 0) goto L10
            float r5 = com.facebook.aura.ui.pulltorefresh.PullRefreshDefaults.RefreshThreshold
        L10:
            r0 = r22 & 8
            if (r0 == 0) goto L16
            float r1 = com.facebook.aura.ui.pulltorefresh.PullRefreshDefaults.RefreshingOffset
        L16:
            r0 = r22 & 16
            r4 = 0
            r2 = 0
            if (r0 == 0) goto L22
            r0 = 300(0x12c, float:4.2E-43)
            X.ASj r13 = X.AnonymousClass001.A0K(r0, r2)
        L22:
            r0 = r22 & 32
            if (r0 == 0) goto L28
            r19 = 0
        L28:
            r0 = 0
            int r0 = X.C1DG.A01(r5, r0)
            if (r0 <= 0) goto Lca
            r3 = r20
            java.lang.Object r0 = r3.AaT()
            java.lang.Object r2 = X.C78N.A00
            java.lang.Object r9 = X.AnonymousClass004.A15(r3, r0, r2)
            X.3UX r9 = (X.C3UX) r9
            androidx.compose.runtime.MutableState r10 = X.C1er.A00(r3, r15)
            X.AXN r0 = X.AnonymousClass002.A0Y(r3)
            float r12 = r0.Ah4(r5)
            float r11 = r0.Ah4(r1)
            boolean r0 = r3.A65(r9)
            java.lang.Object r8 = r3.AaT()
            if (r0 != 0) goto L59
            if (r8 != r2) goto L61
        L59:
            com.facebook.aura.ui.pulltorefresh.PullRefreshState r8 = new com.facebook.aura.ui.pulltorefresh.PullRefreshState
            r8.<init>(r9, r10, r11, r12, r13)
            r3.Ai0(r8)
        L61:
            com.facebook.aura.ui.pulltorefresh.PullRefreshState r8 = (com.facebook.aura.ui.pulltorefresh.PullRefreshState) r8
            if (r19 == 0) goto Lc3
            r0 = 239560697(0xe4767f9, float:2.4578705E-30)
            r3.AgE(r0)
            X.AKH<X.0dx> r0 = X.Am0.A08
            java.lang.Object r0 = r3.A6v(r0)
            androidx.compose.runtime.MutableState r7 = X.C1er.A00(r3, r0)
            X.1BN<java.lang.Boolean> r0 = r8.hasPulledToThreshold
            X.1BO r6 = X.C2CK.A02(r3, r0)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            boolean r1 = X.AnonymousClass003.A1K(r3, r6, r7)
            java.lang.Object r0 = r3.AaT()
            if (r1 != 0) goto L89
            if (r0 != r2) goto L91
        L89:
            com.facebook.aura.ui.pulltorefresh.PullRefreshStateKt$rememberPullRefreshState$3$1 r0 = new com.facebook.aura.ui.pulltorefresh.PullRefreshStateKt$rememberPullRefreshState$3$1
            r0.<init>(r6, r7, r4)
            r3.Ai0(r0)
        L91:
            X.AnonymousClass001.A18(r3, r0, r5)
        L94:
            X.AnonymousClass001.A1D(r3)
            boolean r5 = r3.A67(r8)
            r0 = r21 & 14
            r0 = r0 ^ 6
            r4 = 4
            if (r0 <= r4) goto La8
            boolean r0 = r3.A66(r14)
            if (r0 != 0) goto Lad
        La8:
            r1 = r21 & 6
            r0 = 0
            if (r1 != r4) goto Lae
        Lad:
            r0 = 1
        Lae:
            r5 = r5 | r0
            java.lang.Object r0 = r3.AaT()
            if (r5 != 0) goto Lb7
            if (r0 != r2) goto Lbf
        Lb7:
            com.facebook.aura.ui.pulltorefresh.PullRefreshStateKt$rememberPullRefreshState$4$1 r0 = new com.facebook.aura.ui.pulltorefresh.PullRefreshStateKt$rememberPullRefreshState$4$1
            r0.<init>(r8, r14)
            r3.Ai0(r0)
        Lbf:
            X.AnonymousClass001.A15(r3, r0)
            return r8
        Lc3:
            r0 = 239902813(0xe4ca05d, float:2.5222153E-30)
            r3.AgE(r0)
            goto L94
        Lca:
            java.lang.String r1 = "The refresh trigger must be greater than zero!"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.pulltorefresh.PullRefreshStateKt.m2371rememberPullRefreshState1yyLQnY(boolean, kotlin.jvm.functions.Function0, float, float, X.ASj, boolean, X.BFM, int, int):com.facebook.aura.ui.pulltorefresh.PullRefreshState");
    }
}
