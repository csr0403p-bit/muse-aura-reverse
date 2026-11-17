package com.facebook.aura.conversation.widget.api;

import X.AnonymousClass005;
import com.facebook.aura.flights.FlightResultsListRendererProvider;

/* loaded from: classes.dex */
public class ConversationListPresentationRendererProviderStatic {
    public static ConversationListPresentationRenderer renderer(int i) {
        if (i == 0) {
            return FlightResultsListRendererProvider.INSTANCE.renderer();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
