package com.meta.maps.fancypins;

import X.AbstractC7559F3s;
import android.util.SparseArray;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinViewRegistry$replacePresentation$15 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $clustersArriveWithData;
    public final /* synthetic */ LinkedHashSet<String> $nextPendingAnimatedAppearances;
    public final /* synthetic */ boolean[] $replacementDirtySlots;
    public final /* synthetic */ SparseArray<FancyPinRetirement> $replacementRetirements;
    public final /* synthetic */ FancyPinSlotRows $replacementRows;
    public final /* synthetic */ FancyPinViewRegistry this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancyPinViewRegistry$replacePresentation$15(FancyPinViewRegistry fancyPinViewRegistry, FancyPinSlotRows fancyPinSlotRows, SparseArray<FancyPinRetirement> sparseArray, boolean[] zArr, LinkedHashSet<String> linkedHashSet, boolean z) {
        super(0);
        this.this$0 = fancyPinViewRegistry;
        this.$replacementRows = fancyPinSlotRows;
        this.$replacementRetirements = sparseArray;
        this.$replacementDirtySlots = zArr;
        this.$nextPendingAnimatedAppearances = linkedHashSet;
        this.$clustersArriveWithData = z;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FancyPinViewRegistry fancyPinViewRegistry = this.this$0;
        fancyPinViewRegistry.sourceRows = this.$replacementRows;
        fancyPinViewRegistry.retirementsBySlot = this.$replacementRetirements;
        fancyPinViewRegistry.contentDirtySlots = this.$replacementDirtySlots;
        LinkedHashSet<String> linkedHashSet = fancyPinViewRegistry.pendingAnimatedAppearancePinIds;
        linkedHashSet.clear();
        linkedHashSet.addAll(this.$nextPendingAnimatedAppearances);
        this.this$0.formedRuntimeClusterAppearancePinIds.retainAll(this.$nextPendingAnimatedAppearances);
        if (this.$clustersArriveWithData) {
            this.this$0.clustersArriveWithData = true;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
