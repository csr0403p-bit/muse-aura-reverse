package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.G0U;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class OnboardingUiFlowTextRevealKt$OnboardingUiFlowTextReveal$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Function0<Float> $clockMs;
    public final /* synthetic */ long $color;
    public final /* synthetic */ boolean $isHeading;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<Integer, Unit> $onLineCount;
    public final /* synthetic */ C1822Arm $style;
    public final /* synthetic */ String $text;
    public final /* synthetic */ TextRevealTiming $timing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingUiFlowTextRevealKt$OnboardingUiFlowTextReveal$3(String str, Function0<Float> function0, TextRevealTiming textRevealTiming, C1822Arm c1822Arm, long j, BRg bRg, boolean z, G0U<? super Integer, Unit> g0u, int i, int i2) {
        super(2);
        this.$text = str;
        this.$clockMs = function0;
        this.$timing = textRevealTiming;
        this.$style = c1822Arm;
        this.$color = j;
        this.$modifier = bRg;
        this.$isHeading = z;
        this.$onLineCount = g0u;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        OnboardingUiFlowTextRevealKt.m1630OnboardingUiFlowTextRevealNpZTi58(this.$text, this.$clockMs, this.$timing, this.$style, this.$color, this.$modifier, this.$isHeading, this.$onLineCount, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
