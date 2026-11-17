package com.facebook.aura.whatsapp.repository;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository$checkStatus$$inlined$executeJarvisRequest-1iavgos$default$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class WhatsAppCompanionRepository$checkStatus$$inlined$executeJarvisRequest1iavgos$default$1 extends AbstractC7559F3s implements Function0<C9hr<WhatsAppStatusPayloadJson>> {
    public static final WhatsAppCompanionRepository$checkStatus$$inlined$executeJarvisRequest1iavgos$default$1 INSTANCE = new WhatsAppCompanionRepository$checkStatus$$inlined$executeJarvisRequest1iavgos$default$1();

    public WhatsAppCompanionRepository$checkStatus$$inlined$executeJarvisRequest1iavgos$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<WhatsAppStatusPayloadJson> invoke() {
        return WhatsAppStatusPayloadJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<WhatsAppStatusPayloadJson> invoke() {
        return WhatsAppStatusPayloadJson$$serializer.INSTANCE;
    }
}
