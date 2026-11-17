package com.facebook.aura.conversation.api;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.shopping.repo.ShoppingResultsLivePresentationHook;

/* loaded from: classes3.dex */
public class ConversationLivePresentationHookStatic {
    public static void onLivePresentation(int i, AbstractC3358CGz abstractC3358CGz, HatchWidgetPresentation hatchWidgetPresentation) {
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        ShoppingResultsLivePresentationHook.INSTANCE.onLivePresentation(abstractC3358CGz, hatchWidgetPresentation);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
