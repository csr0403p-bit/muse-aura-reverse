package com.facebook.aura.nudge;

import X.AGH;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.feed.repo.FeedInstructionsCardStoreKt;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ConversationNudgeLogging {
    public static final int $stable = 0;
    public static final String COMPONENT = "conversation_nudge";
    public static final String EVENT_NAME = "conversation_nudge";
    public static final ConversationNudgeLogging INSTANCE = new ConversationNudgeLogging();
    public static final String KEY_DISMISS_REASON = "dismiss_reason";
    public static final String KEY_NUDGE_ID = "nudge_id";
    public static final String KEY_OUTCOME = "outcome";
    public static final String KEY_SHOW_COUNT = "show_count";
    public static final String KEY_SKIP_REASON = "skip_reason";
    public static final String KEY_VISIBLE_MS = "visible_ms";

    public final void logOutcome(String str, NudgeOutcome nudgeOutcome, Map<String, String> map) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass003.A0x(nudgeOutcome, map);
        log(str, "action_outcome", AGH.A02(map, AnonymousClass006.A10("outcome", nudgeOutcome.getWireValue())), HatchSurface.CHAT.getValue());
    }

    private final void log(String str, String str2, Map<String, String> map, String str3) {
        HatchAppEventLogger.INSTANCE.logEvent("conversation_nudge", str3, null, null, "conversation_nudge", AGH.A02(map, AnonymousClass007.A0d(HatchMetadataKey.RESULT.getValue(), str2, C3cG.A0r(KEY_NUDGE_ID, str))), null);
    }

    public static /* synthetic */ void log$default(ConversationNudgeLogging conversationNudgeLogging, String str, String str2, Map map, String str3, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = HatchSurface.CHAT.getValue();
        }
        conversationNudgeLogging.log(str, str2, map, str3);
    }

    public final void logActionTapped(String str, long j, Map<String, String> map) {
        AnonymousClass003.A0v(str, map);
        log(str, "action_tapped", AGH.A02(map, AnonymousClass006.A10(KEY_VISIBLE_MS, String.valueOf(j))), HatchSurface.CHAT.getValue());
    }

    public final void logCardActionTapped(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        log(str, "action_tapped", AGH.A0E(), str2);
    }

    public final void logCardDismissed(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        log(str, FeedInstructionsCardStoreKt.KEY_DISMISSED, AnonymousClass006.A10(KEY_DISMISS_REASON, NudgeDismissReason.DISMISS_BUTTON.getWireValue()), str2);
    }

    public final void logCardShown(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        log(str, "shown", AGH.A0E(), str2);
    }

    public final void logDismissed(String str, NudgeDismissReason nudgeDismissReason, long j, Map<String, String> map) {
        AnonymousClass005.A0y(str, nudgeDismissReason, map);
        log(str, FeedInstructionsCardStoreKt.KEY_DISMISSED, AGH.A02(map, AnonymousClass007.A0d(KEY_VISIBLE_MS, String.valueOf(j), C3cG.A0r(KEY_DISMISS_REASON, nudgeDismissReason.getWireValue()))), HatchSurface.CHAT.getValue());
    }

    public final void logShown(String str, int i, Map<String, String> map) {
        AnonymousClass003.A0v(str, map);
        log(str, "shown", AGH.A02(map, AnonymousClass006.A10(KEY_SHOW_COUNT, String.valueOf(i))), HatchSurface.CHAT.getValue());
    }

    public final void logSkipped(String str, NudgeSkipReason nudgeSkipReason) {
        AnonymousClass003.A0u(str, nudgeSkipReason);
        log(str, "skipped", AnonymousClass006.A10(KEY_SKIP_REASON, nudgeSkipReason.getWireValue()), HatchSurface.CHAT.getValue());
    }
}
