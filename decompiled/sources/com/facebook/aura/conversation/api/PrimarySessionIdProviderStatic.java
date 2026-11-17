package com.facebook.aura.conversation.api;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import com.facebook.aura.conversation.repo.HatchPrimarySessionIdProvider;

/* loaded from: classes3.dex */
public class PrimarySessionIdProviderStatic {
    public static PrimarySessionIdSource source(int i, AbstractC3358CGz abstractC3358CGz) {
        if (i == 0) {
            return HatchPrimarySessionIdProvider.INSTANCE.source(abstractC3358CGz);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
