package com.facebook.aura.conversation.api;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import com.facebook.aura.pairs.ConnectionsActivityKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ConversationCardOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConversationCardOutcome[] $VALUES;
    public static final ConversationCardOutcome CANCELLED;
    public static final ConversationCardOutcome COMPLETED;
    public static final ConversationCardOutcome DECLINED;
    public static final ConversationCardOutcome EXPIRED;
    public static final ConversationCardOutcome FAILED;
    public static final ConversationCardOutcome UNAVAILABLE;
    public final String wireValue;

    static {
        ConversationCardOutcome conversationCardOutcome = new ConversationCardOutcome("COMPLETED", 0, "completed");
        COMPLETED = conversationCardOutcome;
        ConversationCardOutcome conversationCardOutcome2 = new ConversationCardOutcome("DECLINED", 1, ConnectionsActivityKt.FILE_STATE_DECLINED);
        DECLINED = conversationCardOutcome2;
        ConversationCardOutcome conversationCardOutcome3 = new ConversationCardOutcome(CvmMigrationStatusJson.STAGE_FAILED, 2, "failed");
        FAILED = conversationCardOutcome3;
        ConversationCardOutcome conversationCardOutcome4 = new ConversationCardOutcome("EXPIRED", 3, "expired");
        EXPIRED = conversationCardOutcome4;
        ConversationCardOutcome conversationCardOutcome5 = new ConversationCardOutcome("UNAVAILABLE", 4, "unavailable");
        UNAVAILABLE = conversationCardOutcome5;
        ConversationCardOutcome conversationCardOutcome6 = new ConversationCardOutcome("CANCELLED", 5, "cancelled");
        CANCELLED = conversationCardOutcome6;
        ConversationCardOutcome[] conversationCardOutcomeArr = {conversationCardOutcome, conversationCardOutcome2, conversationCardOutcome3, conversationCardOutcome4, conversationCardOutcome5, conversationCardOutcome6};
        $VALUES = conversationCardOutcomeArr;
        $ENTRIES = C3cG.A0w(conversationCardOutcomeArr);
    }

    public static Ey9<ConversationCardOutcome> getEntries() {
        return $ENTRIES;
    }

    public static ConversationCardOutcome valueOf(String str) {
        return (ConversationCardOutcome) Enum.valueOf(ConversationCardOutcome.class, str);
    }

    public static ConversationCardOutcome[] values() {
        return (ConversationCardOutcome[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public ConversationCardOutcome(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
