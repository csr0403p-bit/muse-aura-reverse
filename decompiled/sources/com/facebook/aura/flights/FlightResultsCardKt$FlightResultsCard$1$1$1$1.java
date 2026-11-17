package com.facebook.aura.flights;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.model.FlightRowData;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class FlightResultsCardKt$FlightResultsCard$1$1$1$1 extends AbstractC7559F3s implements G0U<FlightRowData, Unit> {
    public final /* synthetic */ FlightResultsCardViewModel $model;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ FlightResults $results;
    public final /* synthetic */ String $sessionId;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FlightRowData flightRowData) {
        C7384Etj.A0Y(flightRowData, 0);
        this.$model.openOffer(this.$results);
        this.$navigator.navigate((AuraNavKey) new FlightDetailScreenKey(this.$results.presentationId, flightRowData.id, this.$sessionId, false), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightResultsCardKt$FlightResultsCard$1$1$1$1(FlightResultsCardViewModel flightResultsCardViewModel, FlightResults flightResults, AuraNavigator auraNavigator, String str) {
        super(1);
        this.$model = flightResultsCardViewModel;
        this.$results = flightResults;
        this.$navigator = auraNavigator;
        this.$sessionId = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(FlightRowData flightRowData) {
        invoke2(flightRowData);
        return Unit.INSTANCE;
    }
}
