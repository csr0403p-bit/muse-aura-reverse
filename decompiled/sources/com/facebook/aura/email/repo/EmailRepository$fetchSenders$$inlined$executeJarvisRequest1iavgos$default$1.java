package com.facebook.aura.email.repo;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.email.repo.EmailRepository$fetchSenders$$inlined$executeJarvisRequest-1iavgos$default$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class EmailRepository$fetchSenders$$inlined$executeJarvisRequest1iavgos$default$1 extends AbstractC7559F3s implements Function0<C9hr<EmailPageJson<EmailSenderJson>>> {
    public static final EmailRepository$fetchSenders$$inlined$executeJarvisRequest1iavgos$default$1 INSTANCE = new EmailRepository$fetchSenders$$inlined$executeJarvisRequest1iavgos$default$1();

    public EmailRepository$fetchSenders$$inlined$executeJarvisRequest1iavgos$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<EmailPageJson<EmailSenderJson>> invoke() {
        C9iZ c9iZ = EmailPageJson.$cachedDescriptor;
        EmailSenderJson$$serializer emailSenderJson$$serializer = EmailSenderJson$$serializer.INSTANCE;
        C7384Etj.A0Y(emailSenderJson$$serializer, 0);
        return new EmailPageJson$$serializer(emailSenderJson$$serializer);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<EmailPageJson<EmailSenderJson>> invoke() {
        C9iZ c9iZ = EmailPageJson.$cachedDescriptor;
        EmailSenderJson$$serializer emailSenderJson$$serializer = EmailSenderJson$$serializer.INSTANCE;
        C7384Etj.A0Y(emailSenderJson$$serializer, 0);
        return new EmailPageJson$$serializer(emailSenderJson$$serializer);
    }
}
