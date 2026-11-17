package com.facebook.aura.header.api;

import X.AnonymousClass005;
import com.facebook.aura.activation.view.InviteHeaderButtonDecorationProvider;

/* loaded from: classes3.dex */
public class HeaderButtonDecorationProviderStatic {
    public static HeaderButtonDecoration decoration(int i) {
        if (i == 0) {
            return InviteHeaderButtonDecorationProvider.INSTANCE.decoration();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
