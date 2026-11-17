package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BFM;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.conversation.view.HatchFlightOfferDetailsSheetKt;
import com.facebook.aura.navigation.key.FlightOfferDetailsSheetKey;
import kotlin.Unit;

/* renamed from: com.facebook.aura.navigation.entries.ComposableSingletons$FlightOfferDetailsEntryProviderKt$lambda$-1749391591$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$FlightOfferDetailsEntryProviderKt$lambda$1749391591$1 extends AbstractC7559F3s implements G0W<FlightOfferDetailsSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$FlightOfferDetailsEntryProviderKt$lambda$1749391591$1 INSTANCE = new ComposableSingletons$FlightOfferDetailsEntryProviderKt$lambda$1749391591$1();

    public ComposableSingletons$FlightOfferDetailsEntryProviderKt$lambda$1749391591$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(FlightOfferDetailsSheetKey flightOfferDetailsSheetKey, BFM bfm, Integer num) {
        invoke(flightOfferDetailsSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(FlightOfferDetailsSheetKey flightOfferDetailsSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(flightOfferDetailsSheetKey, 0);
        HatchFlightOfferDetailsSheetKt.HatchFlightOfferDetailsSheet(flightOfferDetailsSheetKey.offerId, flightOfferDetailsSheetKey.sliceIndex, flightOfferDetailsSheetKey.sessionId, bfm, 0);
    }
}
