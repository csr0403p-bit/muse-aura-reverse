package com.facebook.aura.watchhandoff;

import com.facebook.aura.nudge.ConversationNudge;
import com.facebook.aura.nudge.ConversationNudgeProvider;

/* loaded from: classes3.dex */
public final class WatchAppPromoNudgeProvider implements ConversationNudgeProvider {
    public static final int $stable = 0;
    public static final WatchAppPromoNudgeProvider INSTANCE = new WatchAppPromoNudgeProvider();

    @Override // com.facebook.aura.nudge.ConversationNudgeProvider
    public ConversationNudge nudge() {
        return WatchAppPromoNudgeKt.WatchAppPromoCard;
    }
}
