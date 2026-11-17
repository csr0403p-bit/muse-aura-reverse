package com.facebook.aura.hotels;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HotelResultsScreenKt$HotelResultsGrid$2$1$4$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HotelResultsEntry $entry;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $sessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelResultsScreenKt$HotelResultsGrid$2$1$4$1$1(AuraNavigator auraNavigator, HotelResultsEntry hotelResultsEntry, String str) {
        super(0);
        this.$navigator = auraNavigator;
        this.$entry = hotelResultsEntry;
        this.$sessionId = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraNavigator auraNavigator = this.$navigator;
        HotelResultsEntry hotelResultsEntry = this.$entry;
        auraNavigator.navigate((AuraNavKey) HotelResultsCardKt.selectionKey(hotelResultsEntry.hotel, hotelResultsEntry.searchRef, this.$sessionId, true), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
