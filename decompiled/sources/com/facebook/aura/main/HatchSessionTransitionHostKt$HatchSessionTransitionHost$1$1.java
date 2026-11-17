package com.facebook.aura.main;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchSessionTransitionHostKt$HatchSessionTransitionHost$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $hasRenderedSignedOut$delegate;
    public final /* synthetic */ boolean $isInitialized;
    public final /* synthetic */ boolean $isSignedOut;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSessionTransitionHostKt$HatchSessionTransitionHost$1$1(boolean z, boolean z2, MutableState<Boolean> mutableState) {
        super(0);
        this.$isInitialized = z;
        this.$isSignedOut = z2;
        this.$hasRenderedSignedOut$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$isInitialized && this.$isSignedOut) {
            MutableState.A09(true, this.$hasRenderedSignedOut$delegate);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
