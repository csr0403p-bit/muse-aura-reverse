package com.facebook.aura.storagerecovery.data;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient$fetchStatus$$inlined$executeJarvisRequest-1iavgos$default$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class HatchStorageRecoveryClient$fetchStatus$$inlined$executeJarvisRequest1iavgos$default$1 extends AbstractC7559F3s implements Function0<C9hr<StorageRecoveryStatusJson>> {
    public static final HatchStorageRecoveryClient$fetchStatus$$inlined$executeJarvisRequest1iavgos$default$1 INSTANCE = new HatchStorageRecoveryClient$fetchStatus$$inlined$executeJarvisRequest1iavgos$default$1();

    public HatchStorageRecoveryClient$fetchStatus$$inlined$executeJarvisRequest1iavgos$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<StorageRecoveryStatusJson> invoke() {
        return StorageRecoveryStatusJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<StorageRecoveryStatusJson> invoke() {
        return StorageRecoveryStatusJson$$serializer.INSTANCE;
    }
}
