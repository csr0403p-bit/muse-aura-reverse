package com.facebook.aura.conversation.view;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ConversationHapticEvent {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConversationHapticEvent[] $VALUES;
    public static final ConversationHapticEvent REACTION;
    public static final ConversationHapticEvent REPLY_STARTED;
    public static final ConversationHapticEvent SEND_FAILED;

    static {
        ConversationHapticEvent conversationHapticEvent = new ConversationHapticEvent("REACTION", 0);
        REACTION = conversationHapticEvent;
        ConversationHapticEvent conversationHapticEvent2 = new ConversationHapticEvent("REPLY_STARTED", 1);
        REPLY_STARTED = conversationHapticEvent2;
        ConversationHapticEvent conversationHapticEvent3 = new ConversationHapticEvent("SEND_FAILED", 2);
        SEND_FAILED = conversationHapticEvent3;
        ConversationHapticEvent[] conversationHapticEventArr = {conversationHapticEvent, conversationHapticEvent2, conversationHapticEvent3};
        $VALUES = conversationHapticEventArr;
        $ENTRIES = C3cG.A0w(conversationHapticEventArr);
    }

    public static Ey9<ConversationHapticEvent> getEntries() {
        return $ENTRIES;
    }

    public static ConversationHapticEvent valueOf(String str) {
        return (ConversationHapticEvent) Enum.valueOf(ConversationHapticEvent.class, str);
    }

    public static ConversationHapticEvent[] values() {
        return (ConversationHapticEvent[]) $VALUES.clone();
    }

    public ConversationHapticEvent(String str, int i) {
    }
}
