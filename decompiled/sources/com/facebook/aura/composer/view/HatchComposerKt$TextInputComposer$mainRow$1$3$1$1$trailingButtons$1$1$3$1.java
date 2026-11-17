package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$trailingButtons$1$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isDictating;
    public final /* synthetic */ Function0<Unit> $onDictationSend;
    public final /* synthetic */ Function0<Unit> $onSendClick;
    public final /* synthetic */ MutableState<Boolean> $showNameHint$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$trailingButtons$1$1$3$1(boolean z, Function0<Unit> function0, Function0<Unit> function02, MutableState<Boolean> mutableState) {
        super(0);
        this.$isDictating = z;
        this.$onDictationSend = function0;
        this.$onSendClick = function02;
        this.$showNameHint$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$isDictating) {
            this.$onDictationSend.invoke();
        } else {
            this.$onSendClick.invoke();
            MutableState.A09(false, this.$showNameHint$delegate);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
