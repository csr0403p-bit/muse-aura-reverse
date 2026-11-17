package com.facebook.aura.onboarding.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C0881AGi;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.onboarding.OnboardingIntroApi;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.onboarding.view.OnboardingVariantSheetKt$OnboardingVariantSheet$1$1", f = "OnboardingVariantSheet.kt", l = {78}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class OnboardingVariantSheetKt$OnboardingVariantSheet$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public final /* synthetic */ MutableState<List<String>> $variants$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingVariantSheetKt$OnboardingVariantSheet$1$1(AbstractC3358CGz abstractC3358CGz, MutableState<List<String>> mutableState, MutableState<Boolean> mutableState2, HtJ<? super OnboardingVariantSheetKt$OnboardingVariantSheet$1$1> htJ) {
        super(2, htJ);
        this.$userSession = abstractC3358CGz;
        this.$variants$delegate = mutableState;
        this.$isLoading$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new OnboardingVariantSheetKt$OnboardingVariantSheet$1$1(this.$userSession, this.$variants$delegate, this.$isLoading$delegate, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            OnboardingIntroApi onboardingIntroApi = OnboardingIntroApi.INSTANCE;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            this.label = 1;
            obj = onboardingIntroApi.getVariants(abstractC3358CGz, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        if (obj == null) {
            obj = C0881AGi.A00;
        }
        this.$variants$delegate.Af8(obj);
        MutableState.A09(false, this.$isLoading$delegate);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((OnboardingVariantSheetKt$OnboardingVariantSheet$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
