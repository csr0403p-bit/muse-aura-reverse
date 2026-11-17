package com.facebook.aura.hotels;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HotelSelectionContentKt$HotelSelectionPriceBreakdown$onShowTaxes$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HotelSelectionSheetKey $selectionKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelSelectionContentKt$HotelSelectionPriceBreakdown$onShowTaxes$1$1$1(AuraNavigator auraNavigator, HotelSelectionSheetKey hotelSelectionSheetKey) {
        super(0);
        this.$navigator = auraNavigator;
        this.$selectionKey = hotelSelectionSheetKey;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigator.navigate((AuraNavKey) new HotelPolicySheetKey(this.$selectionKey, HotelPolicy.TAXES_AND_FEES), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
