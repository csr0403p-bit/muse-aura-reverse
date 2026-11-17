package com.facebook.aura.partners.voice.chrome;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceFloatingCallControlsKt$rememberCallControlsPresentation$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ CallControlsPresentation $current;
    public final /* synthetic */ MutableState<CallControlsPresentation> $previousPresentation$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceFloatingCallControlsKt$rememberCallControlsPresentation$1$1(CallControlsPresentation callControlsPresentation, MutableState<CallControlsPresentation> mutableState) {
        super(0);
        this.$current = callControlsPresentation;
        this.$previousPresentation$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        CallControlsPresentation callControlsPresentation = this.$current;
        if (callControlsPresentation != null) {
            this.$previousPresentation$delegate.Af8(callControlsPresentation);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
