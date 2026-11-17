package com.facebook.aura.conversation.widget.api;

import X.AnonymousClass003;
import X.AnonymousClass005;
import com.facebook.aura.confidentialvm.view.RecoveryPinPromptBannerProvider;
import com.facebook.aura.graduation.GraduationTopBannerProvider;

/* loaded from: classes.dex */
public class ConversationTopBannerProviderStatic {
    public static ConversationTopBanner banner(int i) {
        if (i == 0) {
            return RecoveryPinPromptBannerProvider.INSTANCE.banner();
        }
        if (i == 1) {
            return GraduationTopBannerProvider.INSTANCE.banner();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass003.A1a();
    }
}
