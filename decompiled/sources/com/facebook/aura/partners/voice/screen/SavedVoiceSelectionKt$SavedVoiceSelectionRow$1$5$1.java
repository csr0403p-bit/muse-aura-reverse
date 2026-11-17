package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SavedVoiceSelectionKt$SavedVoiceSelectionRow$1$5$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ MutableState<Boolean> $menuExpanded$delegate;
    public final /* synthetic */ Function0<Unit> $requestDelete;
    public final /* synthetic */ Function0<Unit> $requestRename;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedVoiceSelectionKt$SavedVoiceSelectionRow$1$5$1(Function0<Unit> function0, Function0<Unit> function02, MutableState<Boolean> mutableState) {
        super(1);
        this.$requestRename = function0;
        this.$requestDelete = function02;
        this.$menuExpanded$delegate = mutableState;
    }

    public final void invoke(int i) {
        MutableState.A09(false, this.$menuExpanded$delegate);
        (i == 1 ? this.$requestRename : this.$requestDelete).invoke();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
