package com.facebook.aura.hotels;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BFM;
import X.G0W;
import kotlin.Unit;

/* renamed from: com.facebook.aura.hotels.ComposableSingletons$HotelBrowseEntryProviderKt$lambda$-1989849688$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$HotelBrowseEntryProviderKt$lambda$1989849688$1 extends AbstractC7559F3s implements G0W<HotelPolicySheetKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$HotelBrowseEntryProviderKt$lambda$1989849688$1 INSTANCE = new ComposableSingletons$HotelBrowseEntryProviderKt$lambda$1989849688$1();

    public ComposableSingletons$HotelBrowseEntryProviderKt$lambda$1989849688$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(HotelPolicySheetKey hotelPolicySheetKey, BFM bfm, Integer num) {
        invoke(hotelPolicySheetKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(HotelPolicySheetKey hotelPolicySheetKey, BFM bfm, int i) {
        HotelPolicySheetKt.HotelPolicySheet(hotelPolicySheetKey, null, bfm, AnonymousClass006.A0E(hotelPolicySheetKey, i), 2);
    }
}
