package com.facebook.aura.conversation.widget.api;

import X.AnonymousClass005;
import com.facebook.aura.rentalcars.RentalCarResultsRendererProvider;

/* loaded from: classes.dex */
public class ConversationGenericListRendererProviderStatic {
    public static ConversationGenericListRenderer renderer(int i) {
        if (i == 0) {
            return RentalCarResultsRendererProvider.INSTANCE.renderer();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
