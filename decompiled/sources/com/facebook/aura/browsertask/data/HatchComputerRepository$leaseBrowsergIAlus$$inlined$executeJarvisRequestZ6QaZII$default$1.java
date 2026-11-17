package com.facebook.aura.browsertask.data;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.browsertask.data.HatchComputerRepository$leaseBrowser-gIAlu-s$$inlined$executeJarvisRequest-Z6QaZII$default$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class HatchComputerRepository$leaseBrowsergIAlus$$inlined$executeJarvisRequestZ6QaZII$default$1 extends AbstractC7559F3s implements Function0<C9hr<BrowserLeaseRequestJson>> {
    public static final HatchComputerRepository$leaseBrowsergIAlus$$inlined$executeJarvisRequestZ6QaZII$default$1 INSTANCE = new HatchComputerRepository$leaseBrowsergIAlus$$inlined$executeJarvisRequestZ6QaZII$default$1();

    public HatchComputerRepository$leaseBrowsergIAlus$$inlined$executeJarvisRequestZ6QaZII$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<BrowserLeaseRequestJson> invoke() {
        return BrowserLeaseRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<BrowserLeaseRequestJson> invoke() {
        return BrowserLeaseRequestJson$$serializer.INSTANCE;
    }
}
