package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.model.FlightRowData;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchFlightOfferDetailsSheetKt$FlightOfferFooter$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $bookingText;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ FlightRowData $offer;
    public final /* synthetic */ String $sessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFlightOfferDetailsSheetKt$FlightOfferFooter$1$2$1$1(String str, FlightRowData flightRowData, String str2, AuraNavigator auraNavigator) {
        super(0);
        this.$sessionId = str;
        this.$offer = flightRowData;
        this.$bookingText = str2;
        this.$navigator = auraNavigator;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchFlightOfferDetailsSheetKt.logFlightOfferClick(this.$sessionId, HatchComponent.FLIGHT_BOOK_BUTTON);
        FlightOfferBookingRequest.INSTANCE.stageOffer(this.$sessionId, this.$offer.id, this.$bookingText);
        this.$navigator.back();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
