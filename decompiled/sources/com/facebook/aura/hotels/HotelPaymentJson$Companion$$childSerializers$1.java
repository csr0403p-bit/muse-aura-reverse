package com.facebook.aura.hotels;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HotelPaymentJson$Companion$$childSerializers$1 extends AbstractC7559F3s implements Function0<C9hr<List<? extends HotelInstallmentJson>>> {
    public static final HotelPaymentJson$Companion$$childSerializers$1 INSTANCE = new HotelPaymentJson$Companion$$childSerializers$1();

    public HotelPaymentJson$Companion$$childSerializers$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends HotelInstallmentJson>> invoke() {
        return C3cG.A19(HotelInstallmentJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends HotelInstallmentJson>> invoke() {
        return C3cG.A19(HotelInstallmentJson$$serializer.INSTANCE);
    }
}
