package com.facebook.aura.hotels;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import kotlin.Unit;

/* renamed from: com.facebook.aura.hotels.ComposableSingletons$HotelBrowseEntryProviderKt$lambda$-1800816511$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$HotelBrowseEntryProviderKt$lambda$1800816511$1 extends AbstractC7559F3s implements G0W<HotelSelectionSheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$HotelBrowseEntryProviderKt$lambda$1800816511$1 INSTANCE = new ComposableSingletons$HotelBrowseEntryProviderKt$lambda$1800816511$1();

    public ComposableSingletons$HotelBrowseEntryProviderKt$lambda$1800816511$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HotelSelectionSheetKey hotelSelectionSheetKey, BFM bfm, Integer num) {
        invoke(hotelSelectionSheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(HotelSelectionSheetKey hotelSelectionSheetKey, BFM bfm, int i) {
        HotelSelectionSheetKt.HotelSelectionSheet(hotelSelectionSheetKey, null, bfm, AnonymousClass006.A0E(hotelSelectionSheetKey, i), 2);
    }
}
