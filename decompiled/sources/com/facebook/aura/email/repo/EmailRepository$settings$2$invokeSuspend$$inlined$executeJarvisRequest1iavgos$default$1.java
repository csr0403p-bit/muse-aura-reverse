package com.facebook.aura.email.repo;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.email.repo.EmailRepository$settings$2$invokeSuspend$$inlined$executeJarvisRequest-1iavgos$default$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class EmailRepository$settings$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 extends AbstractC7559F3s implements Function0<C9hr<EmailSettingsJson>> {
    public static final EmailRepository$settings$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 INSTANCE = new EmailRepository$settings$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1();

    public EmailRepository$settings$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<EmailSettingsJson> invoke() {
        return EmailSettingsJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<EmailSettingsJson> invoke() {
        return EmailSettingsJson$$serializer.INSTANCE;
    }
}
