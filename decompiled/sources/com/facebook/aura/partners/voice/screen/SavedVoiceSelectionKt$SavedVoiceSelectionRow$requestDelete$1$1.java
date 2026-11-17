package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SavedVoiceSelectionKt$SavedVoiceSelectionRow$requestDelete$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $canDelete;
    public final /* synthetic */ MutableState<Integer> $dialogState;
    public final /* synthetic */ boolean $enabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedVoiceSelectionKt$SavedVoiceSelectionRow$requestDelete$1$1(boolean z, boolean z2, MutableState<Integer> mutableState) {
        super(0);
        this.$enabled = z;
        this.$canDelete = z2;
        this.$dialogState = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$enabled && this.$canDelete) {
            MutableState.A07(2, this.$dialogState);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
