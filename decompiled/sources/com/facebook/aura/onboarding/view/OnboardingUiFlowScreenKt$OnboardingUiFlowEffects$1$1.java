package com.facebook.aura.onboarding.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AvW;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.onboarding.view.OnboardingUiFlowScreenKt$OnboardingUiFlowEffects$1$1", f = "OnboardingUiFlowScreen.kt", l = {290, 291}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class OnboardingUiFlowScreenKt$OnboardingUiFlowEffects$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $isCompleted;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $onCompleting;
    public int label;

    /* renamed from: com.facebook.aura.onboarding.view.OnboardingUiFlowScreenKt$OnboardingUiFlowEffects$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Long, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            return AnonymousClass001.A0x(l);
        }

        public final void invoke(long j) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingUiFlowScreenKt$OnboardingUiFlowEffects$1$1(boolean z, G0U<? super HtJ<? super Unit>, ? extends Object> g0u, AuraNavigator auraNavigator, HtJ<? super OnboardingUiFlowScreenKt$OnboardingUiFlowEffects$1$1> htJ) {
        super(2, htJ);
        this.$isCompleted = z;
        this.$onCompleting = g0u;
        this.$navigator = auraNavigator;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new OnboardingUiFlowScreenKt$OnboardingUiFlowEffects$1$1(this.$isCompleted, this.$onCompleting, this.$navigator, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$isCompleted) {
                G0U<HtJ<? super Unit>, Object> g0u = this.$onCompleting;
                this.label = 1;
                if (g0u.invoke(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            this.$navigator.navigate(ConversationTabScreenKey.INSTANCE, LaunchFlag.REPLACE_BACKSTACK);
            return Unit.INSTANCE;
        }
        Hwg.A00(obj);
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        this.label = 2;
        if (AvW.A01(anonymousClass1, this) == enumC10460Hji) {
            return enumC10460Hji;
        }
        this.$navigator.navigate(ConversationTabScreenKey.INSTANCE, LaunchFlag.REPLACE_BACKSTACK);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((OnboardingUiFlowScreenKt$OnboardingUiFlowEffects$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
