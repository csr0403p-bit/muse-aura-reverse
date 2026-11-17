package com.facebook.aura.commands.photos;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.commands.photos.MediaDeviceSyncClient$existsOnServer$$inlined$executeJarvisRequest-Z6QaZII$default$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class MediaDeviceSyncClient$existsOnServer$$inlined$executeJarvisRequestZ6QaZII$default$1 extends AbstractC7559F3s implements Function0<C9hr<FsUploadStatusRequestJson>> {
    public static final MediaDeviceSyncClient$existsOnServer$$inlined$executeJarvisRequestZ6QaZII$default$1 INSTANCE = new MediaDeviceSyncClient$existsOnServer$$inlined$executeJarvisRequestZ6QaZII$default$1();

    public MediaDeviceSyncClient$existsOnServer$$inlined$executeJarvisRequestZ6QaZII$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<FsUploadStatusRequestJson> invoke() {
        return FsUploadStatusRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<FsUploadStatusRequestJson> invoke() {
        return FsUploadStatusRequestJson$$serializer.INSTANCE;
    }
}
