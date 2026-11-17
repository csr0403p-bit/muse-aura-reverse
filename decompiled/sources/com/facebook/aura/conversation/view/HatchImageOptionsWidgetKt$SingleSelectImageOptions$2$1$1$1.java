package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchImageOptionsWidgetKt$SingleSelectImageOptions$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ MutableState<Integer> $pendingIndex$delegate;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImageOptionsWidgetKt$SingleSelectImageOptions$2$1$1$1(boolean z, Map<String, String> map, int i, MutableState<Integer> mutableState) {
        super(0);
        this.$isPrimaryThread = z;
        this.$threadLogMetadata = map;
        this.$index = i;
        this.$pendingIndex$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchImageOptionsWidgetKt.logImageOptionTileClick(this.$isPrimaryThread, this.$threadLogMetadata, this.$index);
        MutableState.A07(this.$index, this.$pendingIndex$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
