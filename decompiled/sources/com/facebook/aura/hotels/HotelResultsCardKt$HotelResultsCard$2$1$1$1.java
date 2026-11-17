package com.facebook.aura.hotels;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HotelResultsCardKt$HotelResultsCard$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HotelResult $hotel;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HotelResults $results;
    public final /* synthetic */ String $sessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelResultsCardKt$HotelResultsCard$2$1$1$1(AuraNavigator auraNavigator, HotelResult hotelResult, HotelResults hotelResults, String str) {
        super(0);
        this.$navigator = auraNavigator;
        this.$hotel = hotelResult;
        this.$results = hotelResults;
        this.$sessionId = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigator.navigate((AuraNavKey) HotelResultsCardKt.selectionKey(this.$hotel, this.$results.searchRef, this.$sessionId, false), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
