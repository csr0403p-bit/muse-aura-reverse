package com.facebook.aura.accessv2;

import X.C4JM;
import com.facebook.aura.auth.SessionActivationHandler;

/* loaded from: classes3.dex */
public final class AuraAccessLibraryPublishActivationHandler implements SessionActivationHandler {
    public static final AuraAccessLibraryPublishActivationHandler INSTANCE = new AuraAccessLibraryPublishActivationHandler();

    @Override // com.facebook.aura.auth.SessionActivationHandler
    public void onActivating(String str) {
        AuraAccessLibraryPublisher.INSTANCE.publishIfChangedAsync(C4JM.A00());
    }
}
