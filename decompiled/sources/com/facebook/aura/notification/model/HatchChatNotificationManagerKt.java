package com.facebook.aura.notification.model;

import X.AnonymousClass001;
import X.C3cG;
import X.C60O;
import com.facebook.aura.model.CanonicalEventEnvelope;
import com.facebook.aura.model.HatchChatEvent;
import com.facebook.aura.model.TextWithButtonPresentationJsonKt;

/* loaded from: classes3.dex */
public abstract class HatchChatNotificationManagerKt {
    public static final long DEBOUNCE_MS = 5000;
    public static final int MAX_BODY_LENGTH = 200;
    public static final int MAX_DEBOUNCED_THREADS = 256;
    public static final int MAX_PROCESSED_EVENT_KEYS = 512;
    public static final String NOTIF_TYPE_BOT_MESSAGE = "hatch_bot_message";
    public static final String TAG = "HatchChatNotifManager";

    public static final String notificationEventKey(HatchChatEvent hatchChatEvent, String str, CanonicalEventEnvelope canonicalEventEnvelope) {
        String str2;
        StringBuilder sbA0g;
        if (canonicalEventEnvelope == null || (str2 = canonicalEventEnvelope.sessionId) == null) {
            str2 = TextWithButtonPresentationJsonKt.TEXT_WITH_BUTTON_STYLE_PRIMARY;
        }
        if (str == null) {
            str = null;
            if (canonicalEventEnvelope != null) {
                String str3 = canonicalEventEnvelope.messageId;
                if (str3 == null) {
                    Long l = canonicalEventEnvelope.seq;
                    if (l != null) {
                        str = String.valueOf(l.longValue());
                    }
                } else {
                    str = str3;
                }
            }
        }
        if (str != null) {
            sbA0g = C3cG.A0g(str2);
            sbA0g.append(":");
        } else {
            String strA0n = C60O.A0n(hatchChatEvent);
            sbA0g = C3cG.A0g(str2);
            sbA0g.append(":");
            sbA0g.append(strA0n);
            str = ":unknown";
        }
        return AnonymousClass001.A0v(str, sbA0g);
    }
}
