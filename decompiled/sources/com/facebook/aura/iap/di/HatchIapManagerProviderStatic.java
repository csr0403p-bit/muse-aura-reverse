package com.facebook.aura.iap.di;

import X.AnonymousClass005;
import X.C9682Gdm;
import android.content.Context;
import com.facebook.aura.iap.HatchIapManagerProviderImpl;

/* loaded from: classes6.dex */
public class HatchIapManagerProviderStatic {
    public static int[] getKeys() {
        return new int[]{0};
    }

    public static C9682Gdm getIapManager(int i, Context context) {
        if (i == 0) {
            return HatchIapManagerProviderImpl.INSTANCE.getIapManager(context);
        }
        throw AnonymousClass005.A0c(i);
    }
}
