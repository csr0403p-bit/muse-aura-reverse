package com.facebook.aura.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.BRg;
import X.G0V;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPullToRefreshKt$HatchPTRLoadingIndicator$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ MutableState<Boolean> $isPTRPending$delegate;
    public final /* synthetic */ boolean $isRefreshing;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Float> $progress;
    public final /* synthetic */ Function0<Float> $pullOffset;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPullToRefreshKt$HatchPTRLoadingIndicator$3(BRg bRg, float f, Function0<Float> function0, boolean z, Function0<Float> function02, MutableState<Boolean> mutableState) {
        super(2);
        this.$modifier = bRg;
        this.$topPadding = f;
        this.$pullOffset = function0;
        this.$isRefreshing = z;
        this.$progress = function02;
        this.$isPTRPending$delegate = mutableState;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(X.BFM r26, int r27) {
        /*
            r25 = this;
            r2 = r27
            r1 = r27 & 3
            r0 = 2
            r9 = 0
            boolean r0 = X.AnonymousClass002.A1P(r1, r0)
            r6 = r26
            boolean r0 = X.AnonymousClass001.A1b(r0, r6, r2)
            if (r0 == 0) goto Lee
            r3 = r25
            X.BRg r0 = r3.$modifier
            X.BRg r1 = X.AnonymousClass001.A0R(r0)
            float r0 = r3.$topPadding
            r24 = 0
            X.BRg r11 = X.C3U4.A04(r1, r0)
            androidx.compose.ui.Alignment r0 = X.C2VU.A0C
            kotlin.jvm.functions.Function0<java.lang.Float> r2 = r3.$pullOffset
            boolean r13 = r3.$isRefreshing
            kotlin.jvm.functions.Function0<java.lang.Float> r15 = r3.$progress
            androidx.compose.runtime.MutableState<java.lang.Boolean> r14 = r3.$isPTRPending$delegate
            X.AiA r4 = X.C3Ue.A01(r0, r9)
            r5 = r6
            X.BBI r5 = (X.BBI) r5
            long r0 = r5.A06
            r3 = 32
            long r7 = r0 >>> r3
            long r0 = r0 ^ r7
            int r3 = (int) r0
            X.AKQ r10 = X.BBI.A04(r5)
            X.BRg r1 = X.AxM.A01(r6, r11)
            kotlin.jvm.functions.Function0<X.AkQ> r8 = X.C1515AkP.A00
            X.Ahw<?> r0 = r5.A0V
            if (r0 != 0) goto L51
            X.C00x.A00()
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L51:
            X.AnonymousClass005.A0n(r6, r5, r8)
            X.G0V<X.AkQ, X.AiA, kotlin.Unit> r7 = X.C1515AkP.A04
            X.BPg.A02(r6, r4, r7)
            X.G0V<X.AkQ, X.Ajz, kotlin.Unit> r4 = X.C1515AkP.A06
            X.G0V r11 = X.AnonymousClass004.A19(r6, r10, r4, r3)
            X.G0U<X.AkQ, kotlin.Unit> r3 = X.C1515AkP.A02
            X.G0V r10 = X.AnonymousClass002.A0u(r6, r1, r3)
            X.BS0 r1 = X.BRg.A00
            float r0 = com.facebook.aura.ui.HatchPullToRefreshKt.IndicatorSize
            X.BRg r12 = X.C10G.A07(r1, r0)
            boolean r1 = r6.A65(r2)
            java.lang.Object r0 = r6.AaT()
            if (r1 != 0) goto L7b
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L83
        L7b:
            com.facebook.aura.ui.HatchPullToRefreshKt$HatchPTRLoadingIndicator$3$1$1$1 r0 = new com.facebook.aura.ui.HatchPullToRefreshKt$HatchPTRLoadingIndicator$3$1$1$1
            r0.<init>(r2)
            r6.Ai0(r0)
        L83:
            X.BRg r16 = X.AnonymousClass001.A0W(r12, r0)
            r18 = 1082130432(0x40800000, float:4.0)
            X.1D3 r2 = X.C1D8.A00
            X.AKH<com.facebook.aura.vds.compose.theme.AuraColors> r0 = com.facebook.aura.vds.compose.theme.AuraColorsKt.LocalAuraColors
            long r20 = X.C06G.A0G(r6, r0)
            long r22 = X.C06G.A0G(r6, r0)
            r19 = 4
            r17 = r2
            X.BRg r1 = X.AbstractC04540eo.A00(r16, r17, r18, r19, r20, r22)
            X.BRg r12 = X.C11U.A03(r1, r2)
            com.facebook.aura.vds.compose.theme.AuraColors r0 = X.AnonymousClass001.A0f(r6, r0)
            long r0 = r0.elevated
            X.BRg r0 = X.C1b8.A03(r12, r2, r0)
            X.AiA r12 = X.AnonymousClass001.A0a()
            int r2 = X.AnonymousClass001.A0D(r5)
            X.AKQ r1 = X.BBI.A04(r5)
            X.BRg r0 = X.AxM.A01(r6, r0)
            X.AnonymousClass005.A0n(r6, r5, r8)
            X.BPg.A02(r6, r12, r7)
            X.BPg.A02(r6, r1, r4)
            X.AnonymousClass003.A15(r3, r11, r6, r2)
            X.BPg.A02(r6, r0, r10)
            if (r13 != 0) goto Ld4
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r14)
            r23 = 0
            if (r0 == 0) goto Ld6
        Ld4:
            r23 = 1
        Ld6:
            r0 = -1892678938(0xffffffff8f3002e6, float:-8.678028E-30)
            r6.AgE(r0)
            r22 = r15
            r25 = r6
            r26 = r9
            r27 = r19
            com.facebook.aura.ui.HatchPullToRefreshKt.HatchPTRProgressArc(r22, r23, r24, r25, r26, r27)
            X.BBI.A0R(r5, r9)
            X.AnonymousClass002.A0y(r5)
            return
        Lee:
            r6.Afo()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.HatchPullToRefreshKt$HatchPTRLoadingIndicator$3.invoke(X.BFM, int):void");
    }
}
