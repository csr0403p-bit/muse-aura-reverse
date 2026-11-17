package com.facebook.aura.email.repo;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.email.repo.EmailRepository$create$2$invokeSuspend$$inlined$executeJarvisRequest-Z6QaZII$default$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class EmailRepository$create$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 extends AbstractC7559F3s implements Function0<C9hr<EmailCreateRequestJson>> {
    public static final EmailRepository$create$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 INSTANCE = new EmailRepository$create$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1();

    public EmailRepository$create$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<EmailCreateRequestJson> invoke() {
        return EmailCreateRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<EmailCreateRequestJson> invoke() {
        return EmailCreateRequestJson$$serializer.INSTANCE;
    }
}
