package com.facebook.aura.notifications.push;

import X.AbstractC0878AGe;
import X.C10571Hud;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import android.net.Uri;
import java.util.List;

/* loaded from: classes3.dex */
public final class HatchChatNotificationIds {
    public static final String BROWSER_NEEDS_YOU_NOTIF_TYPE = "hatch_browser_needs_you";
    public static final String BROWSER_WAKE_REASON = "wake";
    public static final String CHAT_HOST = "chat";
    public static final String CHAT_MESSAGE_NOTIF_TYPE = "hatch_bot_message";
    public static final String HITL_APPROVAL_NOTIF_TYPE = "hatch_hitl_approval";
    public static final HatchChatNotificationIds INSTANCE = new HatchChatNotificationIds();
    public static final String MAIN_CHAT_KEY = "main";
    public static final String PARAM_APPROVAL_ID = "approval_id";
    public static final String PARAM_BROWSER_TASK_ID = "browser_task_id";
    public static final String PARAM_DEVICE_ID = "device_id";
    public static final String PARAM_MESSAGE_ID = "message_id";
    public static final String PARAM_PATH = "path";
    public static final String PARAM_PUSH_NOTIF_ID = "PushNotifID";
    public static final String PARAM_REASON = "reason";
    public static final String PARAM_THREAD_KEY = "ChatThreadKey";
    public static final String THREAD_HOST = "thread";

    public final int chatNotificationId(String str) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0M("hatch_chat_", str).hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String messageIdFromPath(java.lang.String r5) {
        /*
            r4 = this;
            r4 = 0
            if (r5 == 0) goto L69
            android.net.Uri r3 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> L8
            goto Ld
        L8:
            r0 = move-exception
            X.Hud r3 = X.C3cG.A0s(r0)
        Ld:
            boolean r0 = r3 instanceof X.C10571Hud
            if (r0 == 0) goto L12
            r3 = r4
        L12:
            android.net.Uri r3 = (android.net.Uri) r3
            if (r3 == 0) goto L69
            java.lang.String r2 = r3.getHost()
            if (r2 == 0) goto L67
            int r1 = r2.hashCode()
            r0 = -874443254(0xffffffffcbe10e0a, float:-2.9498388E7)
            if (r1 == r0) goto L50
            r0 = 3052376(0x2e9358, float:4.27729E-39)
            if (r1 != r0) goto L67
            java.lang.String r0 = "chat"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L67
            java.util.List r0 = r3.getPathSegments()
            X.C7384Etj.A0U(r0)
            java.lang.Object r0 = X.AbstractC0878AGe.A0G(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L47
            java.lang.String r0 = "message_id"
            java.lang.String r0 = r3.getQueryParameter(r0)
        L47:
            if (r0 == 0) goto L69
            boolean r1 = X.C7BY.A0j(r0)
            if (r1 != 0) goto L69
            return r0
        L50:
            java.lang.String r0 = "thread"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L67
            java.util.List r1 = r3.getPathSegments()
            X.C7384Etj.A0U(r1)
            r0 = 1
            java.lang.Object r0 = X.AbstractC0878AGe.A0A(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            goto L47
        L67:
            r0 = r4
            goto L47
        L69:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.notifications.push.HatchChatNotificationIds.messageIdFromPath(java.lang.String):java.lang.String");
    }

    public final String threadKeyFromPath(String str) {
        Object objA0s;
        Uri uri;
        if (str != null) {
            try {
                objA0s = Uri.parse(str);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            uri = (Uri) objA0s;
        } else {
            uri = null;
        }
        if ("thread".equals(uri != null ? uri.getHost() : null)) {
            List<String> pathSegments = uri.getPathSegments();
            C7384Etj.A0U(pathSegments);
            String str2 = (String) AbstractC0878AGe.A0G(pathSegments);
            if (str2 != null && !C7BY.A0j(str2) && !"main".equals(str2)) {
                return str2;
            }
        }
        return "main";
    }

    public final String threadPath(String str) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0M("hatch://thread/", Uri.encode(str));
    }
}
