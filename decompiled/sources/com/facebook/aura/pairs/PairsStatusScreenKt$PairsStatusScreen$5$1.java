package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class PairsStatusScreenKt$PairsStatusScreen$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $confirmRemoval$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsStatusScreenKt$PairsStatusScreen$5$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$confirmRemoval$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(false, this.$confirmRemoval$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
