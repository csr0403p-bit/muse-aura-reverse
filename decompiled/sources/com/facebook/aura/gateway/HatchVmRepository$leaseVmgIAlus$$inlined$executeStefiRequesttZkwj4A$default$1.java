package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.gateway.HatchVmRepository$leaseVm-gIAlu-s$$inlined$executeStefiRequest-tZkwj4A$default$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class HatchVmRepository$leaseVmgIAlus$$inlined$executeStefiRequesttZkwj4A$default$1 extends AbstractC7559F3s implements Function0<C9hr<LeaseVmRequestJson>> {
    public static final HatchVmRepository$leaseVmgIAlus$$inlined$executeStefiRequesttZkwj4A$default$1 INSTANCE = new HatchVmRepository$leaseVmgIAlus$$inlined$executeStefiRequesttZkwj4A$default$1();

    public HatchVmRepository$leaseVmgIAlus$$inlined$executeStefiRequesttZkwj4A$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<LeaseVmRequestJson> invoke() {
        return LeaseVmRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<LeaseVmRequestJson> invoke() {
        return LeaseVmRequestJson$$serializer.INSTANCE;
    }
}
