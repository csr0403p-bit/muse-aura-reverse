package com.facebook.aura.productactions.api;

import X.AnonymousClass005;
import com.facebook.aura.tryon.TryOnMediaActionProvider;

/* loaded from: classes4.dex */
public class ProductMediaActionProviderStatic {
    public static int[] getKeys() {
        return new int[]{0};
    }

    public static ProductMediaAction action(int i) {
        if (i == 0) {
            return TryOnMediaActionProvider.INSTANCE.action();
        }
        throw AnonymousClass005.A0c(i);
    }
}
