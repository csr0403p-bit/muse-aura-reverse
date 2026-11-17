package com.facebook.aura.email.repo;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.email.repo.EmailRepository$deleteMessage$2$invokeSuspend$$inlined$executeJarvisRequest-1iavgos$default$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class EmailRepository$deleteMessage$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 extends AbstractC7559F3s implements Function0<C9hr<EmailDeletedJson>> {
    public static final EmailRepository$deleteMessage$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 INSTANCE = new EmailRepository$deleteMessage$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1();

    public EmailRepository$deleteMessage$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<EmailDeletedJson> invoke() {
        return EmailDeletedJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<EmailDeletedJson> invoke() {
        return EmailDeletedJson$$serializer.INSTANCE;
    }
}
