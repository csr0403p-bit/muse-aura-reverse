package com.facebook.aura.localbrowser;

import X.BFI;
import com.facebook.aura.model.BrowserTaskDisplayStatus;
import com.facebook.aura.model.BrowserTaskPresentation;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class LocalBrowserSessionKt {
    public static final long AGENT_ACTIVE_WINDOW_MS = 60000;
    public static final Set<LocalBrowserParkTrigger> FINISHED_PARK_TRIGGERS = BFI.A0H(new LocalBrowserParkTrigger[]{LocalBrowserParkTrigger.PARKED_OUTCOME, LocalBrowserParkTrigger.TERMINAL, LocalBrowserParkTrigger.TASK_STATE});
    public static final long IDLE_CLOSE_MS = 600000;
    public static final long IDLE_RECHECK_MS = 60000;
    public static final long PARK_AFTER_IDLE_MS = 300000;
    public static final long UNPARK_READY_TIMEOUT_MS = 10000;

    public static final LocalBrowserParkTrigger parkTrigger(BrowserTaskPresentation browserTaskPresentation) {
        if (browserTaskPresentation.isTerminal()) {
            return browserTaskPresentation.isTombstone() ? LocalBrowserParkTrigger.TERMINAL : LocalBrowserParkTrigger.PARKED_OUTCOME;
        }
        if (browserTaskPresentation.getDisplayState() == BrowserTaskDisplayStatus.WAITING) {
            return LocalBrowserParkTrigger.NEEDS_USER;
        }
        return null;
    }
}
