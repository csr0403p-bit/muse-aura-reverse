package com.facebook.aura.conversation.widget.api;

import X.AnonymousClass003;
import X.AnonymousClass005;
import com.facebook.aura.confidentialvm.view.ConfidentialVmSupportAccessStatusProvider;
import com.facebook.aura.modellock.view.ModelLockStatusProvider;

/* loaded from: classes.dex */
public class ConversationComposerStatusProviderStatic {
    public static ConversationComposerStatusCard card(int i) {
        if (i == 0) {
            return ConfidentialVmSupportAccessStatusProvider.INSTANCE.card();
        }
        if (i == 1) {
            return ModelLockStatusProvider.INSTANCE.card();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass003.A1a();
    }
}
