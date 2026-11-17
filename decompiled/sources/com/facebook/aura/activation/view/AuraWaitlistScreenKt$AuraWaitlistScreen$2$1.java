package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.BLU;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AuraWaitlistScreenKt$AuraWaitlistScreen$2$1 extends AbstractC7559F3s implements Function0<BLU> {
    public final /* synthetic */ MutableState<BLU> $ctaBoundsInRoot$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraWaitlistScreenKt$AuraWaitlistScreen$2$1(MutableState<BLU> mutableState) {
        super(0);
        this.$ctaBoundsInRoot$delegate = mutableState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final BLU invoke() {
        return this.$ctaBoundsInRoot$delegate.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ BLU invoke() {
        return this.$ctaBoundsInRoot$delegate.getValue();
    }
}
