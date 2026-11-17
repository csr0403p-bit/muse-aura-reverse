package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0V;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchImageOptionsWidgetKt$MultiSelectImageOptions$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ G0V<String, List<Integer>, Unit> $onConfirmSelection;
    public final /* synthetic */ List<Integer> $picks;
    public final /* synthetic */ String $selectionMessage;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchImageOptionsWidgetKt$MultiSelectImageOptions$1$1(boolean z, Map<String, String> map, G0V<? super String, ? super List<Integer>, Unit> g0v, String str, List<Integer> list) {
        super(0);
        this.$isPrimaryThread = z;
        this.$threadLogMetadata = map;
        this.$onConfirmSelection = g0v;
        this.$selectionMessage = str;
        this.$picks = list;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchImageOptionsWidgetKt.logImageOptionsConfirmClick(this.$isPrimaryThread, this.$threadLogMetadata);
        this.$onConfirmSelection.invoke(this.$selectionMessage, this.$picks);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
