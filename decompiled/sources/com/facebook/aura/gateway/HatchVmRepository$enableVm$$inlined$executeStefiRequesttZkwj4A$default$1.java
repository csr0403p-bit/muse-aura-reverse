package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.gateway.HatchVmRepository$enableVm$$inlined$executeStefiRequest-tZkwj4A$default$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class HatchVmRepository$enableVm$$inlined$executeStefiRequesttZkwj4A$default$1 extends AbstractC7559F3s implements Function0<C9hr<EnableVmRequestJson>> {
    public static final HatchVmRepository$enableVm$$inlined$executeStefiRequesttZkwj4A$default$1 INSTANCE = new HatchVmRepository$enableVm$$inlined$executeStefiRequesttZkwj4A$default$1();

    public HatchVmRepository$enableVm$$inlined$executeStefiRequesttZkwj4A$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<EnableVmRequestJson> invoke() {
        return EnableVmRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<EnableVmRequestJson> invoke() {
        return EnableVmRequestJson$$serializer.INSTANCE;
    }
}
