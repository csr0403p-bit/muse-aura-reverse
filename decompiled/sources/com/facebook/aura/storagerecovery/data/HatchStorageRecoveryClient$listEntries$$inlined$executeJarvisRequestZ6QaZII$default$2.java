package com.facebook.aura.storagerecovery.data;

import X.AbstractC7559F3s;
import X.C9hr;
import X.F0C;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.storagerecovery.data.HatchStorageRecoveryClient$listEntries$$inlined$executeJarvisRequest-Z6QaZII$default$2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class HatchStorageRecoveryClient$listEntries$$inlined$executeJarvisRequestZ6QaZII$default$2 extends AbstractC7559F3s implements Function0<C9hr<StorageRecoveryListPayloadJson>> {
    public static final HatchStorageRecoveryClient$listEntries$$inlined$executeJarvisRequestZ6QaZII$default$2 INSTANCE = new HatchStorageRecoveryClient$listEntries$$inlined$executeJarvisRequestZ6QaZII$default$2();

    public HatchStorageRecoveryClient$listEntries$$inlined$executeJarvisRequestZ6QaZII$default$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<StorageRecoveryListPayloadJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = StorageRecoveryListPayloadJson.$childSerializers;
        return StorageRecoveryListPayloadJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<StorageRecoveryListPayloadJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = StorageRecoveryListPayloadJson.$childSerializers;
        return StorageRecoveryListPayloadJson$$serializer.INSTANCE;
    }
}
