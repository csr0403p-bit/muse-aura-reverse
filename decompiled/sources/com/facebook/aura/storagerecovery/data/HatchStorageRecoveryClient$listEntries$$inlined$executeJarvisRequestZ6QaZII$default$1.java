package com.facebook.aura.storagerecovery.data;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient$listEntries$$inlined$executeJarvisRequest-Z6QaZII$default$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class HatchStorageRecoveryClient$listEntries$$inlined$executeJarvisRequestZ6QaZII$default$1 extends AbstractC7559F3s implements Function0<C9hr<StorageRecoveryListRequestJson>> {
    public static final HatchStorageRecoveryClient$listEntries$$inlined$executeJarvisRequestZ6QaZII$default$1 INSTANCE = new HatchStorageRecoveryClient$listEntries$$inlined$executeJarvisRequestZ6QaZII$default$1();

    public HatchStorageRecoveryClient$listEntries$$inlined$executeJarvisRequestZ6QaZII$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<StorageRecoveryListRequestJson> invoke() {
        return StorageRecoveryListRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<StorageRecoveryListRequestJson> invoke() {
        return StorageRecoveryListRequestJson$$serializer.INSTANCE;
    }
}
