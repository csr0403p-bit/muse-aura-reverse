package com.facebook.aura.conversation.view;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ConversationComposerLayoutSlot {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConversationComposerLayoutSlot[] $VALUES;
    public static final ConversationComposerLayoutSlot Composer;
    public static final ConversationComposerLayoutSlot Content;

    static {
        ConversationComposerLayoutSlot conversationComposerLayoutSlot = new ConversationComposerLayoutSlot("Composer", 0);
        Composer = conversationComposerLayoutSlot;
        ConversationComposerLayoutSlot conversationComposerLayoutSlot2 = new ConversationComposerLayoutSlot("Content", 1);
        Content = conversationComposerLayoutSlot2;
        ConversationComposerLayoutSlot[] conversationComposerLayoutSlotArr = {conversationComposerLayoutSlot, conversationComposerLayoutSlot2};
        $VALUES = conversationComposerLayoutSlotArr;
        $ENTRIES = new F3w(conversationComposerLayoutSlotArr);
    }

    public static Ey9<ConversationComposerLayoutSlot> getEntries() {
        return $ENTRIES;
    }

    public static ConversationComposerLayoutSlot valueOf(String str) {
        return (ConversationComposerLayoutSlot) Enum.valueOf(ConversationComposerLayoutSlot.class, str);
    }

    public static ConversationComposerLayoutSlot[] values() {
        return (ConversationComposerLayoutSlot[]) $VALUES.clone();
    }

    public ConversationComposerLayoutSlot(String str, int i) {
    }
}
