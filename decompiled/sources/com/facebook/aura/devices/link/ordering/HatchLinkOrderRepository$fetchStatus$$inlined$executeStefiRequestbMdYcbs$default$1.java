package com.facebook.aura.devices.link.ordering;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository$fetchStatus$$inlined$executeStefiRequest-bMdYcbs$default$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class HatchLinkOrderRepository$fetchStatus$$inlined$executeStefiRequestbMdYcbs$default$1 extends AbstractC7559F3s implements Function0<C9hr<DeviceOrderResponseJson>> {
    public static final HatchLinkOrderRepository$fetchStatus$$inlined$executeStefiRequestbMdYcbs$default$1 INSTANCE = new HatchLinkOrderRepository$fetchStatus$$inlined$executeStefiRequestbMdYcbs$default$1();

    public HatchLinkOrderRepository$fetchStatus$$inlined$executeStefiRequestbMdYcbs$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<DeviceOrderResponseJson> invoke() {
        return DeviceOrderResponseJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<DeviceOrderResponseJson> invoke() {
        return DeviceOrderResponseJson$$serializer.INSTANCE;
    }
}
