package com.facebook.aura.gateway;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.gateway.HatchChatHandler$fetchUnreadState$$inlined$executeJarvisRequest-1iavgos$default$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class HatchChatHandler$fetchUnreadState$$inlined$executeJarvisRequest1iavgos$default$1 extends AbstractC7559F3s implements Function0<C9hr<UnreadCountResponseJson>> {
    public static final HatchChatHandler$fetchUnreadState$$inlined$executeJarvisRequest1iavgos$default$1 INSTANCE = new HatchChatHandler$fetchUnreadState$$inlined$executeJarvisRequest1iavgos$default$1();

    public HatchChatHandler$fetchUnreadState$$inlined$executeJarvisRequest1iavgos$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<UnreadCountResponseJson> invoke() {
        return UnreadCountResponseJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<UnreadCountResponseJson> invoke() {
        return UnreadCountResponseJson$$serializer.INSTANCE;
    }
}
