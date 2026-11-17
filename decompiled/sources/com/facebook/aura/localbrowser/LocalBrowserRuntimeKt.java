package com.facebook.aura.localbrowser;

import X.AIW;
import X.C0924AIa;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.notifications.push.HatchChatNotificationIds;
import com.facebook.aura.nudge.ConversationNudgeLogging;

/* loaded from: classes2.dex */
public abstract class LocalBrowserRuntimeKt {
    public static final void logLocalBrowserWake(String str, String str2, String str3, Long l) {
        C7384Etj.A0Y(str2, 1);
        LocalBrowserTelemetry localBrowserTelemetry = LocalBrowserTelemetry.INSTANCE;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        if (str != null) {
            c0924AIaA0u.put(HatchChatNotificationIds.PARAM_BROWSER_TASK_ID, str);
        }
        c0924AIaA0u.put("result", str2);
        if (str3 != null) {
            c0924AIaA0u.put(ConversationNudgeLogging.KEY_SKIP_REASON, str3);
        }
        if (l != null) {
            C3cH.A1A("registration_ms", c0924AIaA0u, l.longValue());
        }
        localBrowserTelemetry.event("local_browser_wake", "outcome", AIW.A0K(c0924AIaA0u), null);
    }

    public static /* synthetic */ void logLocalBrowserWake$default(String str, String str2, String str3, Long l, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        logLocalBrowserWake(str, str2, str3, l);
    }
}
