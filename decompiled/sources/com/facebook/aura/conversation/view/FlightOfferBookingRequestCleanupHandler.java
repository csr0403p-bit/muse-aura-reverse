package com.facebook.aura.conversation.view;

import com.facebook.aura.auth.signout.SignOutCleanupHandler;

/* loaded from: classes.dex */
public final class FlightOfferBookingRequestCleanupHandler implements SignOutCleanupHandler {
    public static final int $stable = 0;
    public static final FlightOfferBookingRequestCleanupHandler INSTANCE = new FlightOfferBookingRequestCleanupHandler();

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        FlightOfferBookingRequest.INSTANCE.clear();
    }
}
