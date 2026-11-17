package com.facebook.aura.bloks.plugins.core.asyncactionwithdatamanifest;

import X.AnonymousClass003;
import X.BV4;
import X.F6D;
import X.FBB;
import X.Hj6;
import com.facebook.aura.bloks.extensions.async.AuraAsyncActions;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class MWABloksAsyncActionWithDataManifestImplementation {
    public static final MWABloksAsyncActionWithDataManifestImplementation INSTANCE = new MWABloksAsyncActionWithDataManifestImplementation();

    public final Object evaluate(Hj6 hj6, F6D f6d) {
        AnonymousClass003.A0u(hj6, f6d);
        AuraAsyncActions auraAsyncActions = AuraAsyncActions.INSTANCE;
        FBB fbb = f6d.A02;
        if (fbb == null) {
            throw BV4.A0U();
        }
        auraAsyncActions.asyncAction(fbb.A02, f6d, hj6);
        return Unit.INSTANCE;
    }
}
