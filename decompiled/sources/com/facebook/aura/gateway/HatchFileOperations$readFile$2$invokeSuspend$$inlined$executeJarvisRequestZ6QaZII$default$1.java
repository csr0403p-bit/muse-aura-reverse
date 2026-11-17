package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.gateway.HatchFileOperations$readFile$2$invokeSuspend$$inlined$executeJarvisRequest-Z6QaZII$default$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class HatchFileOperations$readFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 extends AbstractC7559F3s implements Function0<C9hr<FsReadRequestJson>> {
    public static final HatchFileOperations$readFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 INSTANCE = new HatchFileOperations$readFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1();

    public HatchFileOperations$readFile$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<FsReadRequestJson> invoke() {
        return FsReadRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<FsReadRequestJson> invoke() {
        return FsReadRequestJson$$serializer.INSTANCE;
    }
}
