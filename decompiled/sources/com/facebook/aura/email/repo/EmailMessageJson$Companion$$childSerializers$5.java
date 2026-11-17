package com.facebook.aura.email.repo;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class EmailMessageJson$Companion$$childSerializers$5 extends AbstractC7559F3s implements Function0<C9hr<List<? extends EmailAttachmentJson>>> {
    public static final EmailMessageJson$Companion$$childSerializers$5 INSTANCE = new EmailMessageJson$Companion$$childSerializers$5();

    public EmailMessageJson$Companion$$childSerializers$5() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends EmailAttachmentJson>> invoke() {
        return C3cG.A19(EmailAttachmentJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends EmailAttachmentJson>> invoke() {
        return C3cG.A19(EmailAttachmentJson$$serializer.INSTANCE);
    }
}
