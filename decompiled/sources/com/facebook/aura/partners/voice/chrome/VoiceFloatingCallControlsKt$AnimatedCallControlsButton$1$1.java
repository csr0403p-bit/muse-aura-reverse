package com.facebook.aura.partners.voice.chrome;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceFloatingCallControlsKt$AnimatedCallControlsButton$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ T $button;
    public final /* synthetic */ MutableState<T> $previousButton$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceFloatingCallControlsKt$AnimatedCallControlsButton$1$1(T t, MutableState<T> mutableState) {
        super(0);
        this.$button = t;
        this.$previousButton$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        T t = this.$button;
        if (t != 0) {
            this.$previousButton$delegate.Af8(t);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
