package com.facebook.aura.conversation.widget.api;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ConversationTimelineSurface {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConversationTimelineSurface[] $VALUES;
    public static final ConversationTimelineSurface ASSIST;
    public static final ConversationTimelineSurface MAIN_CHAT;

    static {
        ConversationTimelineSurface conversationTimelineSurface = new ConversationTimelineSurface("MAIN_CHAT", 0);
        MAIN_CHAT = conversationTimelineSurface;
        ConversationTimelineSurface conversationTimelineSurface2 = new ConversationTimelineSurface("ASSIST", 1);
        ASSIST = conversationTimelineSurface2;
        ConversationTimelineSurface[] conversationTimelineSurfaceArr = {conversationTimelineSurface, conversationTimelineSurface2};
        $VALUES = conversationTimelineSurfaceArr;
        $ENTRIES = new F3w(conversationTimelineSurfaceArr);
    }

    public static Ey9<ConversationTimelineSurface> getEntries() {
        return $ENTRIES;
    }

    public static ConversationTimelineSurface valueOf(String str) {
        return (ConversationTimelineSurface) Enum.valueOf(ConversationTimelineSurface.class, str);
    }

    public static ConversationTimelineSurface[] values() {
        return (ConversationTimelineSurface[]) $VALUES.clone();
    }

    public ConversationTimelineSurface(String str, int i) {
    }
}
