package com.facebook.aura.explore.api;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import com.facebook.aura.pairs.ConnectionsIdeaNamesProvider;

/* loaded from: classes3.dex */
public class IdeaConnectionNamesProviderStatic {
    public static IdeaConnectionNamesResolver resolver(int i, AbstractC3358CGz abstractC3358CGz) {
        if (i == 0) {
            return ConnectionsIdeaNamesProvider.INSTANCE.resolver(abstractC3358CGz);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
