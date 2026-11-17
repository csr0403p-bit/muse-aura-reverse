package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class DeliveryCheckoutApprovalJson$Companion$$childSerializers$2 extends AbstractC7559F3s implements Function0<C9hr<List<? extends DeliveryCheckoutPriceItemJson>>> {
    public static final DeliveryCheckoutApprovalJson$Companion$$childSerializers$2 INSTANCE = new DeliveryCheckoutApprovalJson$Companion$$childSerializers$2();

    public DeliveryCheckoutApprovalJson$Companion$$childSerializers$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends DeliveryCheckoutPriceItemJson>> invoke() {
        return C3cG.A19(DeliveryCheckoutPriceItemJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends DeliveryCheckoutPriceItemJson>> invoke() {
        return C3cG.A19(DeliveryCheckoutPriceItemJson$$serializer.INSTANCE);
    }
}
