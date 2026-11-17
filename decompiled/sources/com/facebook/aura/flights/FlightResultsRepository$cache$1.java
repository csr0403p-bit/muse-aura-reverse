package com.facebook.aura.flights;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0V;

/* loaded from: classes2.dex */
public final class FlightResultsRepository$cache$1 extends AbstractC7559F3s implements G0V<String, FlightResults, Long> {
    public static final FlightResultsRepository$cache$1 INSTANCE = new FlightResultsRepository$cache$1();

    public FlightResultsRepository$cache$1() {
        super(2);
    }

    @Override // X.G0V
    public final Long invoke(String str, FlightResults flightResults) {
        C7384Etj.A0Y(flightResults, 1);
        return Long.valueOf(flightResults.offers.size() * 4096);
    }
}
