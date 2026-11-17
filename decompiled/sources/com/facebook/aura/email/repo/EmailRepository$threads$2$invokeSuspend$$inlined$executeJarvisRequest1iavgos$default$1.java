package com.facebook.aura.email.repo;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.F0C;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.email.repo.EmailRepository$threads$2$invokeSuspend$$inlined$executeJarvisRequest-1iavgos$default$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class EmailRepository$threads$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 extends AbstractC7559F3s implements Function0<C9hr<EmailPageJson<EmailSummaryJson>>> {
    public static final EmailRepository$threads$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 INSTANCE = new EmailRepository$threads$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1();

    public EmailRepository$threads$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<EmailPageJson<EmailSummaryJson>> invoke() {
        C9iZ c9iZ = EmailPageJson.$cachedDescriptor;
        F0C<C9hr<Object>>[] f0cArr = EmailSummaryJson.$childSerializers;
        EmailSummaryJson$$serializer emailSummaryJson$$serializer = EmailSummaryJson$$serializer.INSTANCE;
        C7384Etj.A0Y(emailSummaryJson$$serializer, 0);
        return new EmailPageJson$$serializer(emailSummaryJson$$serializer);
    }
}
