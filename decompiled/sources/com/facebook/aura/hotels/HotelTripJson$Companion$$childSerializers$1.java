package com.facebook.aura.hotels;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HotelTripJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends HotelRoomJson>>> {
    public static final HotelTripJson$Companion$$childSerializers$1 INSTANCE = new HotelTripJson$Companion$$childSerializers$1();

    public HotelTripJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends HotelRoomJson>> invoke() {
        return C3cG.A19(HotelRoomJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends HotelRoomJson>> invoke() {
        return C3cG.A19(HotelRoomJson$$serializer.INSTANCE);
    }
}
