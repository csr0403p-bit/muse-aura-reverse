package com.facebook.aura.whatsapp.repository;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.whatsapp.repository.WhatsAppCompanionRepository$requestLinkCode$$inlined$executeJarvisRequest-Z6QaZII$default$2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class WhatsAppCompanionRepository$requestLinkCode$$inlined$executeJarvisRequestZ6QaZII$default$2 extends AbstractC7559F3s implements Function0<C9hr<WhatsAppLinkPayloadJson>> {
    public static final WhatsAppCompanionRepository$requestLinkCode$$inlined$executeJarvisRequestZ6QaZII$default$2 INSTANCE = new WhatsAppCompanionRepository$requestLinkCode$$inlined$executeJarvisRequestZ6QaZII$default$2();

    public WhatsAppCompanionRepository$requestLinkCode$$inlined$executeJarvisRequestZ6QaZII$default$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<WhatsAppLinkPayloadJson> invoke() {
        return WhatsAppLinkPayloadJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<WhatsAppLinkPayloadJson> invoke() {
        return WhatsAppLinkPayloadJson$$serializer.INSTANCE;
    }
}
