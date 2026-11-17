package com.facebook.aura.conversation.view;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchImageOptionsWidgetKt$MultiSelectImageOptions$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $index;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ MutableState<List<Integer>> $pendingIndices$delegate;
    public final /* synthetic */ List<Integer> $picks;
    public final /* synthetic */ boolean $selected;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImageOptionsWidgetKt$MultiSelectImageOptions$2$1$1$1(boolean z, Map<String, String> map, int i, boolean z2, List<Integer> list, MutableState<List<Integer>> mutableState) {
        super(0);
        this.$isPrimaryThread = z;
        this.$threadLogMetadata = map;
        this.$index = i;
        this.$selected = z2;
        this.$picks = list;
        this.$pendingIndices$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchImageOptionsWidgetKt.logImageOptionTileClick(this.$isPrimaryThread, this.$threadLogMetadata, this.$index);
        MutableState<List<Integer>> mutableState = this.$pendingIndices$delegate;
        boolean z = this.$selected;
        List<Integer> list = this.$picks;
        Integer numValueOf = Integer.valueOf(this.$index);
        mutableState.Af8(z ? AbstractC0878AGe.A0b(list, numValueOf) : AbstractC0878AGe.A0Q(numValueOf, list));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
