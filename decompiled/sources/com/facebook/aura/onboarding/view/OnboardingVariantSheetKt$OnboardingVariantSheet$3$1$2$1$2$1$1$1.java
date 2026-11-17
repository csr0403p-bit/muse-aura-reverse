package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class OnboardingVariantSheetKt$OnboardingVariantSheet$3$1$2$1$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<String> $selectedVariant$delegate;
    public final /* synthetic */ String $variant;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingVariantSheetKt$OnboardingVariantSheet$3$1$2$1$2$1$1$1(String str, MutableState<String> mutableState) {
        super(0);
        this.$variant = str;
        this.$selectedVariant$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$selectedVariant$delegate.Af8(this.$variant);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
