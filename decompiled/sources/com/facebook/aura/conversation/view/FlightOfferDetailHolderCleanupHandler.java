package com.facebook.aura.conversation.view;

import com.facebook.aura.auth.signout.SignOutCleanupHandler;

/* loaded from: classes3.dex */
public final class FlightOfferDetailHolderCleanupHandler implements SignOutCleanupHandler {
    public static final int $stable = 0;
    public static final FlightOfferDetailHolderCleanupHandler INSTANCE = new FlightOfferDetailHolderCleanupHandler();

    @Override // com.facebook.aura.auth.signout.SignOutCleanupHandler
    public void cleanup() {
        FlightOfferDetailHolder.cache.clear();
    }
}
