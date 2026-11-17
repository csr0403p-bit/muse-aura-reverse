package com.facebook.aura.conversation.repo;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.conversation.repo.HatchThreadsRepository$markThreadAsSeen$3$invokeSuspend$$inlined$executeJarvisRequest-1iavgos$default$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class HatchThreadsRepository$markThreadAsSeen$3$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 extends AbstractC7559F3s implements Function0<C9hr<MarkThreadAsSeenPayloadJson>> {
    public static final HatchThreadsRepository$markThreadAsSeen$3$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 INSTANCE = new HatchThreadsRepository$markThreadAsSeen$3$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1();

    public HatchThreadsRepository$markThreadAsSeen$3$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<MarkThreadAsSeenPayloadJson> invoke() {
        return MarkThreadAsSeenPayloadJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<MarkThreadAsSeenPayloadJson> invoke() {
        return MarkThreadAsSeenPayloadJson$$serializer.INSTANCE;
    }
}
