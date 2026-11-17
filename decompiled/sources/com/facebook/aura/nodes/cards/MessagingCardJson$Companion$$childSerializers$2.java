package com.facebook.aura.nodes.cards;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C9hr;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class MessagingCardJson$Companion$$childSerializers$2 extends AbstractC7559F3s implements Function0<C9hr<List<? extends MessagingAttachmentJson>>> {
    public static final MessagingCardJson$Companion$$childSerializers$2 INSTANCE = new MessagingCardJson$Companion$$childSerializers$2();

    public MessagingCardJson$Companion$$childSerializers$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C9hr<List<? extends MessagingAttachmentJson>> invoke() {
        return C3cG.A19(MessagingAttachmentJson$$serializer.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<List<? extends MessagingAttachmentJson>> invoke() {
        return C3cG.A19(MessagingAttachmentJson$$serializer.INSTANCE);
    }
}
