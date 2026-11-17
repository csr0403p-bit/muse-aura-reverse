package com.meta.maps.fancypins;

import X.AbstractC7559F3s;
import X.BV4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinViewRegistry$updateRank$3 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $effectiveRank;
    public final /* synthetic */ FancyPinSlotRows $rows;
    public final /* synthetic */ int $slotIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancyPinViewRegistry$updateRank$3(FancyPinSlotRows fancyPinSlotRows, int i, int i2) {
        super(0);
        this.$rows = fancyPinSlotRows;
        this.$slotIndex = i;
        this.$effectiveRank = i2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FancyPinSlotRows fancyPinSlotRows = this.$rows;
        if (fancyPinSlotRows == null) {
            throw BV4.A0U();
        }
        fancyPinSlotRows.effectiveRanks.put(this.$slotIndex, this.$effectiveRank);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
