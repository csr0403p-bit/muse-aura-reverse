package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginTwoFactorMethodScreenKt$NativeLoginTwoFactorMethodScreen$1$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<HatchTwoFactorMethod, Unit> $onMethodSelected;
    public final /* synthetic */ HatchTwoFactorMethod $selectedMethod;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginTwoFactorMethodScreenKt$NativeLoginTwoFactorMethodScreen$1$1$2$1(HatchTwoFactorMethod hatchTwoFactorMethod, G0U<? super HatchTwoFactorMethod, Unit> g0u) {
        super(0);
        this.$selectedMethod = hatchTwoFactorMethod;
        this.$onMethodSelected = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchTwoFactorMethod hatchTwoFactorMethod = this.$selectedMethod;
        if (hatchTwoFactorMethod != null) {
            this.$onMethodSelected.invoke(hatchTwoFactorMethod);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
