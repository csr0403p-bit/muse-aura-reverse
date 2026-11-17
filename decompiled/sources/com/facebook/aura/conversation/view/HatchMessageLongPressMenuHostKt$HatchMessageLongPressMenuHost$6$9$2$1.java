package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$9$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ MutableState<Boolean> $showContextMenu$delegate;
    public final /* synthetic */ MutableState<Boolean> $showReactionPicker$delegate;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageLongPressMenuHostKt$HatchMessageLongPressMenuHost$6$9$2$1(boolean z, Map<String, String> map, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$isPrimaryThread = z;
        this.$threadLogMetadata = map;
        this.$showContextMenu$delegate = mutableState;
        this.$showReactionPicker$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchMessageLongPressMenuHostKt.logReactionPickerClick(this.$isPrimaryThread, this.$threadLogMetadata);
        MutableState.A09(false, this.$showContextMenu$delegate);
        MutableState.A09(true, this.$showReactionPicker$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
