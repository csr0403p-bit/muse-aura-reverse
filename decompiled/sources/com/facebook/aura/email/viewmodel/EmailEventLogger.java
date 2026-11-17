package com.facebook.aura.email.viewmodel;

import X.AnonymousClass003;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.json.ClockCardWireActionsKt;
import com.facebook.aura.nodes.cards.HatchGeofenceCardKt;
import java.util.Map;

/* loaded from: classes.dex */
public final class EmailEventLogger {
    public static final String INBOX = "inbox";
    public static final EmailEventLogger INSTANCE = new EmailEventLogger();
    public static final String SURFACE = "mail";
    public static final String THREAD = "thread";

    public final void inboxViewed(EmailInboxEntryPoint emailInboxEntryPoint) {
        C7384Etj.A0Y(emailInboxEntryPoint, 0);
        log("mail_inbox_viewed", "impression", INBOX, AnonymousClass006.A10(HatchMetadataKey.ENTRY_POINT.getValue(), emailInboxEntryPoint.getValue()));
    }

    public final void threadOpened(String str, int i) {
        C7384Etj.A0Y(str, 0);
        log("mail_thread_opened", "click", INBOX, AnonymousClass007.A0d(HatchMetadataKey.ABSOLUTE_POSITION.getValue(), String.valueOf(i), AnonymousClass006.A12(HatchMetadataKey.THREAD_ID, str)));
    }

    private final void log(String str, String str2, String str3, Map<String, String> map) {
        HatchAppEventLogger.INSTANCE.logEvent(str, SURFACE, str3, str2, null, map, null);
    }

    public final void inboxExited(long j) {
        log("mail_inbox_exited", HatchGeofenceCardKt.TRIGGER_EXIT, INBOX, AnonymousClass006.A10(HatchMetadataKey.DURATION_MS.getValue(), String.valueOf(j)));
    }

    public final void inboxRefreshed() {
        log("mail_inbox_refreshed", "pull_to_refresh", INBOX, null);
    }

    public final void moreThreadsRequested(int i) {
        log("mail_inbox_load_more", "click", INBOX, AnonymousClass006.A10(HatchMetadataKey.TOTAL_COUNT.getValue(), String.valueOf(i)));
    }

    public final void threadClosed(String str, EmailThreadExit emailThreadExit) {
        AnonymousClass003.A0u(str, emailThreadExit);
        log("mail_thread_closed", ClockCardWireActionsKt.CLOCK_ACTION_DISMISS, "thread", AnonymousClass007.A0d(HatchMetadataKey.EXIT_REASON.getValue(), emailThreadExit.getValue(), AnonymousClass006.A12(HatchMetadataKey.THREAD_ID, str)));
    }
}
