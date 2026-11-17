package com.facebook.aura.conversation.widget.api;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ConversationPresentationButtonState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConversationPresentationButtonState[] $VALUES;
    public static final ConversationPresentationButtonState DISABLED;
    public static final ConversationPresentationButtonState ENABLED;
    public static final ConversationPresentationButtonState HIDDEN;

    static {
        ConversationPresentationButtonState conversationPresentationButtonState = new ConversationPresentationButtonState("ENABLED", 0);
        ENABLED = conversationPresentationButtonState;
        ConversationPresentationButtonState conversationPresentationButtonState2 = new ConversationPresentationButtonState("DISABLED", 1);
        DISABLED = conversationPresentationButtonState2;
        ConversationPresentationButtonState conversationPresentationButtonState3 = new ConversationPresentationButtonState("HIDDEN", 2);
        HIDDEN = conversationPresentationButtonState3;
        ConversationPresentationButtonState[] conversationPresentationButtonStateArr = {conversationPresentationButtonState, conversationPresentationButtonState2, conversationPresentationButtonState3};
        $VALUES = conversationPresentationButtonStateArr;
        $ENTRIES = C3cG.A0w(conversationPresentationButtonStateArr);
    }

    public static Ey9<ConversationPresentationButtonState> getEntries() {
        return $ENTRIES;
    }

    public static ConversationPresentationButtonState valueOf(String str) {
        return (ConversationPresentationButtonState) Enum.valueOf(ConversationPresentationButtonState.class, str);
    }

    public static ConversationPresentationButtonState[] values() {
        return (ConversationPresentationButtonState[]) $VALUES.clone();
    }

    public ConversationPresentationButtonState(String str, int i) {
    }
}
