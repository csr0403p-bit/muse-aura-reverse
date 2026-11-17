package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.onboarding.OnboardingGreetingVideo;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class OnboardingUiFlowScreenKt$OnboardingUiFlowGreetingVideo$4$1 extends AbstractC7559F3s implements G0U<Exception, Unit> {
    public final /* synthetic */ OnboardingGreetingVideo $video;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowScreenKt$OnboardingUiFlowGreetingVideo$4$1(OnboardingGreetingVideo onboardingGreetingVideo) {
        super(1);
        this.$video = onboardingGreetingVideo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
        this.$video.onFailed();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Exception exc) {
        this.$video.onFailed();
    }
}
