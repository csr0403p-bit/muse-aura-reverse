package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.onboarding.GreetingVideoState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class OnboardingUiFlowScreenKt$OnboardingUiFlowAvatarImage$1$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ Function0<Float> $greetingVideoAlpha;
    public final /* synthetic */ C1BO<GreetingVideoState> $videoState$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Acj(this.$videoState$delegate.getValue() == GreetingVideoState.LOADING ? 0.0f : AnonymousClass001.A02(this.$greetingVideoAlpha.invoke()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingUiFlowScreenKt$OnboardingUiFlowAvatarImage$1$1$1(Function0<Float> function0, C1BO<? extends GreetingVideoState> c1bo) {
        super(1);
        this.$greetingVideoAlpha = function0;
        this.$videoState$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
