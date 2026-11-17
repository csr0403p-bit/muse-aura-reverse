package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.gateway.HatchVmWakeApi$wakeVm$$inlined$executeStefiRequest-tZkwj4A$default$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class HatchVmWakeApi$wakeVm$$inlined$executeStefiRequesttZkwj4A$default$1 extends AbstractC7559F3s implements Function0<C9hr<WakeVmRequestJson>> {
    public static final HatchVmWakeApi$wakeVm$$inlined$executeStefiRequesttZkwj4A$default$1 INSTANCE = new HatchVmWakeApi$wakeVm$$inlined$executeStefiRequesttZkwj4A$default$1();

    public HatchVmWakeApi$wakeVm$$inlined$executeStefiRequesttZkwj4A$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<WakeVmRequestJson> invoke() {
        return WakeVmRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<WakeVmRequestJson> invoke() {
        return WakeVmRequestJson$$serializer.INSTANCE;
    }
}
