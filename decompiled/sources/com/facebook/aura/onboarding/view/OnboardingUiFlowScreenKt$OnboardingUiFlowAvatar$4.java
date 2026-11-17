package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.onboarding.OnboardingGreetingVideo;
import com.facebook.aura.onboarding.OnboardingUiFlowStep;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class OnboardingUiFlowScreenKt$OnboardingUiFlowAvatar$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $agentName;
    public final /* synthetic */ String $avatarUri;
    public final /* synthetic */ OnboardingGreetingVideo $greetingVideo;
    public final /* synthetic */ boolean $isResolved;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $nameAvatarSize;
    public final /* synthetic */ float $nameAvatarTop;
    public final /* synthetic */ OnboardingUiFlowStep $step;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowScreenKt$OnboardingUiFlowAvatar$4(OnboardingUiFlowStep onboardingUiFlowStep, float f, float f2, String str, OnboardingGreetingVideo onboardingGreetingVideo, boolean z, String str2, BRg bRg, int i, int i2) {
        super(2);
        this.$step = onboardingUiFlowStep;
        this.$nameAvatarTop = f;
        this.$nameAvatarSize = f2;
        this.$avatarUri = str;
        this.$greetingVideo = onboardingGreetingVideo;
        this.$isResolved = z;
        this.$agentName = str2;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        OnboardingUiFlowScreenKt.m1622OnboardingUiFlowAvatareWuZFaY(this.$step, this.$nameAvatarTop, this.$nameAvatarSize, this.$avatarUri, this.$greetingVideo, this.$isResolved, this.$agentName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
