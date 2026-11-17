package com.facebook.aura.confidentialvm.vmswitch;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository$awaitPending$$inlined$executeJarvisRequest-1iavgos$default$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ConfidentialVmMigrationDoneRepository$awaitPending$$inlined$executeJarvisRequest1iavgos$default$1 extends AbstractC7559F3s implements Function0<C9hr<VmMigrationLatestResponseJson>> {
    public static final ConfidentialVmMigrationDoneRepository$awaitPending$$inlined$executeJarvisRequest1iavgos$default$1 INSTANCE = new ConfidentialVmMigrationDoneRepository$awaitPending$$inlined$executeJarvisRequest1iavgos$default$1();

    public ConfidentialVmMigrationDoneRepository$awaitPending$$inlined$executeJarvisRequest1iavgos$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<VmMigrationLatestResponseJson> invoke() {
        return VmMigrationLatestResponseJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<VmMigrationLatestResponseJson> invoke() {
        return VmMigrationLatestResponseJson$$serializer.INSTANCE;
    }
}
