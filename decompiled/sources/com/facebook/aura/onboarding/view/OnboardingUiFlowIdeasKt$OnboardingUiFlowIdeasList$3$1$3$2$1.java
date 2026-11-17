package com.facebook.aura.onboarding.view;

import X.AOW;
import X.AT5;
import X.ATD;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C2HU;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.onboarding.OnboardingTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeasList$3$1$3$2$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ AT5<Float, AOW> $cardClock;
    public final /* synthetic */ Function0<Float> $exitProgress;
    public final /* synthetic */ OnboardingTask $idea;
    public final /* synthetic */ int $index;
    public final /* synthetic */ String $selectedIdeaId;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        float fTransform = C2HU.A01.transform(ATD.A03(((MutableState.A00(this.$cardClock) - 1300.0f) - (this.$index * 60.0f)) / 450.0f, 0.0f, 1.0f));
        float fA04 = C7384Etj.areEqual(this.$idea.id, this.$selectedIdeaId) ? 0.0f : AnonymousClass003.A04(this.$exitProgress);
        c2av.Acj((1.0f - fA04) * fTransform);
        c2av.Af6((c2av.Ah4(48.0f) * (1.0f - fTransform)) + (c2av.Ah4(24.0f) * fA04));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingUiFlowIdeasKt$OnboardingUiFlowIdeasList$3$1$3$2$1(AT5<Float, AOW> at5, int i, OnboardingTask onboardingTask, String str, Function0<Float> function0) {
        super(1);
        this.$cardClock = at5;
        this.$index = i;
        this.$idea = onboardingTask;
        this.$selectedIdeaId = str;
        this.$exitProgress = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
