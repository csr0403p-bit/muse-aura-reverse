package com.facebook.aura.onboarding.view;

import X.ADq;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1958Aux;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class OnboardingUiFlowTextRevealKt$UnfoldingCharacter$7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ ADq $character;
    public final /* synthetic */ Function0<Float> $clockMs;
    public final /* synthetic */ long $color;
    public final /* synthetic */ C1958Aux $layout;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ TextRevealTiming $timing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowTextRevealKt$UnfoldingCharacter$7(C1958Aux c1958Aux, ADq aDq, Function0<Float> function0, TextRevealTiming textRevealTiming, long j, BRg bRg, int i, int i2) {
        super(2);
        this.$layout = c1958Aux;
        this.$character = aDq;
        this.$clockMs = function0;
        this.$timing = textRevealTiming;
        this.$color = j;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        OnboardingUiFlowTextRevealKt.m1631UnfoldingCharacterFHprtrg(this.$layout, this.$character, this.$clockMs, this.$timing, this.$color, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
