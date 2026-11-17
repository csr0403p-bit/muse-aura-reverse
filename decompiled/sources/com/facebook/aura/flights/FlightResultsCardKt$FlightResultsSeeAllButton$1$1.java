package com.facebook.aura.flights;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class FlightResultsCardKt$FlightResultsSeeAllButton$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ FlightResultsViewModel $model;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ FlightResults $results;
    public final /* synthetic */ String $sessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightResultsCardKt$FlightResultsSeeAllButton$1$1(FlightResultsViewModel flightResultsViewModel, FlightResults flightResults, AuraNavigator auraNavigator, String str) {
        super(0);
        this.$model = flightResultsViewModel;
        this.$results = flightResults;
        this.$navigator = auraNavigator;
        this.$sessionId = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$model.onSeeAllClicked(this.$results);
        this.$navigator.navigate((AuraNavKey) new FlightResultsScreenKey(this.$results.presentationId, this.$sessionId), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
