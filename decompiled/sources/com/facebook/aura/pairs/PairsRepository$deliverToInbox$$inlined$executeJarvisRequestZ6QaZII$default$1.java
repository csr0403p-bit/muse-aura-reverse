package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.pairs.PairsRepository$deliverToInbox$$inlined$executeJarvisRequest-Z6QaZII$default$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class PairsRepository$deliverToInbox$$inlined$executeJarvisRequestZ6QaZII$default$1 extends AbstractC7559F3s implements Function0<C9hr<PeerInboxDeliverRequestJson>> {
    public static final PairsRepository$deliverToInbox$$inlined$executeJarvisRequestZ6QaZII$default$1 INSTANCE = new PairsRepository$deliverToInbox$$inlined$executeJarvisRequestZ6QaZII$default$1();

    public PairsRepository$deliverToInbox$$inlined$executeJarvisRequestZ6QaZII$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<PeerInboxDeliverRequestJson> invoke() {
        return PeerInboxDeliverRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<PeerInboxDeliverRequestJson> invoke() {
        return PeerInboxDeliverRequestJson$$serializer.INSTANCE;
    }
}
