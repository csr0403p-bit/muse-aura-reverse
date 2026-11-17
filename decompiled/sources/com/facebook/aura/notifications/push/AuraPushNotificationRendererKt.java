package com.facebook.aura.notifications.push;

import X.C3cI;
import X.C60O;
import X.C7384Etj;

/* loaded from: classes3.dex */
public abstract class AuraPushNotificationRendererKt {
    public static final int LARGE_ICON_SIZE_PX = 256;

    public static final String dedupKey(AuraPushNotificationData auraPushNotificationData) {
        StringBuilder sbA0x;
        String strMessageIdFromPath;
        C7384Etj.A0Y(auraPushNotificationData, 0);
        if (!"hatch_bot_message".equals(auraPushNotificationData.notificationType) || (strMessageIdFromPath = HatchChatNotificationIds.INSTANCE.messageIdFromPath(C60O.A0p("path", auraPushNotificationData.params))) == null) {
            String strA0p = C60O.A0p(HatchChatNotificationIds.PARAM_PUSH_NOTIF_ID, auraPushNotificationData.params);
            if (strA0p == null || strA0p.equals(AuraNotificationChannels.CHAT_NOTIF_ID)) {
                String str = auraPushNotificationData.ndid;
                if (str == null) {
                    return null;
                }
                sbA0x = C3cI.A0x("ndid:", str);
            } else {
                sbA0x = C3cI.A0x("pnid:", strA0p);
            }
        } else {
            sbA0x = C3cI.A0x("mid:", strMessageIdFromPath);
        }
        return sbA0x.toString();
    }

    public static final String notificationIdentity(AuraPushNotificationData auraPushNotificationData, int i) {
        StringBuilder sbA0y;
        String str;
        C7384Etj.A0Y(auraPushNotificationData, 0);
        String str2 = auraPushNotificationData.ndid;
        if (str2 != null) {
            str = "ndid:";
        } else {
            str2 = auraPushNotificationData.inappNotifId;
            if (str2 == null) {
                String str3 = auraPushNotificationData.type;
                long j = auraPushNotificationData.timeStamp;
                int iHashCode = auraPushNotificationData.hashCode();
                sbA0y = C60O.A0y("notification:", i);
                C60O.A1R(":", str3, sbA0y);
                sbA0y.append(j);
                sbA0y.append(":");
                sbA0y.append(iHashCode);
                return sbA0y.toString();
            }
            str = "inapp:";
        }
        sbA0y = C3cI.A0x(str, str2);
        return sbA0y.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037 A[PHI: r0
  0x0037: PHI (r0v4 java.lang.String) = (r0v3 java.lang.String), (r0v10 java.lang.String) binds: [B:8:0x001e, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String approvalId(com.facebook.aura.notifications.push.AuraPushNotificationData r4) {
        /*
            java.lang.String r1 = r4.collapseKey
            java.lang.String r0 = "approval_request"
            boolean r0 = r0.equals(r1)
            r3 = 0
            if (r0 != 0) goto L16
            java.lang.String r1 = r4.notificationType
            java.lang.String r0 = "hatch_hitl_approval"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L16
        L15:
            return r3
        L16:
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.params
            java.lang.String r2 = "approval_id"
            java.lang.String r0 = X.C60O.A0p(r2, r0)
            if (r0 != 0) goto L37
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.params
            java.lang.String r0 = "path"
            java.lang.String r1 = X.C60O.A0p(r0, r1)
            if (r1 == 0) goto L15
            r0 = 0
            android.net.Uri r0 = X.C7Je.A01(r1)     // Catch: java.lang.Throwable -> L2f
        L2f:
            if (r0 == 0) goto L15
            java.lang.String r0 = r0.getQueryParameter(r2)
            if (r0 == 0) goto L15
        L37:
            java.lang.String r1 = X.AnonymousClass002.A0l(r0)
            if (r1 == 0) goto L15
            int r0 = r1.length()
            if (r0 <= 0) goto L15
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.notifications.push.AuraPushNotificationRendererKt.approvalId(com.facebook.aura.notifications.push.AuraPushNotificationData):java.lang.String");
    }
}
