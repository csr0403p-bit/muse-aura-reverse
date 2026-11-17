package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class FlightCheckoutApprovalJson$Companion$$childSerializers$2 extends AbstractC7559F3s implements Function0<C9hr<List<? extends FlightCheckoutPassengerJson>>> {
    public static final FlightCheckoutApprovalJson$Companion$$childSerializers$2 INSTANCE = new FlightCheckoutApprovalJson$Companion$$childSerializers$2();

    public FlightCheckoutApprovalJson$Companion$$childSerializers$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends FlightCheckoutPassengerJson>> invoke() {
        return C3cG.A19(FlightCheckoutPassengerJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends FlightCheckoutPassengerJson>> invoke() {
        return C3cG.A19(FlightCheckoutPassengerJson$$serializer.INSTANCE);
    }
}
