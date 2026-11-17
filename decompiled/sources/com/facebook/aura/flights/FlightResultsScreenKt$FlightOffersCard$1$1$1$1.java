package com.facebook.aura.flights;

import X.AbstractC7559F3s;
import com.facebook.aura.model.FlightRowData;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class FlightResultsScreenKt$FlightOffersCard$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ FlightRowData $offer;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ String $sessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightResultsScreenKt$FlightOffersCard$1$1$1$1(AuraNavigator auraNavigator, String str, FlightRowData flightRowData, String str2) {
        super(0);
        this.$navigator = auraNavigator;
        this.$presentationId = str;
        this.$offer = flightRowData;
        this.$sessionId = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigator.navigate((AuraNavKey) new FlightDetailScreenKey(this.$presentationId, this.$offer.id, this.$sessionId, false), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
