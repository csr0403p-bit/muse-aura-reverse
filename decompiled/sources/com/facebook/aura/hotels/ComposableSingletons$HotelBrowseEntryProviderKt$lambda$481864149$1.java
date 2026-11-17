package com.facebook.aura.hotels;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ComposableSingletons$HotelBrowseEntryProviderKt$lambda$481864149$1 extends AbstractC7559F3s implements G0W<HotelResultsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$HotelBrowseEntryProviderKt$lambda$481864149$1 INSTANCE = new ComposableSingletons$HotelBrowseEntryProviderKt$lambda$481864149$1();

    public ComposableSingletons$HotelBrowseEntryProviderKt$lambda$481864149$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HotelResultsScreenKey hotelResultsScreenKey, BFM bfm, Integer num) {
        invoke(hotelResultsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(HotelResultsScreenKey hotelResultsScreenKey, BFM bfm, int i) {
        HotelResultsScreenKt.HotelResultsScreen(hotelResultsScreenKey, null, bfm, AnonymousClass006.A0E(hotelResultsScreenKey, i), 2);
    }
}
