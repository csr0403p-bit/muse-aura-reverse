package com.facebook.aura.notifications.push;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C60R;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AuraPushNotificationData extends C06G {
    public static final Companion Companion = new Companion();
    public static final String PARAM_VM_ID = "vm_id";
    public final String collapseKey;
    public final String inappNotifId;
    public final boolean isLoggedOutPush;
    public final String message;
    public final String ndid;
    public final String notificationType;
    public final Map<String, String> params;
    public final String subtitle;
    public final Long targetUid;
    public final long timeStamp;
    public final String title;
    public final String type;
    public final Integer unreadCount;
    public final String vmId;

    public AuraPushNotificationData(String str, long j, String str2, String str3, String str4, Long l, Map<String, String> map, boolean z, String str5, String str6, String str7, String str8, Integer num, String str9) {
        AnonymousClass002.A1E(str, 0, map);
        this.type = str;
        this.timeStamp = j;
        this.title = str2;
        this.subtitle = str3;
        this.message = str4;
        this.targetUid = l;
        this.params = map;
        this.isLoggedOutPush = z;
        this.ndid = str5;
        this.collapseKey = str6;
        this.notificationType = str7;
        this.inappNotifId = str8;
        this.unreadCount = num;
        this.vmId = str9;
    }

    public final AuraPushNotificationData copy(String str, long j, String str2, String str3, String str4, Long l, Map<String, String> map, boolean z, String str5, String str6, String str7, String str8, Integer num, String str9) {
        AnonymousClass002.A1E(str, 0, map);
        return new AuraPushNotificationData(str, j, str2, str3, str4, l, map, z, str5, str6, str7, str8, num, str9);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraPushNotificationData) {
                AuraPushNotificationData auraPushNotificationData = (AuraPushNotificationData) obj;
                if (!C7384Etj.areEqual(this.type, auraPushNotificationData.type) || this.timeStamp != auraPushNotificationData.timeStamp || !C7384Etj.areEqual(this.title, auraPushNotificationData.title) || !C7384Etj.areEqual(this.subtitle, auraPushNotificationData.subtitle) || !C7384Etj.areEqual(this.message, auraPushNotificationData.message) || !C7384Etj.areEqual(this.targetUid, auraPushNotificationData.targetUid) || !C7384Etj.areEqual(this.params, auraPushNotificationData.params) || this.isLoggedOutPush != auraPushNotificationData.isLoggedOutPush || !C7384Etj.areEqual(this.ndid, auraPushNotificationData.ndid) || !C7384Etj.areEqual(this.collapseKey, auraPushNotificationData.collapseKey) || !C7384Etj.areEqual(this.notificationType, auraPushNotificationData.notificationType) || !C7384Etj.areEqual(this.inappNotifId, auraPushNotificationData.inappNotifId) || !C7384Etj.areEqual(this.unreadCount, auraPushNotificationData.unreadCount) || !C7384Etj.areEqual(this.vmId, auraPushNotificationData.vmId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraPushNotificationData copy$default(AuraPushNotificationData auraPushNotificationData, String str, long j, String str2, String str3, String str4, Long l, Map map, boolean z, String str5, String str6, String str7, String str8, Integer num, String str9, int i, Object obj) {
        long j2 = j;
        String str10 = str2;
        String str11 = str3;
        String str12 = str4;
        Long l2 = l;
        Map map2 = map;
        boolean z2 = z;
        String str13 = str5;
        String str14 = str6;
        String str15 = str7;
        String str16 = str8;
        Integer num2 = num;
        String str17 = str9;
        if ((i & 1) != 0) {
            str = auraPushNotificationData.type;
        }
        if ((i & 2) != 0) {
            j2 = auraPushNotificationData.timeStamp;
        }
        if ((i & 4) != 0) {
            str10 = auraPushNotificationData.title;
        }
        if ((i & 8) != 0) {
            str11 = auraPushNotificationData.subtitle;
        }
        if ((i & 16) != 0) {
            str12 = auraPushNotificationData.message;
        }
        if ((i & 32) != 0) {
            l2 = auraPushNotificationData.targetUid;
        }
        if ((i & 64) != 0) {
            map2 = auraPushNotificationData.params;
        }
        if ((i & 128) != 0) {
            z2 = auraPushNotificationData.isLoggedOutPush;
        }
        if ((i & 256) != 0) {
            str13 = auraPushNotificationData.ndid;
        }
        if ((i & 512) != 0) {
            str14 = auraPushNotificationData.collapseKey;
        }
        if ((i & 1024) != 0) {
            str15 = auraPushNotificationData.notificationType;
        }
        if ((i & 2048) != 0) {
            str16 = auraPushNotificationData.inappNotifId;
        }
        if ((i & 4096) != 0) {
            num2 = auraPushNotificationData.unreadCount;
        }
        if ((i & 8192) != 0) {
            str17 = auraPushNotificationData.vmId;
        }
        String str18 = str10;
        return auraPushNotificationData.copy(str, j2, str18, str11, str12, l2, map2, z2, str13, str14, str15, str16, num2, str17);
    }

    public final String component1() {
        return this.type;
    }

    public final String component10() {
        return this.collapseKey;
    }

    public final String component11() {
        return this.notificationType;
    }

    public final String component12() {
        return this.inappNotifId;
    }

    public final Integer component13() {
        return this.unreadCount;
    }

    public final String component14() {
        return this.vmId;
    }

    public final long component2() {
        return this.timeStamp;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.subtitle;
    }

    public final String component5() {
        return this.message;
    }

    public final Long component6() {
        return this.targetUid;
    }

    public final Map<String, String> component7() {
        return this.params;
    }

    public final boolean component8() {
        return this.isLoggedOutPush;
    }

    public final String component9() {
        return this.ndid;
    }

    public final String getCollapseKey() {
        return this.collapseKey;
    }

    public final String getInappNotifId() {
        return this.inappNotifId;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getNdid() {
        return this.ndid;
    }

    public final String getNotificationType() {
        return this.notificationType;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Long getTargetUid() {
        return this.targetUid;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final Integer getUnreadCount() {
        return this.unreadCount;
    }

    public final String getVmId() {
        return this.vmId;
    }

    public int hashCode() {
        return ((((((((((C0KA.A01(AnonymousClass005.A0F(this.params, (((((((C60R.A00(this.timeStamp, AnonymousClass001.A0G(this.type)) + AnonymousClass006.A0G(this.title)) * 31) + AnonymousClass006.A0G(this.subtitle)) * 31) + AnonymousClass006.A0G(this.message)) * 31) + AnonymousClass006.A0D(this.targetUid)) * 31), this.isLoggedOutPush) + AnonymousClass006.A0G(this.ndid)) * 31) + AnonymousClass006.A0G(this.collapseKey)) * 31) + AnonymousClass006.A0G(this.notificationType)) * 31) + AnonymousClass006.A0G(this.inappNotifId)) * 31) + AnonymousClass006.A0D(this.unreadCount)) * 31) + AnonymousClass005.A0H(this.vmId);
    }

    public final boolean isLoggedOutPush() {
        return this.isLoggedOutPush;
    }

    public final boolean isSilentPush() {
        return "hatch_node_wakeup".equals(this.type);
    }

    public final class Companion {
        /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[PHI: r1
  0x003c: PHI (r1v2 java.lang.String) = (r1v1 java.lang.String), (r1v6 java.lang.String) binds: [B:7:0x0031, B:9:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.facebook.aura.notifications.push.AuraPushNotificationData fromJson(kotlinx.serialization.json.JsonObject r17) {
            /*
                r16 = this;
                r0 = 0
                r2 = r17
                X.C7384Etj.A0Y(r2, r0)
                r15 = 0
                X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Exception -> L60
                X.F0C<X.9hr<java.lang.Object>>[] r0 = com.facebook.aura.notifications.push.AuraPushWireJson.$childSerializers     // Catch: java.lang.Exception -> L60
                com.facebook.aura.notifications.push.AuraPushWireJson$$serializer r0 = com.facebook.aura.notifications.push.AuraPushWireJson$$serializer.INSTANCE     // Catch: java.lang.Exception -> L60
                java.lang.Object r2 = r1.A01(r0, r2)     // Catch: java.lang.Exception -> L60
                com.facebook.aura.notifications.push.AuraPushWireJson r2 = (com.facebook.aura.notifications.push.AuraPushWireJson) r2     // Catch: java.lang.Exception -> L60
                java.lang.String r3 = r2.type     // Catch: java.lang.Exception -> L60
                long r4 = r2.time     // Catch: java.lang.Exception -> L60
                java.lang.String r6 = r2.title     // Catch: java.lang.Exception -> L60
                java.lang.String r7 = r2.subtitle     // Catch: java.lang.Exception -> L60
                java.lang.String r8 = r2.message     // Catch: java.lang.Exception -> L60
                java.lang.Long r9 = r2.target_uid     // Catch: java.lang.Exception -> L60
                java.util.Map<java.lang.String, java.lang.String> r10 = r2.params     // Catch: java.lang.Exception -> L60
                boolean r11 = r2.is_logged_out_push     // Catch: java.lang.Exception -> L60
                java.lang.String r12 = r2.ndid     // Catch: java.lang.Exception -> L60
                if (r12 != 0) goto L2d
                java.lang.String r0 = "d"
                java.lang.String r12 = X.C60O.A0p(r0, r10)     // Catch: java.lang.Exception -> L60
            L2d:
                java.lang.String r13 = r2.collapse_key     // Catch: java.lang.Exception -> L60
                java.lang.String r1 = r2.notification_type     // Catch: java.lang.Exception -> L60
                if (r1 != 0) goto L3c
                java.lang.String r1 = r2.type     // Catch: java.lang.Exception -> L60
                int r0 = r1.length()     // Catch: java.lang.Exception -> L60
                r14 = r15
                if (r0 <= 0) goto L3d
            L3c:
                r14 = r1
            L3d:
                java.lang.Integer r1 = r2.unread_count     // Catch: java.lang.Exception -> L60
                if (r1 == 0) goto L47
                int r0 = r1.intValue()     // Catch: java.lang.Exception -> L60
                if (r0 >= 0) goto L48
            L47:
                r1 = r15
            L48:
                java.lang.String r0 = r2.vm_id     // Catch: java.lang.Exception -> L60
                if (r0 != 0) goto L56
                java.util.Map<java.lang.String, java.lang.String> r2 = r2.params     // Catch: java.lang.Exception -> L60
                java.lang.String r0 = "vm_id"
                java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Exception -> L60
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L60
            L56:
                com.facebook.aura.notifications.push.AuraPushNotificationData r2 = new com.facebook.aura.notifications.push.AuraPushNotificationData     // Catch: java.lang.Exception -> L60
                r16 = r1
                r17 = r0
                r2.<init>(r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Exception -> L60
                return r2
            L60:
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.notifications.push.AuraPushNotificationData.Companion.fromJson(kotlinx.serialization.json.JsonObject):com.facebook.aura.notifications.push.AuraPushNotificationData");
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraPushNotificationData(String str, long j, String str2, String str3, String str4, Long l, Map map, boolean z, String str5, String str6, String str7, String str8, Integer num, String str9, int i, C06H c06h) {
        this(str, j, str2, str3, str4, l, map, z, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : num, (i & 8192) != 0 ? null : str9);
    }
}
