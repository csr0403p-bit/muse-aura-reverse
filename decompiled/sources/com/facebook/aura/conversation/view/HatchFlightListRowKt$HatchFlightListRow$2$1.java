package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.model.FlightRowData;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.FlightOfferDetailsSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchFlightListRowKt$HatchFlightListRow$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ FlightRowData $flight;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<FlightRowData, Unit> $onOpen;
    public final /* synthetic */ String $sessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchFlightListRowKt$HatchFlightListRow$2$1(G0U<? super FlightRowData, Unit> g0u, FlightRowData flightRowData, AuraNavigator auraNavigator, String str) {
        super(0);
        this.$onOpen = g0u;
        this.$flight = flightRowData;
        this.$navigator = auraNavigator;
        this.$sessionId = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchFlightListRowKt.logFlightRowClick();
        G0U<FlightRowData, Unit> g0u = this.$onOpen;
        if (g0u != null) {
            g0u.invoke(this.$flight);
            return;
        }
        FlightOfferDetailHolder.INSTANCE.put(this.$flight);
        AuraNavigator auraNavigator = this.$navigator;
        FlightRowData flightRowData = this.$flight;
        auraNavigator.navigate((AuraNavKey) new FlightOfferDetailsSheetKey(flightRowData.id, flightRowData.sliceIndex, this.$sessionId), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
