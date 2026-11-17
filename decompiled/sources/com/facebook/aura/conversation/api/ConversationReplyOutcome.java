package com.facebook.aura.conversation.api;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ConversationReplyOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConversationReplyOutcome[] $VALUES;
    public static final ConversationReplyOutcome COMPLETED;
    public static final ConversationReplyOutcome FAILED;

    static {
        ConversationReplyOutcome conversationReplyOutcome = new ConversationReplyOutcome("COMPLETED", 0);
        COMPLETED = conversationReplyOutcome;
        ConversationReplyOutcome conversationReplyOutcome2 = new ConversationReplyOutcome(CvmMigrationStatusJson.STAGE_FAILED, 1);
        FAILED = conversationReplyOutcome2;
        ConversationReplyOutcome[] conversationReplyOutcomeArr = {conversationReplyOutcome, conversationReplyOutcome2};
        $VALUES = conversationReplyOutcomeArr;
        $ENTRIES = C3cG.A0w(conversationReplyOutcomeArr);
    }

    public static Ey9<ConversationReplyOutcome> getEntries() {
        return $ENTRIES;
    }

    public static ConversationReplyOutcome valueOf(String str) {
        return (ConversationReplyOutcome) Enum.valueOf(ConversationReplyOutcome.class, str);
    }

    public static ConversationReplyOutcome[] values() {
        return (ConversationReplyOutcome[]) $VALUES.clone();
    }

    public ConversationReplyOutcome(String str, int i) {
    }
}
