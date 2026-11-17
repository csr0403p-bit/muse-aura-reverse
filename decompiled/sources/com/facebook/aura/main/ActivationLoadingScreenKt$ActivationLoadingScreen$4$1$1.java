package com.facebook.aura.main;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ActivationLoadingScreenKt$ActivationLoadingScreen$4$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<String> $screenshotUri$delegate;
    public final /* synthetic */ MutableState<Boolean> $showBugReport$delegate;
    public final /* synthetic */ MutableState<String> $submissionId$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivationLoadingScreenKt$ActivationLoadingScreen$4$1$1(MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<Boolean> mutableState3) {
        super(0);
        this.$submissionId$delegate = mutableState;
        this.$screenshotUri$delegate = mutableState2;
        this.$showBugReport$delegate = mutableState3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$submissionId$delegate.Af8(AnonymousClass002.A0k());
        this.$screenshotUri$delegate.Af8(null);
        MutableState.A09(true, this.$showBugReport$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
