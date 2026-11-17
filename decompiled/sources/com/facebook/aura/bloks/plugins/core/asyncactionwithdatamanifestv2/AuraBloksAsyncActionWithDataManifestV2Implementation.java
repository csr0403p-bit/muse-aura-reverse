package com.facebook.aura.bloks.plugins.core.asyncactionwithdatamanifestv2;

import X.AnonymousClass003;
import X.F6D;
import X.Hj6;
import com.facebook.aura.bloks.extensions.async.AuraAsyncActions;

/* loaded from: classes5.dex */
public final class AuraBloksAsyncActionWithDataManifestV2Implementation {
    public static final AuraBloksAsyncActionWithDataManifestV2Implementation INSTANCE = new AuraBloksAsyncActionWithDataManifestV2Implementation();

    public final Object evaluate(Hj6 hj6, F6D f6d) {
        AnonymousClass003.A0u(hj6, f6d);
        AuraAsyncActions.INSTANCE.asyncActionV2(f6d, hj6);
        return null;
    }
}
