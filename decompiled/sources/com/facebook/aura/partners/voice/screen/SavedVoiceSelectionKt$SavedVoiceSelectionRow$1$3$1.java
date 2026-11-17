package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SavedVoiceSelectionKt$SavedVoiceSelectionRow$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ MutableState<Boolean> $menuExpanded$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedVoiceSelectionKt$SavedVoiceSelectionRow$1$3$1(boolean z, MutableState<Boolean> mutableState) {
        super(0);
        this.$enabled = z;
        this.$menuExpanded$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$enabled) {
            MutableState.A09(true, this.$menuExpanded$delegate);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
