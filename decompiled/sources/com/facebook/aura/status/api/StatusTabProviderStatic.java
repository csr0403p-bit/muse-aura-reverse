package com.facebook.aura.status.api;

import X.AnonymousClass005;
import com.facebook.aura.email.EmailStatusTabProvider;

/* loaded from: classes.dex */
public class StatusTabProviderStatic {
    public static StatusTab tab(int i) {
        if (i == 0) {
            return EmailStatusTabProvider.INSTANCE.tab();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
