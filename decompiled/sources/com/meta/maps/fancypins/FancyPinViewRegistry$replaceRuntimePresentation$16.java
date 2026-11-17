package com.meta.maps.fancypins;

import X.AbstractC7559F3s;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinViewRegistry$replaceRuntimePresentation$16 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Set<String> $formedRuntimePinIds;
    public final /* synthetic */ LinkedHashSet<String> $nextPendingAnimatedAppearances;
    public final /* synthetic */ boolean[] $replacementDirtySlots;
    public final /* synthetic */ FancyPinSlotRows $replacementRows;
    public final /* synthetic */ FancyPinViewRegistry this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancyPinViewRegistry$replaceRuntimePresentation$16(FancyPinViewRegistry fancyPinViewRegistry, FancyPinSlotRows fancyPinSlotRows, boolean[] zArr, LinkedHashSet<String> linkedHashSet, Set<String> set) {
        super(0);
        this.this$0 = fancyPinViewRegistry;
        this.$replacementRows = fancyPinSlotRows;
        this.$replacementDirtySlots = zArr;
        this.$nextPendingAnimatedAppearances = linkedHashSet;
        this.$formedRuntimePinIds = set;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FancyPinViewRegistry fancyPinViewRegistry = this.this$0;
        fancyPinViewRegistry.runtimeRows = this.$replacementRows;
        fancyPinViewRegistry.contentDirtySlots = this.$replacementDirtySlots;
        LinkedHashSet<String> linkedHashSet = fancyPinViewRegistry.pendingAnimatedAppearancePinIds;
        linkedHashSet.clear();
        linkedHashSet.addAll(this.$nextPendingAnimatedAppearances);
        this.this$0.formedRuntimeClusterAppearancePinIds.addAll(this.$formedRuntimePinIds);
        this.this$0.formedRuntimeClusterAppearancePinIds.retainAll(this.$nextPendingAnimatedAppearances);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
