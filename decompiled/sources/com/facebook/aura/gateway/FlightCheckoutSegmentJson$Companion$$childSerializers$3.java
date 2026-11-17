package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class FlightCheckoutSegmentJson$Companion$$childSerializers$3 extends AbstractC7559F3s implements Function0<C9hr<List<? extends FlightCheckoutBaggageJson>>> {
    public static final FlightCheckoutSegmentJson$Companion$$childSerializers$3 INSTANCE = new FlightCheckoutSegmentJson$Companion$$childSerializers$3();

    public FlightCheckoutSegmentJson$Companion$$childSerializers$3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends FlightCheckoutBaggageJson>> invoke() {
        return C3cG.A19(FlightCheckoutBaggageJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends FlightCheckoutBaggageJson>> invoke() {
        return C3cG.A19(FlightCheckoutBaggageJson$$serializer.INSTANCE);
    }
}
