package com.meta.maps.fancypins;

import X.AbstractC7559F3s;
import X.BV4;
import X.C7384Etj;
import android.util.SparseArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinViewRegistry$updateActiveVariant$5 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $activeVariantId;
    public final /* synthetic */ FancyPinPresentation $presentation;
    public final /* synthetic */ FancyPinSlotRows $rows;
    public final /* synthetic */ int $slotIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FancyPinViewRegistry$updateActiveVariant$5(FancyPinPresentation fancyPinPresentation, String str, FancyPinSlotRows fancyPinSlotRows, int i) {
        super(0);
        this.$presentation = fancyPinPresentation;
        this.$activeVariantId = str;
        this.$rows = fancyPinSlotRows;
        this.$slotIndex = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (C7384Etj.areEqual(this.$presentation.activeVariantId, this.$activeVariantId)) {
            return;
        }
        FancyPinSlotRows fancyPinSlotRows = this.$rows;
        if (fancyPinSlotRows == null) {
            throw BV4.A0U();
        }
        SparseArray<FancyPinPresentation> sparseArray = fancyPinSlotRows.presentations;
        int i = this.$slotIndex;
        FancyPinPresentation fancyPinPresentation = this.$presentation;
        sparseArray.put(i, fancyPinPresentation.copy(fancyPinPresentation.pin, fancyPinPresentation.blueprint, this.$activeVariantId, fancyPinPresentation.layout, fancyPinPresentation.registrationRevision, fancyPinPresentation.properties, fancyPinPresentation.partConfigurations, fancyPinPresentation.runtimeCluster));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
