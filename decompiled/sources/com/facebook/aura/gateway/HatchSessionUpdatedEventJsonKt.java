package com.facebook.aura.gateway;

/* loaded from: classes3.dex */
public abstract class HatchSessionUpdatedEventJsonKt {
    public static final String SESSION_UPDATE_TAG = "HatchSessionUpdate";

    public static final long firstTimestamp(Long... lArr) {
        for (Long l : lArr) {
            if (l != null) {
                long jLongValue = l.longValue();
                if (jLongValue > 0) {
                    return jLongValue;
                }
            }
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.gateway.HatchSessionUpdate parseSessionUpdate(kotlinx.serialization.json.JsonObject r5) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r5, r0)
            java.lang.String r0 = "session"
            java.lang.Object r2 = r5.get(r0)
            boolean r0 = r2 instanceof kotlinx.serialization.json.JsonObject
            r4 = 0
            if (r0 == 0) goto L13
            kotlinx.serialization.json.JsonElement r2 = (kotlinx.serialization.json.JsonElement) r2
            if (r2 != 0) goto L34
        L13:
            java.lang.String r0 = "is_thread"
            boolean r0 = r5.containsKey(r0)
            if (r0 != 0) goto L33
            java.lang.String r0 = "created_at_ms"
            boolean r0 = r5.containsKey(r0)
            if (r0 != 0) goto L33
            java.lang.String r0 = "archived"
            boolean r0 = r5.containsKey(r0)
            if (r0 != 0) goto L33
            java.lang.String r0 = "pinned"
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L69
        L33:
            r2 = r5
        L34:
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L43
            com.facebook.aura.gateway.SessionUpdatedSessionJson$$serializer r0 = com.facebook.aura.gateway.SessionUpdatedSessionJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r1.A01(r0, r2)     // Catch: java.lang.Throwable -> L43
            com.facebook.aura.gateway.SessionUpdatedSessionJson r0 = (com.facebook.aura.gateway.SessionUpdatedSessionJson) r0     // Catch: java.lang.Throwable -> L43
            com.facebook.aura.gateway.HatchSessionUpdate r3 = r0.toSessionUpdate()     // Catch: java.lang.Throwable -> L43
            goto L48
        L43:
            r0 = move-exception
            X.Hud r3 = X.C3cG.A0s(r0)
        L48:
            java.lang.Throwable r2 = X.HsJ.A00(r3)
            if (r2 == 0) goto L55
            java.lang.String r1 = "HatchSessionUpdate"
            java.lang.String r0 = "Failed to decode sessions.updated session"
            X.CFK.A0A(r1, r0, r2)
        L55:
            boolean r0 = r3 instanceof X.C10571Hud
            if (r0 == 0) goto L5a
            r3 = r4
        L5a:
            com.facebook.aura.gateway.HatchSessionUpdate r3 = (com.facebook.aura.gateway.HatchSessionUpdate) r3
            if (r3 == 0) goto L69
            com.facebook.aura.gateway.HatchSessionItem r0 = r3.session
            java.lang.String r0 = r0.sessionId
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto L69
            return r3
        L69:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchSessionUpdatedEventJsonKt.parseSessionUpdate(kotlinx.serialization.json.JsonObject):com.facebook.aura.gateway.HatchSessionUpdate");
    }
}
