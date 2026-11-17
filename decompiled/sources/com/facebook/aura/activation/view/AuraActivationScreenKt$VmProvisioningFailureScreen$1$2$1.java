package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AuraActivationScreenKt$VmProvisioningFailureScreen$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $onRetry;
    public final /* synthetic */ MutableState<Boolean> $wasStopped$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraActivationScreenKt$VmProvisioningFailureScreen$1$2$1(Function0<Unit> function0, MutableState<Boolean> mutableState) {
        super(0);
        this.$onRetry = function0;
        this.$wasStopped$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (MutableState.A0A((MutableState) this.$wasStopped$delegate)) {
            MutableState.A09(false, this.$wasStopped$delegate);
            this.$onRetry.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
