package com.facebook.aura.conversation.api;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import com.facebook.aura.modellock.ModelLockInputBlockProvider;

/* loaded from: classes2.dex */
public class ConversationInputBlockProviderStatic {
    public static ConversationInputBlock source(int i, AbstractC3358CGz abstractC3358CGz) {
        if (i == 0) {
            return ModelLockInputBlockProvider.INSTANCE.source(abstractC3358CGz);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
