package com.facebook.aura.pause;

import X.AbstractC7559F3s;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchUnpauseBottomSheetContentKt$UnpauseHatchRecoveryKeyPage$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<String, Unit> $onSubmit;
    public final /* synthetic */ MutableState<String> $recoveryKey$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchUnpauseBottomSheetContentKt$UnpauseHatchRecoveryKeyPage$1$2$1(G0U<? super String, Unit> g0u, MutableState<String> mutableState) {
        super(0);
        this.$onSubmit = g0u;
        this.$recoveryKey$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (MutableState.A01((MutableState) this.$recoveryKey$delegate) >= 32) {
            this.$onSubmit.invoke(this.$recoveryKey$delegate.getValue());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
