package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.model.FlightRowData;

/* loaded from: classes2.dex */
public final class FlightOfferDetailHolder$cache$1 extends AbstractC7559F3s implements G0V<String, FlightRowData, Long> {
    public static final FlightOfferDetailHolder$cache$1 INSTANCE = new FlightOfferDetailHolder$cache$1();

    public FlightOfferDetailHolder$cache$1() {
        super(2);
    }

    @Override // X.G0V
    public final Long invoke(String str, FlightRowData flightRowData) {
        C7384Etj.A0Y(flightRowData, 1);
        return Long.valueOf(FlightOfferDetailHolder.INSTANCE.estimatedWeightBytes(flightRowData));
    }
}
