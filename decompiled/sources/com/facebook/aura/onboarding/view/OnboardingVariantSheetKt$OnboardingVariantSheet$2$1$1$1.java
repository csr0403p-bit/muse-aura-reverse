package com.facebook.aura.onboarding.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.app.Activity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.common.restart.HatchAppRestarter;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.onboarding.OnboardingStateManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class OnboardingVariantSheetKt$OnboardingVariantSheet$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Activity $hostActivity;
    public final /* synthetic */ MutableState<Boolean> $isResetting$delegate;
    public final /* synthetic */ String $resetOnboardingTitle;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ MutableState<String> $selectedVariant$delegate;
    public final /* synthetic */ OnboardingStateManager $stateManager;

    @DebugMetadata(c = "com.facebook.aura.onboarding.view.OnboardingVariantSheetKt$OnboardingVariantSheet$2$1$1$1$1", f = "OnboardingVariantSheet.kt", l = {AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.onboarding.view.OnboardingVariantSheetKt$OnboardingVariantSheet$2$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Activity $hostActivity;
        public final /* synthetic */ MutableState<Boolean> $isResetting$delegate;
        public final /* synthetic */ String $resetOnboardingTitle;
        public final /* synthetic */ OnboardingStateManager $stateManager;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OnboardingStateManager onboardingStateManager, String str, Activity activity, MutableState<Boolean> mutableState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$stateManager = onboardingStateManager;
            this.$resetOnboardingTitle = str;
            this.$hostActivity = activity;
            this.$isResetting$delegate = mutableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$stateManager, this.$resetOnboardingTitle, this.$hostActivity, this.$isResetting$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    OnboardingStateManager onboardingStateManager = this.$stateManager;
                    this.label = 1;
                    if (onboardingStateManager.resetOnboardingWithServer(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                HatchAppRestarter.INSTANCE.relaunchApp(this.$resetOnboardingTitle, this.$hostActivity, null, true);
                MutableState.A09(false, this.$isResetting$delegate);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                MutableState.A09(false, this.$isResetting$delegate);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingVariantSheetKt$OnboardingVariantSheet$2$1$1$1(OnboardingStateManager onboardingStateManager, C3UX c3ux, MutableState<Boolean> mutableState, MutableState<String> mutableState2, String str, Activity activity) {
        super(0);
        this.$stateManager = onboardingStateManager;
        this.$scope = c3ux;
        this.$isResetting$delegate = mutableState;
        this.$selectedVariant$delegate = mutableState2;
        this.$resetOnboardingTitle = str;
        this.$hostActivity = activity;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (MutableState.A0A((MutableState) this.$isResetting$delegate)) {
            return;
        }
        MutableState.A09(true, this.$isResetting$delegate);
        this.$stateManager.setSelectedVariant(MutableState.A05(this.$selectedVariant$delegate));
        AnonymousClass001.A1J(new AnonymousClass1(this.$stateManager, this.$resetOnboardingTitle, this.$hostActivity, this.$isResetting$delegate, null), this.$scope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
