package com.facebook.aura.conversation.widget.api;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFM;
import com.facebook.aura.email.view.EmailSetupButtonProvider;

/* loaded from: classes3.dex */
public final class ConversationPresentationButtons {
    public static final int $stable = 0;
    public static final ConversationPresentationButtons INSTANCE = new ConversationPresentationButtons();

    public final ConversationPresentationButtonState state(String str, BFM bfm, int i) {
        bfm.AgE(653789323);
        if (str != null) {
            int i2 = new int[]{0}[0];
            if (i2 != 0) {
                throw AnonymousClass005.A0c(i2);
            }
            ConversationPresentationButtonState conversationPresentationButtonStateState = EmailSetupButtonProvider.INSTANCE.policy().state(str, bfm, i & 14);
            if (conversationPresentationButtonStateState != null) {
                AnonymousClass001.A1D(bfm);
                return conversationPresentationButtonStateState;
            }
        }
        ConversationPresentationButtonState conversationPresentationButtonState = ConversationPresentationButtonState.ENABLED;
        AnonymousClass002.A19(bfm);
        return conversationPresentationButtonState;
    }
}
