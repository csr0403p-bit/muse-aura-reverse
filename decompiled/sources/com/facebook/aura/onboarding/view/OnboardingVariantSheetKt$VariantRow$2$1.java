package com.facebook.aura.onboarding.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class OnboardingVariantSheetKt$VariantRow$2$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ boolean $isSelected;
    public final /* synthetic */ Function0<Unit> $onSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingVariantSheetKt$VariantRow$2$1(boolean z, Function0<Unit> function0) {
        super(1);
        this.$isSelected = z;
        this.$onSelected = function0;
    }

    public final void invoke(boolean z) {
        if (!z || this.$isSelected) {
            return;
        }
        this.$onSelected.invoke();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
