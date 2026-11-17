package com.facebook.aura.email.repo;

import X.AbstractC7559F3s;
import X.C9hr;
import X.F0C;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.email.repo.EmailRepository$accountEmailAddresses$2$invokeSuspend$$inlined$executeStefiRequest-bMdYcbs$default$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class EmailRepository$accountEmailAddresses$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 extends AbstractC7559F3s implements Function0<C9hr<EmailAccountAddressesJson>> {
    public static final EmailRepository$accountEmailAddresses$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 INSTANCE = new EmailRepository$accountEmailAddresses$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1();

    public EmailRepository$accountEmailAddresses$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<EmailAccountAddressesJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = EmailAccountAddressesJson.$childSerializers;
        return EmailAccountAddressesJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<EmailAccountAddressesJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = EmailAccountAddressesJson.$childSerializers;
        return EmailAccountAddressesJson$$serializer.INSTANCE;
    }
}
